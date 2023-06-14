# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\era_teski2\Baby_Rhytm.sql

drop database if exists Baby_Rythm;
create database Baby_Rhytm;

use database Baby_Rhytm;

create table dnevnik_aktivnosti (
    sifra int not null primary key auto_increment,
    datum date not null,
    vrijeme time not null
);

create table hrana (
    sifra int not null primary key auto_increment,
    vrsta varchar (50),
    kolicina char (20)
);

create table dnevnik_hrana (
    dnevnik_aktivnosti int not null,
    hrana int not null
);

create table san (
    sifra int not null primary key auto_increment,
    vrijeme_pocetka time not null,
    vrijeme_budenja time not null
);

create table dnevnik_san (
    dnevnik_aktivnosti int not null,
    san int not null
);

create table pice (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    kolicina char (20) not null
);

create table dnevnik_pice (
    dnevnik_aktivnosti int not null,
    pice int not null
);

create table prvi_put (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    opis varchar (255)
);

create table dnevnik_prvi (
    dnevnik_aktivnosti int not null,
    prvi_put int not null
);

create table zdravstveni_kutak (
    sifra int not null primary key auto_increment,
    datum date not null,
    vrijeme time,
    odlazak_doktoru boolean,
    pojava zubica boolean,
    cjepivo boolean,
    opis varchar (255)
);

create table dnevnik_zdravstveni (
    dnevnik_aktivnosti int not null.
    zdravstveni_kutak int not null
);

alter table dnevnik_hrana add foreign key (dnevnik_aktivnosti)
references dnevnik_aktivnosti (sifra);

alter table dnevnik_hrana add foreign key (hrana)
references hrana (sifra);

alter table dnevnik_pice add foreign key (dnevnik_aktivnosti)
references dnevnik_aktivnosti (sifra);

alter table dnevnik_pice add foreign key (pice)
references pice (sifra);

alter table dnevnik_san add foreign key (dnevnik_aktivnosti)
references dnevnik_aktivnosti (sifra);

alter table dnevnik_san add foreign key (san)
references san (sifra);

alter table dnevnik_prvi add foreign key (dnevnik_aktivnosti)
references dnevnik_aktivnosti (sifra);

alter table dnevnik_prvi add foreign key (prvi_put)
references prvi_put (sifra);

alter table dnevnik_zdravstveni add foreign key (dnevnik_aktivnosti)
references dnevnik_aktivnosti (sifra);

alter table dnevnik_aktivnosti add foreign key (zdravstveni_kutak)
references zdravstveni_kutak (sifra);
