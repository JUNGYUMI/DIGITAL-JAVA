package day8;

public class ConstructorEx1 {

	public static void main(String[] args) {
		point p1 = new point();
		p1.print();
		point p2 = new point(1,2);
		p2.print();
		
	}
}
class point{
	int x = 1;
	int y = 1;
	{ 
		// 초기화 블럭
		   x = 10;
	      y = 10;
	}
	static {
			// 클래스 초기화 블럭
			// 클래스 변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)", x, y);
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public point() {
		// this(0,0);
		this(100,100);
	}
	//복사 생성자
	public point(point p) {
		//다른 생성자 this()를 이용할 대에는 메서드의 첫번째줄에 넣어주어야한다.
		this(p.x, p.y);
		this.x = p.x;
		this.y = p.y;
		
	}
}

