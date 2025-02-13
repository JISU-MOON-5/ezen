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

select * from USER_INFO
where UI_NAME like '%동';

delete from USER_INFO
where UI_NUM=2
;


/*
<구조> ex. 폴더, 테이블, 파일 등
Create : 생성
Alter : 수정
Drop : 버리다


<데이터> ex. 파일 안에 들어가 있는 것
Insert : 집어넣다
Update : 수정하다
Delete : 삭제하다
Select : 조회하다(선택)


구조 / 데이터
를 구분하기!!!


---


(실행할 자리에 커서 두고)CTRL + ENTER : 실행하기
* : 모든 것을 선택
## : 주석
VALUES : 값들
= : 같다
SET : 대입
primary key : 기본값(중복 불가)
Delete 뒤에는 컬럼명 못 씀!! 바로 from 붙여


---


database :
table : 폴더라고 생각하면 됨(이 안에 데이터를 만들어야 한다)
meta data : 다른 데이터를 설명해주는 데이터
column : 테이블에서의 각 열, 데이터 값 등






EX))

where UI_NAME LIKE '%김%' : UI_NAME에서 '김'이 들어간 것만 나와라
'김%' : 첫글자가 '김'인 것만 나와라
'%김' : 마지막이 '김'인 것만 나와라

VARCHAR(20) : 가변성이 있는 문자를 20자까지 
NOT NULL : 무조건 값을 집어넣어라