package day19;
import java.util.*;
public class TestEx4 {
	// 추가, 수정, 삭제 메소드를 이용하여 main에서 학생 관리 프로그램이 동작하도록 코드를 구성하세요.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		Student s;
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("추가할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!insertStudent(list, s)) {
					System.out.println("***이미 있는 학생 정보입니다.***");
				}else {
					System.out.println("***학생 정보를 추가했습니다.***");
				}
				break;
			case 2 : 
				System.out.println("수정할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!modifyStudent(list, s)) {
					System.out.println("***없는 학생 정보입니다.***"); 
				}else {
					System.out.println("***학생 정보를 수정했습니다.***"); 
				}
				break;
			case 3 :
				System.out.println("삭제할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!deleteStudent(list, s)) {
					System.out.println("***없는 학생 정보입니다.***"); 
				}else {
					System.out.println("***학생 정보를 삭제했습니다.***");
				}
				break;
			case 4 :
				printStudent(list);
				break;
			case 5 :
				System.out.println("***프로그램을 종료합니다.***");
				break;
			default : 
				System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while(menu != 5);
		scan.close();
	}
	public static void printMenu() {
		System.out.println("======메뉴======");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 프로그램  종료");
		System.out.println("===============");
		System.out.print("메뉴를 입력하세요 : "); 
	}	
	
	public static void printStudent(List<Student>list) {
		if(list == null || list.size() == 0)
			System.out.println("학생 정보가 없습니다.");
		else {
			System.out.println("-이름----학번---전공-학년"); 
			for(Student tmp : list) {
				System.out.println(tmp);
			}
		}
	}
	
	
	public static Student inputStudent(Scanner scan) { 
		Student s = new Student();
		System.out.print("학번 : ");
		String num = scan.next();
		System.out.print("학년 : ");
		String grade = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();
		s.num = num;								// s라는 객체에 하나씩 넣어주기
		s.name = name;
		s.grade = grade;
		s.major = major;
		return s;
	}
	
	public static boolean insertStudent(List<Student> list, Student s) {
		if(list == null || s == null)
			return false;
		if(list.contains(s))
			return false; 
		list.add(s);
		return true;
	}
	
	public static boolean modifyStudent (List<Student> list, Student s){
		if(list == null || s == null) 	 
			return false;
		if(!list.contains(s))			
			return false;
		list.remove(s);					
		list.add(s);
		return true;
	}
	
	public static boolean deleteStudent (List<Student> list, Student s){
		if(list == null || s == null)
			return false;
		if(!list.contains(s))
			return false;
		list.remove(s);					
		return true;
	}
}
