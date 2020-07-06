package day53;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// for문을 이용하여 구구단 9단을 출력하는 코드
		int num = 9;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (i*num));
			//system.out.printf("%d X %d = %d\n",num, i, num*i);
		}
	}

}
