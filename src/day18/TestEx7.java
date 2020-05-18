package day18;

import java.util.*;

public class TestEx7 {
	/* 정수 n개를 입력받아 저장하고, 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.
		ex)
		입력받을 정수의 개수 : 5
		정수 5개를 입력하세요 : 1 2 3 4 5
		입력 받은 정수를 거꾸로 출력 : 5 4 3 2 1 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력받을 정수의 개수 : "); 
		int size = scan.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		System.out.print("정수" + size + "개를 입력하세요 : ");
		for(int i = 0; i<size; i++) {
			int tmp = scan.nextInt();
			//저장
			arr.add(tmp);				// arr.add(scan.nextInt());
		}
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		//거꾸로 출력하는 작업
		for(int i = size-1; i>=0; i--) {
			System.out.print(arr.get(i) + " "); 
		}
	
	}
}	
		
		
	
	

