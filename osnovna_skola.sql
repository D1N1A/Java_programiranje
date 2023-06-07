c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\osnovna_skola.sql

drop database if exists osnovna_skola;
create database osnovna_skola;
use osnovna_skola;
create table osnovna_skola (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null
);

create table sadrzaj (
    osnovna_skola int not null,
    djecja_radionica int not null
);

create table djecja_radionica (
    sifra int not null primary key auto_increment,
    naziv int not null,
    max_polaznika varchar (30) not null
);

create table voditelj (
    djecja_radionica int not null,
    uciteljica int not null
);

create table dijete (
    sifra int not null primary key auto_increment,
    osoba int not null,
    djecja_radionica int not null,
    kontakt_roditelja char (14) not null
);

create table uciteljica (
    sifra int not null primary key auto_increment,
    osoba int not null,
    kontakt_telefon char (14) not null,
    e_mail varchar (100)
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11) not null
);

alter table sadrzaj add foreign key (osnovna_skola)
references osnovna_skola (sifra);

alter table sadrzaj add foreign key (djecja_radionica)
references djecja_radionica (sifra);

alter table voditelj add foreign key (djecja_radionica)
references djecja_radionica (sifra);

alter table voditelj add foreign key (uciteljica)
references uciteljica (sifra);

alter table dijete add foreign key (djecja_radionica)
references djecja_radionica (sifra);

alter table dijete add foreign key (osoba)
references osoba (sifra);

alter table uciteljica add foreign key (osoba)
references osoba (sifra);

insert into osoba (sifra,ime,prezime,oib) values
(null,'Dalia','Dalić','01234567890'),
(null,'Lucija','Lucić','12345678901'),
(null,'Mila','Milić','23456789012'),
(null,'Nika','Nikić','34567890123'),
(null,'Dina','Dinić','56789012345'),
(null,'Tin','Tinić','67890123456');

insert into djecja_radionica (sifra,naziv,max_polaznika) values
(null,'Proljeće',10),
(null,'Cvijeće od papira',12),
(null,'Izrada kukaca od čupave žice i kartona',15);

insert into uciteljica (sifra,osoba,kontakt_telefon,e_mail) values
(null,1,00385912345678,'uciteljica1@skola.com'),
(null,2,00385923456789,'uciteljica2@skola.com'),
(null,3,00385956789012,'učiteljica3@skola.com');

insert into dijete (sifra,osoba,djecja_radionica,kontakt_roditelja) values
(null,4,1,00385978901234),
(null,5,2,00385989012345),
(null,6,3,00385990123456);

insert into voditelj (djecja_radionica,učiteljica) values
(1,1),
(2,2),
(3,3);

insert into osnovna_skola (sifra, naziv, adresa) values
(null,'OŠ Frana Krsto Frankopana','Umaška bb'),
(null,'OŠ Mladost','Osječka bb'),
(null,'OŠ Grigor Vitez','Ulica Republike bb');

insert into sadrzaj (osnovna_skola,djecja_radionica) values
(null,1,1),
(null,2,2),
(null,3,3);