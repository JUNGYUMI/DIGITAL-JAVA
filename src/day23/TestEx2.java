package day23;
import java.util.*;
public class TestEx2 {
	/* 중복되지 않는 정수 5개를 Set에 저장하고, 저장된 값의 합과 평균을 구하세요. */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int size = 5;	// 사이즈가 5개가 아니라 중복되지 않은 수가 5개가 나올 때 까지를 의미
		/* 문제에서 정수 5개를 입력받는게 아니라 중복되지 않은 정수 5개를 입력받아야 하기 때문에 
		 * 반복 횟수는 5번으로 고정된 것이 아니라 Set에 5개가 저장될때 까지 반복해야한다. */
		for( ; set.size() < size ; ) {
			int tmp = scan.nextInt();
			set.add(tmp);
			//= set.add(scan.nextInt());
		}
		int sum = sum(set);
		System.out.println(sum);
		double avg = (double)sum / set.size();
		System.out.println(avg);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);	list.add(2);
		System.out.println(sum(list));
	}
	
	/* 아래 sum 메소드는 매개변수가 Collection 인터페이스를 구현한 모든 객체이기 때문에
	 * Set이 와도 가능하고, List가 와도 가능합니다. (즉, 재사용성이 높아지게 된다.) */
	public static int sum(Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer tmp = it.next(); 	// 실행
			if(tmp != null)
				sum += tmp;
		}
		return sum;
	}
	
}
/*Scanner scan = new Scanner(System.in);
HashSet<Integer> hs = new HashSet<Integer>(5);
int size = 5;
int min = 0, max = 5;
while(hs.size() < size) {
	int random = new Random().nextInt(max - min) + min;
	System.out.print(random + " "); 
	hs.add(random); 
}
for(int i = 0; i < 5; i++) {
	
	for(Integer tmp : hs) { 
		System.out.print(tmp + " "); 
	}
}*/