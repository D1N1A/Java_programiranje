# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\JP\GitHub_repository\EdunovaJP28\nakladnik.sql

drop database if exists nakladnik;
create database nakladnik;
use nakladnik;
create table nakladnik (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    godina_osnutka datetime,
    adresa varchar (100)
);

create table izdavanje (
    nakladnik int not null,
    djelo int not null
);

create table djelo (
    sifra int not null primary key auto_increment,
    naziv varchar (100) not null,
    godina datetime,
    autor varchar (100),
    nakladnik int not null
);

create table lokacija (
    nakladnik int not null,
    mjesto int not null
);

create table mjesto (
    sifra int not null primary key auto_increment,
    naziv varchar (50) not null,
    nakladnik int not null
);

alter table izdavanje add foreign key (nakladnik)
references nakladnik (sifra);

alter table izdavanje add foreign key (djelo)
references djelo (sifra);

alter table djelo add foreign key (nakladnik)
references nakladnik (sifra);

alter table lokacija add foreign key (nakladnik)
references nakladnik (sifra);

alter table lokacija add foreign key (mjesto)
references mjesto (sifra);

alter table mjesto add foreign key (nakladnik)
references nakladnik (sifra);

insert into nakladnik (sifra,naziv,godina_osnutka,adresa) values
(null,'Papirus',1999.,'Zagrebačka ulica bb'),
(null,'Global',2003.,'Belomanastirska ulica bb'),
(null,'Let',2005.,'Riječka ulica bb');

insert into mjesto (sifra,naziv,nakladnik) values
(null,'Zagreb',1),
(null,'Beli Manastir',2),
(null,'Rijeka',3);

insert into lokacija (nakladnik,mjesto) values
(1,1),
(2,2),
(3,3);

insert into djelo (sifra,godina,autor,nakladnik) values
(null,'Patnje mladog Werthera','Johan Wolfgang von Goethe',1),
(null,'Lovac u žitu','Jerome David Salinger',2),
(null,'Zločin i kazna','Fjodor Mihajlovič Dostojevski',3);

insert into izdavanje (nakladni,djelo) values
(null,1,1),
(null,2,2),
(null,3,3);

