# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists ZOK_Vitez_11;
create database ZOK_Vitez_11;
use ZOK_Vitez_11;

create table odbojkasni_klub (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100),
    trener int not null,
    info int not null,
    zajednica int not null
);

create table trener (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null
);

create table igracica (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    broj char (100) not null
)

create table sastav (
    odbojkasni_klub int not null,
    igracica int not null
);

create table zajednica (
    sifra int not null primary key auto_increment,
    komentari varchar (255) 
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnicko_ime varchar (100) not null,
    lozinka varchar (100) not null,
    e_mail varchar (100) not null,
    zajednica int not null
);

create table info (
    sifra int not null primary key auto_increment,
    o_nama varchar (255) not null,
    nadolazeca_utakmica int not null,
    prosla_utakmica int not null
);

create table prosla_utakmica (
    sifra int not null primary key auto_increment,
    datum date not null,
    galerija int not null
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    opis varchar (255),
    autor varchar (100)
);

create table slika (
    sifra int not null primary key auto_increment,
    broj char (1000),
    galerija int not null
);

create table nadolazeca_utakmica (
    sifra int not null primary key auto_increment,
    protivnik varchar (100) not null,
    datum date not null,
    vrijeme time not null,
    mjesto varchar (100) not null
);

alter table odbojkasni_klub add foreign key (zajednica)
references zajednica (sifra);

alter table odbojkasni_klub add foreign key (trener)
references trener (sifra);

alter table odbojkasni_klub add foreign key (zajednica)
references zajednica (sifra);

alter table odbojkasni_klub add foreign key (info)
references info (sifra);

alter table sastav add foreign key (odbojkasni_klub)
references odbojkasni_klub (sifra);

alter table sastav add foreign key (igracica)
references igracica (sifra);

alter table korisnik add foreign key (zajednica)
references zajednica (sifra);

alter table info add foreign key (nadolazeca_utakmica)
references nadolazeca_utakmica (sifra);

alter table info add foreign key (prosla_utakmica)
references prosla_utakmica (sifra);

alter table prosla_utakmica add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);