package day54;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		// 컬렉션프레임워크를 이용하여 1부터 10까지를 저장하는 코드를 작성
		// int => 일반변수
		// integer => 참조변수 => NULL
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			arr.add(i);
		}
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		// HashSet<Integer> arr2 = new HashSet<Integer>();
		// HashMap<Integer, Integer> arr3 = new HashMap<Integer,Integer>();
	}

}
