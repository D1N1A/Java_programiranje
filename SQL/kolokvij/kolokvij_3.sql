# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\Git\Java_programiranje\SQL\kolokvij\kolokvij_3.sql

drop database if exists kolovij_3;
create database kolovij_3;

use kolovij_3;

create table svekar (
    sifra int not null primary key auto_increment,
    novcica decimal (16,8) not null,
    suknja varchar (46) not null,
    bojakose varchar (36),
    prstena int,
    narukvica int not null,
    cura int not null
);

create table ostavljena (
    sifra int not null primary key auto_increment,
    kuna decimal (17,5),
    lipa decimal (15,6),
    majica varchar (36),
    modelnaocala varchar (31) not null,
    prijatelj int
);

create table prijatelj (
    sifra int not null primary key auto_increment,
    kuna decimal (16,10),
    haljina varchar (37),
    lipa decimal (13,10),
    dukserica varchar (31),
    indiferentno bit not null
);

create table cura (
    sifra int not null primary key auto_increment,
    dukserica varchar (49),
    maraka decimal (13,7),
    drugiputa datetime,
    majica varchar (49),
    novcica decimal (15,8),
    ogrlica int not null
);

create table snasa (
    sifra int not null primary key auto_increment,
    introvertno bit,
    kuna decimal (15,6) not null,
    eura decimal (12,9) not null,
    treciputa datetime,
    ostavljena int not null
);

create table punica (
    sifra int not null primary key auto_increment,
    asocijalno bit,
    kratkamajica varchar (44),
    kuna decimal (13,8) not null,
    vesta varchar (32) not null,
    snasa int
);

create table brat (
    sifra int not null primary key auto_increment,
    jmbag char (11),
    ogrlica int not null,
    ekstrovertno bit not null
);

create table prijatelj_brat (
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);


alter table prijatelj_brat add foreign key (brat)
references brat (sifra);

alter table prijatelj_brat add foreign key (prijatelj)
references prijatelj (sifra);

alter table punica add foreign key (snasa)
references snasa (sifra);

alter table snasa add foreign key (ostavljena)
references ostavljena (sifra);

alter table ostavljena add foreign key (prijatelj)
references prijatelj (sifra);

alter table svekar add foreign key (cura)
references cura (sifra);


insert into snasa (sifra,kuna,eura,ostavljena) values
(null,150.23,19.94,1),
(null,27.14,3.60,2),
(null,231.57,30.73,3);

insert int prijatelj (sifra,indiferentno) values
(null,1),
(null,0),
(null,1);

insert into ostavljena (sifra,modelnaocala,prijatelj) values
(null,'dioptrijske plastični okvir',1),
(null,'sunčane metalni ovir',2),
(null,'dioptrijske metalni okvir',3);

insert into brat (sifra,ogrlica,ekstrovertno) values
(null,'zlatna',1),
(null,'kirurški čelik',0)
(null,'s privjeskom',1);

insert into prijatelj_brat (sifra,prijatelj,brat) values
(null,1,1),
(null,2,2),
(null,3,3);


update svekar set sunja = 'Osijek';


delete from punica where kratkamajica = 'AB' ;

select a.ekstroverno, e.vesta, f.kuna
from brat a inner join prijatelj_brat on a.sifra = b.brat
inner join prijatelj c on c.sifra = b.prijatelj
inner join ostavljena d on c.sifra = d.prijatelj
inner join snasa e on d.sifra = e.ostavljena
inner join f punica on e.sifra = f.snasa
where d.lipa != 91 and c.haljina like '%ba%'
order by e.kuna asc;


select a.haljina,a.lipa
from prijatelj a left join prijatelj_brat b
on a.sifra = b.prijatelj
where b.prijatelj is null;