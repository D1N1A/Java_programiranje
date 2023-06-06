c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\postolar.sql

drop database if exists postolar;
create database postolar;
use postolar;
create table postolar (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    adresa varchar (100) not null,
    segrt int not null
);

create table obuca (
    sifra int not null primary key auto_increment,
    vlasnik int not null,
    tip varchar (50),
    marka varchar (50),
    cijena_popravka decimal (18,2) not null,
    ponovni_popravak int
);

create table korisnik (
    sifra int not null primary key auto_increment,
    prezime varchar (50) not null,
    oznaka_obuce char (50),
    obuca int not null,
    iban varchar (50)
);

create table segrt (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB char (11)
);

create table popravak (
    postolar int not null,
    obuca int not null
);

create table vlasnik (
    korisnik int not null,
    obuca int not null
);

alter table postolar add foreign key (popravak)
references obuca (sifra);

alter table postolar add foreign key (segrt)
references segrt (sifra);

alter table obuca add foreign key (ponovni_popravak)
references obuca (sifra);

alter table vlasnik add foreign key (korisnik)
references korisnik (sifra);

alter table vlasnik add foreign key (obuca)
references obuca (sifra);

alter table obuca add foreign key (vlasnik)
references korisnik (sifra);

alter table popravak add foreign key (postolar)
references postolar (sifra);

alter table popravak add foreign key (obuca)
references obuca (sifra);

insert into segrt (sifra,ime,prezime,OIB) values
(null,'Milka','Milić',12345678901).
(null,'Dalibor','Dalić',23456789012),
(null,'Tonči','Tonković',34567890123);

insert into obuca (sifra,vlasnik,tip,marka,cijena_popravka,ponovni_popravak) values
(null,1,'mokasine','Gucci',50.20,0),
(null,2,'sandale','Steve Maden', 20.10,0),
(null,3,'čizme','Ugg',9.99,0);

insert into korisnik (sifra,prezime,oznaka_obuce,obuca,iban) values
(null,'Bobić',01,1,'HR1234567890123456789'),
(null,'Liović',02,2,'HR2345678901234567890'),
(null,'Curović',03,3,'HR3456789012345678901');

insert into postolar (sifra,naziv,adresa,popravak,segrt) values
(null,'Cipela','Ulica bana Josipa Jelačića bb','lijepljenje potplata',1),
(null,'Shoes','Trg Slobode bb','lijepljenje pete',2),
(null,'Go','Cvjetkova ulica bb','prešpricavanje sprejem za impregnaciju',3);

insert into popravak (obuca,postolar) values
(1,1),
(2,2),
(3,3);