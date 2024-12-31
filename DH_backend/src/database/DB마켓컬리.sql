create database kurly;
use kurly;

create table categoryt(
	cno int auto_increment,
    cname varchar(100) not null,
    origin varchar(30) not null,
    cdate datetime not null default now(),
    constraint primary key(cno)
);

create table productt(
	pno int auto_increment,
    pname varchar(100) not null,
    prduct int unsigned default 0,
    pcount int unsigned default 0,
    constraint primary key(pno),
    cno int,
    constraint foreign key(cno) references categoryt(cno)
);
show tables;