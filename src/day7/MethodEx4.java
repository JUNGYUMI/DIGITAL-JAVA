package day7;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	gugudan(num);
	System.out.println("----------------------------");
	int start = 19, end = 10;
	int res = gugudan(num, start, end);
	if( res == 0) {
		System.out.println("0단의 모든 값은 0입니다.");	
	}else if (gugudan(num, start, end)== -1) {
		System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
	}
	
	scan.close();
	}
	
	/* 기능 : num가 주어지면 주어진 num단(구구단)을 출력하는 예제 메서드 
	 * 매개변수 : num단 => 정수 => int num
	 * 리턴타입 : 없음 void
	 * 메서드명 : gugudan
	 */
	public static void gugudan (int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", num, i, num*i);
		}
		
	}

	/* 기능 : num가 주어지면 주어진 num단(구구단)을 출력하는 예제 메서드 
	 * 		리턴값을 이용하여 예외처리가지 신경쓰는 예제
	 * 매개변수 : num단, 단의 시작, 단의 끝 => int num, int start, int end
	 * 리턴타입 : 없음 => void
	 * 			0 => 0단이 입력됨 => 출력 안함
	 * 			1 => 정상출력
	 * 			-1 => start > end 경우 => 출력 안함
	 * 			정수형 => int
	 * 메서드명 : gugudan
	 */
	public static int gugudan (int num, int start, int end) {
		if(num == 0)
			return 0;
		if(start > end)
			return -1;
		for(int i=start; i<=end; i++) {
			System.out.printf("%d x %d = %2d\n", num, i, num*i);
		}
		return 1;
	}
}
