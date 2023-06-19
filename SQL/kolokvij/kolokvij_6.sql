# c:xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists Kolokvij_6;
create database Kolokvij_6;

use Kolokvij_6;

create table prijatelj (
    sifra int not null primary key auto_increment,
    haljina varchar (35),
    prstena int not null,
    introvertno bit,
    stilfrizura varchar (36) not null
);

create table svekrva (
    sifra int not null primary key auto_increment,
    hlace varchar (48) not null,
    suknja varchar (42) not null,
    ogrlica int not null,
    treciputa datetime not null,
    duskerica varchar (32) not null,
    narukvica int not null,
    punac int
);

create table brat (
    sifra int not null primary key auto_increment,
    nausnica int not null,
    treciputa datetime not null,
    narukvica int not null,
    hlace varchar (31),
    prijatelj int
);

create table prijatelj_ostavljena (
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    ostavljena int not null
);

create table punac (
    sifra int not null primary key auto_increment,
    ekstrovertno bit not null,
    suknja varchar (30) not null,
    majica varchar (44) not null,
    prviputa datetime not null
);

create table ostavljena (
    sifra int not null primary key auto_increment,
    priputa datetime not null,
    kratkamajica varchar (39) not null,
    drugiputa datetime,
    maraka decimal (14,10)
);

create table decko (
    sifra int not null primary key auto_increment,
    prviputa datetime,
    modelnaocala varchar (41),
    nausnica int,
    zena int not null
);

create table zena (
    sifra int not null primary key auto_increment,
    novcica decimal (14,8) not null,
    narukvica int not null,
    duskerica varchar (40) not null,
    haljina varchar (30),
    hlace varchar (32),
    brat int not null
);


alter table decko add foreign key (zena)
references zena (sifra);

alter table zena add foreign key (brat)
references brat (sifra);

alter table brat add foreign key (prijatelj)
references prijatelj (sifra);

alter table prijatelj_ostavljena add foreign key (prijatelj)
references prijatelj (sifra);

alter table prijatelj_ostavljena add foreign key (ostavljena)
references ostavljena (sifra);

alter table svekrva add foreign key (punac)
references punac (sifra);

insert into ostavljena (sifra,prviputa,kratkamajica) values
(null,'2023-06-15 02:15 PM','boje lavance'),
(null,'2023-09-12 03:45 PM','s printom'),
(null,'2023-08-03 11:45 AM','narančasta');

insert into prijatelj (sifra,prstena,stilfrizura) values
(null,1,'kratka kosa'),
(null,3,'stilizirana gelom'),
(null,5,'duga kosa');

insert into prijatelj_ostavljena values
(null,1,1),
(null,2,2),
(null,3,3);

insert into brat (sifra,nausnica,treciputa,narukvica) values
(null,1,'2023-03-15 11:15 AM','kožna'),
(null,3,'2023-05-15 12:10 PM','kirurški čelik'),
(null,5,'2023-07-09 02:15 PM','zlatna');

insert into zena (sifra,novcica,narukvica,dukserica,brat) values
(null,45.67,1,'krem boje',1),
(null,34.23,2,'s printom',2),
(null,67.89,3,'zelena',3);


update svekrva suknja = 'Osijek';

delete decko where modelnaoca < 'AB';

select narukvica from brat where treciputa is null;

select a.drugiputa, f.zena, e.narukvica
from ostavljena a inner join prijatelj_ostavljena b on a.sifra = b.ostavljena
inner join prijatelj c on c.sifra = b.prijatelj
inner join brat d on d.prijatelj = c.sifra
inner join zena e on e.brat = d.sifra
inner join decko f on f.zena = e.sifra
where e.treciputa is not null and c.prsten = 219
by e.narukvica asc;


select a.prstena, a.introvertno
from prijatelj a left join prijatelj_ostavljena b on a.sifra = b. prijatelj
where prijatelj is null;



