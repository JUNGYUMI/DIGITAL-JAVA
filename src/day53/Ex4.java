package day53;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		// for문을 이용하여 문자를 입력받고 입력받은 문자가 y또는 Y이면 반복문을 종료하는 코드
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		// 입력받은 값 ch가 y가 아니고 Y가 아니면 반복
		for(; ;) {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if(ch == 'y' || ch=='Y') {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
