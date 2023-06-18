# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Adri\Desktop\Git\Java_programiranje\SQL\kolokvij\kolokvij_4.sql

drop database if exists kolokvij_4;
create database kolokvij_4;

use kolokvij_4;

create table punac (
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar (46),
    jmbag char (11) not null,
    novcica decimal (18,7) not null,
    maraka decimal (12,6) not null,
    ostavljen int not null
);

create table zena (
    sifra int not null primary key auto_increment,
    suknja varchar (39) not null,
    lipa decimal (18,7),
    prstena int not null
);

create table ostavljen (
    sifra int not null primary key auto_increment,
    modelnaocala varchar (43),
    introverntno bit not null,
    kuna decimal (14,10)
);

create table snasa (
    sifra int not null primary key auto_increment,
    introvertno bit,
    treciputa datetime,
    haljina varchar (44) not null,
    zena int not null
);

create table zena_mladic (
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);

create table becar (
    sifra int not null primary key auto_increment,
    novcica decimal (14,8),
    kratkamajica varchar (48) not null,
    bojaociju varchar (36) not null,
    snasa int not null
);

create table mladic (
    sifra int not null primary key auto_increment,
    kuna decimal (15,9),
    lipa decimal (18,5),
    nausnica int,
    stilfrizura varchar (49),
    vesta varchar (34) not null
);

create table prijatelj (
    sifra int not null primary key auto_increment,
    eura decimal (16,9),
    prstena int not null,
    gustoca decimal (16,5),
    jmbag char (11) not null,
    suknja varchar (47) not null,
    becar int not null
);


alter table punac add foreign key (ostavljen)
references ostavljen (sifra);

alter table snasa add foreign key (zena)
references zena (sifra);

alter table becar add foreign key (snasa)
references snasa (sifra);

alter table prijatelj add foreign key (becar)
references becar (sifra);

alter table zena_mladic add foreign key (zena)
references zena (sifra);

alter table zena_mladic add foreign key (mladic)
references mladic (sifra);


insert into zena (sifra,suknja,prstena) values
(null,'dugačka',1),
(null,'s uzorkom',2),
(null,'kratka',1);

insert into snasa (sifra,haljina,zena) values
(null,'ljetna',1),
(null,'klasična',2),
(null,'večernja',3);

insert into becar (sifra,kratkamajica,bojaociju,snasa) values
(null,'s printom','smeđa',1),
(null,'jednobojna','zelena',2),
(null,'s dezenom','plava',3);

insert into zena_mladic (sifra,zena,mladic) values
(null,1,1),
(null,2,2),
(null,3,3);

update punac set majica = 'Osijek';

delete from prijatelj where prsten > 17;

select haljina from snasa where treciputa is null;

select a.nausnica, f.jmbag, e.kratkamajica
from mladic a inner join zena_mladic b on a.sifra= b.mladic
inner join zena c on c.sifra = d.zena
inner join snasa d on c.sifra = d.zena
inner join becar e on d.sifra = e.snasa
inner join prijatelj f on e.sifra = f.becar
where d.treciputa is not null and c.lipa !=29
order by e.kratkamajica desc;

select a.lipa, a.prstena
from zena a left join zena_mladic on a.sifra = b.zena
where b.zena is null;