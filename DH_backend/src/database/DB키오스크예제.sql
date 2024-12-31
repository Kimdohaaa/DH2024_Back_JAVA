# 과제 : 키오스크 개발의 메모리를 설계하고 DB와 테이블 생성을 SQL 로 작성하여 제출 하시오.
/*
링크와 같은 프로그램을 만들기 위한 DB를 설계하시오.

[요구사항]
1. 여러개 카테고리 중에 카테고리를 선택 해서 카테고리 별로 제품들을 출력 / 확인하낟.
2. 해당 제품을 선택해서 수량을 입력받아 주문을 처리한다 단, 하나의 주문에 여러 개 제품주문 가능
3. 주문번호를 받아 대기한다.
[설계조건]
1. 식별자 코드 / 카테고리명 / 가결 / 제품명 / 주문수량 / 주문 날짜 필수 
2. 테이블간의 데이터 중복 최소화
3. 총 테이블은 3개 이상
4. 적절한 타입과 제약조건을 최대한 호라용
5. DB 명 / 테이블명 / 속성명 은 임의로 지정
*/

show databases;
create database kiosk;
use kiosk;

create table kiot(
    kno int auto_increment,
    constraint primary key(kno) -- kno 를 PK 필드로 지정
);
create table categoryt(
	cno int auto_increment, 
    cname varchar(20),	-- 카테고리명
    constraint primary key(cno), -- cno 를 PK 필드로 지정
    kno int ,
    constraint foreign key(kno) references kio(kno) -- FK 필드를 통해 kio 테이블 참조
);

create table menut(
	mno int auto_increment,
    mname varchar(15) not null unique, -- 메뉴명
    price int  not null, -- 가격
	constraint primary key(mno), -- mno 를 PK 필드로 지정
    cno int,
    constraint foreign key (cno) references category(cno) -- FK 필드를 통해 category 테이블 참조
);



create table membert(
	wno int auto_increment,
    count int auto_increment, -- 주문수량
    today date default now(), -- 주문날짜
	constraint primary key(wno), -- cno 를 PK 필드로 지정
    kno int,
    constraint foreign key(kno) references kio(kno), -- FK 필드를 통해 kio 테이블 참조
    con int,
    constraint foreign key(cno) references category(cno),
    mno int,
    constraint foreign key(mno) references menut(mno) -- FK 필드를 통해 menu 테이블 참조
);

show tables;