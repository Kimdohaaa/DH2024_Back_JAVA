# boardservice 10 DML 과 샘플 INSERT
drop database if exists boardservice10;
create database boardservice10;
use boardservice10;

# table 생성 시 PK 테이블 먼저 생성 / 타입 , 제약 조건 고려
create table member(
	mno int unsigned auto_increment,
    mid varchar(30) not null unique,
    mpwd varchar(30) not null,
    mname varchar(20) not null,
    mphone varchar(13) not null unique,
    mdate datetime default now(),
    constraint primary key(mno)
);
-- member table 샘플 레코드 삽입 --
insert into member (mid, mpwd, mname , mphone) values ('qwe123','m1234','유재석','010-3333-3333');
insert into member (mid, mpwd, mname , mphone) values ('qwe234','m1234','유재석','010-4444-3333');
insert into member (mid, mpwd, mname , mphone) values ('qwe345','m1234','유재석','010-5555-3333');
insert into member (mid, mpwd, mname , mphone) values ('qwe456','m1234','유재석','010-6666-3333');
insert into member (mid, mpwd, mname , mphone) values ('qwe567','m1234','유재석','010-7777-3333');

create table category(
	cno int unsigned auto_increment,
    cname varchar(10) not null unique,
    cdate datetime default now(),
    constraint primary key (cno)
);
-- category table 샘플 레코드 삽입 --
insert into category (cname) values ('자유');
insert into category (cname) values ('질문');
insert into category (cname) values ('노하우');
insert into category (cname) values ('공부');
insert into category (cname) values ('친목');

create table board(
	bno int unsigned auto_increment,
    btitle varchar(100) ,
    bcontent longtext ,
    bview int unsigned default 0,
    bdate datetime default now(),
    mno int unsigned,
    cno int unsigned,
	constraint primary key(bno),
	# FK 제약조건 옵션 : FK 가 참조하는 PK 의 삭제 / 수정 에 따른 FK 의 제약 조건
		-- on update / delete  +
		-- 1) restrict : PK 레코드가 FK 레코드를 참조 중이면 PK 레코드 삭제 / 수정 불가
		-- 2) cascade : PK 레코드 삭제 시 FK 레코드도 같이 자동 삭제
        -- 3) set null : PK 레코드 값 삭제 / 수정 시 FK 레코드는 참조를 그만하고 null 로 변경
    constraint foreign key (mno) references member (mno) on update cascade on delete cascade,
		-- 만약 작성자가 회원 수정 / 삭제(PK 수정 / 삭제) 시 게시물 수정 / 삭제(FK 수정 / 삭제)
    constraint foreign key (cno) references category (cno) on update cascade on delete cascade
		-- 만약 카테고리 수정 / 삭제(PK 수정 / 삭제) 시 게시물 수정 / 삭제(Fk 수정 / 삭제)
);
-- board table 샘플 레코드 삽입 --
insert into board (btitle, bcontent ) value ('안녕하세요1','힘찬 자바1','1','1');
insert into board (btitle, bcontent ) value ('안녕하세요2','힘찬 자바2','1','3');
insert into board (btitle, bcontent ) value ('안녕하세요3','힘찬 자바3','4','3');
insert into board (btitle, bcontent ) value ('안녕하세요4','힘찬 자바4','2','5');
insert into board (btitle, bcontent ) value ('안녕하세요5','힘찬 자바5','3','2');

create table reply(
	mo int unsigned auto_increment,
    rcontent longtext,
    rdate datetime default now(),
    mno int unsigned,
    bno int unsigned,
    constraint primary key(mo),
    constraint foreign key (mno) references member (mno) on update cascade on delete cascade,
    constraint foreign key (bno) references board (bno) on update cascade on delete cascade
);
-- reply table 샘플 레코드 삽입 --
insert into reply (rcontent) values ('하하하 댓글1','3','3');
insert into reply (rcontent) values ('하하하 댓글2','3','3');
insert into reply (rcontent) values ('하하하 댓글3','4','5');
insert into reply (rcontent) values ('하하하 댓글4','5','5');
insert into reply (rcontent) values ('하하하 댓글5','1','4');