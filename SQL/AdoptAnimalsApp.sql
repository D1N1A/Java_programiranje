# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists AdoptAnimalsApp;
create database AdoptAnimalsApp;

use AdoptAnimalsApp;

create table azil (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    info int not null
);

create table info (
    sifra int not null primary key auto_increment,
    o_nama varchar (255) not null,
    opremljenost varchar (255),
    adresa varchar (100) not null
);

create table zivotinja (
    sifra int not null primary key auto_increment,
    vrsta varchar (50) not null,
    starost char (50),
    zdravlje varchar (100),
    navike varchar (100),
    osobine varchar (255),
    opis varchar (255)
);

create table svida_mi_se (
    sifra int not null primary key auto_increment,
    boolean,
    zivotinja int not null
);

create table slika (
    sifra int not null primary key auto_increment,
    br_slike char (50) not null,
    zivotinja int not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnicko_ime varchar (100) not null,
    lozinka (100) not null,
    svida_mi_se int not null,
    iskustva
);

create table iskustva (
    sifra int not null primary key auto_increment,
    komentar varchar (255)
);


alter table azil add foreign key (info)
references info (sifra);

alter table svida_mi_se add foreign key (zivotinja)
references zivotinja (sifra);

alter table korisnik add foreign key (svida_mi_se)
references svida_mi_se (sifra);

alter table korisnik add foreign key (iskustva)
references iskustva (sifra);

alter table slika add foreign key (zivotinja)
references zivotinja (sifra);