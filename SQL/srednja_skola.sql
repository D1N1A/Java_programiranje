# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\srednja_skola.sql
drop database if exists srednja_skola;
create database srednja_skola;
use srednja_skola;
create table srednja_skola (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null
);

create table organizacijska_struktura (
    srednja_skola int not null,
    razred int not null
);

create table razred (
    sifra int not null primary key auto_increment,
    godina varchar (50),
    oznaka varchar (50),
    razrednik varchar (100)
);

create table nastava (
    razred int not null,
    profesor int not null
);

create table profesor (
    sifra int not null primary key auto_increment,
    osoba int not null,
    razred int not null
);

create table clan (
    razred int not null,
    ucenik int not null
);

create table ucenik (
    sifra int not null primary key auto_increment,
    osoba int not null,
    razred int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11) not null
);

alter table organizacijska_struktura add foreign key (srednja_skola)
references srednja_skola (sifra);

alter table organizacijska_struktura add foreign key (razred)
references razred (sifra);

alter table nastava add foreign key (razred)
references razred (sifra);

alter table nastava add foreign key (profesor)
references profesor (sifra);

alter table clan add foreign key (razred)
references razred (sifra);

alter table clan add foreign key (ucenik)
references ucenik (sifra);

alter table profesor add foreign key (razred)
references razred (sifra);

alter table profesor add foreign key (osoba)
references osoba (sifra);

alter table ucenik add foreign key (osoba)
references osoba (sifra);

insert into srednja_skola (sifra,naziv,adresa) values
(null,'Ekonomska i upravna škola', 'Trg Svetog Trojstva bb'),
(null,'Opća gimnazija','Ulica Republike bb'),
(null,'Ugostiteljska škola','Zeleno polje bb');

insert into razred (sifra,godina,oznaka,razrednik) values
(null,'drugi razred','b','Marija Marić'),
(null,'treći razred','f','Lada Ladić'),
(null,'četvrti razred','c','Dario Darić');

insert into organizacijska_struktura (srednja_skola,razred) values
(1,1),
(2,2),
(3,3);

insert into osoba (sifra,ime,prezime,oib) values
(null,'Darinka','Darić',12345678901),
(null,'Vedrana','Vedrić',23456789012),
(null,'Milo','Milić',34567890123),
(null,'Mateo','Mateić',45678901234),
(null,'Lea','Leić',56789012345),
(null,'Frano','Franić',67890123456);

insert into profesor (sifra,osoba,razred) values
(4,1),
(5,2),
(6,3,);

insert into ucenik (sifra,osoba,razred) values
(null,1,1),
(null,2,2,),
(null,3.3);

insert into clan (razred,ucenik) values
(1,1),
(2,2),
(3,3);

insert into nastava (razred,profesor) values
(1,1),
(2,2),
(3,3);