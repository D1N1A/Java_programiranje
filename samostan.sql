# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\samostan.sql

drop database if exists samostan;
create database samostan;
use samostan;
create table samostan (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100) not null,
    prostor int not null
);

create table prostor (
    sifra int not null primary key auto_increment,
    lokacija varchar (100) not null,
    svecenik int not null
);

create table svecenik (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    posao int not null, 
    nadredeni int
);

create table posao (
    sifra int not null primary key auto_increment,
    opis varchar (100) not null,
    dodatni_posao int,
    ispomoc int not null
);

alter table samostan add foreign key (prostor)
references prostor (sifra);

alter table prostor add foreign key (svecenik)
references svecenik (sifra);

alter table svecenik add foreign key (posao)
references posao (sifra);

alter table svecenik add foreign key (nadredeni)
references svecenik (sifra);

alter table posao add foreign key (ispomoc)
references svecenik (sifra);

alter table posao add foreign key (dodatni_posao)
references posao (sifra);

insert into posao (sifra,opis,dodatni_posao,ispomoc) values
(null,'vođenje Svete Mise',null,4),
(null,'ispovijed',null,5),
(null,'vođenje susreta bračnih parova',null,6);

insert into svecenik (sifra,ime,prezime,posao,nadredeni) values
(null,'Pero','Perić',1,null),
(null,'Đuro','Đurić',2,1),
(null,'Stjepan','Stjepić',3,1),
(null,'Mirjan','Mirić',1,2),
(null,'Dejan','Dejić',2,2),
(null,'Leo','Leić',3,2);

insert into prostor (sifra,lokacija,svecenik) values
(null,'1.kat sjever građevine',1),
(null,'1. kat jug građevine',2),
(null,'2.kat sjever građevine',3);

insert into samostan (sifra,naziv,adresa,prostor) values
(null,'Sv. Franjo Asiški', 'Opatijska bb',1),
(null,'Sv. Antun Padovanski', 'Umaška bb', 2),
(null,'Sv. Josipa', 'Osječka bb', 3);