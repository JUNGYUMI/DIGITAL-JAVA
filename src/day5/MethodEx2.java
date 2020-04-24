package day5;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1; int num2 = 2; char op = '+';
		System.out.println(calculate(num1, op, num2));
	}

	/* 기능 : 두 정수와 산술연산자가 주어지면 연산 결과를 알려주는 메서드
	 * 		(단, 예외 상황은 없다고 가정한다.
	 *		잘못된 연산자가 들어오거나, 0으로 나누는 경우) 
	 *	1. 매개변수 : 두 정수와 산술연산자 => int num1, char op, int num2
	 *	2. 리턴타입 : 산술연산자 => 실수 => double
	 *  3. 메서드명 : calculate
	 */

	public static double calculate (int num1, char op, int num2){
		
		if(op == '+') {
			return num1 + num2;
		}
		else if(op == '-') {
			return num1 - num2;
		}
		else if(op == '*') {
			return num1 * num2;	
		}
		else if(op == '/') {
			return (double)num1 / num2;	
		}
		else {
			return num1 % num2;
				
		}
	}
}