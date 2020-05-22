package day21;
import java.util.*;
public class TestEx4 {
	// 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수중에 가장 큰 수를 출력하는 코드를 작성하세요. 
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[] arr =  new int[5];
		//5개의 정수를 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		//최댓값 검색
		int max = arr[0];
		for(int i = 1; i <arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		scan.close();
	}
}



/*Scanner scan = new Scanner(System.in);
		int[] arr =  new int[5];
		//5개의 정수를 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			int tmp = num;
			tmp = arr[i];
			if( arr[i] >  ) {
				System.out.println(arr[i]);
			}else {
				System.out.println();*/
