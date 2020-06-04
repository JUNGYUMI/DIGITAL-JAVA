-- 홍길동 교수님의 모든 지도학생을 확인하기 위한 SQL문을 작성하세요
select pr_name as '교수님', st_name as '지도학생'
	from coach
		join professor
		on pr_num = ch_pr_num
        join student
        on st_num = ch_st_num
	where pr_name = '홍길동';
    
-- 홍길동 교수님이 강의하거나 했던 모든 과목명을 확인하는 SQL문
-- (폐강인 경우는 가의 테이블에서 해당 강의를 삭제한다는 조건의 시스템)
select pr_name as '교수님' , su_title as '과목명', co_code as '강의코드'
	from course
		join professor
		on pr_num = co_pr_num
        join subject
        on su_num = co_su_num
	where pr_name = '홍길동';
    
-- 홍길동 교수님이 2020년 1학기 강의하는 모든 과목명을 확인하는 SQL문
-- (폐강인 경우는 가의 테이블에서 해당 강의를 삭제한다는 조건의 시스템)
-- 2020#_%#_1%로 조건을 걸면 다음과 같은 경우에 겸색돼서 잘못됨 => 2020_MSC001_2_1 // % = 0글자 이상
-- 2020#_%#_1_%로 족너을 걸면 _1다음에 1글자 이상이 필요해서 해결 됨
select pr_name as '교수명', su_title as '과목명', co_code as '강의코드'
	from (select * from course where co_code like '2020#_%#_1#_%' escape '#') co
		join(select * from professor where pr_name = '홍길동') pr 
			on pr_num = co_pr_num
        join subject
			on su_num = co_su_num;
            
-- 홍길동 교수가 하거나 했던 강의 이름을 중복된 강의 명은 제거
select pr_name as '교수님' , su_title as '과목명'
	from course
		join (select * from professor where pr_name = '홍길동') pr
			on pr_num = co_pr_num
		join subject
			on su_num = co_su_num
group by su_title;			-- 과목명을 기준으로 하나로 묶다 

-- 정렬 : order by ASC(오름차순)/DESC(내림차순) 
select * from attend order by at_num asc;