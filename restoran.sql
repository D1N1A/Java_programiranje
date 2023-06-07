c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\restoran.sql
drop database if exists restoran;
create database restoran;
use restoran;
create table restoran (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    adresa varchar (50) not null,
    vlasnik varchar (50) not null,
    jelovnik int not null
);

create table jelovnik (
    sifra int not null primary key auto_increment,
    vrsta varchar (50)
);

create table sadrzaj (
    jelovnik int not null,
    kategorija int not null
);

create table kategorija (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    jelo int not null
);

create table jelo (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    sastojci varchar (100)
);

create table preporuka (
    jelo int not null,
    pice int not null
);

create table pice (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    datum_proizvodnje datetime,
    sorta boolean
);



alter table restoran add foreign key (jelovnik)
references jelovnik (sifra);

alter table sadrzaj add foreign key (jelovnik)
references jelovnik (sifra);

alter table sadrzaj add foreign key (kategorija)
references kategorija (sifra);

alter table kategorija add foreign key (jelo)
references jelo (sifra);

alter table preporuka add foreign key (jelo)
references jelo (sifra);

alter table preporuka add foreign key (pice)
references pice (sifra);

insert into pice (sifra,naziv,datum_proizvodnje,sorta) values
(null,'vino',2015.,'graševina'),
(null,'pivo',2022.,'svijetlo'),
(null,'sok od višnje',2023.,'maraska');

insert into jelo (sifra,naziv,sastojci) values
(null,'rižoto s morskim plodovina','riža,dagnje,kozice,račići,maslinovo ulje'),
(null,'janjetina ispod peke','janjetina,krumpir,mrkva,tikvica,luk'),
(null,'pasta quattro formaggi','tjestenina na bazi riže, emmentaler, gouda, mozzarela, gorgonzola, vrhnje');

insert into kategorija (sifra,naziv,jelo) values
(null,'pesco',1),
(null,'mesno',2),
(null,'vege',3);

insert into jelovnik (sifra,vrsta) values
(null, 'peskatarijanski'),
(null,'mesni'),
(null,'vegetarijanski');

insert into sadrzaj (jelovnik,kategorija) values
(1,1),
(2,2),
(3,3);

insert into restoran (sifra,naziv,adresa,vlasnik,jelovnik) values
(null,'More','Umaška bb','Šime Šimić',1),
(null,'Ispod kestena','Miro Mirić',2),
(null,'Vegetarijanci','Filipa Filipović',3);