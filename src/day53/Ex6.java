package day53;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// while문을 이용하여 문자를 입력받고 입력받은 문자가 y또는 Y이면 반복문을 종료하는 코드
		char ch = 'N';
		Scanner scan = new Scanner(System.in);
		while(ch != 'y' && ch != 'Y') {
			System.out.print("문자를 입력 : ");
			ch = scan.next().charAt(0);
		}
	}

}
