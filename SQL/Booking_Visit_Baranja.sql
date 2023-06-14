# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists Booking_Visit_Baranja;
create database Booking_Visit_Baranja;

use Booking_Visit_Baranja;

create table smjestaj (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null
);

create table atrakcije (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    korisnicko_ime varchar (100) not null,
    lozinka (100) not null,
    iban varchar (21) not null
);

create table uplata_atrakcija (
    sifra int not null primary key auto_increment,
    atrakcija int not null,
    korisnik int not null,
    cijena decimal (18,2) not null,
    datum date not null,
    
)