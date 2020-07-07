package day54;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		try {
			calc(1,0,'?');
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		/** 기능: 두 실수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
		 * 매개변수 : 두 실수, 산술연산자 => double num1, double num2, char op
		 * 리턴타입 :산술 연산 결과 => double
		 * 메서드명 : calc
		 */
		public static double calc(double num1, double num2, char op) throws Exception {
			switch(op) {
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '/': 
				if(num2 == 0)
					throw new ArithmeticException("0으로 나눌 수 없습니다.");
				return num1 / num2;
			case '%': 
				if(num2 == 0)
					throw new ArithmeticException("0으로 나눌 수 없습니다.");return num1 % num2;
			default : 
				throw new Exception(op + "는 산술 연산자가 아닙니다.");
			
			}
		}
	}