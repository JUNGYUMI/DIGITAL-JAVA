package day23;
import java.util.*;
public class OperatorEx2 {

	public static void main(String[] args) {
		// 정수 num가 짝수이면 true를, 홀수이면 false를 출력하는 코드를 조건문 없이 작성
		/* 예) 4
		 * 4는 짝수입니까? true
		 * 예) 5
		 * 5는 짝수입니까? fasle*/
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "은(는) 짝수입니까? " + (num % 2 == 0));
		//= System.out.println(num + "은(는) 짝수입니까? " + (num % 2 == 0 ? true : false));
		
		
		
	}

}
