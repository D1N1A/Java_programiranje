c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\obiteljsko_poljoprivredno_gospodarstvo.sql

drop database if exists obiteljsko_poljoprivredno_gospodarstvo;
create database obiteljsko_poljoprivredno_gospodarstvo;
use obiteljsko_poljoprivredno_gospodarstvo;
create table opg (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    vlasnik int not null
);

create table djelatnost (
    opg int not null,
    proizvod int not null
);

create table proizvod (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    vrsta varchar (50)
);

create table sastav (
    proizvod int not null,
    sirovina int not null
);

create table sirovina (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    proizvod int not null
);

create table djelatnik (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11),
    kontakt_telefon char (14),
    e_mail varchar (50)
);

create table odgovornost (
    proizvod int not null,
    djelatnik int not null
);


alter table djelatnost add foreign key (opg)
references opg (sifra);

alter table djelatnost add foreign key (proizvod)
references proizvod (sifra);

alter table sastav add foreign key (proizvod)
references proizvod (sifra);

alter table sastav add foreign key (sirovina)
references sirovina (sifra);

alter table sirovina add foreign key (proizvod)
references proizvod (sifra);

alter table odgovornost add foreign key (proizvod)
references proizvod (sifra);

alter table odgovornost add foreign key (djelatnik)
references djelatnik (sifra);

insert into djelatnik (sifra,ime,prezime,oib) values
(null,'Ana','Anić',012345678901),
(null,'Nika','Nikić',23456789012),
(null,'Dino','Dinić',34567890123);

insert into proizvod (sifra,naziv,vrsta) values
(null,'svježi sir', 'kozji'),
(null,'svježe domaće kiselo vrhnje','kozje'),
(null,'mileram','22 posto masti');

insert into opg (sifra,naziv,vlasnik) values
(null,'OPG Brunić','Bruno Brunić'),
(null,'OPG Nikić', 'Nika Nikić'),
(null,'OPG Dinić', 'Dino Dinić');

insert into odgovornost (proizvod, djelatnik) values
(1,1),
(2,2),
(3.3);

insert into djelatnost (opg,proizvod)
(1,1),
(2,2),
(3,3);

insert into sirovina (sifra,naziv,proizvod) values
(null,'sirutka',1),
(null,'bijeli ocat',2),
(null,'domaće mlijeko',3);

insert into sastav (proizvod,sirovina) values
(1,1),
(2,2),
(3,3);