package day17;

import java.util.*;

public class TestEx1 {
	//Scanner를 클래스 멤버 메소드로 사용할 수 있지만, TestEx1 클래스에서 스캐너는 의미있는 정보가 아님, 사용하지 않는 것이 좋다
	//static Scanner scan = new Scanner(System.in);
	
/*	두 정수를 입력받아 두 정수를 더하여 출력하는 코드를 자유롭게 작성하세요.
 * 매개변수 : 두 정수 int num1, int num2
 * 리턴타입 : 더하여 int 
 * 메소드명 : sum
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 참조변수, 지역변수
		int num1 = scan.nextInt(); // 일반변수, 지역변수
		Integer/*일반자료형을 클래스로 만든 것*/ num2 = scan.nextInt(); // 참조변수, 지역변수
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2,0));
		System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2));
		scan.close();
	}
	public static int sum(int num1, int num2, int res) {//매개변수, 일반변수
		res = num1 + num2;						 
		return res;
	}
	public static int sum(int num1, int num2) {
		int res = num1 + num2; //매개변수, 일반변수
		return res;
	}
}
