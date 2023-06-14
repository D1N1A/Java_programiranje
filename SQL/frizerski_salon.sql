c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\frizerski_salon.sql

drop database if exists frizerski_salon;
create database frizerski_salon;
use frizerski_salon;
create table frizerski_salon (
    sifra int not null primary key auto_increment,
    osoba int not null,
    vlasnik varchar (100),
    lokacija varchar (100)
);

create table djelatnik (
    sifra int not null primary key auto_increment,
    osoba int not null,
    prezime varchar (50) not null ,
    sifra_djelatnika char (20),
    kontakt int not null
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    OIB char (11) not null, 
    IBAN varchar (50)
);

create table korisnik (
    sifra int not null primary key auto_increment, 
    ime varchar (50),
    prezime varchar (50) not null,
    kontakt int not null,
    posjet int not null
   );

create table kontakt (
    sifra int not null primary key auto_increment,
    telefon char (14),
    e_mail varchar (100)
);

create table posjet(
    sifra int not null primary key auto_increment,
    datum datetime,
    vrijeme time,
    usluga int not null
);

create table usluga (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    cijena decimal (18,2) not null
);

alter table frizerski_salon add foreign key (osoba)
references osoba (sifra);

alter table djelatnik add foreign key (osoba)
references osoba (sifra);

alter table djelatnik add foreign key (kontakt)
references kontakt (sifra);

alter table korisnik add foreign key (kontakt)
references kontakt (sifra);

alter table korisnik add foreign key (posjet)
references posjet (sifra);

alter table posjet add foreign key (usluga)
references usluga (sifra);

insert into usluga (sifra,naziv,cijena) values
(null,fen frizura, 20,20),
(null,šišanje,50,40),
(null,bojanje,70,30);

insert into posjet (sifra,datum,vrijeme) values
(null,05.05.2023.,14:30,1),
(null,10.05.2023.,12:15,2),
(null,15.05.2023.,09:35,3);

insert into kontakt (sifra,telefon,e_mail) values
(null,'00385912345678','mail1@email.com'),
(null,'00385923456789','mail2@email.com'),
(null,'00385956789012','mail3@email.com');

insert into korisnik (sifra,ime,prezime,kontakt,posjet) values
(null,'Lea','Leić',1,1),
(null,'Pero','Perić',2,2),
(null,'Iva','Ivić',3,3);

insert into osoba (sifra,ime,oib,IBAN) values
(null,'Ena','56789012345','HR1234567890123456789'),
(null,'Bartol','67890123456','HR2345678901234567890'),
(null,'Mara','78901234567','HR3456789012345678901');

insert into djelatnik (sifra,osoba,prezime,sifra_djelatnika,kontakt) values
(null,1,'Enić',01,1),
(null,2,'Bartić',02,2),
(null,3,'Marić',03,3);

insert into frizerski_salon (sifra,osoba,vlasnik,lokacija) values
(null,1,'Luce Lucić','Osječka ulica bb'),
(null,2,'Bruno Brunić','Ulica Republike bb'),
(null,3,'Sanela Sanić', 'Našička ulica bb');