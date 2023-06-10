# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\Dobrovoljno_vatrogasno_drustvo_Branjin_Vrh.sql

drop database if exists Acoustic_duo_Baby_blue;
create database Acoustic_duo_Baby_blue;
use Acoustic_duo_Baby_blue;

create table glazbeni_duo(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    info int not null,
    galerija int not null,
    novost int not null,
    nadolazeci_koncert int not null
);

create table zajednica (
    info int not null,
    clan int not null
);

create table clan (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    instrument varchar (50)
);

create table info (
    sifra int not null primary key auto_increment,
    osnovutak varchar (100),
    repertoar varchar (255) not null
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    autor varchar (100)
);

create table slika (
    sifra int not null primary key auto_increment,
    galerija int not null,
    broj char (200)
);

create table kontakt (
    sifra int not null primary key auto_increment,
    obrazac int not null,
    e_mail varchar (100) not null
);

create table obrazac (
    sifra int not null primary key auto_increment,
    pohvale varchar (255),
    kritike varchar (255),
    prijedlozi varchar (255)
);

create table korisnik (
    ime varchar (50) not null,
    prezime varchar (50) not null,
    e_mail varchar (100) not null,
    obrazac int not null
);

create table novost (
    sifra int not null primary key auto_increment,
    opis varchar (255) not null
);

create table nadolazeci_koncert (
    sifra int not null primary key auto_increment,
    datum date not null,
    vrijeme time not null,
    mjesto varchar (100) not null
);

alter table zajednica add foreign key (info)
references info (sifra);

alter table zajednica add foreign key (clan)
references clan (sifra);

alter table glazbeni_duo add foreign key (info)
references info (sifra);

alter table glazbeni_duo add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);

alter table glazbeni_duo add foreign key (kontakt)
references kontakt (sifra);

alter table kontakt add foreign key (obrazac)
references obrazac (sifra);

alter table korisnik add foreign key (obrazac)
references obrazac (sifra);

alter table glazbeni_duo add foreign key (novost)
references novost (sifra);

alter table glazbeni_duo add foreign key nadolazeci_koncert
references nadolazeci_koncert (sifra);
