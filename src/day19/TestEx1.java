package day19;

import java.util.Scanner;

public class TestEx1 {
	/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성
		ex)
		정수를 입력하세요 : 12345
		결과 : 54321 */
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		int tmp = num;
		String res = "";
		while(tmp != 0) {
			res += tmp % 10;
			tmp = tmp / 10;
		}
		if(num!=0)
			System.out.println(" 결과 : " + res);
		else
			System.out.println(" 결과 : " + num); 
		res = "" + num;
		String reverseRes = "";
		for(int i = res.length()-1; i >= 0; i--) {
			reverseRes += res.charAt(i);
		}
		System.out.println(" 결과 : " + reverseRes);
		scan.close();
	}
}
		/* Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int size = scan.nextInt();
		System.out.print("결과 : " + size);
		for(int i = size-1; i>=0; i--) {
			
		} */

