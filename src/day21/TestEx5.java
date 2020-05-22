package day21;
import java.util.*;
public class TestEx5 {
	// 9개짜리 배열을 만들어서 2단의 결과를 배열에 저장하는 코드
	public static void main(String[] args) {
		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 2 * (i+1);
			System.out.print(arr[i] + " ");
		}

	}
}

