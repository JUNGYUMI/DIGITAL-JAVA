package day22;
import java.util.*;
public class TestEx2 {
	// 구구단을 2단에서 9단까지 출력하는 코드를 작성
	// 구구단을 2단에서 9단까지 출력하는 메소드를 만들고, 이를 main에서 테스트
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	gugudan();
	}
	
	/* 기능 : 구구단을 2단부터 9단까지 출력하는 메소드
	 * 매개변수 : 2단, 9단 => int start, int end
	 * 리턴타입 : 없음 = void
	 * 메소드명 : gugudan
	 */
	public static void gugudan() {
		int i, j;
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
			System.out.printf("%d x %d = %d\n",i, j, i*j);
			}
			System.out.println();
		}
	}
}

/* start단 부터 end단까지 메소드 만들기
 public static void gugudan(int start, int end) {
 
		for(i=start; i<=end; i++) {
			for(j=1; j<=9; j++) {
			System.out.printf("%d x %d = %d\n",i, j, i*j);
			}
			System.out.println();
		}
	}
 */