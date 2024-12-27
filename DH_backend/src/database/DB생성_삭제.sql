/* 여러줄 주석 */
# 한줄 주석
-- 한줄 주석

/*
1. SQL 작성 방법
	1) SQL 문법 작성
    2) SQL 문장 종료 시 ;(세미콜론) 사용
2. SQL 실행 방법
	방법 1) 단위 실행
			- 실행할 코드에 커서를 두고 control + enter
            - 실행할 코드에 커서를 두고 메뉴 상단 -> 번개 아이콘(I) 클릭 
	방법 2) 현재 파일 내 모든 코드 실행(위 -> 아래 순서)
			- control + Shift + enter
            - 메뉴 상단 -> 번개아이콘 클릭
3. SQL 실행 결과
	- 하단에 Result Grid 탭에서 확인 가능
*/

# [1] DB Server 내 모든 DB를 확인
show databases; -- 기본적으로 존재하는 DB 출력alter

# [2] DB Server 의 local path 확인  * variables : 매개변수 *
show variables like 'datadir';

# [3] DB Server 의 DB 생성
-- creat (생성) database(DB) DB명;
create database mydb1226;

# [4-1] DB Server 의 DB 삭제
-- drop(삭제) database(DB) DB명;
drop database mydb1226;

# [4-2] 만약 DB 가 존재할 시 삭제
-- drop(삭제)  database(DB) if(만약) exists(존재 시) DB명; 
drop database if exists mydb1226;

# [5] DB Server 내 여러 개 DB 중에 사용 / 활성화 할 DB 선택
-- use 활성화할 DB명;
use mydb1226;


# 실습 1 : 아래와 같이 순서대로 SQL 코드를 작성하고 실행하시오.
-- 1. 'test1' 이라는 DB 존재 시 삭제
drop database if exists test1;
-- 2. 'test1' 이라는 DB 생성
create database test1;
-- 3. 서버 전체 DB 목록 확인
show databases;
-- 4. 로컬 PC 내 DB 가 만들어졌는지 경로 확인
show variables like 'datadir'
-- 5. 'test1' 이라는 DB 사용 활성화
use test1;

# 참고 : 현재 작성한 코드파일 == sql확장자 파일 | ctrl + s 로 저장 












