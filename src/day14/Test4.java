package day14;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("*****");
		print('-', 10);
		System.out.println(print2('&',10));
		}
	
		public static void print(String str){
		System.out.println(str);
		}										// 재사용성 낮음
		
		public static void print(char ch, int cnt) {
			for(int i = 1; i <= cnt; i++) {
			System.out.print(ch);
			}
			System.out.println();
		}
		
		public static String print2(char ch, int cnt) {
			StringBuffer res = new StringBuffer(cnt);	
			for(int i = 1; i<=cnt; i++) {
				res.append(ch);								//append 뒤에 이어붙이는 메서드
			}
			return res.toString();
		}
	}


