package day16;

import java.util.*;

public class LottoEx2 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>(); 
		HashSet<Integer> auto;
		int min = 1, max = 45;
		int bonus = 0;

		try {
			auto = createRandomSet(min, max, 6);
			createRandomSet(min, max, lotto, 6);

			bonus = min-1;
			while(true) {
				bonus = random(min,max);
				if(!lotto.contains(bonus)) {
					break;
				}
			}
			printSet(lotto);
			System.out.println("보너스 : " + bonus);
			printSet(auto);
			System.out.println();
			int rank = rank(lotto, bonus, auto); 
			if(rank != -1) {
				System.out.println(rank+"등 당첨!");
			}else {
				System.out.println("꽝!");
			}

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("예외 : 최소값과 최대값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1) + min;
	}

	public static void createRandomSet(int min, int max, HashSet<Integer> lotto, int cnt) 
		throws Exception, NullPointerException{
		if(lotto == null)	throw new NullPointerException("예외 : 빈 배열입니다.");
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");

		while(lotto.size() < cnt) {
			lotto.add(random(min,max));
		}
	}
	public static HashSet<Integer> createRandomSet(int min, int max, int cnt) 
		throws Exception {
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() < cnt) {
			set.add(random(min,max));
		}
		return set;
	}
	public static void printSet(HashSet<Integer> lotto) {
		for(Integer tmp : lotto) {
			System.out.printf("%2d ",tmp);
		}
	}
	
	public static int rank(HashSet<Integer> lotto, int bonus, HashSet<Integer> auto) {
		int sameCnt = 0;
		for(int tmp:lotto) {
			if(auto.contains(tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6:	return 1;
		case 5:	return auto.contains(bonus)? 2 : 3;
		case 4:	return 4;
		case 3:	return 5;
		}
		return -1;
	}
}

