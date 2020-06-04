/* student 테이블안에 있는 모든 행들의 st_num과
	st_name의 값들을 확인하기 위한 SQL문을 작성하세요. */
    select st_num, st_name from university.student;
    
    /* student 테이블 안에 있는 모든 행들의 모든 속성 값들을 확인하기 위한 SQL문을 작성하세요. */
    select st_num, st_name, st_identification_num, st_type 
    from university.student;
    select * from university.student;
    
    insert into student(st_num, st_name, st_identification_num)
    values(2020110011, '홍길동','010101-312345');   
    
    select * from student;
    