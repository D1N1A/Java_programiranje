# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists e_lektirni_katalog;
create database e_lektirni_katalog;
use e_lektirni_katalog;

create table katalog (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    cilj varchar (255) 
);

create table knjizevno_djelo (
    sifra int not null primary key auto_increment,
    naslov varchar (100) not null,
    autor varchar (100) not null,
    mjesto varchar (100) not null,
    izdavac varchar (100),
    zanimljivosti varchar (255),
    poveznica varchar (255)
);

create table korisnik (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    srednja_skola varchar (100),
    e_mail varchar (100) not null,
    katalog int not null
);

create table zbirka (
    katalog int not null,
    knjizevno_djelo int not null
);


alter table korisnik add foreign key (katalog)
references katalog (sifra);

alter table zbirka add foreign key (katalog)
references katalog (sifra);

alter table zbirka add foreign key (knjizevno_djelo)
references knjizevno_djelo (sifra);


