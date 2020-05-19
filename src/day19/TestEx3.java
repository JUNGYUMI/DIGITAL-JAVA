package day19;

import java.util.*;

public class TestEx3 {
	/* 아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고 한다.
	 * 기능은 학생 정보 추가, 학생 정보 수정, 학생 정보 삭제가 있다.
	 * 이 때 필요한 메소드를 선언부만 정의하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s = new Student("홍길동","21846033","컴공"," 1 "); //inputStudent(scan);
		List<Student> list = new ArrayList<Student>();
		insertStudent(list, s); //list에 학생 추가
		insertStudent(list, s); //list에 이미있는 학생을 추가하려해서 추가가 안됨
		insertStudent(list, new Student("임꺽정","21846034", "컴공", " 1 "));
		modifyStudent(list, new Student("임꺽정","21846034","컴공"," 2 ")); 
		deleteStudent(list, new Student("유관순","21846034","컴공"," 2 "));
		System.out.println("-이름----학번---전공-학년"); 
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		scan.close();
		
	}
	
	// 학생 정보 추가
	/* 기능 : 스캐너를 이용하여 학생 정보를 입력하면 학생 객체를 반환하는 메소드 
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 학생 객체 => Student
	 * 메소드명 : inputStudent */
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
	
	/* 기능: 주어진 학생정보를 학생정보 리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고, 학생이면 저장
	 * 매개변수 : 학생정보 리스트, 학생정보 => List<Student> list, Student s 
	 * 리턴타입 : 저장여부 => boolean
	 * 메소드명 : insertStudent
	 */
	public static boolean insertStudent(List<Student> list, Student s) {
		if(list == null || s == null)			// 학생정보 리스트가 없거나, 학생정보가 없으면 추가할 수 없기 때문에 실패
			return false;
		
		if(list.contains(s))					// 이미있는 학생 저장하지x
			return false;
		else 
			list.add(s);						// 학생이면 저장 (학생 정보 추가)
			return true; 
	}
	
	/* 기능 : 주어진 학생 정보를 학생정보 리스트에서 수정하는 메소드로 학생 정보가 없으면 수정실패를 학생 정보가 있으면 수정 성공을 알려줌
	 * 매개변수 : 학생정보리스트, 주어진 학생정보 => List<Student> list, student s
	 * 리턴타입 : 수정여부 => boolean
	 * 메소드명 : modifyStudent
	 */
	public static boolean modifyStudent (List<Student> list, Student s){
		if(list == null || s == null) 	 // list가 비거나 s가 비었으면 false
			return false;
		
		if(!list.contains(s))			// list에 학생정보 s가 있는지 확인하여 없으면 false
			return false;
		
		list.remove(s);					// 있으면 list에 있는 학생 s의 정보를 지우고, list에 학생 s의 정보를 추가
		list.add(s);
		return true;
	}
	
	/* 기능 : 주어진 학생 정보를 학생정보 리스트에서 수정하는 메소드로 학생 정보가 없으면 삭제실패를 학생 정보가 있으면 삭제 성공을 알려줌
	 * 매개변수 : 학생정보리스트, 주어진 학생정보 => List<Student> list, student s
	 * 리턴타입 : 수정여부 => boolean
	 * 메소드명 : deleteStudent
	 */
	public static boolean deleteStudent (List<Student> list, Student s){
		if(list == null || s == null)
			return false;

		if(!list.contains(s))
			return false;

		list.remove(s);					// 있으면 list에 있는 학생 s의 정보를 지움
		return true;
	}
	
	
	//----------------------------------------내가 연습한 것-----------------------------------
	// 학생 정보 수정
	/* 기능 : 학생의 학번을 이용하여 학생의 전공을 수정 
	 * 매개변수 : 학번 => String num, 전공=> String major
	 * 리턴타입 : void
	 * 메소드명 : studentEdit */
	public static void studentEdit(String major, String num) { 
		
	}
	
	// 학생 정보 삭제
	/* 기능 : 학생의 전공을 이용하여 학번이 일치하면 삭제 일치하지않으면 삭제하지 않음  
	 * 매개변수 : 전공 => major, 학번=> num 
	 * 리턴타입 : ~일치하면 ~않으면 => boolean
	 * 메소드명 : studentDel */
	public static boolean studentDel(String major, String num) {
		return true;
	}
	//--------------------------------------------------------------------------------------
}
class Student{
	String name; //이름
	String num; //학번 => 고유번호(중복x)
	String major; //전공
	String grade; //학년
	public Student() {} 			//기본 생성자
	public Student(String name, String num, String major, String grade) {					// 생성자 오버로딩
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return name + " " + num + " " + major + " " + grade + " ";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {					// 학생 정보인지 아닌지를 판단하기 위한 메소드를 선언해보세여.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
}