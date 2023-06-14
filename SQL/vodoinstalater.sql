# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\vodoinstalater.sql

drop database if exists vodoinstalater;
create database vodoinstalater;
use vodoinstalater;
create table vodoinstalater (
    sifra int not null primary key auto_increment,
    naziv_obrta varchar (50) not null,
    vlasnik varchar (100) not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100)
);

create table posao (
    vodoinstalater int not null,
    popravak int not null
);

create table popravak (
    sifra int not null primary key auto_increment,
    opis varchar (100) not null,
    kvar int not null
);

create table kvar (
    sifra int not null primary key auto_increment,
    opis varchar (100), 
    ponavljanje int
);

create table pomoc (
    popravak int not null,
    segrt int not null
);

create table segrt (
    sifra int not null primary key auto_increment,
    ime varchar (50),
    prezime varchar (50),
    oib char (11),
    kontakt_telefon char (14)
);

alter table posao add foreign key (vodoinstalater)
references vodoinstalater (sifra);

alter table posao add foreign key (popravak)
references popravak (sifra);

alter table popravak add foreign key (kvar)
references kvar (sifra);

alter table pomoc add foreign key (popravak)
references popravak (sifra);

alter table pomoc add foreign key (segrt)
references segrt (sifra);

alter table kvar add foreign key (ponavljanje)
references kvar (sifra);

insert into vodoinstalater (sifra,naziv_obrta,vlasnik,kontakt_telefon,e_mail) values
(null,'Majstor','Pero Perić',00385912345678,'majstor@mail.com'),
(null,'Super Mario','Mario Marić',00385923456789,'supermario@gmail.com'),
(null,'Luigi','Luigi Luigić',00385956789012,'luigi@mail.com');

insert into segrt (sifra,ime,prezime,oib,kontakt_telefon) values
(null,'Petra','Petrić',12345678901,00385978901234),
(null,'Zana','Zanić',23456789012,00385989012345),
(null,'Bruno','Brunić',34567890123,00385990123456);

insert into kvar (sifra,opis)
(null,'zaštopan odvod'),
(null,'pokidan sifon'),
(null,'pokidana cijev za dovod vode');

insert into popravak (sifra,opis,kvar) values
(null,'odštopavanje odvoda',1),
(null,'montiranje novog sifora',2),
(null,'montiranje nove cijevi za dovod vode',3);

insert into pomoc (popravak,segrt) values
(1,1),
(2,2),
(3,3);

insert into posao (vodoinstalater,popravak) values
(1,1),
(2,2),
(3,3);