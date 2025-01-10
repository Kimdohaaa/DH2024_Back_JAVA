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
insert into sco (ksco,esco,msco,stuno) values ('30','20','10', '2');
insert into sco (ksco,esco,msco,stuno) values ('30','20','10', '3');
select * from stu;
select * from sco;


select stu.sname,  sco.ksco , sco.esco, sco.msco from sco inner join stu on sco.stuno = stu.stuno  ;
SET SQL_SAFE_UPDATES = 0;
update sco inner join stu on sco.stuno = stu.stuno 
	set sco.ksco = 100 , sco.esco = 200, sco.msco = 300 
    where stu.sname = '김도하' ;  
    
delete sco from sco join stu on sco.stuno = stu.stuno where stu.sname = 'lee';

delete sco from sco left join stu on sco.stuno = stu.stuno where stu.stuno is null;

select * from sco;

insert into sco(ksco, esco, msco,stuno) select 90,80,70, stuno
	from stu where sname = 'kim';
select * from sco;