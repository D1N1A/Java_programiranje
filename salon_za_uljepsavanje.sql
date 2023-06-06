# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\salon_za_uljepsavanje.sql
drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;
use salon_za_uljepsavanje;
create table salon_za_uljepsavanje (
    sifra int not null primary key auto_increment,
    osoba int not null,
    vlasnik varchar (100),
    djelatnost varchar (100),
    lokacija varchar (100)
);

create table djelatnik (
    sifra int not null primary key auto_increment,
    osoba int not null,
    prezime varchar (50) not null,
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

alter table salon_za_uljepsavanje add foreign key (osoba)
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
(null,'čišćenje lica',35,75),
(null,'dermapen tretman lica',70,50),
(null,'tesla sculptor tretman', 100,25);

insert into posjet (sifra,datum,vrijeme,usluga) values
(null,17.05.2023.,14;15,1),
(null,18.05.2023.,17;30,2),
(null,19.05.2023.,18:00,3);

insert into kontakt (sifra,telefon,mail) values
(null,00385912345678,'djelatnik1@mail.com'),
(null,00385923456789,'djelatnik2@mail.com'),
(null,00385956789012,'djelatnik3@mail.com'),
(null,00385978901234,'korisnik1@mail.com'),
(null,00385989012345,'korisnik2@mail.com'),
(null,00385990123456,'korisnik3@mail.com');

insert into korisnik (sifra,ime,prezime,kontakt,posjet) values
(null,'Petra','Petrić',4,1),
(null,'Marija','Marić',5,2),
(null,'Josipa','Josić',6,3);

insert into osoba (sifra,ime,OIB,IBAN) values
(null,'Royal Swiss Beauty'12345678901,'HR1234567890123456789'),
(null,'Nika',23456789012,'HR2345678901234567890'),
(null,'Dino',34567890123,'HR3456789012345678901'),
(null,'Ana',56789012345,'HR5678901234567890123'),
(null,'Orhideja',6789012345,'HR6789012345678901234'),
(null,'Ljepota',78901234567,'HR7890123456789012345');

insert into djelatnik (sifra,osoba,prezime,sifra_djelatnika,kontakt) values
(null,2,'Nikić',01,1),
(null,3,'Dinić',02,2),
(null,4,'Anić',03,3);

insert into salon_za_uljepsavanje (sifra,osoba,vlasnik,djelatnost,lokacija) values
(null,1,'Sanja Sanjić','pomlađivanje i zdravo mršavljenje','Trg Slobode bb'),
(null,5,'Tajana Tajić','ugrađivanje umjetnih noktiju','Opatijska bb'),
(null,6,'Dijana Dijić','ugrađivanje umjetnih trepavica','Ulica sv. Ane');
