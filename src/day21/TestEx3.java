package day21;
import java.util.*;
public class TestEx3 {
	// 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수의 합과 평균을 구하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		double res = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); 
			sum += arr[i];			
		}
		res = (double)sum / arr.length;						
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f\n" , res);
		scan.close();
	}

}
