package day21;
import java.util.*;
public class TestEx1 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 입력받은 정수 중 큰 수를 출력하는 코드
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
			scan.close();
		}
	}
}
