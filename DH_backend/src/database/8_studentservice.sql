drop database if exists stdb;
create database stdb;
use stdb;

create table stu(
	stuno int auto_increment,
    sname varchar(30),
    constraint primary key (stuno)
);

create table sco(
	scno int auto_increment,
    ksco int ,
    esco int,
    msco int,
    stuno int ,
    constraint primary key(scno),
    constraint foreign key (stuno) references stu (stuno)
);

insert into stu (sname) values ('kim');
insert into stu (sname) values ('lee');
insert into stu (sname) values ('min');
insert into sco (ksco,esco,msco,stuno) values ('30','20','10', '1');
select * from stu;
select * from sco;


select stu.sname,  sco.ksco , sco.esco, sco.msco from sco inner join stu on sco.stuno = stu.stuno  ;



