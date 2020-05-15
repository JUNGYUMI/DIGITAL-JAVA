package day17;

import java.util.*;
public class BaseballGame2 {

	public static void main(String[] args) {
		// 1. 컴퓨터가 생성한 랜덤한 수를 저장하는 리스트 : com
		List<Integer> com = new ArrayList<Integer>();
		
		// 2. 사용자가 입력한 수를 저장하는 리스트 : user
		List<Integer> user = new ArrayList<Integer>();
		int size = 3;
		int min = 1, max = 9;
		
		// 3. 중복되지않은 랜덤한 수 3개를 com에 저장
		com = createRandomList(size,min,max);
		System.out.println(com+" ");
		
		// 4. 중복되지않은 세수를 입력하여 맞출 때 까지 반복
		// 4-1. 3스트라이크의 개수가 3개가 될 때까지
		int strike = 0, ball = 0;
		Scanner scan = new Scanner(System.in);
		while(strike != size) {
		
			// 4-2. 정수 세개를 입력받아 중복된 내용이 있으면 다시 입력 받게 함
			user.clear();
			
			/* 중복된 숫자가 있는 경우 */
			if(!insertUser(scan, min, max, user, size)) {
				System.out.printf("입력한 숫자중에 중복된 숫자가 있거나 입력된 숫자가" + "%d~%d사이의 숫자가 아닙니다.\n",min, max); 
				continue;
			}
			System.out.println(user);
			
			// 4-3. 스트라이크와 볼 판별
			strike = 0;
			ball = 0;
			for(int i = 0; i<com.size(); i++) {
				if(com.get(i) == user.get(i)) {				// 스트라이크 개수 판별
					strike++;
				}
				if(com.contains(user.get(i))){				// 스트라이크 + 볼의 개수 판별
					ball++;
				}
			}
			ball = ball - strike;
			// 4-4. 판별한 스트라이크와 볼을 이용하여 출력
			if(strike != 0) {
				System.out.print(strike + " S ");
			}
			if(ball != 0) {
				System.out.print(ball + " B ");
			}
			if(strike == 0 && ball == 0) {
				System.out.print( " 3O ");
			}
			System.out.println();
		}
		System.out.println(" 정답 입니다"); 
	}
	public static int random(int min, int max) {
		
		if(max < min)
			throw new ArithmeticException(" 예외발생 : 최댓값과 최솟값 순서가 바뀌었습니다. ");				
		return new Random().nextInt(max - min + 1)+min;
	}
	/* 기능 : 정수/중복되지않은 수/저장하여 출력 => min에서 max사이의 랜덤한 수를 중복되지않게 size개 만큼 리스트에 저장하는 메소드
	 * 매개변수 : 개수 => int size 최솟값, 최댓값 : int min, int max
	 * 리턴타입 : 랜덤한 수가 저장된 리스트 => List<Integer> 
	 * 메소드명 : createRandomList
	 */
	public static List<Integer> createRandomList(int size, int min, int max) {
		if(size > max-min+1)
			throw new ArithmeticException("예외 발생 : 랜덤 범위보다 만들어야하는 개수가 더 많습니다.");
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random(min, max);
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		return list;
	}
	/* 기능 : 스캐너를 통해 정수를 size개 입력받아 입력받은 정수가 min ~ max사이이고 중복되지않으면 리스트에 저장한 후 
	 		 리스트 생성 여부를 알려주는 메소드
	 * 매개변수 : 스캐너, 최솟값, 최댓값, 리스트, 개수 => Scanner scan, int min, int max, List<Integer> user, int size
	 * 리턴타입 : 생성여부 => boolean
	 * 메소드명 : insertUser
	 */
	public static boolean insertUser(Scanner scan, int min, int max, List<Integer>user, int size) {
		int i = 0;
		System.out.print("중복되지 않은 숫자 3개를 입력하세요(1~9) : "); 
		while(i++ < size) {
			user.add(scan.nextInt());
		}
		i = 0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while(user.size() != 0) {
			int tmp = user.remove(0);
			// 입력된 수가 min보다 작거나 max보다 크거나 중복이 되면
			if(tmp < min || tmp > max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);							
		}
		// user = tmpList; <====== 이렇게 작성시 원본에 tmpList값이 추가되지 않음 
		user.addAll(tmpList);
		return true;
	}
}
