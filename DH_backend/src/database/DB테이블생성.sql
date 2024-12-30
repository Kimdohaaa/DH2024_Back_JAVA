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


