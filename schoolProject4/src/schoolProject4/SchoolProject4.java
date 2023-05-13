package schoolProject4;
import java.util.*;

class Student{ //학생 클래스
	int age;
	String irum;
	String hakbun;
	
	public Student() {
		age = 0;
		irum = null;
		hakbun = null;
	}
	
	public int getAge() { // 나이 출력
		return age;
	}

	public void setAge(int age) { //나이 입력
		this.age = age;
	}

	public String getIrum() { //이름 출력
		return irum;
	}

	public void setIrum(String irum) { //이름 입력
		this.irum = irum;
	}

	public String getHakbun() { //학번 출력
		return hakbun;
	}

	public void setHakbun(String hakbun) { //학번 입력
		this.hakbun = hakbun;
	}
	
}
class Professor //교수 클래스
{
	int age2;
	String irum2;
	String subject2;
	
	public Professor() {
		age2 = 0;
		irum2 = null;
		subject2 = null;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public String getIrum2() {
		return irum2;
	}

	public void setIrum2(String irum2) {
		this.irum2 = irum2;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	
	
}
class Manager{ //매니저 클래스
	int age3;
	String irum3;
	String part3;
	
	public Manager() {
		age3 = 0;
		irum3 = null;
		part3 = null;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}

	public String getIrum3() {
		return irum3;
	}

	public void setIrum3(String irum3) {
		this.irum3 = irum3;
	}

	public String getPart3() {
		return part3;
	}

	public void setPart3(String part3) {
		this.part3 = part3;
	}
	
	
}

public class SchoolProject4 {
	
	void register(Scanner scanner, ArrayList<Student> studentList, ArrayList<Professor> professorList, ArrayList<Manager> managerList, Scanner lineScanner) {
		System.out.println("등록입니다.");
		System.out.println("=====메뉴 선택 ======");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.print("번호를 선택해 주세요.. ");
		int menu = scanner.nextInt();
			if(menu == 1) { //학생
				Student student = new Student();
				System.out.print("나이 : ");
				int age1 = scanner.nextInt(); //나이
				System.out.print("이름 : ");
				String irum1 = scanner.next(); //이름
				System.out.print("학번 : ");
				String hakbun1 = scanner.next(); //학번
				student.setAge(age1); //Student 클래스 setAge 메소드에 입력한 age1 변수를 등록
				student.setIrum(irum1); //Student 클래스 setIrum 메소드에 입력한 irum1 변수를 등록
				student.setHakbun(hakbun1); //Student 클래스 setHakbun 메소드에 입력한 hakbun1 변수를 등록
				studentList.add(student); //등록한 나이, 이름, 학번을 studentList 에 추가한다. 즉 studentList 0번 요소에 추가, 이후에 계속 들어오는 것은 studentList 1,2,3... 요소에 추가
				System.out.println("학생이 등록되었습니다.");
			}
			else if(menu == 2) { //교수
				Professor professor = new Professor();
				System.out.print("나이 : ");
				int age2 = scanner.nextInt(); //나이
				System.out.print("이름 : ");
				String irum2 = scanner.next(); //이름
				System.out.print("과목 : ");
				String subject2 = lineScanner.nextLine(); //과목
				professor.setAge2(age2);
				professor.setIrum2(irum2);
				professor.setSubject2(subject2);
				professorList.add(professor);
				System.out.println("교수님이 등록되었습니다.");
			}
			else if(menu == 3) { //관리자
				    Manager manager = new Manager();
					System.out.print("나이 : "); //나이
					int age3 = scanner.nextInt();
					System.out.print("이름 : ");
					String irum3 = scanner.next(); //이름
					System.out.print("부서 : ");
					String part3 = scanner.next(); //부서
					manager.setAge3(age3);
					manager.setIrum3(irum3);
					manager.setPart3(part3);
					managerList.add(manager);
					System.out.println("관리자가 등록되었습니다.");
				}
	}
	void search(Scanner scanner, ArrayList<Student> studentList, ArrayList<Professor> professorList, ArrayList<Manager> managerList) {
		System.out.println("찾기입니다.");
		System.out.println("찾을 이름을 입력해주세요.");
		System.out.print("이름 : ");
		String name = scanner.next();
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			if(student.getIrum().equals(name)) {
			System.out.print("나이 : " + student.getAge() + "\t\t");
			System.out.print("이름 : " + student.getIrum() + "\t\t");
			System.out.print("학번 : " + student.getHakbun() + "\t\n");
			}
		}
		
		for(int i=0; i<professorList.size(); i++) {
			Professor professor = professorList.get(i);
			if(professor.getIrum2().equals(name)) {
			System.out.print("나이 : " + professor.getAge2() + "\t\t");
			System.out.print("이름 : " + professor.getIrum2() + "\t\t");
			System.out.print("과목 : " + professor.getSubject2() + "\t\n");
			}
		}
		for(int i=0; i<managerList.size(); i++) {
			Manager manager = managerList.get(i);
			if(manager.getIrum3().equals(name)) {
			System.out.print("나이 : " + manager.getAge3() + "\t\t");
			System.out.print("이름 : " + manager.getIrum3() + "\t\t");
			System.out.print("부서 : " + manager.getPart3() + "\t\n");
		  	}
		}
	}
	
	void delete(Scanner scanner, ArrayList<Student> studentList, ArrayList<Professor> professorList, ArrayList<Manager> managerList) {
		System.out.println("삭제입니다.");
		String irumDelete;
		System.out.println("삭제할 사람의 이름을 입력해주세요");
		System.out.print("이름 : ");
		irumDelete = scanner.next();
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			  //학생
			    if(student.getIrum().equals(irumDelete)) {
					studentList.remove(i);
					System.out.println(irumDelete + " 님을 삭제하였습니다.");
				}
		    }
			
		for(int i=0; i<professorList.size(); i++) {//교수
			Professor professor = professorList.get(i);
			 if(professor.getIrum2().equals(irumDelete)) {
					professorList.remove(i);
					System.out.println(irumDelete + " 님을 삭제 하였습니다.");
				}
			}
		
		for(int i=0; i<managerList.size(); i++) { //관리자
			Manager manager = managerList.get(i);
				if(manager.getIrum3().equals(irumDelete)) {
					managerList.remove(i);
					System.out.println(irumDelete + " 님을 삭제 하였습니다.");
				}
			}
	}
	
	void list(ArrayList<Student> studentList, ArrayList<Professor> professorList, ArrayList<Manager> managerList) {
		System.out.println("======전체출력======");
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i); //학생
		    System.out.println("이름 : " + student.getIrum() + "\t 나이 : " + student.getAge() + "\t 학번 : " + student.getHakbun());
		}
		
		for(int i=0; i<professorList.size(); i++) { //교수
			Professor professor = professorList.get(i);
		    System.out.println("이름 : " + professor.getIrum2() + "\t 나이 : " + professor.getAge2() + "\t 과목 : " + professor.subject2);
		}
		
		for(int i=0; i<managerList.size(); i++) { //관리자
			Manager manager = managerList.get(i);
			System.out.println("이름 : " + manager.getIrum3() + "\t 나이 : " + manager.getAge3() + "\t 부서 : " + manager.getPart3());
		}

	}
	
	void update(Scanner scanner, ArrayList<Student> studentList, ArrayList<Professor> professorList, ArrayList<Manager> managerList) {
		System.out.println("수정입니다.");
		System.out.print("키보드로 수정할 이름을 입력하세요. ");
		String irumUpdate = scanner.next();

		for(int i=0; i<studentList.size(); i++) {
			Student student= studentList.get(i);
					if(student.getIrum().equals(irumUpdate)) {
						System.out.println("이름 : " + student.getIrum() + "\t 나이 : " + student.getAge() + "\t 학번 : " + student.getHakbun());
						System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
						String modify = scanner.next();
						if(modify.equals("yes") || modify.equals("YES")) {
							System.out.print("나이 : ");
							int age4 = scanner.nextInt();
							System.out.print("이름 : ");
							String irum4 = scanner.next();
							System.out.print("학번 : ");
							String hakbun4 = scanner.next();
							student.setAge(age4);
							student.setIrum(irum4);
							student.setHakbun(hakbun4);
							System.out.println("학생이 수정되었습니다.");
							studentList.set(i, student); //haksaList에 0번지에 있는 해시맵을 바꿈.
						}
						else if(modify.equals("no") || modify.equals("NO")) {
							System.out.println("원래 데이터로 되돌아갑니다.");
							continue;
					}
				}
			}
		for(int i=0; i<professorList.size(); i++) {
			Professor professor = professorList.get(i);
			if(professor.getIrum2().equals(irumUpdate)) {
					System.out.println("이름 : " + professor.getIrum2() + "\t 나이 : " + professor.getAge2() + "\t 과목 : " + professor.getSubject2());
					System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
					String modify = scanner.next();
							if(modify.equals("yes") || modify.equals("YES")) {
								System.out.print("나이 : ");
								int age4 = scanner.nextInt();
								System.out.print("이름 : ");
								String irum4 = scanner.next();
								System.out.print("과목 : ");
								String subject4 = scanner.next();
								professor.setAge2(age4);
								professor.setIrum2(irum4);
								professor.setSubject2(subject4);
								System.out.println("교수님이 수정되었습니다.");
								professorList.set(i, professor); //haksaList에 1번지에 있는 해시맵을 바꿈.
							}
							else if(modify.equals("no") || modify.equals("NO")) {
								System.out.println("원래 데이터로 되돌아갑니다.");
								continue;
						}
				}
			}
		for(int i=0; i<managerList.size(); i++) {
			Manager manager = managerList.get(i);
				if(manager.getIrum3().equals(irumUpdate)) {
					System.out.println("이름 : " + manager.getIrum3() + "\t 나이 : " + manager.getAge3() + "\t 부서 : " + manager.getPart3());
					System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
					String modify = scanner.next();
						if(modify.equals("yes") || modify.equals("YES")) {
							System.out.print("나이 : ");
							int age4 = scanner.nextInt();
							System.out.print("이름 : ");
							String irum4 = scanner.next();
							System.out.print("부서 : ");
							String part4 = scanner.next();
							manager.setAge3(age4);
							manager.setIrum3(irum4);
							manager.setPart3(part4);
							System.out.println("관리자님이 수정되었습니다.");
							managerList.set(i, manager); //haksaList에 2번지에 있는 해시맵을 바꿈.
						}

						else if(modify.equals("no") || modify.equals("NO")) {
							System.out.println("원래 데이터로 되돌아갑니다.");
							continue;
					}
				}
			}
	}


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner lineScanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Professor> professorList = new ArrayList<Professor>();
		ArrayList<Manager> managerList = new ArrayList<Manager>();
		
	    SchoolProject4 sp4 = new SchoolProject4();
		
		
		while(true) {
		System.out.println("======메뉴 선택 ======");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체출력");
		System.out.println("5. 수정");
		System.out.println("--------------------");
		System.out.println("0. 종료");
		System.out.print("번호를 선택해 주세요... ");
		int cnt = scanner.nextInt();
		if(cnt == 1) { //등록 버튼을 눌렀을 때
			 sp4.register(scanner, studentList, professorList, managerList, lineScanner);
			 if(cnt == 4) {
				System.out.println("이전메뉴");
				continue;
			}
		}
		
		else if(cnt == 2) { //찾기 버튼을 눌렀을 때
			sp4.search(scanner, studentList, professorList, managerList);
			System.out.print("계속하시려면1, 종료하시려면0을 입력해주세요.");
			cnt = scanner.nextInt();
			if(cnt == 1) {
				continue;
			}
			else if(cnt == 0) {
				break;
			}
		}
		
		
		else if(cnt == 3) { //삭제 버튼을 눌렀을 때
			sp4.delete(scanner, studentList, professorList, managerList);
			System.out.print("계속하시려면1, 종료하시려면0을 입력해주세요.");
			cnt = scanner.nextInt();
			if(cnt == 1) {
				continue;
			}
			else if(cnt == 0) {
				break;
			}
		}
		
		else if(cnt == 4) { //전체출력 버튼을 눌렀을 때
			sp4.list(studentList, professorList, managerList);
			System.out.print("계속하시려면1, 종료하시려면0을 입력해주세요.");
			cnt = scanner.nextInt();
			if(cnt == 1) {
				continue;
			}
			else if(cnt == 0) {
				break;
			}
		}
		
		else if(cnt == 5) { //수정 버튼을 눌렀을 때
			sp4.update(scanner, studentList, professorList, managerList);
				System.out.print("계속하시려면1, 종료하시려면0을 입력해주세요.");
				cnt = scanner.nextInt();
					if(cnt == 1) {
					continue;
				}
					else if(cnt == 0) {
					break;
				}
			}
			
		else if(cnt == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				
		}
	}

}
