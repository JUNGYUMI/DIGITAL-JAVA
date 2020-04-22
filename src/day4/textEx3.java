package day4;

public class textEx3 {

	public static void main(String[] args) {
		/* 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고(중복o)
		 * 저장된 배열 값 중에서/ 가장 큰값과 가장 작은 값/을 출력하는 코드를 작성
		 */
		
		int arr[] = new int [10];
		int rMin = 1;
		int rMax = 100;
		int min, max;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin))+rMin;
		}
		for (int tmp : arr) {
			System.out.printf(" %d ", tmp); 
		}
		System.out.println();
		min = max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("배열의 최댓값 : %d, 최솟값 : %d\n", max, min);
	}
}
