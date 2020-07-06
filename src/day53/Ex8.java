package day53;
import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		// 두 실수와 산술연산자가 주어지면 산술 연산결과를 출력하는 코드를 작성하기 위한 메서드 만들기
	Scanner scan = new Scanner(System.in);
	double num1, num2;
	char op;
	System.out.print("두 정수와 연산자를 입력하세요(예: 1 2 +) : ");
	num1 = scan.nextDouble();
	num2 = scan.nextDouble();
	op = scan.next().charAt(0);
	System.out.printf("%.1f %c %.1f = %.1f\n", num1, op, num2, calc(num1, num2, op));
	}
	/** 기능: 두 실수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
	 * 매개변수 : 두 실수, 산술연산자 => double num1, double num2, char op
	 * 리턴타입 :산술 연산 결과 => double
	 * 메서드명 : calc
	 */
	public static double calc(double num1, double num2, char op) {
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		default : return 0;
		}
	}
}