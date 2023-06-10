# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists DV_Crvenkapica;
create database DV_Crvenkapica;
use DV_Crvenkapica;

create table djecji_vrtic (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null,
    prijava int not null,
    kontakt varchar (100) not null,
    info int not null,
    struktura int not null
);

create table prijava (
    sifra int not null primary key auto_increment,
    broj_prijave char (1000),
    ime_djeteta varchar (50) not null,
    prezime_djeteta varchar (50) not null,
    ime_roditelja varchar (50) not null,
    datum_rodenja_djeteta date not null,
    oib_djeteta char (100) not null
);

create table kontakt (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100) not null,
    prijava int not null
);

create table info (
    sifra int not null primary key auto_increment,
    nadolazeci_dogadaj varchar (255) not null,
    galerija int not null
);

create table nadolazeci_dogadaj (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    opis varchar (255),
    datum date not null,
    vrijeme time not null
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    autor varchar (100)
);

create table slika (
    sifra int not null primary key auto_increment,
    broj char (2000) not null,
    galerija int not null
);

create table struktura (
    sifra int not null primary key auto_increment,
    broj_skupina char (20) not null,
    broj_djece char (200) not null
);

create table skupina (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    odgojiteljica varchar (100) not null,
    broj_clanova char (20) not null,
    struktura int not null
);

alter table djecji_vrtic add foreign key (prijava)
references prijava (sifra);

alter table djecji_vrtic add foreign key (info)
references info (sifra);

alter table djecji_vrtic add foreign key (struktura)
references struktura (sifra);

alter table korisnik add foreign key (prijava)
references prijava (sifra);

alter table info add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);

alter table skupina add foreign key (struktura)
references struktura (sifra);

alter table info add foreign key (nadolazeci_dogadaj)
references nadolazeci_dogadaj (sifra);