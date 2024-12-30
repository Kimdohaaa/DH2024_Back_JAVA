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




