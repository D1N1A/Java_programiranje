# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\odvjetnik.sql

drop database if exists odvjetnik;
create database odvjetnik;
use odvjetnik;
create table odvjetnik (
    sifra int not null primary key auto_increment,
    naziv_ureda varchar (100),
    osoba int not null
);

create table djelatnost (
    odvjetnik int not null,
    obrana int not null
);

create table obrana (
    sifra int not null primary key auto_increment,
    datum datetime,
    sat time,
    sud varchar (50)
);

create table ispomoc (
    obrana int not null,
    suradnik int not null
);

create table suradnik (
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50),
    prezime varchar (50),
    oib char (11),
    kontak_telefon char (14),
    e_mail varchar (50),
    iban varchar (50)   
);

create table stranka (
    obrana int not null,
    klijent int not null
);

create table klijent (
    sifra int not null primary key auto_increment,
    osoba int not null
);

alter table odvjetnik add foreign key (osoba)
references osoba (sifra);

alter table djelatnost add foreign key (odvjetnik)
references odvjetnik (sifra);

alter table djelatnost add foreign key (obrana)
references obrana (sifra);

alter table stranka add foreign key (obrana)
references obrana (sifra);

alter table stranka add foreign key (klijent)
references klijent (sifra);

alter table ispomoc add foreign key (obrana)
references obrana (sifra);

alter table ispomoc add foreign key (suradnik)
references suradnik (sifra);

alter table suradnik add foreign key (osoba)
references osoba (sifra);

alter table klijent add foreign key (osoba)
references osoba (sifra);


insert into osoba (sifra,ime,prezime,oib,kontak_telefon,e_mail,iban) values
(null,'Ana','Anić',012345678901,003857890123,'anic@mail.com'),
(null,'Nika','Nikić',23456789012,00385912345678,'nikic@mail.com'),
(null,'Dino','Dinić',34567890123,00385923456789,'dinic@mail.com'),
(null,'Bruno','Brunić',45678901234,00385956789012,'brunic@mail.com'),
(null,'Zana','Zanić',56789012345,00385978901234,'zanic@mail.com'),
(null,'Iva','Ivić',67890123456,00385989012345,'ivic@mail.com'),
(null,'Lea','Leić',78901234567,00385990123456,'leic@mail.com'),
(null,'Petar','Petrić',89012345678,00385913456789,'petric@mail.com'),
(null,'Emin','Emić',90123456789,00385924567890,'emic@mail.com');

insert into odvjetnik (sifra,naziv_ureda,osoba) values
(null,'Odvjetnik Ana Anić',1),
(null,'Odvjetnik Nika Nikić',2),
(null,'Odvjetnik Dino Dinić',3);

insert into obrana (sifra,datum,sat,sud) values
(null,19.05.2023.,11:30,'OS Vinkovci'),
(null,18.05.2023.,09:30,'OS Našice'),
(null,17.05.2023,08:15,'OS Osijek');

insert into djelatnost (odvjetnik obrana) values 
(1,1),
(2,2),
(3,3);

insert into suradnik (sifra,osoba) values
(null,4),
(null,5),
(null,6);

insert into ispomoc (obrana,suradnik) values
(1,3),
(2,2),
(3,1);

insert into klijent (sifra,osoba) values
(null,7),
(null,8),
(null,9);

insert into stranka (obrana,klijent) values
(1,3),
(2,1),
(3,2);

