c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\urar_Silvija.sql

drop database if exists urar__Silvija;
create database urar__Silvija;
use urar__Silvija;
create table urar_Silvija(
    sifra int not null primary key auto_increment,
    adresa varchar (100) not null,
    vlasnik varchar (100),
    kontakt_telefon char (14),
    e_mail varchar (100),
    djelatnost varchar (200),
    segrt int not null,
    popravak int not null
);

create table sat (
    sifra int not null primary key auto_increment,
    marka varchar (50),
    cijena_popravka decimal (18,2) not null,
    ponovni_popravak int
);

create table korisnik (
    sifra int not null primary key auto_increment,
    prezime varchar (50) not null,
    oznaka_popravka char (100) not null,
    sat int not null,
    iban varchar (50) 
);

create table segrt (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB char (11) not null
);

alter table urar_Silvija add foreign key (popravak)
references sat (sifra);

alter table urar_Silvija add foreign key (segrt)
references segrt (sifra);

alter table korisnik add foreign key (sat)
references sat (sifra);

alter table sat add foreign key (ponovni_popravak)
references sat (sifra);

insert into segrt (sifra,ime,prezime,oib) values
(null,'Pero','Perić',12345678901),
(null,'Iva','Ivić',23456789012),
(null,'Zana','Zanić',34567890123);

insert into sat (sifra,marka,cijena_popravka,ponovni_popravak) values
(null,'Guess',20.25,null),
(null,'Casio',15.10,null),
(null,'Rolex',50.25,null);

insert into korisnik (sifra,prezime,oznaka_popravka,sat,iban) values
(null,'Perić',1,1,'HR1234567890123456789'),
(null,'Mlakar',2,2,'HR2345678901234567890'),
(null,'Brunić',3,3,'HR3456789012345678901');

insert into urar__Silvija (sifra,adresa,vlasnik,kontakt_telefon,e_mail,djelatnost,segrt,ponovni_popravak) values
(null,'Oparijska bb','Silvija Silvić',00385912345678,'urarsilvija@mail.com','popravak i prodaja satova',3,3);