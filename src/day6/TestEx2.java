package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력받아 출력하는 과정을 q가 입력될때까지 반복하세요.
		 * 
		 */
		
		char a;
		Scanner scan = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.print( "문자를 입력하세요 : ");
			a = scan.next().charAt(0);
			if( a != 'q')
				System.out.println(" 입력받은 문자 : " + a);
			else {
				System.out.println(" 종료합니다 ");
				break;
			}
		}
		scan.close();
		
	}	
}
		

