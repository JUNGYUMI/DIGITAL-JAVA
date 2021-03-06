package day17;

import java.util.*;

public class MethodEx1 {
	/*main메소드부터 실행 순서를 줄수로 표현하세요. (단, 1 / 2를 입력했다고 가정)
	 * 순서 ==>
	 * 10 - 19 > 48 - 46 > 40 41 42 48  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 (예 : 1 + 2) : ");
		int num1, num2;
		char op;
		try {
			num1 = scan.nextInt();
			op = scan.next().charAt(0);
			num2 = scan.nextInt();
		System.out.printf("%d %c %d = %.1f\n", num1, op, num2, calculate(num1, op, num2));
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
		scan.close();
	}
	/* 기능 : 두 정수의 합을 반환하는 메소드 */
	public static int sum(int a, int b) {
		return a + b;
	}
	/* 기능 : 두 정수의 차를 반환하는 메소드 */
	public static int minus(int a, int b) {
		int res = a - b;
		return res;
	}
	/* 기능 : 두 정수의 곱을 반환하는 메소드 */
	public static int mul(int a, int b) {
		int res = a * b;
		return res;
	}
	/* 기능 : 정수 a를 정수 b로 나눈 결과를 반환하는 메소드 */
	public static double div(int a, int b) {
		return (double)a / b;
	}
	/* 기능 : 정수 a를 정수 b로 나눈 나머지를 반환하는 메소드 */
	public static int mod(int a, int b) {
		return a % b;
	}
	/* 기능 : 정수 a와 정수 b를 산술연산자 op의 결과를 반환하는 메소드 */
	public static double calculate(int a, char op, int b) {
		switch(op) {
		case '+' : return sum(a,b); 
		case '-' : return minus(a,b); 
		case '*' : return mul(a,b); 
		case '/' :  
			if(b == 0)
				throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다.");
			return div(a,b);
		case '%' :
			if(b == 0)
				throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다.");
		return mod(a,b);
		/* case '+' : res = a + b; break;
		case '-' : res = a - b; break;
		case '*' : res = a * b; break;
		case '/' : res = a / b; break;
		case '%' : res = (double)a % b; break; */
		default:	
			throw new ArithmeticException("예외 발생 : " +op+ "는 산술연산자가 아닙니다.");
		}
	}
}

