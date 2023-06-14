# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\Git\Java_programiranje\DVD_Branjin_Vrh.sql

drop database if exists DVD_Branjin_Vrh;
create database DVD_Branjin_Vrh;
use DVD_Branjin_Vrh;

create table dobrovoljno_vatrogasno_drustvo (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    adresa varchar (100),
    info int not null,
    kontakt int not null
);

create table info (
    sifra int not null primary key auto_increment,
    novina int not null,
    predostojeci_dogadaj int not null,
    galerija int not null
);

create table novina (
    sifra int not null primary key auto_increment,
    naslov varchar (50),
    opis varchar (255) not null
);

create table predostojeci_dogadaj (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    datum date not null,
    vrijeme time not null,
    opis varchar (255)
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    datum date,
    vrijeme time
);

create table slika (
    sifra int not null primary key auto_increment,
    autor varchar (100),
    galerija int not null
);

create table kontakt (
    sifra int not null primary key auto_increment,
    kontakt_telefon char (14),
    e_mail varchar (100) not null,
    prijavnica int not null
);

create table prijavnica (
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    kontakt_telefon char (14) not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnicko_ime varchar (100) not null,
    lozinka varchar (50) not null
);

create table prijavnica_korisnik (
    korisnik int not null,
    prijavnica int not null
);

create table kontakt_korisnik (
    korisnik int not null,
    kontakt int not null
);

alter table dobrovoljno_vatrogasno_drustvo add foreign key (info)
references info (sifra);

alter table dobrovoljno_vatrogasno_drustvo add foreign key (kontakt)
references kontakt (sifra);

alter table info add foreign key (novina)
references novina (sifra);

alter table info add foreign key (predostojeci_dogadaj)
references predostojeci_dogadaj (sifra);

alter table info add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);

alter table kontak add foreign key (prijavnica)
references prijavnica (sifra);

alter table prijavnica_korisnik add foreign key (prijavnica)
references prijavnica (sifra);

alter table prijavnica_korisnik add foreign key (korisnik)
references korisnik (sifra);

alter table kontakt_korisnik add foreign key (korisnik)
references korisnik (sifra);

alter table kontakt_korisnik add foreign key (kontakt)
references kontakt (sifra);