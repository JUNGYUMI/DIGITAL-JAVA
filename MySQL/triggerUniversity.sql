/* 수강 테이블에 이수한 수강정보를 추가하세요.
EX) 2019년도 수강을 추가
	1. 학생과 강의 정보
	2. 2019년도 이전에(포함) 입학한 학생
	3. 강의 정보는 교수 정보와 과목 정보
    4. 2019년 이전에(포함) 교수가 된 교수 정보 */

-- 2015110013 학번 학생이 현재까지 이수한 학점을 출력하는 SQL문
select sum(su_point) as '2015110013 학생 이수학점'
	from attend
		join course
			on co_code = at_co_code
		join subject
			on su_num = co_su_num
    where at_st_num = 2015110013 and at_complete = 'Y';
    
/* 위의 과정을 트리거로 작성하세요.
	이벤트 종류 : update 
	이벤트 발생 테이블 : attend */
use university;
drop trigger if exists update_attend;
delimiter //
create trigger update_attend after update on attend
for each row
begin
	declare _point int default 0;
    declare _total int default 0; -- 업데이트 되기 전 학생의 총 이수학점
    if new.at_complete = 'Y' then 
		set _point = 
			(select ifnull(sum(su_point),0)
				from attend
					join course
						on co_code = at_co_code
					join subject
						on su_num = co_su_num
				where at_st_num = new.at_st_num and at_complete = 'Y');
	update student
		set st_point = _point
        where st_num = new.at_st_num;
	end if;
	if old.at_complete = 'Y' and new.at_complete = 'N' then
		# _total : 업데이트 되기 전 총 이수학점
        set _total = (select st_point from student where st_nm = new.at_st_num);
		# 이 시점의 _point는 학점 포기한 강의의 학점
        set _point = (select su_point 
			from attend
				join course
					on co_code = at_co_code
				join subject
					on su_num = co_su_num
				where at_st_num = new.at_st_num and new.at_co_code = at_co_code);
		# _point는 새로 계산된 총 이수학점 
        set _point = _total - _point;
	update student
		set st_point = _point
        where st_num = new.at_st_num;
    end if;
   
end//
delimiter ; 
show triggers;

# 트리거 실행문 안에서 트리거 이벤트가 발생한 테이블을 수정할 수 없다.
# 위의 트리거는 attend 테이블에서 이벤트가 발생할 때 실행되는 테이블이기 때문에
# 트리거 안에서 attend 테이블을 수정할 수 없다. 