c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

delete database if exists Kolokvij_5;
create database Kolokvij_5;

use Kolokvij_5;

create table mladic (
    sifra int not null primary key auto_increment,
    kratkamajica varchar (48) not null,
    haljina varchar (30) not null,
    asocijalno bit,
    zarucnik int
);

create table svekar (
    sifra int not null primary key auto_increment,
    bojakose varchar (33),
    majica varchar (31),
    carape varchar (31) not null,
    haljina varchar (43),
    narukvica int,
    eura decimal (14,5) not null
);

create table zarucnik (
    sifra int not null primary key auto_increment,
    jmbag char (11),
    lipa decimal (12,8),
    indiferentno bit not null
);

create table punac (
    sifra int not null primary key auto_increment,
    dukserica varchar (33),
    prviputa datetime not null,
    majica varchar (36),
    svekar int not null
);

create table svekar_cura (
    sifra int not null primary key auto_increment,
    svekar int not null,
    cura int not null
);

create table cura (
    sifra int not null primary key auto_increment,
    carape varchar (41) not null,
    maraka decima (17,10) not null,
    asocijalno bit,
    vesta varchar (47) not null
);

create table ostavljena (
    sifra int not null primary key auto_increment,
    majica varchar (33),
    ogrlica int not null,
    carape varchar (44),
    stilfrizura varchar (42),
    punica int not null
);

create table punica (
    sifra int not null primary key auto_increment,
    hlace varchar (43)not null,
    naucnica int not null,
    ogrlica int,
    vesta varchar (49) not null,
    modelnaocala varchar (31) not null,
    treciputa datetime not null,
    punca int not null
);


alter table mladic add foreign key (zarucnik)
references zarucnik (sifra);

alter table svekar_cura add foreign key (svekar)
references svekar (sifra);

alter table svekar_cura add foreign key (cura)
references cura (sifra);

alter table punac add foreign key (svekar)
references svekar (sifra);

alter table punica add foreign key (punac)
references punac (sifra);

alter table ostavljena add foreign key (punica)
references punica (sifra);


insert into cura (sifra,carapce,maraka,vesta) values
(null,'s cvjetnim uzorkom',34.57,'tamnoplava dugih rukava')
(null,'s likovima iz crtića',135.49,'s printom'),
(null,'ružičaste',105.15,'boja lavande');

insert into svekar (sifra,carape,eura) values
(null,'tamnoplave',105.39),
(null,'zimske',37.28),
(null,'s dezenom',57.23);

insert into svekar_cura (sifra,svekar,cura) values
(null,1,1),
(null,2,2),
(null,3,3);

insert into punac (sifra,prviputa,svekar) values
(null,'15-10-2023 12:15 PM', 1),
(null,'23-08-2023 8:15 AM',2),
(null,'12-09-2023 3:40 PM',3);

insert into punica (sifra,hlace,nausnica,vesta,modelnaocala,treciputa,punac) values
(null,'dugih nogavica',2,'dugih rukava','dioptrijske plastičnog okvira','17-05-2023 2:15 PM',1),
(null,'od odijela',3,'poslovna','doptrijske metalnog okvira','08-04-2023 10:05 AM',2),
(null,'kratke',5,'s printom','sunčane','17-12-2023 04:15 PM',3);


delete ostavljena where ogrlica != 17;


select majica from table punac where prviputa is null;


select a.asocijalno, e.nausnica, f.stilfrizura
from cura a inner join svekar_cura b on a.sifra = b. cura
inner join svekar c on b.sifra = c.svekar
inner join punac d on c.sifra = d.svekar
inner join punica e on d.sifra = e.punica
inner join ostavljena f on e.sifra = f.punica
where d.prviputa is not null and c.majica like '%ba%'
order by e.nausnica asc;

select a.majica,a.carape
from svekar a left join svekar_cura b
on a.sifra = b.svekar
where b.svekar is null;