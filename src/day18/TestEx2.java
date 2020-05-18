package day18;

import java.util.*;

public class TestEx2 {
	/* 1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요
			A : 90점이상 100점 이하
			B : 80점이상 90점 미만
			C : 70점이상 80점 미만
			D : 60점 이상 70점 미만
			F : 0점이상 60점 미만
	2. 1번에서 작성한 내용을 메소드로 만드세요.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요(0~100) : ");
		int num = scan.nextInt();
		String grade = grade(num);
		if(grade(num).contentEquals("X")) {
			System.out.println("올바른 점수가 아닙니다.");
		}else {
			System.out.println(grade(num) + "학점입니다.");
		}
		
		//grade2 메소드
		try {
			System.out.println(grade2(num) + "학점입니다.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		scan.close();
	}
	/* 기능 : 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드
	 * 매개변수 : 정수 성적 => int score
	 * 리턴타입 : 학점(추후 +를 추가할수도 있기 때문에) => String
	 * 메소드명 : grade
	 */
	
	/**
	 * 
	 * @param score : 정수 성적
	 * @return : 성적에 맞는 학점으로 A,B,C,D,F학점과 올바르지 않을때의 학점 X를 반환
	 */
	public static String grade(int score) {
		if(score < 0 || score > 100) return "X";
		if(score >= 90) return "A";
		if(score >= 80) return "B";
		if(score >= 70) return "C";
		if(score >= 60) return "D";
		return "F";
	}
	
	/*
	 * 기능 : 점수를 입력받아 입력받은 성적에 맞는 학점을 알려주는 메소드 */
	 
	public static String grade2(int score) {
		if(score < 0 || score > 100)
			throw new ArithmeticException("올바른 점수가 아닙니다.");
		if(score >= 90) return "A";
		if(score >= 80) return "B";
		if(score >= 70) return "C";
		if(score >= 60) return "D";
		return "F";
	}
	 /* 기능 : 정수를 입력받아 입력받은 성적에 맞는 학점을 출력하는 메소드 */
	public static void grade4(int num) {
		if(num >= 90 && num <= 100) {
			System.out.println("A 학점");
		}else if(num >= 80 && num < 90){
			System.out.print("B 학점");
		}else if(num >= 70 && num < 80){
			System.out.print("C 학점");
		}else if(num >= 60 && num < 70){
			System.out.print("D 학점");
		}else {
			System.out.println("F 학점");
		}
	}

}


