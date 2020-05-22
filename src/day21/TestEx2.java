package day21;
import java.util.*;
public class TestEx2 {

	public static void main(String[] args) {
		// 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요(평균은 소수점 둘째자리까지 출력)
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double res = 0.0;
		for(int i = 1; i <= 3; i++) {
			sum += scan.nextInt();
		}
		res = sum / 3.0;							// 평균 만들 때 한쪽은 실수로 
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f" , res);
		scan.close();
	}

}

/* 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요(평균은 소수점 둘째자리까지 출력)
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int num3 = scan.nextInt();
System.out.printf("%d + %d + %d = %d",num1, num2, num3, num1+num2+num3);
System.out.printf("(%d + %d + %d) / 3 = %.2f\n", num1, num2, num3, (num1+num2+num3)/3);
scan.close(); */