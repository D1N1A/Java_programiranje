# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\era_teski2\Vet_DataBase_App.sql

drop database if exists Vet_DataBase_App;
create database Vet_DataBase_App;

use database Vet_DataBase_App;

create table zivotinja(
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    vrsta varchar (50) not null,
    pasmina varchar (50),
    datum_rodenja date,
    broj_cipa char (15),
    vlasnik int not null,
    tretman int not null
);

create table vlasnik (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    kontakt_tel char (14) not null,
    e_mail varchar (100)
);

create table tretman (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    date datum not null,
    vrijeme time not null,
    cjepivo varchar (50),
    iduci_termin datetime
);

alter table zivotinja add foreign key (vlasnik)
references vlasnik (sifra);

alter table tretman add foreign key (tretman) 
references tretman (sifra);
)

