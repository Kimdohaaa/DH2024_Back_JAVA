drop database if exists kurly;
create database kurly;
use kurly;
# [1] 카테고리 테이블
create table categoryt(
	cno int auto_increment,
    cname varchar(100) not null,
    origin varchar(30) not null,
    cdate datetime not null default now(),
    constraint primary key(cno) -- PK 필드 지정
);
# [2] 제품테이블
create table productt(
	pno int auto_increment,
    pname varchar(100) not null,
    prduct int unsigned default 0,
    pcount int unsigned default 0,
    constraint primary key(pno), -- PK 필드 지정
    cno int,
    constraint foreign key(cno) references categoryt(cno) -- FK 필드를 통해 categoryt 참조 
);

# [3] 회원정보테이블
create table membert(
	mno int auto_increment,
    mname varchar(30) not null,
    phone varchar(30) not null,
    address text not null,
    constraint primary key(mno) -- PK 필드 지정
);			
				
# [4] 주문 테이블 생성				
create table ordert(				
	ono	int auto_increment	, # 주문 번호
	odate	datetime not null default now() , # 주문 날짜			
	arrival	datetime not null , # 배송 예상 날짜			
	today	bool not null default false,  # 당일 배송 논리			
	constraint primary key(ono)	-- PK 필드 지정
);			

# [5] 주문상세 테이블 생성
create table detailt (	
	dno int auto_increment,
	dcount smallint unsigned not null,
	ono int not null,
	pno int not null,
	mno int not null,
	constraint primary key(dno), -- PK 필드 지정
	constraint foreign key(ono) references ordert(ono), -- FK 필드를 통해 ordert 참조
	constraint foreign key(pno) references productt(pno), -- FK 필드를 통해 productt 참조
	constraint foreign key(mno) references membert(mno) -- FK 필드를 통해 membert 참조
);
show tables;