package day6;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 배열의 값을 출력하도록 작성하세요.
		 * 
		 */
		int arr[] = new int[5];
		PrintArray(arr);
		
		/* 0번지에 0을 1번지에 1을... 4번지에는 4가 저장되도록 작성하세요.
		 * 
		 */
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			
		}
		PrintArray(arr);
		
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 확인하여 있으면 있습니다.
		 * 없으면 없습니다라고 출력하는 코드를 작성하세요.
		 */
		int num = 6;
		if(isDuplicated(arr, num)) {
			
			System.out.println(num + "(은)는 있습니다.");
		}else {
			System.out.println(num + "(은)는 없습니다.");
		}
		
		/* for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(num + "(은)는 있습니다.");
				break;
			}
			 
			 arr.length-1은 배열 arr의 마지막번지
			  앞에서 중복검사를 하기 대문에 마지막번지이면서 여기까지 왔다는 것은
			  마지막번지까지 중복된 내용이 없다는 뜻이다.
			 
			if(i==arr.length-1) {
				System.out.println(num + "(은)는 없습니다.");
			}
		} */
	}
	
		// 배열의 값을 0번지부터 마지막까지 접근하는 반복문 (외웡) //
		/* for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}*/
	
	
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열 => int[] arr
	 * 리턴타입 : 없음 => void (출력만하는 기능)						//있을때 : 보여주는, 알려주는
	 * 메서드명 : PrintArray
	 */
	public static void PrintArray (int []arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		}
	
		/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드
		 * 매개 변수 : 배열, 정수 num => int[] arr
		 * 리턴타입 : 있는지 없는지 => boolean     
		 * 메서드명 : isDuplicated
		 */
	public static boolean isDuplicated (int []arr, int num) {
		int num1; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
			
	}
}

	
