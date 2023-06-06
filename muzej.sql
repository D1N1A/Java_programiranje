# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\muzej.sql


drop database if exists muzej;
create database muzej;
use muzej;
create table muzej(
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    adresa varchar (100) not null,
    program int not null
);

create table izlozba (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    datum datetime not null,
    vrijeme time not null,
    zbirka int not null,
    sponzor int not null
);

create table program (
    sifra int not null primary key auto_increment,
    izlozba int not null,
    radionica varchar (50),
    performans varchar (50),
    projekcija varchar (50)
);

create table sponzor (
    sifra int not null primary key auto_increment,
);

create table zbirka (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    sakupljač varchar (100),
    djelo int not null
);

create table djelo (
    sifra int not null primary key auto_increment,
    autor varchar (100) not null,
    datum datetime,
    kustos varchar (100) not null
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    OIB char (11) not null,
    osoba int not null
);

create table kustos (
    sifra int not null primary key auto_increment,
    prezime varchar (50) not null,
    osoba int not null
);

alter table muzej add foreign key (program)
references program (sifra);

alter table program add foreign key (izlozba)
references izlozba (sifra);

alter table izlozba add foreign key (zbirka)
references zbirka (sifra);

alter table izlozba add foreign key (sponzor)
references sponzor (sifra);

alter table zbirka add foreign key (djelo)
references djelo (sifra);

alter table sponzor add foreign key (osoba)
references osoba (sifra);

alter table kustos add foreign key (osoba)
references osoba (sifra);

insert into djelo (sifra,naziv,autor,datum,kustos) values
(null,'Proljeće','Pero Perić',15.06.2023.,'Đuro Đurić'),
(null,'Zima','Vera Verić',05.06.2023.,'Kata Katić'),
(null,'Ljeto','Dejan Dejanović', 07.06.2023.,'Filip Filipović');

inset into zbirka (sifra,sakupljac,djelo) values
(null,'Ilija Ilić',1),
(null,'Bero Berić',2),
(null,'MiroMirić',3);

insert into osoba (sifra,ime,OIB) values
(null,'Vinoteka',12345678901),
(null,'Vinko',23456789012),
(null,'Mirta',3456789012),
(null,'Kviskoteka',45678901234),
(null,'Kristina',56789012345),
(null,'Parfemi',67890123456);

insert into spoznor (sifra,osoba) values
(null, 1),
(null,4),
(null,6);

insert into kustos (sifra,prezime,osoba) values
(null,'Vinković',2),
(null,'Mirtić',3),
(null,'Kristić',5);

insert into izlozba (sifra,naziv,datum,vrijeme,zbirka,sponzor) values
(null,'Četiri godišnja doba', 20.05.2023., 16:30,1,1),
(null,'Zimski prizori', 22.05.2023., 19:15,2,2),
(null,'Insekti', 25.05.2023., 18:05,3,3);

insert into program (sifra,izlozba,radionica,performans,projekcija)
(null,1),
(null,2),
(null,3);

insert into muzej (sifra,naziv,adresa,program) values
(null,'Muzej primjenjene umjetnosti','Ulica Republike bb'), 1)
(null,'Muzej iluzija','Istarska ulica bb',2)
(null,'Prirodoslovni muzej','Osječka ulica bb',3);