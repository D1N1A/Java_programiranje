# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists koncertna_mreza;
createa database koncertna_mreza;
use koncertna_mreza;

create table koncertna_mreza (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    info int not null,
    zajednica int not null
);

create table info (
    sifra int not null primary key auto_increment,
    predstojeci_dogadaj int not null,
    novi_koncert int no null,
    galerija int not null
);

create table predstojeci_dogadaj (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    opis varchar (255),
    adresa varchar (100) not null,
    datum date not null,
    vrijeme time not null
);

create table galerija (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    autor varchar (100)
);

create table novi_koncert (
    sifra int not null primary key auto_increment,
    mjesto varchar (100) not null,
    datum date not null,
    vrijeme time not null
);

create table korisnik (
    sifra int not null primary key auto_increment,
    korisnicko_ime varchar (100) not null,
    lozinka varchar (100) not null,
    rezervacija int not null
);

create table rezervacija (
    sifra int not null primary key auto_increment,
    broj_rezervacije char (1000) not null,
    koncert int not null
);

create table zajednica_korisnik (
    korisnik int not null,
    zajednica int not null
);

alter table koncertna_mreza add foreign key (info)
references info (sifra);

alter table koncertna_mreza add foreign key (zajednica)
references zajednica (sifra);

alter table info add foreign key (predstojeci_dogadaj)
references predstojeci_dogadaj (sifra);

alter table info add foreign key (novi_koncert)
references novi_koncert (sifra);

alter table info add foreign key (galerija)
references galerija (sifra);

alter table slika add foreign key (galerija)
references galerija (sifra);

alter table korisnik add foreign key (rezervacija)
references rezervacija (sifra);

alter table rezervacija add foreign key (novi_koncert)
references novi_koncert (sifra);

alter table zajednica_korisnik add foreign key (korisnk)
references korisnik (sifra);

alter table zajednica_korisnik add foreign key (zajednica)
references zajednica (sifra);
