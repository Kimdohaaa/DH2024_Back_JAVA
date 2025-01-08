drop database if exists jobkorea;
create database jobkorea;
use jobkorea;

create table category(
	cno int unsigned auto_increment ,
    cname varchar(30) not null unique,
    constraint primary key(cno)
);
-- category 샘플 --
insert into category (cname) values ('법무');
insert into category (cname) values ('마케팅');
insert into category (cname) values ('디자인');
insert into category (cname) values ('영업');
insert into category (cname) values ('금융');
insert into category (cname) values ('제조');
insert into category (cname) values ('교육');
insert into category (cname) values ('개발');

create table post(
	pno int unsigned auto_increment,
    ptitle varchar(100) not null,
	pcontent text not null,
    phistory varchar(20) not null,
    pcount  varchar(20) not null,
    psalary varchar(20) not null,
    pstart datetime default now(),
    pend datetime not null,
    cno int unsigned,
    eno int unsigned,
    constraint primary key (pno),
    constraint foreign key(cno) references category (cno)on update cascade on delete cascade,
    constraint foreign key(eno) references category (eno)on update cascade on delete cascade  
);
-- post sample --
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend) 
values('국민은행','JAVA / 클라우드 유경험자','경력무관','0명','회사내규에 따름','2025-02-01');
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend)
	values('법무담당자 경력직','서류전형 > 인적성검사 > 임원면접 > 채용검진 > 합격으로 진행',' 5년 이상','00명','회사내규에 따름','2025-02-18');
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend)
	values('2025년 1월 수시채용','JAVA / JS / 웹 서버 운영경험자','경력무관','00명','회사내규에 따름','2025-03-05');
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend)
	values('SW QA 엔지니어 신입 공채','C++/JAVA/PYTHON 개발 경험이 있는 분','3년 이상','0명','3500만원~','2025-03-05');
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend)
	values('2025 신한 라이프 ','채용업무 및 TM / 영업','경력무관','00명','회사내규에 따름','2025-04-01');
insert into post (ptitle,pcontent, phistory, pcount,psalary, pend)
	values('법무 / IP 담당자','특허기술 동향조사 및 시장 모니터링 업무하실 분 찾습니다.','7년 이상','0명','5000만원~','2025-04-01');





