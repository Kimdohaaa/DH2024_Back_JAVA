# [1] DB 생성
drop database if exists example6_집합;
create database example6_집합;
use example6_집합;

# [2] table 생성
create table table1(
	num_pk int,
    constraint primary key(num_pk)
);
create table table2(
	no_pk int,
    constraint primary key(no_pk),
    num_pk int,
    constraint foreign key (num_pk) references table1 (num_pk)
);

# [3] 레코드 삽입
insert into table1 values (1),(2),(3),(4),(5); -- 하나의 insert 에 5개 레코드 삽입
insert into table2 values(1,1) , (2,2) , (3,1) , (4,1) , (5,2); -- 하나의 insert 에 5개 레코드 삽입
	-- no_pk : 1, 2, 3, 4, 5
    -- num_fk : 1, 2, 1, 1, 2 가 insert 됨
    
# [4] 레코드 조회
select * from table1;	
select * from table2; 
	
# [5] 집합
# [5-1] 교집합 : 두 테이블 간의 공통으로 포함하는 속성값으로 이루어진 테이블 
-- table 조회
select * from table1; -- 레코드 5개 출력
select * from table1, table2; -- 레코드 25개 출력 : 두 테이블의 행 * 행 
	-- 두개 이상 테이블 조회 : select * from 테이블명 , 테이블명;
-- 교집합 --
-- 1) where 문을 이용한 교집합 표현 : where 을 통해 공통 속성값 (table1.num_pk / table2.num_fk) 을 찾아 교집합으로 출력
select * from table1, table2 where table1.num_pk = table2.num_pk; -- 레코드 5개 출력
	-- where 문을 사용한 집합은 일반 조건과 겹치므로 구분이 어려워 잘 사용하지 않음

-- 2) inner join ~ on 절을 이용한 교집합 표현 
-- ★ select * from 테이블명1 inner join 테이블명2 on 집합조건(주로 pk속성명 = fk속성명) ;
select * from table1 inner join table2 on table1.num_pk = table2.num_pk; -- 레코드 5개 출력
	-- 가독성이 좋음
    -- where : 일반조건 / on : 집합조건 / having : 그룹조건
-- ★ inner 생략 가능
select * from table1 join table2 on table1.num_pk = table2.num_pk;
-- ★ on 대신 using (pk명) 으로 사용 가능 | 전제조건 : pk 속성명과 fk 속성명이 같아야 함
select * from table1 join table2 using (num_pk); -- 현재 DB 는 PK 키 명과 FK 명이 달라서 실행 불가
-- ★ natrul join : on 조건절 생략 가능 | 전제조건 : pk 속성명과 fk 속성명이 같아야 함
select * from table1 natural join table2 ;

-- 2) outer join 
-- ★ left 
select * from table1 left outer join table2 on table1.num_pk = table2.num_pk;
	-- 왼쪽 테이블 (table1)의 모든 레코드 + table1 과 table2 의 교집합 조회
-- ★ right
select * from table1 right outer join table2 on table1.num_pk = table2.num_pk;
	-- 오른쪽 테이블 (table2)의 모든 레코드 + table1 과 table2 의 교집합 조회
-- ★ outer 생략 가능
select * from table1 right join table2 on table1.num_pk = table2.num_pk;

# [5-2] 합집합 : 두 테이블의 모든 레코드
-- 1) union 키워드 : 두 레코드 이상의 select 를 하나로 합치는 키워드
select * from table1 left join table2 on table1.num_pk = table2.num_pk 
	union
select * from table1 right join table2 on table1.num_pk = table2.num_pk;

# [5-3] 차칩합 : 두 테이블에서 특정 테이블에는 속하지만 다른 테이블에는 속하지 않는 레코드
select * from table1 left outer join table2 on table1.num_pk = table2.num_pk where table2.num_pk is null; 
	-- table2 의 PK 키가 null 인 레코드(=> 차집합) 인 레코드만 조회
select table1.* from table1 left outer join table2 on table1.num_pk = table2.num_pk where table2.num_pk is null; 
    -- null 출력 X 하기 위해 테이블명.* 사용



### 예제 ###
create table pcategory(
	카테고리번호_pk int unsigned auto_increment , 
    # 속성(필드) 임의 , int(식별키숫자) , unsigned(부호없다.) , auto_increment(레코드삽입시 자동번호부여)
    카테고리명 varchar(10) not null , #속성(필드) 임의 , varchar(10) : 카테고리명이 최대 10글자로 이내로 작성하기 위해서
    primary key( 카테고리번호_pk) # pk필드 선언하기 , primary key( pk필드명 ) 
);
# 제품 테이블 
create table product( 
	제품번호_pk int unsigned auto_increment , 
    제품명 varchar(100) not null, # 제품명을 최대 100 글자 이내로 작성하기 위해서 
    제품가격 int unsigned not null , # 40억 이하로 가격을 작성하고 -(음수) 없음 , not null : 공백이 아닌 필드 설정 ( 공백삽입시 오류발생 )
    카테고리번호_fk int unsigned , # 카테고리 테이블의 pk필드 를 참조할 fk필드 
    primary key( 제품번호_pk ) , # pk 필드 선언하기 # pk필드는 자동으로 not null(null방지) 과 unique(중복방지) 제약조건이 설정된다.
    foreign key( 카테고리번호_fk ) references pcategory( 카테고리번호_pk ) # fk 필드 설정하기 
    # foreign key( fk필드명 ) references pk테이블명( pk필드명 )
);
# 재고 테이블 
create table stock( 
    재고번호_pk int unsigned auto_increment , 
    재고수량 int ,
    재고등록날짜 datetime default now() ,  # date(날짜타입) , default : 레코드삽입시 초기값를 선언하기 , now() : 현재 시스템 날짜/시간 반환 함수 
    제품번호_fk int unsigned ,                 # 제품 테이블의 pk필드를 참조할 fk필드 
    primary key( 재고번호_pk ) ,                 # 모든 테이블은 pk필드를 1개 이상 갖는다.(권장) 
    foreign key( 제품번호_fk ) references product( 제품번호_pk ) # fk 필드 설정하기 
);
# [1] 모든 product 테이블 레코드 조회 시 카테고리 번호 대신 카테고리명을 조회
select p.제품번호_pk, p.제품명 , p.제품가격 , c.카테고리번호_pk from product p inner join pcategory c on p.카테고리번호_fk = c.카테고리번호_pk ;

# [2] 제품 번호 1번의 재고 수량 합계를 조회 / 조회 시 제품명 속성과 합계 수량 속성명으로 조회 
select p.제품명 , sum(s.재고수량) 합계수량 from stock s inner join product p on s.제품번호_fk = p.제품번호_pk where p.제품번호_pk = '1';










