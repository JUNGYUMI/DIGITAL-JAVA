-- 등록된 학생들의 학번과 이름이 출력(검색)되도록 SQL문을 작성하세요.
select st_num, st_name from student;

-- 등록된 학생들 중에서 학번이 2020110011인 학생의 모든 정보를 출력(검색)하는 SQL문을 작성하세요 (테이블에 2020110011학생이 없어도 상관없음)
SELECT * FROM student where st_num = 2020110011;

-- 등록된 학생들 중에서 학번이 2020110011이 아닌 학생의 모든 정보를 출력(검색)하는 SQL문을 작성하세요 (테이블에 2020110011학생이 없어도 상관없음)
select * from student where st_num != 2020110011;

-- 2019학번 학생을 등록하는 SQL문을 작성하세요. 학번, 이름, 주민번호, 분류는 임의로 입력
insert into student(st_num, st_name, st_identification_num)
values (2019110011, '이순신', '000102-332188');
select * from student;

-- 2020학번 학생들만 출력되도록 SQL문 작성
select * from student where st_num >= 2020000000;


