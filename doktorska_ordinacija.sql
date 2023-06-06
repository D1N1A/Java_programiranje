# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\doktorska_ordinacija.sql

drop database if exists doktorska_ordinacija;
create database doktorska_ordinacija;
use doktorska_ordinacija;
create table doktorska_ordinacija (
    sifra int not null primary key auto_increment,
    adresa varchar (50) not null,
    doktor int not null,
    kontakt_telefon char (14),
    e_mail varchar (100) not null
);

create table doktor(
    sifra int not null primary key auto_increment,
    osoba int not null,
    lijecenje int not null
);

create table lijecenje (
    sifra int not null primary key auto_increment,
    pacijent int not null,
    doktor int not null,
    medicinska_sestra int not null,
    terapija varchar (100) not null
);

create table pacijent (
    sifra int not null primary key auto_increment,
    osoba int not null,
    oznaka_pacijenta char (100) not null,
    lijecenje int not null,
    ponovno_lijecenje int
);

create table medicinska_sestra (
    sifra int not null primary key auto_increment,
    osoba int not null,
    doktor int not null
);

create table osoba (
	sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB char (11)
);

alter table doktorska_ordinacija add foreign key (doktor)
references doktor (sifra);

alter table doktor add foreign key (posao)
references lijecenje (sifra);

alter table lijecenje add foreign key (pacijent)
references pacijent (sifra);

alter table pacijent add foreign key (ponovno_lijecenje)
references pacijent (sifra);
 
alter table pacijent add foreign key (osoba)
references osoba (sifra);

alter table medicinska_sestra add foreign key (osoba)
references osoba (sifra);

alter table medicinska_sestra add foreign key (doktor)
references doktor (sifra);

insert into doktorska_ordinacija (sifra,adresa,doktor,kontakt_telefon,e_mail) values
(null,'Park kralja Petra Krešimira bb',1,'0912345678','doktor1@dzobz.hr'),
(null,'Drinska ulica bb',2,'0923456788','doktor2@dzobz.hr'),
(null,'Biševska ulica bb',3,'0956789012','doktor3@dzobz.hr');

insert into doktor (sifra,osoba,lijecenje) values
(null,1,1),
(null,2,2),
(null,3,3);

insert into lijecenje (sifra,pacijent,medicinska_sestra,terapija) values
(null,1,1,1,'mirovanje'),
(null,2,2,2,'uzimanje analgetika'),
(null,3,3,3,'vestibularne vježbe')

insert into medicinska medicinska_sestra (sifra,osoba,pacijent) values
(null,4,1,),
(null,5,2),
(null,6,2);

insert into pacijent (sifra,osoba,oznaka_pacijenta,lijecenje,ponovno_lijecenje) values
(null,7,01,1,0),
(null,8,02,2,0),
(null,9,03,3,0);

insert into osoba (sifra,ime,prezime,oib) values
(null,'Ana','Anić',012345678901),
(null,'Nika','Nikić',23456789012),
(null,'Dino','Dinić',34567890123),
(null,'Bruno','Brunić',45678901234),
(null,'Zana','Zanić',56789012345),
(null,'Iva','Ivić',67890123456),
(null,'Lea','Leić',78901234567),
(null,'Petar','Petrić',89012345678),
(null,'Emin','Emić',90123456789);




