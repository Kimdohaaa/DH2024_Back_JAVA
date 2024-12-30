# 1. DB 생성
create database my1230;

# 2. 해당 DB 활성화
use my1230;

# 3. 테이블 생성
-- create table 테이블명(필드명(=변수명) 필드의타입);
create table testtable1(필드명 int);

# 4. 현재 활성화 중인 DB 내 모든 테이블 조회
show tables;

# 5. 테이블 여러개 생성
-- 여러 개의 필드가 존재할 경우 ,(쉼표)로 구분한다.
create table testtable2(필드명1 int, 필드명2 double);

# 6. 테이블 삭제
-- drop table 테이블명;
-- drop table if exists 테이블명; -> 존재할 시 테이블 삭제
drop table testtable1;
drop table if exists testtable2;

# 다양한 데이터 타입을 이용한 테이블 생성 실습
create table testtable3( # table s
	# 테이블 내 속성명과 타입 선언 -> 여러 개가 들어갈 시 ,(쉼표) 로 구분
    -- [1] 정수 타입
    정수필드1 tinyint,
    정수필드2 smallint,
    정수필드3 mediumint,
    정수필드4 int,
    정수필드5 bigint,
	-- [2] 실수타입
    실수필드1 float,
    실수필드2 double,
    실수필드3  decimal,
	-- [3] 시간 / 날짜 타입
    날짜필드 date,
    시간필드 time,
    날짜시간필드 datetime,
    -- [4] 문자타입
    문자필드1 char(100),
    문자필드2 varchar(100),
    문자필드3 text,
    문자필드4 longtext,
	-- [5] 논리타입
    논리필드 bool
); # table e

# 테이블 확인
show tables;
# 특정 테이블 확인
select * from testtable3;

# 제약조건 : 테이블에서 문제 / 결함 이 되는 데이터가 입력되지 않도록 제약을 지정해놓은 것
use mydb1230;
create table testtable4(
	필드명1 tinyint not null, -- 지정한 필드에는 null 을 대입할 수 없다.
    필드명2 smallint unique,  -- 지정한 필드에는 중복값을 대입할 수 없다.
	필드명3 int default 10 ,  -- 지정한 필드에는 레코드 삽입 시 값을 생략하면 자동으로 기본값이 대입된다.
	필드명4 bigint auto_increment, -- 지정한 필드에는 레코드 삽입 시 순서대로 자동 번호가 대입된다.
    PK필드명5 double ,  -- PK 키이기 때문에 not null 과 unique 가 자동으로 포함 됨
	constraint primary key(PK필드명5) -- 지정한 필드를 PK 필드로 지정
);

create table testtable5(
	FK필드명1 double, -- FK 키이기때문에 null 과 중복데이터를 가질 수 있다.
    constraint foreign key(FK필드명1) references testtable4(PK필드명5) 
    -- 지정한 필드를 FK 필드로 지정
	-- constraint foreign key(FK로 사용할 필드명) references 참조할 테이블명(PK필드명);
);

