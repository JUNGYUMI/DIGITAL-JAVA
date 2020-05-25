package day23;
import java.util.*;
public class EnumsEx1 {

	public static void main(String[] args) {
		// 열거형(691p) : 서로 관련된 상수를 편리하게 선언하기 위한 것.
		// 열거형.valueOf(문자열) : 문자열을 열거형으로 변환
		// 열거형.values() : 열거형에 있는 모든 값들 각각을 하나의 열거형으로 만들어서 배열을 생성 
		Type t = Type.교통비;
		Scanner scan = new Scanner(System.in);
		String type;
		do {
			int cnt = 1;
			System.out.println("분류 리스트");
			for(Type tmp : Type.values()) {
				System.out.println(cnt++ + "." + tmp);
			}
			System.out.print("분류를 입력하세요 : ");
			type = scan.next();
			 	
			for(Type tmp : Type.values()) {			// 하나씩 꺼내서 비교
				if(tmp.toString().equals(type)) {
					t = Type.valueOf(type);
				}
			}
		}while(t == null);			
		System.out.println(t);
		scan.close();
	}

}

enum Type{					 	//열거형 만들기
	통신비, 식비, 교통비, 월세, 주거비
}