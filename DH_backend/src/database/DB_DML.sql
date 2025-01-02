# 만약 생성할 DB 존재 시 삭제
drop database if exists mydb0102;
# DB 생성
create database mydb0102;
# DB 활성화
use mydb0102;

# table 생성
create table table1(
	mno int auto_increment, 
    mname varchar(30) not null unique,
    mcount int,
    constraint primary key(mno) -- PK 필드 지정
);

# DML (DB 조작어)
# [1] insert : 레코드(행 / 투플) 삽입
-- insert into 테이블명(속성명) values (값);
insert into table1(mname, mcount) values('박명수', 10);
insert into table1 (mno , mname , mcount) values (3, '강호동', 30);
insert into table1 values (4, '신동엽', 40);
	-- 테이블의 모든 속성을 순서대로 대입할 경우 속성명 생략 가능
insert into table1 (mcount, mname) values(20,'유재석');
	-- mname 속성에 제약조건으로 unique 를 선언했으므로 중복 삽입 불가
insert into table1 (mcount) values(30); -- 오류 
	-- mname 속성에 제약조건으로 not null 을 선언했으므로 값을 대입해야 한다
insert into table1 values(5, '서장훈', 50) , (6 ,'하하',60);
	-- 각 값을 넣은 괄호를 쉼표로 나누면 동시에 여러 개의 값을 선언할 수 있다.
    
-- mno 속성의 초기값을 생략 시 auto_increment 이므로 자동번호가 부여된다.

# [2] select : 레코드 조회
-- 1. select * from 테이블명; -> 전체 레코드 조회 
select * from table1;
-- 2. select 속성명 from 테이블명; -> 특정 속성 조회
select mno from table1;
select mno, mname from table1; 
	-- 쉼표로 구분하여 여러 속성 조회 가능
-- 3. select * from 테이블명 where 속성명 = 조건; -> 조회 시 속성값 조건
select * from table1 where mname = '유재석';
	-- mname 속성값이 '유재석' 인 레코드 조회
select * from table1 where mno = 3;
	-- mno 의 속성값이 3 인 레코드 조회
	
# [3] update : 레코드의 속성값 수정
-- update 테이블명 set 속성명 = 새로운값; -> 전체 레코드의 속성값 수정
update table1 set mcount = 0;
set SQL_SAFE_UPDATES = 0; -- safe mode(MySQL 자체에서 레코드 전체 수정을 막아놓은 것) 끄기 
set SQL_SAFE_UPDATES = 1; -- safe mode(MySQL 자체에서 레코드 전체 수정을 막아놓은 것) 켜기
-- update 테이블명 set 속성명 = 새로운값 where 속성명 = 조건; -> 특정 레코드의 속성값 수정
update table1 set mcount = 100 where mname = '유재석';
	-- mname 이 유재석인 레코드의 mname 속성의 값을 100으로 수정
-- update 테이블명 set 속성명1 = 새로운값 , 속성명2 = 새로운값; -> 여러 속성값 수정(쉼표로 구분)
-- update 테이블명 set 속성명1 = 새로운값 , 속성명2 = 새로운값 where 조건; -> 조건 설정 가능
update table1 set mname = '강호동' , mcount = 200 where mno = 3;
	-- mno 속성값이 3 인 레코드의 mname 과 mcount 를 새로운값으로 수정한다.
    
# [4] delete : 레코드 삭제
-- delete from 테이블명; -> 전체 레코드 삭제(safe mode 적용 시 레코드 전체 삭제 불가)
delete from table1;	
-- delete from 테이블명 where 조건; -> 특정 레코드 삭제
delete from table1 where mno = 3;
	-- mno 속성값이 3 인 레코드 삭제




