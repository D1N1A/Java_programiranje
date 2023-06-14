# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\taksi_sluzba.sql

drop database if exists taksi_sluzba;
create database taksi_sluzba;
use taksi_sluzba;
create table taksi_sluzba(
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    imovina int not null
);

create table imovina (
    sifra int not null primary key auto_increment,
    vozilo int not null
);

create table vozilo (
	sifra int not null primary key auto_increment,
	taksi_broj char (50) not null,
	marka varchar (50),
	tip varchar (50),
	broj_sasije varchar (17),
	vozac int not null
);

create table vozac (
    sifra int not null primary key auto_increment,
    broj_vozaca char (50),
    osoba int not null,
    putnik int not null,
    voznja int not null
);

create table putnik (
    sifra int not null primary key auto_increment,
    voznja int not null,
    osoba int not null,
    suputnik int
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB char (11) not null,
    IBAN varchar (50) not null,
    kontakt_telefon char (14)
);

create table voznja (
    sifra int not null primary key auto_increment,
    broj varchar (200),
    putnik int not null,
    vozac int not null
);

alter table taksi_sluzba add foreign key (imovina)
references imovina (sifra);

alter table imovina add foreign key (vozilo)
references vozilo (sifra);

alter table vozilo add foreign key (vozac)
references vozac (sifra);

alter table vozac add foreign key (putnik)
references putnik (sifra);

alter table vozac add foreign key (voznja)
references voznja (sifra);

alter table vozac add foreign key (osoba)
references osoba (sifra);

alter table putnik add foreign key (osoba)
references osoba (sifra);

alter table putnik add foreign key (voznja)
references voznja (sifra);

alter table putnik add foreign key (suputnik)
references putnik (sifra);

alter table voznja add foreign key (putnik)
references putnik (sifra);

alter table voznja add foreign key (vozac)
references vozac (sifra);

insert into osoba (sifra,ime,prezime,OIB,IBAN,kontakt_telefon) values
(null,'Mia','Mijić',12345678901,'HR1234567890123456789',00385912345678),
(null,'Tin','Tinić',23456789012,'HR2345678901234567890',00385923456789),
(null,'Marija','Marić',34567890123,'HR34567890123456789012',00385956789012),
(null,'Robert','Robić',45678901234,'HR4567890123456789012',00385978901234),
(null,'Pero','Perić',56789012345,'HR5678901234567890123',00385989012345),
(null,'Tanja','Tanjić',67890123456,'HR6789012345678901234',00385990123456);

insert into putnik (sifra,voznja,osoba,suputnik) values
(null,1,1),
(null,2,2),
(null,3,3);

insert into voznja (sifra,broj,putnik,vozac) values
(null,1,1,1),
(null,2,2,2),
(null,3,3,3);

insert into vozac (sifra,broj_vozaca,osoba,putnik,voznja) values
(null,1,4,1,1),
(null,2,5,2,2),
(null,3,6,3,3);

insert into vozilo (sifra,taksi_broj,marka,tip,broj_sasije,vozac) values
(null,1,'Alfa','Romeo',12345678901234567),
(null,2,'Kia','Stonic',23456789012345678),
(null,3,'Audi','A6',34567890123456789);

insert into imovina (sifra,vozilo) values
(null,1),
(null,2),
(null,3);

insert into taksi_sluzba (sifra,naziv,imovina) values
(null,'Brzi',1),
(null,'Munja',2),
(null,'Žuti taxi',3);