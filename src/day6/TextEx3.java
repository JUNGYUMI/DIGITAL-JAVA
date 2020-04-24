package day6;

import java.util.Scanner;

public class TextEx3 {

	public static void main(String[] args) {
		/* 여러명 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료하도록 하세요. 
		 *
		 * 100 ~ 90  : A
		 *  89 ~ 80  : B
		 *  79 ~ 70  : C
		 *  69 ~ 60  : D
		 *  59 ~  0  : F
		 *  100점이상   : 잘못된 수 입니다.
		 */
		int i = 100;
		Scanner scan = new Scanner(System.in);
		
		for( ; ; ) {	
			System.out.print(" 성적을 입력하세요. (종료하려면 음수를 입력하세요) : ");
			i = scan.nextInt();
			
			
			if(i <= 100 && i >= 90) {
				System.out.println(i + "는 A학점");
			}
	
			else if(i <= 89 && i >= 80) {
				System.out.println(i + "는 B학점");
			}
			
			else if(i <= 79 && i >= 70) {
				System.out.println(i + "는 C학점");
			}
			
			else if(i <= 69 && i >= 60) {
				System.out.println(i + "는 D학점");
			}
			
			else if(i <= 59 && i >= 0) {
				System.out.println(i + "는 F학점");
			}
			
			else if(i < 100) { 
				System.out.println("지금까지 입력확인한 학생의 수는" + (i-1) + "명입니다."); 
				System.out.println("종료합니다");
				break;
			}
			
		}
		
	}
}
