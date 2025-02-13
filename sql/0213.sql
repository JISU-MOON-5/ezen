CREATE database EZEN;
use EZEN;
create table USER_INFO(
UI_NUM INT primary key auto_increment,
UI_NAME VARCHAR(20) not null,
UI_ID VARCHAR(20) not null,
UI_PWD VARCHAR(20) not NULL
);

drop table USER_INFO;

insert into USER_INFO(UI_NAME, UI_ID, UI_PWD)
VALUES('홍길동', 'HONG', '1234')
,('김길동', 'KIM', '1234')
,('이길동', 'LEE', '1234');

select * from USER_INFO;
where FI_PRICE>=4000
and FI_NAME like '%라%';

delete from USER_INFO
where UI_NUM=2;

update USER_INFO
set UI_NAME='성룡',
UI_ID='SUNG'
where UI_NAME='홍금보';


create table FOOD_INFO(
FI_NUM INT primary key auto_increment,
FI_NAME VARCHAR(30) not null,
FI_PRICE INT not NULL
);

insert into FOOD_INFO(FI_NAME, FI_PRICE)
VALUES('김밥', 3500)
,('떡볶이', 4000)
,('순대', 4500)
,('라면', 5000)
,('해장라면', 6000);

select * from FOOD_INFO;

delete from FOOD_INFO
where FI_NUM>=6;

update FOOD_INFO
set FI_PRICE = FI_PRICE+500;

update FOOD_INFO
set FI_PRICE = FI_PRICE * 1.1;

select * from FOOD_INFO
order by FI_NAME asc, FI_PRICE ASC



/*

<구조> ex. 폴더, 테이블, 파일 등
Create : 생성
Alter : 수정
Drop : 버리다


<데이터> ex. 파일 안에 들어가 있는 것
Insert : 집어넣다
Update : 수정
Delete : 삭제
Select : 조회(선택)


구조 / 데이터
를 구분하기!!!


---


(실행할 자리에 커서 두고)CTRL + ENTER : 실행하기
// select 계속 실행하지마라..
* : 모든 것을 선택
## : 주석
VALUES : 값들
= : 같다
SET : 대입
primary key : 기본값(중복 불가)  // PRIMARY KEY AUTO_INCREMENT
Delete 뒤에는 컬럼명 못 씀!! 바로 from 붙여


---


database : DATA 저장하는 곳
table : 폴더라고 생각하면 됨(이 안에 데이터를 만들어야 한다)
meta data : 다른 데이터를 설명해주는 데이터
column : 테이블에서의 각 열, 데이터 값 등

ASC(Ascending) : 오름차순
DESC(Descending) : 내림차순
//table 앞에 있으면 describe로 쓰임 : 테이블의 각 열이 어떤 속성을 가지고 있는지?로 쓰임
order by : 정렬



---



EX))

where UI_NAME LIKE '%김%' : UI_NAME에서 '김'이 들어간 것만 나와라
'김%' : 첫글자가 '김'인 것만 나와라
'%김' : 마지막이 '김'인 것만 나와라

VARCHAR(20) : 가변성이 있는 문자를 20자까지 
NOT NULL : 무조건 값을 집어넣어라

ODER BY ~~ // ~뒤에 아무것도 없으면 무조건 ASC
ODER BY ~~ DESC : ~~의 내림차순