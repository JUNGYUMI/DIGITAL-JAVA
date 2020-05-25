package day23;
import java.util.*;
public class DateEx1 {

	public static void main(String[] args) {
		Calendar date =  Calendar.getInstance();
		// Month는 0~11까지 입력하기 대문에 5월을 입력하려면 4로 입력하거나, Calendar.MAY를 입력
		// Calendar.MAY는 상수 4를 의미
		date.set(2020, 4, 05);
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);	// 특정한 날 계산할 때
		
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);	
		
		System.out.println(toString(date));
		date.add(Calendar.MONTH, 1);	
		
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "-" + 
				((date.get(Calendar.MONTH)+1) < 10?"0" : "") +			// 1월 ~ 9월까지 01~09월로 만들기
				(date.get(Calendar.MONTH)+1) + "-" + 					// MONTH에는 +1을 해준다리
				((date.get(Calendar.DATE)+1) < 10?"0" : "") +
				date.get(Calendar.DATE);
	}
}
