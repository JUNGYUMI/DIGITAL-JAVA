package day2;

public class ForEx3 {

	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하는 코드를 for문으로 작성하세요.
		// 1. 반복횟수 : i는 1부터 5까지 1씩 증가
		// 2. 규칙성 : 
		// 3. 반복문 종료 후 " 1부터 5까지의 합 sum을 출력
		
		int i, sum = 0;
		for(i=1; i<=5; i++) {
			sum = sum + i; //sum += i;
		}
		System.out.println("1부터 5까지의 합 : " + sum);
	}

}
