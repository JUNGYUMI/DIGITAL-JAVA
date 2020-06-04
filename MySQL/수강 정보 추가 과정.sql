-- 1. 과목 등록
insert into subject values('MSC001', '대학수학기초', 2, 2);
SELECT * FROM university.subject;
-- 2. 교수 등록
insert into professor 
	values(2020110003, '김구', '40', '010-1234-5678', '교수실 103호');
select * from professor;
-- 3. 강의 등록
insert into course
	values('2020_MSC002_1_1','강의실 103호','월1,2 수1,2',2,2020110003,'MSC001');
select * from course;
-- 4. 학생 등록
select*from student;
-- 5. 수강 등록
insert into attend(at_co_code, at_st_num)
	values('2020_MSC002_1_1', 2020110011);
select * from attend;
