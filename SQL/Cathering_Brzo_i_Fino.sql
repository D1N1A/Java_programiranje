# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists Cathering_Brzo_i_Fino;
create database Cathering_Brzo_i_Fino;

use Cathering_Brzo_i_Fino;

create table cathering (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null,
    kontakt varchar (100) not null
);

create table jelovnik (
    sifra int not null primary key auto_increment,
    ponuda varchar (255) not null,
    cathering int not null
);

create table pice (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    cijena decimal (18,2) not null,
    jelovnik int not null
);

create table jelo (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    cijena decimal (18,2) not null,
    jelovnik int not null
);

create table narudzba (
    sifra int not null primary key auto_increment,
    proizvod varchar (100) not null,
    cijena varchar (18,2) not null,
    catherin int not null
);

create table iskustvo (
    sifra int not null primary key auto_increment,
    komentari varchar (255),
    iskustva varchar (255),
    cathering int not null
);

create table ocjena (
    sifra int not null primary key auto_increment,
    ocjena boolean not null,
    cathering int not null
);

create table reg_korisnik (
    sifra int not null primary key auto_increment,
    korisnicki_racun varchar (100) not null,
    lozinka varchar (100) not null,
    iban varchar (21) not null,
    iskustvo int not null,
    narudzba int not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    email varchar (100) not null,
    broj_narudzbe char (50),
    narudzba int not null,
    ocjena int not null
);


alter table jelovnik add foreign key (cathering)
references cathering (sifra);

alter table narudzba add foreign key (cathering)
references cathering (sifra);

alter table ocjena add foreign key (cathering)
references cathering (sifra);

alter table iskustva add foreign key (cathering)
references cathering (sifra);

alter table pice add foreign key (pice)
references pice (sifra);

alter table jelo add foreign key (jelo)
references jelo (sifra);

alter table reg_korisnik add foreign key iskustvo
references iskustvo (sifra);

alter table reg_korisnik add foreign key (narudzba)
references narudzba (sifra);

alter table korisnik add foreign key (narudzba)
references narudzba (sifra);

alter table korisnik add foreign key (ocjena)
references ocjena (sifra);
