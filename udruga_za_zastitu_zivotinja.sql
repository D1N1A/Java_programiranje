# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\udruga_za_zastitu_zivotinja.sql

drop database if exists udruga_za_zastitu_zivotinja;
create database udruga_za_zastitu_zivotinja;
use udruga_za_zastitu_zivotinja;
create table udruga_za_zastitu_zivotinja (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    kontakt int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    OIB char (11),
    kontakt int not null,
    prostor int not null
);

create table kontakt (
    sifra int not null primary key auto_increment,
    telefon char (14) not null,
    e_mail varchar (100) not null
);

create table sticenik (
    sifra int not null primary key auto_increment,
    oznaka_sticenika char (100) not null,
    zivotinja int not null,
    prostor int not null
);

create table zivotinja (
    sifra int not null primary key auto_increment,
    ime varchar (100) not null,
    vrsta varchar (50) not null,
    pasmina varchar (50)
);

create table prostor (
    sifra int not null primary key auto_increment,
    oznaka char (50) not null,
    lokacija int not null,
);

alter table udruga_za_zastitu_zivotinja add foreign key (kontakt)
references kontakt (sifra);

alter table osoba add foreign key (kontakt)
references kontakt (sifra);

alter table osoba add foreign key (prostor)
references prostor (sifra);

alter table sticenik add foreign key (prostor)
references prostor (sifra);

alter table sticenik add foreign key (zivotinja)
references zivotinja (sifra);

insert into zivotinja (sifra,ime,vrsta,pasmina) values
(null,'Piko','pas','jazavčar'),
(null,'Kika','ptica','nimfa'),
(null,'Korni','kornjača','barska');

insert into prostor (sifra,oznaka,lokacija)
(null,1,'dvorište'),
(null,2,'krletka'),
(null,3,'akvaterarij');

insert into sticenik (sifra,oznaka_sticenika,zivotinja,prostor) values
(null,1,1,1),
(null,2,2,2),
(null,3,3,3);

insert into kontakt (sifra,telefon,e_mail) values
(null,00385912345678,'uzz1@mail.com'),
(null,00385923456789,'uzz2@mail.com'),
(null,00385956789012,'uzz3@mail.com');

insert into osoba (sifra,ime,prezime,oib,kontakt,prostor) values
(null,'Mara','Marić',12345678901,1,1),
(null,'Leon','Leić',23456789012,2,2),
(null,'Sara','Sarić',34567890123,3,3);

insert into udruga_za_zastitu_zivotinja (sifra,naziv,djelatnost,kontakt) values
(null,'Šapa',1),
(null,'Pobjeda',2),
(null,'Nezaustavljivi',3);

