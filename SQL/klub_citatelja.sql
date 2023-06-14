c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\klub_citatelja.sql

drop database if exists klub_citatelja;
create database klub_citatelja;
use klub_citatelja;
create table klub_citatelja (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    kontakt varchar (100)
);

create table sastav (
    klub_citatelja int not null,
    clan int not null
);

create table clan (
    sifra int not null primary key auto_increment,
    sifra_clana char (50) not null,
    osoba int not null,
    knjiga int not null,
    citatelj int not null
);

create table knjiga (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    autor varchar (100) not null,
    izdavac varchar (100),
    citatelj int not null,
    vlasnik int not null
);

create table vlasnik (
    sifra int not null primary key auto_increment,
    sifra_vlasnika char (50) not null,
    osoba int not null
);

create table imovina (
    knjiga int not null,
    vlasnik int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (50)
);

create table citatelj (
    sifra int not null primary key auto_increment,
    sifra_citatelja char (50) not null,
    osoba int not null,
    knjiga int not null
);


alter table sastav add foreign key (clan)
references clan (sifra);

alter table knjiga add foreign key (citatelj)
references citatelj (sifra);

alter table clan add foreign key (knjiga)
references knjiga (sifra);

alter table imovina add foreign key (knjiga)
references knjiga (sifra);

alter table imovina add foreign key (vlasnik)
references vlasnik (sifra);

alter table vlasnik add foreign key (osoba)
references osoba (sifra);

alter table citatelj add foreign key (osoba)
references osoba (sifra);

alter table clan add foreign key (osoba)
references osoba (sifra);

alter table clan add foreign key (citatelj)
references citatelj (sifra);

alter table sastav add foreign key (klub_citatelja)
references klub_citatelja (sifra);

insert into osoba (sifra,ime,prezime,kontakt_telefon,e_mail) values
(null,'Ana','Anić',012345678901,00385912345678,'ana@mail.com'),
(null,'Nika','Nikić',23456789012,00385923456789,'nika@mail.com'),
(null,'Dino','Dinić',34567890123,00385953456789,'dino@mail.com');

insert into citatelj (sifra,sifra_citatelja,osoba,knjiga) values
(null,01,1,1),
(null,02,2,2),
(null,03,3,3);

insert into knjiga (sifra,naziv,autor,izdavac,citatelj,vlasnik) values
(null,'Ana Karenjina','Lav Nikolajevič Tolstoj','Školska knjiga',1),
(null,'Danski odgoj djece','Jessica Joelle Alexander i Iben Dissing Sandahl','Puls',2),
(null,'Kuća lutaka','Henrik Ibsen','Klasici',3)

insert into clan (sifra,sifra_clana,osoba,knjiga,citatelj) values
(null,01,1,1,1,),
(null,02,2,2,2,),
(null,03,3,3,3,);

insert into vlasnik (sifra_vlasnika, osoba) values
(null,1,1,),
(null,2,2,),
(null,3,3);

insert into klub_citatelja values
(null,'Čitam knjigu', 00385978901234),
(null,'Knjiga',00385989012345),
(null,'Book',00385990123456);

