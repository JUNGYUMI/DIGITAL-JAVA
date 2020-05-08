package student;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		student tmpstudent;
		int size = 30;						
		student std[] = new student[size];	// 30개를 만든 상태
		int cnt = 0;	// 현재 저장된 학생 수
		
		String name;
		
		while(menu != 5) {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("추가할 학생정보를 입력하세요.");
				tmpstudent = searchInfor(scan);
				System.out.print("이름 : ");
				name = scan.next();
				tmpstudent.setName(name);
				if(isDuplicated(std, cnt, tmpstudent) != -1) {				// 중복이 없다
					System.out.println("이미 있는 학생입니다.");
					break;
				}
				std[cnt] = tmpstudent;	 
				
				//과목정보에 대한 작업을 해야함
				System.out.println("과목정보를 입력하시겠습니까?(y/n)");
				char subjectMenu = scan.next().charAt(0);
				switch(subjectMenu) {
				case 'y' : case 'Y' :
					inputSubject(scan, std[cnt]);
				default :
					//처리
				}
				cnt++;
				tmpstudent = null;
				break;
				
			case 2 : 
				modifyStudent(std,cnt,scan);
				break;
				
			case 3 : 
				System.out.println("삭제할 학생 정보를 입력하세요.");
				tmpstudent = searchInfor(scan);
				if(deleteStudent(std, tmpstudent, cnt)) cnt--;
				
				break;
				
			case 4 : 
				printstudent(std,cnt);
				break;
				
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				break;
				default :
				System.out.println("잘못된 메뉴입니다.");

			}
		}
		scan.close();
	}
	
	// 메뉴
	public static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("-----------------");
		System.out.printf("메뉴를 선택하세요. : ");
	}
	
	// 찾는 정보
	public static student searchInfor(Scanner scan){
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		student s = new student();										// 비어있는 학생정보만들기
		s.setGrade(grade);												// (학년) 채워주기
		s.setClassNum(classNum);										// (학반) 채워주기		
		s.setNum(num);													// (번호) 채워주기
		return s;														// 받아서 채워주기
	}
	
	// 학생의 모든 정보를 출력
	/*
	 * void : 콘솔에 출력하고 알려줄 정보가 없어서
	 * int : 출력학생 수를 확인
	 * boolean : 학생정보를 추력하면 true, 실패하면 false
	 */
	/*
	 * student : 한명의 학생정보
	 * student [] : 여러명의 학생 정보
	 * cnt : 현재 출력할 학생 수 
	 */
	public static void printstudent(student []std, int cnt) {
		for(int i = 0; i<cnt; i++) {
			System.out.println("-----------------");
			System.out.println("학년 : " + std[i].getGrade());
			System.out.println("학반 : " + std[i].getClassNum());
			System.out.println("번호 : " + std[i].getNum());
			System.out.println("이름 : " + std[i].getName());
			std[i].printScore();

		}
	}
	
	/*
	 * 기능 : 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 저장한 과목을
	 * 		학생정보에 추가하는 기능
	 * A :
	 * void
	 * 
	 * B :
	 * Scanner : 콘솔에서 입력받기 위해서
     * student : 학생 정보
	 */
	public static void inputSubject(Scanner scan, student s){
		System.out.print("입력할 과목 수 : ");
		int subjectCnt = scan.nextInt();
		
		//여러 과목 정보를 입력
		Subject []subjectList = new Subject[subjectCnt];
		for(int i = 0; i < subjectCnt; i++) {
			System.out.print("과목명 : "); 
			String title = scan.next();
			System.out.print("중간고사 : "); 
			int midterm = scan.nextInt();
			System.out.print("기말고사 : ");
			int finals = scan.nextInt();
			System.out.print ("수행평가 : ");
			int performance = scan.nextInt();
			System.out.println("출석점수 : "); 
			int attendacne = scan.nextInt();
			subjectList[i] = new Subject(title, midterm, finals, performance, attendacne);
	}
		if(s == null)
			return;					// 학생 정보가 없는 경우에 
		s.setScore(subjectList); 	//setScore : 과목들을 한번에 등록하는 것
	}
	
	/*A
	 * void
	 * int : 삭제된 뒤의 학생 수
	 * boolean : 삭제 여부
	 * int cnt : 현재 학생수
	 * student []std : 저장된 학생 정보
	 * student s : 삭제할 학생 정보*/
	public static boolean deleteStudent(student std[], student deleteStudent, int cnt) {
		if(std == null || deleteStudent == null || cnt <= 0) return false;
		int pos = isDuplicated(std, cnt, deleteStudent);				// 삭제할 요소가 몇번지에 있는지 찾는 역할
			//하나씩 검색해서 tmp student와 같은 학생이 있는지 확인
			//있으면 삭제 후 하나씩 밀어준다.
			if(pos != -1) {
				for(int j = pos; j<cnt-1; j++) {
					std[j] = std[j+1];
				}
				System.out.println("삭제가 완료되었습니다.");
				return true;
			}
		return false;
	}
	/*
	 * A : 
	 * int : 중복되면 중복된 번지를 알려주고, 중복 안되면 -1을 반환
	 * boolean : 중복되면 true, 아니면 false
	 * B : 
	 * student []std   	// 저장된 학생들 
	 * student s		// 
	 * int cnt	
	 */
	public static int isDuplicated(student std[], int cnt, student s) {
		int pos = -1;
		for(int i = 0; i<cnt; i++) {
			if(std[i].equal(s)) {
				return i;
			}
		}
		return -1;
	}
	/*
	 * A
	 * void : 
	 * B
	 * student std[] : 학생들 정보
	 * int cnt : 저장된 학생 수
	 * Scanner scan : 학생 정보를 입력 받기 위해선
	 */
	public static void modifyStudent(student std[], int cnt, Scanner scan) {
		System.out.println("수정할 학생 정보를 입력하세요.(검색)");
		student tmpstudent = searchInfor(scan);
		int pos = isDuplicated(std, cnt, tmpstudent);
		if(pos == -1) {
			System.out.println("없는 학생 정보입니다."); 
			return ;
		}
		System.out.print("이름 : ");
		String name = scan.next();
		tmpstudent.setName(name);
		System.out.println("--------과목 수정--------");  
		System.out.println("1. 수정"); 
		System.out.println("2. 추가");
		System.out.println("3. 종료"); 
		System.out.println(" 과목을 수정하시겠습니까? ");
		
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1 :
			// 해당 학생의 과목 정보를 가져옴
			Subject sList[] = std[pos].getScore();
			if(sList == null) {
				System.out.println("수정할 과목이 없습니다."); 
				break;
			}
			// 수정할 과목을 입력
			System.out.println("과목 : "); 
			String title = scan.next();
			
			// 수정할 과목이 있는지 찾아야 함. 있으면 아래작업을 하고, 없으면 종료
			int subPos = -1;
			for(int i = 0; i<sList.length; i++) {
				if(sList[i].getTitle().equals(title)) {
					subPos = i;
					break;
				}
			}
			if(subPos == -1) {
				System.out.println("등록되지 않은 과목입니다."); 
				break;
			}
			// 중간, 기말, 수행평가, 출석점수를 다 새로 수정
			System.out.println("중간고사 : "); 
			int midterm = scan.nextInt();
			System.out.println("기말고사 : "); 
			int finals = scan.nextInt();
			System.out.println("수행평가 : "); 
			int performance = scan.nextInt();
			System.out.println("출석점수 : "); 
			int attendance = scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attendance);
			
			break;

		case 2 : 
			student s = new student();
			inputSubject(scan, s);
			std[pos].addScore(s.getScore());					//setScore를 하면 덮어쓰기됨
			break;
		}
	}
}
/* 1. 데이터 관리를 위한 직업
 * => 변수나 클래스를 이용
 * 학생 정보 => Student 클래스
 * 과목 정보 => Subject 클래스
 * 2. 기능 구현
 * => main메소드에 바로 구현
 * => 또는 기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
 * 3. 테스트
 */

interface Manage{
	public int insertStudent(student []arr, student std);
	public void modifyStuent(student []arr, student std);
	public int deleteStuent(student []arr, student std);
	public void printStuent(student []arr,int count);
}


