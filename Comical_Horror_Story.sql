# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists Comical_Horrror_Story;
create database Comical_Horrror_Story;
use Comical_Horrror_Story;

create table igra (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    info int not null,
    zajednica int not null
);

create table info (
    sifra int not null primary key auto_increment,
    o_igri varchar (255) not null,
    galerija int not null
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    autor varchar (100)
);

create table slika (
    sifra int not null primary key auto_increment,
    broj char (2000),
    galerija int not null
);

create table zajednica (
    sifra int not null primary key auto_increment,
    komentar varchar (255),
    misljenje varchar (255)
);

create table korisnicki_racun (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    e_mail varchar (100) not null,
    zajednica int not null
);

alter table igra add foreign key (info)
references info (sifra);

alter table igra add foreign key (zajednica)
references zajednica (sifra);

alter table info add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);

alter table korisnicki_racun add foreign key (zajednica)
references zajednica (sifra);