# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\djecja_igraonica.sql


drop database if exists djecja_igraonica;
create database djecja_igraonica;
use djecja_igraonica;
create table djecja_igraonica (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100)
);

create table struktura (
    djecja_igraonica int not null,
    skupina int not null
);

create table skupina (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    broj_clanova varchar (50),
    teta int not null
);

create table clan (
    skupina int not null,
    dijete int not null
);

create table dijete (
    sifra int not null primary key auto_increment,
    osoba int not null,
    dob decimal (18,2),
    kontakt_roditelja char (14),
    skupina int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11)
);

create table teta (
    sifra int not null primary key auto_increment,
    osoba int not null,
    kontakt_telefon char (14),
    e_mail varchar (50),
    iban varchar (50)
);

alter table struktura add foreign key (djecja_igraonica)
references djecja_igraonica (sifra);

alter table struktura add foreign key (skupina)
references skupina (sifra);

alter table skupina add foreign key (teta)
references teta (sifra);

alter table clan add foreign key (skupina)
references skupina (sifra);

alter table clan add foreign key (dijete)
references dijete (sifra);

alter table dijete add foreign key (skupina)
references skupina (sifra);

alter table dijete add foreign key (osoba)
references osoba (sifra);

alter table teta add foreign key (osoba)
references osoba (sifra);

insert into djecja_igraonica (sifra,naziv,adresa,kontakt_telefon,e_mail) values
(null,'Igraonica','Park kralja Petra Krešimira IV bb','00385912345678','igraonica@igraonica.hr'),
(null,'EnTenTini','Opatijska bb','00385923456789','ententini@igraonica.hr'),
(null,'Bubamara','Istarska bb','00385934567890','bubamara@igraonica.hr');

insert into skupina (sifra,naziv,broj_clanova) values
(null,'Pilići',15,1),
(null,'Leptirići'12,2),
(null,'Snails'14,3);

insert into teta (sifra,osoba,kontakt_telefon,e_mail,iban) values
(null,1,'00385921234567','teta1@igraonica.hr','HR12345678901234567'),
(null,2,'00385931234567','teta2@igraonica.hr','HR23456789121234567'),
(null,3,'00385951234567','teta3@igraonica.hr','HR34567890121234567');

insert into osoba (sifra,ime,prezime,oib) values
(null,'Lucija','Lucić','12345678901'),
(null,'Dalia','Dalić','23456789012'),
(null,'Bruna','Brunić','34567890123'),
(null,'Dino','Dinić','56789012345'),
(null,'Nika','Nikić','78901234567'),
(null,'Tanja','Tunić','45678901234');

insert into dijete (sifra,osoba,dob,kontakt_roditelja,skupina) values
(null,4,'00385978901234',2),
(null,5,'00385978901235',1),
(null,6,'00385990123456',3);



