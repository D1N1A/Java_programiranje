# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\era_teski2\premier_liga.sql

drop database if exists premier_liga;
create database premier_liga;

use premier_liga;

create table klub (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    rang char (20),
    korisnik int not null
);

create table igrac (
    sifra int not null primary key auto_increment,
    broj char (99),
    osoba int not null,
    klub int not null,
    trener int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    datum_rodenja date
);

create table trener (
    sifra int not null primary key auto_increment,
    osoba int not null,
    klub int not null
);

create table utakmica (
    sifra int not null primary key auto_increment,
    datum date not null,
    vrijeme time not null,
    mjesto varchar (100) not null,
    klub int not null
);

create table opklada (
    sifra int not null primary key auto_increment,
    koeficijent decimal (18,2)
    korisnik int not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnicko_ime varchar (100) not null,
    lozinka varchar (50) not null
);

alter table klub add foreign key (korisnik)
references korisnik (sifra);

alter table igrac add foreign key (klub)
references klub (sifra);

alter table igrac add foreign key (trener)
references trener (sifra);

alter table igrac add foreign key (osoba)
references osoba (sifra);

alter table trener add foreign key (osoba)
references (sifra);

alter table trener add foreign key (klub)
references klub (sifra);

alter table utakmica add foreign key (klub)
references klub (sifra);

alter table opklada add foreign key (utakmica)
references utakmica (sifra);

