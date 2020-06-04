use shoppingmall;

drop trigger if exists insert_purchase_list;
-- phurchase_list 테이블에 insert 이벤트가 발생된 후에 동작하는 트리거
-- 데이터가 추가된 후에 동작하며 추가된 데이터는 new를 통해 접근할 수 있다.
delimiter //
create trigger insert_purchase_list after insert on purchase_list

-- for each row는 update나 delete와 같이 조건에 의해 여러 행이 수정되거나 삭제될 때
-- 변경되는 각행을 의미
for each row
begin
	-- _amount 변수 선언
     declare _amount int default 0;
	declare _total_price int default 0;
    declare _price int default 0;
    -- 구매 리스트에 추가된 제품의 현재 재고량을 가져와서 _amount에 저장
    -- new.pl_pd_code는 지금 테이블에 추가된 구매리스트의 제품코드
    set _amount = (select rl_amount from registration_list where rl_pd_code = new.pl_pd_code);
    
    -- 현재 재고량에서 구매한 재고량을 뺌
    set _amount = _amount - new.pl_amount;
    
	update registration_list
		set rl_amount = _amount
        where rl_pd_code = new.pl_pd_code;
        
		set _total_price
        = (select pc_price
			from purchase
				where new.pl_pc_num = pc_num);
             
		set _price
			= (select pd_price from product
				where new.pl_pd_code = pd_code);
		set _total_price = _total_price + _price * new.pl_amount;
        
	update purchase
		set pc_price = _total_price
		where new.pl_pc_num = pc_num;
end//
delimiter ; 
show triggers;
