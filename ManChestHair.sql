# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists ManChestHair;
create database ManChestHair;
use ManChestHair;

create table servis (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    ponuda int not null
);

create table ponuda (
    sifra int not null primary key auto_increment,
    opis_posla varchar (255) not null,
    datum date not null,
    vrijeme time not null,
    mjesto varchar (100) not null
);

create table veteran (
    sifra int not null primary key auto_increment,
    osoba int not null,
    iskustvo_i_vjestine varchar (255) not null,
    ponuda int not null
);

create table novak (
    sifra int not null primary key auto_increment,
    osoba int not null,
    znanja_i_vjestine varchar (255) not null,
    ponuda int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100)
);

alter table servis add foreign key (ponuda)
references ponuda (sifra);

alter table veteran add foreign key (ponuda)
references ponuda (sifra);

alter table novak add foreign key (ponuda)
references ponuda (sifra);

alter table novak add foreign key (osoba)
references osoba (sifra);

alter table veteran add foreign key (osoba)
references osoba (sifra);