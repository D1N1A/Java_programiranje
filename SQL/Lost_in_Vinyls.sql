# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists Lost_in_Vinyls;
create database Lost_in_Vinyls;

use Lost_in_Vinyls;

create table projekt (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    zajednica int not null
);

create table zajednica(
    sifra int not null primary key auto_increment,
    ponuda int not null,
    potraznja int not null
);

create table ponuda(
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    izvodac varchar (100),
    godina year
);

create table potraznja (
    sifra int not null primary key auto_increment,
    naziv_albuma varchar (100) not null,
    izvodac varchar (100),
    godina year
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnik varchar (100) not null,
    lozinka varchar (50) not null,
    iban char (11),
    zajednica int not null
);

alter table projekt add foreign key (zajednica)
references zajednica (sifra);

alter table zajednica add foreign key (ponuda)
references ponuda (sifra);

alter table zajednica add foreign key (potraznja)
references potraznja (sifra);

alter table korisnik add foreign key (zajednica)
references zajednica (sifra);