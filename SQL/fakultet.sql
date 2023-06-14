# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\fakultet.sql

drop database if exists fakultet;
create database fakultet;
use fakultet;
create table fakultet (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    adresa varchar (100) not null,
    kontakt_telefon char (14),
    e_mail varchar (100),
);

create table studijski program (
    fakultet int not null,
    kolegij int not null
);

create table kolegij (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    ECTS_bodova char (2) not null,
    ocjena varchar (50),
    fakultet int not null
);

create table rok (
    sifra int not null primary key auto_increment,
    kolegij int not null,
    datum datetime not null,
    vrijeme time not null,
    prijavljeni int not null,
    ponavljanje int
);

create table student (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11) not null,
    jmbag char (10) not null,
    prijavljeni_ispit int not null
);

create table prijavljeni_ispit (
	student int not null,
	rok int not null
	);



alter table kolegij add foreign key (fakultet)
references fakultet (sifra);

alter table rok add foreign key (kolegij)
references kolegij (sifra);

alter table rok add foreign key (ponavljanje)
references rok (sifra);

alter table prijavljeni_ispit add foreign key (student)
references student (sifra);

alter table prijavljeni_ispit add foreign key (rok)
references rok (sifra);

insert into fakultet (sifra,naziv,adresa,kontakt_telefon,e_mail,studijski_program) values
(null,'Ekonomski fakultet', 'Vukovarska bb','031580123','ekonomski@fakultet.hr'1,),
(null,'Pravni fakultet','Ulica Stjepana Radića','031580234','pravni@fakultet.hr',2),
(null,'Filozofski fakultet','Ulica Lorenza Jagera','031580345','filozofski@fakultet.hr',3);

insert into kolegij (sifra,naziv,ECTS_bodova,ocjena) values
(null,'integrirani diplomski i preddiplomski smjer',360,'izvrstan'),
(null, 'preddiplomski studij',240,'dobar'),
(null,'diplomski studij',120,'dovoljan');

insert into student (sifra,ime,prezime,oib,jmbag,prijavljeni_rok) values
(null,'Ana','Anić',012345678901,1234567890,1),
(null,'Nika','Nikić',23456789012,2345678901,2),
(null,'Dino','Dinić',34567890123,3456789012,3);

insert into rok (sifra,kolegij,datum,vrijeme,prijavljeni,ponavljanje)
(null,1,15.01.2024.,16:30,1,0),
(null,2,05.04.2024.,12:30,2,0),
(null,3,01.06.2024.,09:00,3,0);

