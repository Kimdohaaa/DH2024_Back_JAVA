# 실습 1 : 이클립스의 Boardservice 의 DB 를 설계하시오.

# [1] DB Server 에 DB 생성
create database practice;
# [2] 지정한 DB 에 테이블을 만들기 위해 DB 활성화
use practice;
# [3] 지정한 DB 에 테이블 생성
create table board( -- DB 설계에 따라 DTO 의 멤버변수 설계
	title varchar(100), -- 문자길이 임의로 지정(제목의 길이는 고정되어 있지 않기 때문에 가변길이를 가진 varchar 로 설계)
    content longtext,   -- 문자길이 임의로 지정(긴글 / 사진을 넣기 위해)
	writer varchar(30)  -- 문자길이 임의로 지정(작성자는 최대 30 글자로 설계)
);

# 실습 2 : 이클립스 WaitingService 의 DB 를 설계하시오.
create table waiting(
	tel char(13), -- 문자길이 임의로 지정(13 자리로 고정해서 사용하기 위해 char로 설계)
    count int -- 정수크기 임의로 지정
);
show tables;

# 실습 3 : boardService7 의 DB를 설계하시오.
	# 회원 테이블 
    # 게시판 테이블
    -- 회원이 존재해야 게시물이 존재 => 회원 : 상위 개념(PK) 게시판 : 하위 개념(FK)
create database boardservice7;
use boardservice7;
# 회원 테이블
create table member(
	mno int auto_increment, -- 회원번호 (auto_increment 를 통해 자동 부여 / 회원번호는 20 억을 넘지 않을 것으로 예상하고 int 설계)
    mid varchar(30) not null unique, -- 회원아이디 (아이디는 공백 존재 불가 not null 제약조건 지정 / 중복배제를 위해 unique 제약조건 지정)
    mpwd varchar(30) not null, -- 회원비밀번호 (비밀번호는 공백 존재 불가 not null 제약조건 지정)
 	mname varchar(10) not null, -- 회원명 (공백배제 -> not null)
    constraint primary key(mno) -- mno 를 PK 필드로 지정 (not null 과 unique 가 자동으로 포함되기 때문에 mno에 따로 지정하지 않아도 됨)
);
# 게시판 테이블
create table board(
	bno bigint auto_increment, -- 게시물번호 (auto_increment 를 통해 자동 부여)
	btitle varchar(100) not null,
    bcontent text, -- 내용은 공백 허용 / 최대 4GB 까지 대용량 입력 가능
    bdate datetime default now(), -- 게시물 작성일에는 default 기본값에 now() 함수를 사용해 시스템 날짜 / 시간 지정
    bview int default 0, -- 게시물 조회수에는 기본값을 0으로 지정해 조회수 0부터 시작되도록 지정
    
    # PK 필드 지정 -> PK 필드를 사용하지 않아도 관례적으로 테이블 당 1개 이상 씩 PK 필드로 지정해줌
    constraint primary key(bno), -- 해당 테이블의 기본키는 bno 로 지정
    
    # FK 필드 지정 
    mno int, -- 참조할 필드와 동일한 타입으로 지정
    constraint foreign key(mno) references member(mno)
    -- board 테이블의 mno 필드가 member 테이블의 mno 필드를 참조한다.
	-- member 테이블의 mno 를 참조하므로써 member 테이블의 mno 에 해당되는 정보(아이디, 비밀번호, 이름)를 사용할 수 있음 
	-- member 테이블의 mno != board 테이블의 mno => 같은 필드가 아닌 다른 필드를 참조해서 사용하는 것
);
