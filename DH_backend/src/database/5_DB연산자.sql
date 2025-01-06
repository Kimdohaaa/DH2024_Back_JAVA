# MySQL 연산자 #
drop database if exists example5_연산자;
create database example5_연산자;
use example5_연산자;

# 1. 회원테이블
drop table if exists member;
create table member(            # 아이돌 그룹
   mid char(8) not null ,          # 식별키      최대 8자리
    mname varchar(10) not null ,   # 그룹명      최대 10자리
    mnumber int not null ,         # 인원수      정수 +-21억정도
    maddr char(2) not null ,       # 지역        최대 2자리
    mphone1 char(3) ,              # 지역번호     최대 2자리 
    mphone2 char(8) ,              # 전화번호     최대 8자리
    mheight smallint ,             # 평균키      정수 +-3만정도
   mdebut date ,                   # 데뷔일      yyyy-mm-dd 
    constraint primary key ( mid )       # 제약조건 
);
# 2. 구매테이블
drop table if exists buy;
create table buy(
   bnum int auto_increment ,          # 구매번호     정수    자동번호 부여 
    mid char(8),                      # 구매자      FK 
    bpname char(6) not null ,         # 제품명      최대 6자리 
    bgname char(4) ,                  # 분류명      최대   4자리
    bprice int not null ,             # 가격        정수 
    bamount smallint not null ,       # 구매수량     정수 
    constraint primary key(bnum) ,       				  # 제약조건 
    constraint foreign key ( mid ) references member(mid) # 제약조건 
);

# 샘플데이터 
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);




# [1] 모든 속성의 레코드 조회
select * from member;
select * from buy;

# [2] 특정 속성의 레코드 조회
select mid from member;
select mid, mname from member; -- 여러 속성 조회

# [3] 속성명과 테이블명의 별칭 -- 별칭 : 조회 결과에만 적용되는 속성명(기존 속성명은 그대로)
-- 주로 다중 테이블 조회 시 속성명이 중복되거나 속성명을 간소화할 때 별칭 부여
-- 주로 as 를 생략해서 사용한다.
-- select 속성명 as 별칭;
select mid as 회원아이디 from member; -- 조회 결과 : mid -변경-> 회원아이디
select mid as 회원아이디, mname as 회원명 from member; -- 조회결과 : mid -> 회원아이디 / mname -> 회원명
select mid 회원아이디 , mname 회원명 from member; -- as 생략가능
select mid 회원아디, mname 회원명 from member as m; -- table 명도 as 를 통해 별칭 부여 가능 
select mid 회원아디, mname 회원명 from member m; -- as 생략가능

# [4] 속성값이 중복인 레코드 제거
-- select distinct 속성명 from 테이블명;
select maddr from member; -- member 테이블에 maddr 속성값을 가진 레코드 조회
select distinct maddr from member; -- maddr 속성값을 가진 레코드 내 중복 제거

# [5] 속성값의 산술연산
-- select 속성명 연산 from 테이블명;
-- div : 몫
-- mod : 나머지 
select mnumber + 3 from member; -- member 테이블에 mnumber 속성값을 가진 모든 레코드에 +3
select mnumber - 3 from member; -- member 테이블에 mnumber 속성값을 가진 모든 레코드에 -3
select mnumber 인원수 
	, mnumber +3 
    , mnumber -3
    , mnumber * 3 
    , mnumber / 3 
    , mnumber div 3 -- 몫
    , mnumber mod 3 -- 나머지
					from member;

# [6] 일반 조건절 (where) ★ where 문에서는 별칭 사용 불가
-- >>> select 문에서 컴퓨터가 처리하는 순서 : select -> from -> where 순서이기 때문에 where 절에서 별칭 지정 시 select 문에서 별칭을 알 수 없다.
-- 비교 연산자 : 속성명 = 속성값 (같다.) | 속성명 != 속성값 (같지 않다.) / <= / >= 
-- 논리 연산자 : not (같지 않다.) / 조건1 and 조건2 (논리곱) / 조건1 or 조건2 (논리합)
-- 기타 연산자 : 속성명 between 조건1 and 조건2 (사이값) / 속성명 in (값1 , 값2)
		-- / 속성명 is null(null 조회) / 속성명 is not null(null 아닌 값 조회) 
select * from member where mname = '블랙핑크'; -- mname 속성값이 '블랙핑크' 인 레코드 조회
select * from member where mnumber = 4; -- mnumber 속성값이 4 인 레코드 조회
select * from member where mname != '블랙핑크'; -- mname 속성값이 '블랙핑크' 가 아닌 레코드 조회
select * from member where not mname = '블랙핑크' ; -- mname 속성값이 '블랙핑크' 가 아닌 레코드 조회
select * from member where mheight <= 162; -- mheight 속성값이 162 이하인 레코드 조회
select * from member where mheight >= 165 and mheight <= 170; -- mheight 속성값이 165 이하 , 170 이하인 레코드 조회
select * from member where mheight between 165 and 170; -- mheight 속성값이 165 이하 , 170 이하인 레코드 조회
select * from member where maddr = '경기' or maddr = '전남'; -- maddr 속성값이 '경기' 이거나 '전남' 인 레코드 조회
select * from member where maddr in('경기','전남'); -- maddr 속성값이 '경기' 이거나 '전남' 인 레코드 조회

select * from member where mphone1 = ' '; -- 불가
select * from member where mphone1 = null; -- 불가
select * from member where mphone1 is null; -- mphone1 속성값이 null 인 레코드 조회
select * from member where mphone1 is not null; -- mphone1 속성값이 null 이 아닌 레코드 조회
-- 주의점 : 속성값이 null 일때는 = (같다) 사용불가 -> 속성명 is null 을 통해 조회 --

-- 문자열 패턴 연산자 : 속성명 like '문자패턴'
		-- 문자패턴 1 : % -> 모든 문자 대응 / 문자 개수 상관 X 	ex] 삼성전자 / 물전자 -> %전자 => 삼성전자 / 물전자 조회가능
        -- 문자패턴 2 : _ -> 언더바 개수만큼 문자 대응 			ex] 삼성전자 / 물전자 -> _전자 => 물전자 조회 가능
select * from member where mname like '에이%'; -- mname 속성값이 '에이' 로 시작하는 레코드 조회
select * from member where mname like '에이_'; -- mname 속성값이 '에이' 로 시작하는 세글자인 레코드 조회
select * from member where mname like '%핑크'; -- mname 속성값이 '핑크' 로 끝나는 레코드 조회
select * from member where mname like '%이%'; -- mname 속성값에 '이' 가 포함된 레코드 조회
select * from member where mname like '_이_'; -- mname 속성값에 '이' 가 두번째에 있고 세글자인 레코드 조회

# [7] 정렬
-- order by 속성명 asc -> 지정한 속성명 기준으로 속성값들을 오름차순 정렬 (기본값 -> 생략 가능) 
-- order by 속성명 desc -> 지정한 속성명 기준으로 속성값들을 내림차순 정렬
-- 다중정렬 : order by 속성명1 정렬기준 , 속성명2 정렬기준 asc / desc (,(쉼표)로 구분)
	-- 주의점 : 2차정렬은  1차정렬 내 동일한 값 내에서 2차정렬 -> 1차정렬이 무의미해지지 않도록 하기 위해서
select * from member order by mdebut asc; -- mdebut 속성명을 과거 ~ 현재 (오름차순) 으로 레코드 조회
select * from member order by mdebut; -- asc 생략 가능
select * from member order by mdebut desc; -- mdebut 속성명을 현재 ~ 과거 (내림차순) 으로 레코드 조회
select * from member order by mname asc; -- mname 속성명을 오름차순으로 레코드 조회
select * from member order by mname desc; -- mname 속성명을 내림차순으로 레코드 조회

select * from member order by maddr desc, mdebut asc; -- maddr 속성값을 정렬한 후 동일한 속성값이 존재할 경우 동일한 속성값 끼리 mdebut 속성명을 정렬
/*
MMU	마마무	4	전남	061	99999999	165	2014-06-19
GRL	소녀시대	8	서울	02	44444444	168	2007-08-02
OMY	오마이걸	7	서울					160	2015-04-21
TWC	트와이스	9	서울	02	11111111	167	2015-10-19
SPC	우주소녀	13	서울	02	88888888	162	2016-02-25
RED	레드벨벳	4	경북	054	55555555	161	2014-08-01
BLK	블랙핑크	4	경남	055	22222222	163	2016-08-08
ITZ	잇지		5	경남					167	2019-02-12
APN	에이핑크	6	경기	031	77777777	164	2011-02-10
WMN	여자친구	6	경기	031	33333333	166	2015-01-15
★ maddr 속성값 정렬 후 mdebut 정렬 -> 전남/서울/경북/경남/경기 내에서 mdebut asc ★
*/

# [8] 레코드 출력 제한 -> 조회결과의 레코드 수 제한
-- limit 레코드수
-- limit 시작레코드번호, 개수 -> 번호는 0부터 시작
select * from member limit 2; -- 조회결과의 레코드에서 상위 2개만 조회
select * from member limit 0, 2; -- 조회 결과의 레코드에서 0번 레코드 ~ 2개만 조회
select * from member limit 2, 3; -- 조회 결과의 레코드에서 0번 레코드 ~ 3개만 조회
# 예제 : mheight 속성명을 상위 3개만 조회
select * from member order by mheight desc limit 3; -- mheight 속성명을 내림차순으로 정렬한 후 상위 3개 레코드 조회


# 실습 1: : 주소가 '서울' 인 레코드를 데뷔일 기준으로 내림차순으로 조회한 결과 상위 2개만 조회
select * from member where maddr = '서울' order by mdebut desc limit 2; 
-- select * from -> member 테이블 전체 레코드 조회
-- where maddr = '서울' -> maddr 속성명이 '서울'인 레코드 조회
-- order by mdebut desc -> mbebut 속성명을 내림차순으로 정렬
-- limit 2; -> 상위 2개 레코드 조회

# [9] 그룹
-- group by 그룹속성명 having 그룹조건
-- 주의점 : 두 개 이상의 속성명 사용 -> 그룹 대상이 동일하더라도 다른 속성명의 값이 다를 수 있으므로 집계 / 통계 후에 그룹화
select * from buy; 
select bpname from buy group by bpname; -- buy 테이블의 bpname 속성명 값을 그룹화함 -> 중복값이 없어짐
select bpname, bprice from buy group by bpname; -- 오류 : bpname 이 동일하더라도 bprice 가 다를 수 있기 때문에 오류 발생
/*
학년 점수			
1	30
2	20			=> 1학년의 점수합계(집계 / 통계) =>			그룹화
1	40
-- 학년과 점수를 그룹화하려할 경우 학년은 같아도 점수는 다르기 때문에 그룹화 불가
-- 점수를 집계 / 통계 하여 동일하게 만든 후 그룹화 함
*/

# [10] 집계 / 통계 함수
select bamount from buy;
select sum(bamount) from buy; -- bamount 속성명의 값들의 총 합계
select avg(bamount) from buy; -- bamount 속성명의 값들의 평균
select min(bamount) from buy; -- bamount 속성명의 값들의 최솟값
select max(bamount) from buy; -- bamount 속성명의 값들의 최댓값
select count(bamount) from buy; -- bamount 속성명의 값들의 개수 (null 제외)
select count(*) from buy; -- bamount 속성명의 레코드의 개수 (null 포함)

# 예제 1 : 회원아이디 별 구매수량 총 합계 조회
select mid, sum(bamount) from buy group by mid; -- mid 속성명의 값을 그룹화 -> bamount 속성명을 집계한 레코드를 조회
# 예제 2 : 회원아디 별 총 구매 금액 총합계 조회
select mid, sum(bamount * bprice) from buy group by mid; -- mid 속성명의 값을 그룹화 -> bamount 속성명 값 * bprice 속성명 값 연산 총 합산 집계
# 예제 3 : 회원아이디 별 구매 평균 조회
select mid, avg(bpirce) from buy group by mid; -- mid 속성명의 값을 그룹화 -> bpirce 의 평균값 집계
# 예제 4 : 총 구매횟수 조회
select count(*) from buy;
# 예제 5 : 회원아이디 별 구매 횟수 조회
select mid, count(bpname) from buy group by mid; 

# [11] 그룹 조건절 (having) -- where은 그룹화 전 조건 having 은 그룹화한 후 조건
-- 주의점 : select 문에서 컴퓨터가 처리하는 순서 : select -> from -> where -> group by -> having 순서이기 때문에 where 절에서 별칭 지정 시 select 문에서 별칭을 알 수 없다.
# 예제 1 : 구매수량이 3 초과인 회원아이디 별 레코드 조회 
select mid from buy where bamount > 3;  
# 예제 2: 회원아이디 별 총 구매 금액이 1000 초과인 레코드 조회
select mid, sum(bamount * bprice) from buy group by mid having sum(bamount * bprice) >= 1000;
select mid, sum(bamount * bprice) as 총구매금액 from buy group by mid having 총구매금액 > 1000; -- as 를 통해 별칭 사용
select mid , bprice 구매가격 from buy where 구매가격 >= 1000; -- 오류 : where 절에서는 별칭을 사용할 수 없기 때문
select mid , sum(bamount * bprice) as 총구매금액 where 총구매금액 >= 1000; -- 오류 : 집계 후 조건은 where 절 사용이 불가능하기 때문

# 예제 : 구매수량(bamount)이 2개 초과인 레코드에서 회원아이디별 총 구매가격(bprice) 평균이 50 이상인 레코드 조회 
-- 조건 :  구매가격 평균으로 내림차순 후 상위 2개 조회
select * from buy  where bamount > 2; -- 구매수량이 2개 초과인 레코드
select mid as 회원아이디, avg(bprice) as 구매가격평균 from buy  where bamount > 2 group by 회원아이디; -- 회원아이디 별 구매가격평균
select mid as 회원아이디, avg(bprice) as 구매가격평균 from buy  
										where bamount > 2 
										group by 회원아이디 
										having 구매가격평균 >= 50; -- 구매가격평균이 50 이상 

select mid as 회원아이디, avg(bprice) as 구매가격평균 from buy  
										where bamount > 2 
										group by 회원아이디 
										having 구매가격평균 >= 50
                                        order by 구매가격평균 desc;	-- 구매가격 평균 내림차순으로 정렬
                                        
select mid as 회원아이디, avg(bprice) as 구매가격평균 from buy  
										where bamount > 2 
										group by 회원아이디 
										having 구매가격평균 >= 50
                                        order by 구매가격평균 desc
                                        limit 0, 2; -- 상위 2개 레코드 조회
                                   
# select 사용 시 여러 절이 있을 때 작성 순서 
-- select 속성명 from 테이블명 where 조건절 group by 그룹속성명 having 그룹조건 order by 정렬속성명  정렬기준 limit 시작번호 , 개수
# select 처리 순서
-- select -> from -> where -> group by -> having -> order by -> limit 
