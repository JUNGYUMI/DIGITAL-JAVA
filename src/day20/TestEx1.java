package day20;
import java.util.*;
public class TestEx1 {
	/* 영어 단어장 프로그램을 작성하세요.
			1. 영어 단어 등록
			2. 영어 단어 수정
			3. 영어 단어 삭제
			4. 영어 단어 검색
			5. 종료 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Word> list = new ArrayList<Word>();
		Word w;
		int menu = 0;
		do {
			printMenu();	
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("# 등록할 단어를 입력하세요.");
				w = inputWord(scan);
				if(!insertWord(list,w)) { 
					System.out.println("***이미 있는 단어입니다***");
				}else {
					System.out.println("***단어를 추가했습니다***");
				}
				char mn = 'y';
				while(mn != 'n') {
				  	System.out.print("더 하시겠습니까?(y/n) : ");
				  	mn = scan.next().charAt(0);
				  	scan.nextLine();
			  		if(mn == 'y' || mn == 'Y') {
				  		System.out.print("품사를 입력하세요 : ");
				  		String wordClass = scan.next();
				  		w.wordClass.add(wordClass);
				  		System.out.print("뜻을 입력하세요 : ");
				  		w.meaning.add(scan.next());
				  	}else if(mn == 'n' || mn == 'N')		
			  			for(int i = 0; i < list.size(); i++) {
			  				System.out.println(i + 1 + "." + list.get(i));
			  			}
				}
				break;
			case 2 :
				System.out.println("# 수정할 단어를 입력하세요.");
				w = inputWord(scan);
				if(!modifyWord(list,w)) 
					System.out.println("***없는 단어입니다***");
				else
					System.out.println("***단어를 수정했습니다***");
				break;
				
			case 3 : 
				System.out.println("# 삭제할 단어를 입력하세요.");
				w = inputWord(scan);
				if(!deleteWord(list,w)) 
					System.out.println("***없는 단어입니다***");
				else
					System.out.println("***단어를 삭제했습니다***");
				break;
				
			case 4 : printWord(list); break;
			case 5 : System.out.println("프로그램을 종료합니다."); break;
			default :
				System.out.println("올바른 메뉴가 아닙니다.");
			}
			
		}while(menu != 5);
		scan.close();
	}
	public static void printMenu() {
		System.out.println("======메뉴======"); 
		System.out.println("1. 영어 단어 등록");
		System.out.println("2. 영어 단어 수정");
		System.out.println("3. 영어 단어 삭제"); 
		System.out.println("4. 영어 단어 검색");
		System.out.println("5. 프로그램  종료");
		System.out.println("===============");
		System.out.print("메뉴를 입력하세요 : ");
	}
	
	public static void printWord(List<Word>list) {
		if(list == null || list.size() == 0)
			System.out.println("단어 정보가 없습니다.");
		else {
			System.out.println("-단어-의미-품사-"); 
			for(Word tmp : list) {
				System.out.println(tmp);
			}
		}
	}
	
	public static Word inputWord(Scanner scan) {
		Word w = new Word();
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("뜻 : ");
		String meaning = scan.next();
		System.out.print("품사 : ");
		String wordClass = scan.next();
		w.word = word;
		w.meaning.add(meaning);
		w.wordClass.add(wordClass);
		return w;
	}
	
	public static boolean insertWord(List<Word> list, Word w) {
		if(list == null || w == null)
			return false;
		if(list.contains(w))
			return false;
		list.add(w);
		return true;
	}
	
	public static boolean modifyWord(List<Word> list, Word w) {
		if(list == null || w == null)
			return false;
		if(!list.contains(w))
			return false;
		list.remove(w);
		list.add(w);
		return true;
	}
	
	public static boolean deleteWord(List<Word> list, Word w) {
		if(list == null || w == null)
			return false;
		if(!list.contains(w))
			return false;
		list.remove(w);
		return true;
	}
}

class Word {
	String word;
	List<String> meaning = new ArrayList<String>();
	List<String> wordClass = new ArrayList<String>();
	
	public Word(){ }
	public Word(String word, List<String> meaning, List<String> wordClass) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordClass = wordClass;
	}
	@Override
	public String toString() {
		return " 단어 = " + word + ", 의미 = "   + meaning + ", 품사 = " + wordClass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	

	
}