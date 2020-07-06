package day53;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		// 성적을 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int num = scan.nextInt();
		if(num <= 100 && num >= 95) {
			System.out.print("A+");
		}else if(num <= 94 && num >= 90){
			System.out.print("A");
		}else if(num <= 89 && num >= 85){
			System.out.print("B+");
		}else if(num <= 84 && num >= 80){
			System.out.print("B");
		}else if(num <= 79 && num >= 75){
			System.out.print("C+");
		}else if(num <= 74 && num >= 70){
			System.out.print("C");
		}else if(num <= 69 && num >= 60){
			System.out.print("D+");
		}else if(num <= 59 && num >= 50){
			System.out.print("D");
		}else if(num <= 49 && num >= 0){
			System.out.print("F");
		}else {
			System.out.print("잘못된 성적입니다.");
		}
	}

}
