package noticeProject4_1;
import java.util.*;

class Person{
	String title;
	String content;
	String writer;
	String date;
	String hits;
	
	public Person() {
		title = null;
		content = null;
		writer = null;
		date = null;
		hits = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}
	
	
}

class Register{
	Scanner scanner;
	static ArrayList<Person> personList;
	
	static {
		personList = new ArrayList<Person>();
	}
	
	public Register(){
		scanner = new Scanner(System.in);
	}
	
	void registerMethod() {
		Person person = new Person();
		String title = null;
		String content = null;
		
		System.out.print("제목 : ");
		System.out.print("내용 : ");
		String str = scanner.next();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '|') {
				title = str.substring(0, 3);
				content = str.substring(i+1); //i를 기준으로 분리 i가 3
			}
		}
		System.out.print("작성자 : ");
		String writer = scanner.next();
		System.out.print("날짜 : ");
		String date = scanner.next();
		System.out.print("조회수 : ");
		String hits = scanner.next();
		
		person.setTitle(title);
		person.setContent(content);
		person.setWriter(writer);
		person.setDate(date);
		person.setHits(hits);
	
		personList.add(person);
	
		System.out.println("게시글이 작성되었습니다.");
	}
}

class Search{
	Scanner scanner;
	
	public Search() {
		scanner = new Scanner(System.in);
	}
	
	void searchMethod() {
		System.out.print("찾는 게시글 제목 입력 : ");
		String searchTitle = scanner.next();
		
		int count = 0;
		
		for(int i=0; i<Register.personList.size(); i++) {
			Person person = Register.personList.get(i);
			for(int j=0; j<Register.personList.size(); j++) {
			if(person.getTitle().equals(searchTitle)) {
				count = Integer.parseInt(person.getHits()); //검색 버튼을 누를때마다 조회수가 1이 증가되는것을 표현하기 위해서 count변수를 선언하여 초깃값을 0으로 넣고 문자열로 저장되어 있는 getHits 메소드를 꺼내서 정수로 변환
				count++; // 정수로 변환해서 count로 대입한 hits를 1 증가시킴
				Register.personList.get(i).hits = Integer.toString(count); //숫자를 1 증가 시킨 뒤 다시 문자열로 변환하여 배열방의 i 번째 인덱스 요소에 hits 조회수에 다시 집어넣음.
				System.out.println("제목 : " + person.getTitle() + "\t내용 : " + person.getContent() + "\t작성자 : " + person.getWriter() + "\t날짜 : " + person.getDate() + "\t조회수 : " + person.getHits());
				System.out.println("해당 게시글이 검색되었습니다.");
					
			}
			else if(person.getTitle() != searchTitle) {
				System.out.println("찾는 게시글을 다시 입력해주시기 바랍니다.");
				}
			}
		}
	}
}

class Delete{
	Scanner scanner;
	
	public Delete() {
		scanner = new Scanner(System.in);
	}
	
	void deleteMethod() {
		System.out.println("게시판 삭제를 선택하셨습니다.");
		System.out.print("정말로 게시판을 삭제하시겠습니까? (YES/NO) ");
		String yesorno = scanner.next();
		
	
			if(yesorno.equals("YES") || yesorno.equals("yes")) {
				System.out.print("삭제할 게시글 제목 입력 : ");
				String deleteTitle = scanner.next();
				
				for(int i=0; i<Register.personList.size(); i++) {
					Person person = Register.personList.get(i);
					
					if(person.getTitle().equals(deleteTitle)) {
						Register.personList.remove(i);
						System.out.println("해당 게시글은 삭제되었습니다.");
					}
					else if(person.getTitle() != deleteTitle) {
						System.out.println("게시글의 제목이 달라 삭제할 수 없습니다. 다시 입력해주세요.");
					}
				}
			}
			else if(yesorno.equals("NO") || yesorno.equals("no")) {
				System.out.println("게시글을 삭제하지 않았습니다. 메인 메뉴로 돌아갑니다.");
		}
	}
}

class Update{
	Scanner scanner;
	
	public Update() {
		scanner = new Scanner(System.in);
	}
	
	void updateMethod() {
		System.out.print("수정할 게시글 제목 입력 : ");
		String updateTitle = scanner.next();
		
		 for(int i=0; i<Register.personList.size(); i++) {
		    	Person person = Register.personList.get(i);
		    	
		    	if(person.getTitle().equals(updateTitle)) {
		    		System.out.println("수정 전 내용입니다.");
		    		System.out.println("제목 : " + person.getTitle() + "\t\t내용 : " + person.getContent() + "\t\t작성자 : " + person.getWriter() + "\t날짜 : " + person.getDate() + "\t\t조회수 : " + person.getHits());
			    	
			    	System.out.print("게시글을 수정할까요? (YES/NO) ");
			    	String yesorno2 = scanner.next();
			    	
			    	if(yesorno2.equals("YES") || yesorno2.equals("yes")) {
			    		System.out.print("수정할 제목을 입력하세요 : ");
			    		String updateTitle2 = scanner.next();
			    		System.out.print("수정할 내용을 입력하세요 : ");
			    		String updateContent2 = scanner.next();
			    		
			    		person.setTitle(updateTitle2);
			    		person.setContent(updateContent2);
			    		
			    		Register.personList.set(i, person);
			    		
			    		System.out.println("게시글이 수정되었습니다.");
			    		
			    	}
			    	else if(yesorno2.equals("NO") || yesorno2.equals("no")) {
			    		System.out.println("수정할 제목을 다시 한번 확인하고 입력해주세요.");
			    	}
			    	
		    	}
		    }
	}
}

class List{
	public List() {
		
	}
	void listMethod() {
		System.out.println("====전체출력====");
		
		for(int i=0; i<Register.personList.size(); i++) {
			Person person = Register.personList.get(i);
			
			System.out.println("제목\t 내용\t 작성자\t 날짜\t 조회수");
			System.out.println(person.getTitle() + "\t " + person.getContent() + "\t " + person.getWriter() + "\t " + person.getDate() + "\t " + person.getHits());
			
		}
	}
}

public class NoticeProject4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> personList = new ArrayList<Person>();
		
		Register register = new Register();
		Search search = new Search();
		Delete delete = new Delete();
		Update update = new Update();
		List list = new List();
		
		System.out.println("==== 게시판 작성 ====");
		
		while(true) {
			System.out.print("R: 등록 S: 검색 D: 삭제 U: 수정 L: 목록 : X: 종료 ");
			String menu = scanner.next();
		
			if(menu.equals("R") || menu.equals("r")) { //게시판 등록
				register.registerMethod();
			}
			else if(menu.equals("S") || menu.equals("s")) { //게시판 검색
				search.searchMethod();
			}
			
			else if(menu.equals("D") || menu.equals("d")) { //게시판 삭제
				delete.deleteMethod();
			}
			else if(menu.equals("U") || menu.equals("u")) { //게시판 수정
				update.updateMethod();
			}
			else if(menu.equals("L") || menu.equals("l")) { //게시판 목록
				list.listMethod();
			}
			else if(menu.equals("X") || menu.equals("x")) { //게시판 종료
				System.out.println("게시판 프로젝트를 종료합니다.");
				break;
			}
			
		}


	}

}
