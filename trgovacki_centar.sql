# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\trgovacki_centar.sql

drop database if exists trgovacki_centar;
create database trgovacki_centar;
use trgovacki_centar;
create table trgovacki_centar (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null
);

create table struktura (
    trgovacki_centar int not null,
    trgovina int not null
);

create table trgovina (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    roba varchar (100) not null,
    sef int not null
);

create table djelatnik (
    trgovina int not null,
    zaposlenik int not null
);

create table zaposlenik (
    sifra int not null primary key auto_increment,
    osoba int not null
    );

create table sef (
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11) not null,
    radno_mjesto varchar (50)
);

alter table struktura add foreign key (trgovacki_centar)
references trgovacki_centar (sifra);

alter table struktura add foreign key (trgovina)
references trgovina (sifra);

alter table trgovina add foreign key (sef)
references sef (sifra);

alter table djelatnik add foreign key (trgovina)
references trgovina (sifra);

alter table djelatnik add foreign key (zaposlenik)
references zaposlenik (sifra);

alter table sef add foreign key (osoba)
references osoba (sifra);

alter table zaposlenik add foreign key (osoba)
references osoba (sifra);

insert into trgovacki_centar (sifra,naziv,adresa) values
(null,'AllStar','Zeleno polje bb'),
(null,'ExtraNova','Opatijska bb'),
(null,'Konzumerizan','Cvjetkova bb');

insert into osoba (sifra,ime,prezime,oib,radno mjesto) values
(null,'Petar','Petrić',12345678901,'voditelj prodaje'),
(null,'Vera','Verić',23456789012,'voditelj prodaje'),
(null,'Stanko','Stanić',34567890123,'voditelj,prodaje'),
(null,'Vatko','Vlatkić',45678901234,'prodavač'),
(null,'Pera','Perić',56789012345,'prodavač'),
(null,'Sara','Sarić',67890123456,'prodavač'),
(null,'Iva','Ivić',78901234567,'prodavač'),
(null,'Mijo','Mijić',89012345678,'prodavač'),
(null,'Leon','Leonić',90123456789,'prodavač');

insert into sef (sifra,osoba) values
(1,1),
(2,2),
(3,3);

insert into trgovina (sifra,naziv,roba,sef) values
(null,'Frizeraj','frizerska oprema',1),
(null,'Kućni ljubimci','oprema i hrana za kućne ljubimce',2),
(null,'Food and stuff','prodaja namirnica i hrane',3);

insert into zaposlenik (sifra,osoba) values
(null,4),
(null,5),
(null,6);

insert into djelatnik (trgovina,zaposlenik) values
(1,4),
(2,5),
(3,6);

insert into struktura (trgovacki_centar,trgovina) values
(1,1),
(2,2),
(3,3);

