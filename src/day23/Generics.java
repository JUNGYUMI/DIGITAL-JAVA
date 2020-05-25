package day23;

public class Generics {
	/* 지네릭스 : 클래스(A) 안의 멤버 변수의 클래스를 미리 지정해 놓지 않고, 
	 * 		      클래스를 생성할 때 결정해주는 클래스
	 */
	public static void main(String[] args) {
	Student<Double> s = new Student();
	s.kor = 10.0;
	System.out.println(s.kor);
	
	}

}
class Student<A>{
	String name;
	A kor;
	A eng;
	A math;
	
}