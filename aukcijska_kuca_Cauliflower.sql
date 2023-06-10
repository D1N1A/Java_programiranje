# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists aukcijska_kuca_Cauliflower;
create database aukcijska_kuca_Cauliflower;
use aukcijska_kuca_Cauliflower;

create table projekt (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    aukcija int not null,
    ponuda int not null,
    zajednica int not null,
    kontakt varchar (100) not null
);

create table aukcija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    datum date not null,
    vrijeme time not null,
    mjesto varchar (100) not null
);

create table umjetnina (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    opis varchar (100),
    autor varchar (100),
    datum_nastanka date,
    aukcija int not null
);

create table ponuda (
    sifra int not null primary key auto_increment,
    broj_umjetnine char (1000) not null,
    cijena decimal (18,2) not null,
    umjetnina int not null
);

create table zajednica (
    sifra int not null primary key auto_increment,
    prodavac int not null,
    kupac int not null,
    pravila varchar (255) not null
);

create table kupac (
    sifra int not null primary key auto_increment,
    broj_kupca char (1000) not null,
    osoba int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    iban char (11) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100)
);

create table prodavac (
    sifra int not null primary key auto_increment,
    broj_prodavaca char (1000) not null,
    osoba int not null
);


alter table projekt add foreign key (aukcija)
references aukcija (sifra);

alter table projekt add foreign key (ponuda)
references ponuda (sifra);

alter table projekt add foreign key (zajednica)
references zajednica (sifra);

alter table umjetnina add foreign key (umjetnina)
references umjetnina (sifra);

alter table ponuda add foreign key (umjetnina)
references umjetnina (sifra);

alter table zajednica add foreign key (prodavac)
references prodavac (sifra);

alter table zajednica add foreign key (kupac)
references kupac (sifra);

alter table kupac add foreign key (osoba)
references osoba (sifra);

alter table prodavac add foreign key (osoba)
references osoba (sifra);