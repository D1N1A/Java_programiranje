# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\djecji_vrtic.sql

drop database if exists djecji_vrtic;
create database djecji_vrtic;
use djecji_vrtic;
create table djecji_vrtic(
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    lokacija varchar (100),
    kontakt varchar (100) not null,
    kapacitet int not null
);

create table skupina (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    odgajateljica int not null,
    dob_upisanih decimal (18,1),
    kapacitet int not null
);

create table kapacitet (
    sifra int not null primary key auto_increment,
    broj_djece varchar (50)
);

create table dijete (
    sifra int not null primary key auto_increment,
    osoba int not null,
    datum_rodenja datetime,
    skupina int not null,
    telefon_roditelja char (14) not null,
    email_roditelja varchar (100),
    odgajateljica int not null
);

create table odgajateljica (
    sifra int not null primary key auto_increment,
    osoba int not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100),
    strucna_sprema int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB varchar (50) not null
);

create table strucna_sprema (
    sifra int not null primary key auto_increment,
    stupanj_obrazovanja varchar (50),
    steceno_zvanje varchar (50)
);

alter table djecji_vrtic add foreign key (kapacitet)
references kapacitet (sifra);

alter table skupina add foreign key (kapacitet)
references kapacitet (sifra);

alter table skupina add foreign key (odgajateljica)
references odgajateljica (sifra);

alter table dijete add foreign key (osoba)
references osoba (sifra);

alter table dijete add foreign key (skupina)
references skupina (sifra);

alter table odgajateljica add foreign key (osoba)
references osoba (sifra);

alter table odgajateljica add foreign key (strucna_sprema)
references strucna_sprema (sifra);

insert into djecji_vrtic (sifra,naziv,lokacija,kontakt,kapacitet) values
(null,'Kosjenka','Ulica kralja Petra Svačića bb', '00385912344567',3),
(null,'Maslačak','Opatijska bb','00385923456789',1),
(null,'Tratinčica','Istarska bb', '0956789012',2);

insert into kapactet (sifra,broj_djece) values
(null,'12'),
(null,'15'),
(null,'14');

insert into skupina (sifra,naziv,odgajateljica,dob_upisanik,kapacitet)
(null,'Pilići', ,2,1),
(null,'Leptirići', , 1,2),
(null,'Snails', ,3,3);

insert into odgajateljica (osoba,kontakt_telefon,e_mail,strucna_sprema) values
(1,'00385978901234','odgajateljica1@vrtic.hr',1),
(2,'00385989012345','odgajateljica2@vrtic.hr',2),
(3,'00385990123455','odgajateljica3@vrtic.hr',2);

insert into strucna_sprema (sifra,stupanj_obrazovanja,steceno_zvanje) values
(null,'VSS','prvostupnik'),
(null,'VSS','magistar');

insert into dijete (sifra,osoba,datum_rodenja,skupina,telefon_roditelja,email_roditelja,odgajateljica);
(null,4,11.04.2020.,1,'00385912346789','bruno.brunic@gmail.com',1),
(null,5,19.2.2022.,'0038500385912346789','bruno.brunic@gmail.com',2),
(null,6,05.05.2019.,'00385923457890','iva.ivic@gmial.com',3);

insert into osoba (sifra,ime,prezime,oib) insert
(null,'Dalia','Dalić','01234567890'),
(null,'Lucija','Lucić','12345678901'),
(null,'Mila','Milić','23456789012'),
(null,'Nika','Nikić','34567890123'),
(null,'Dina','Dinić','56789012345'),
(null,'Tin','Tinić','67890123456');
