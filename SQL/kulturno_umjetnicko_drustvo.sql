drop database if exists kulturno_umjetnicko_drustvo;
create database kulturno_umjetnicko_drustvo;
use kulturno_umjetnicko_drustvo;
create table kud(
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    sjediste varchar (50) not null,
    kontakt varchar (100)
);

create table djelovanje (
    kud int not null,
    nastup int not null
);

create table nastup (
     sifra int not null primary key auto_increment,
     naziv varchar (50) not null,
     mjesto int not null,
     sastav int not null,
     inozemno boolean
);

create table mjesto (
     sifra int not null primary key auto_increment,
     adresa varchar (100) not null
);

create table clan (
     sifra int not null primary key auto_increment,
     ime varchar (50) not null,
     prezime varchar (50) not null,
     kontakt_broj char (14) not null,
     nastup int not null
);

create table ansambl (
    nastup int not null,
    clan int not null
);

alter table djelovanje add foreign key (kud)
references kud (sifra);

alter table djelovanje add foreign key (nastup)
references nastup (sifra);

alter table nastup add foreign key (mjesto)
references mjesto (sifra);

alter table ansambl add foreign key (nastup)
references nastup (sifra);

alter table ansambl add foreign key (clan)
references clan (sifra);

alter table clan add foreign key (nastup)
references nastup (sifra);

insert into mjesto (sifra, adresa) values
(null,'Opatijska ulica bb'),
(null,'Ulica kralja Zvonimira bb'),
(null,'Ulica Republike bb');

insert into nastup (sifra,naziv,mjesto,sastav,inozemno) values
(null,'Martinsko kolo','Martin','srebrni satav','da'),
(null,'Šokačko kolo','Velimirovac','zlatni sastav','ne'),
(null,'Kukunješće kolo','Granice','glavni satav','ne');

insert into član (sifra,ime,prezime,kontakt_broj,nastup) values
(null,'Pero','Perić',00385912345678,1),
(null,'Verica','Verić', 00385923456789,2),
(null,'Đurđa','Đurić',0038595678901,2);

insert into kud (sifra,naziv,sjediste,kontakt) values
(null,'KUD Silvije Strahimir, Kranjčević','Bački breg'),
(null,'KUD Josip Šošić','Tenja','00385989012345'),
(null,'KUD Sarvaš','Sarvaš','00385978901234');
