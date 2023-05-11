package schoolProject;
import java.util.*;

public class SchoolProjectEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner lineScanner = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		String gubun = "";
		String irum = "";
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
		System.out.println("등록입니다.");
		System.out.println("=====메뉴 선택 ======");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.print("번호를 선택해 주세요.. ");
		int menu = scanner.nextInt();
			if(menu == 1) { //학생
				HashMap<String, String> hm = new HashMap<String, String>();
				System.out.print("나이 : ");
				String age1 = scanner.next();
				System.out.print("이름 : ");
				String irum1 = scanner.next(); //이름
				System.out.print("학번 : ");
				String hakbun1 = scanner.next(); //학번
				hm.put(gubun, "1");
				hm.put("age", age1);
				hm.put("irum", irum1);
				hm.put("hakbun", hakbun1);
				haksaList.add(hm);
				System.out.println("학생이 등록되었습니다.");
			}
			else if(menu == 2) { //교수
				HashMap<String, String> hm = new HashMap<String,String>();
				System.out.print("나이 : ");
				String age2 = scanner.next();
				System.out.print("이름 : ");
				String irum2 = scanner.next(); //이름
				System.out.print("과목 : ");
				String subject2 = lineScanner.nextLine(); //과목
				hm.put(gubun, "2");
				hm.put("age", age2);
				hm.put("irum", irum2);
				hm.put("subject", subject2);
				haksaList.add(hm);
				System.out.println("교수님이 등록되었습니다.");
			}
			else if(menu == 3) { //관리자
				HashMap<String, String> hm = new HashMap<String, String>();
					System.out.print("나이 : ");
					String age3 = scanner.next();
					System.out.print("이름 : ");
					String irum3 = scanner.next(); //이름
					System.out.print("부서 : ");
					String part3 = scanner.next(); //부서
					hm.put(gubun, "3");
					hm.put("age", age3);
					hm.put("irum", irum3);
					hm.put("part", part3);
					haksaList.add(hm);
					System.out.println("관리자가 등록되었습니다.");
				}
			else if(menu == 4) {
				System.out.println("이전메뉴");
				continue;
			}
		}
		else if(cnt == 2) { //찾기 버튼을 눌렀을 때
			System.out.println("찾기입니다.");
			System.out.println("찾을 이름을 입력해주세요.");
			System.out.print("이름 : ");
			String name = scanner.next();
			for(int i=0; i<haksaList.size(); i++) {
				HashMap<String,String> hm = haksaList.get(i);
				if(hm.get(gubun).equals("1")) { //학생
					if(hm.get("irum").equals(name)) {
						System.out.print("나이 : " + hm.get("age") + "\t\t");
						System.out.print("이름 : " + hm.get("irum") + "\t");
						System.out.print("학번 : " + hm.get("hakbun") + "\t\n");
					}
				}
				if(hm.get(gubun).equals("2")) { //교수
					if(hm.get("irum").equals(name)) {
						System.out.print("나이 : " + hm.get("age") + "\t\t");
						System.out.print("이름 : " + hm.get("irum") + "\t");
						System.out.print("과목 : " + hm.get("subject") + "\t\n");
					}
				}
				if(hm.get(gubun).equals("3")) { //관리자
					if(hm.get("irum").equals(name)) {
						System.out.print("나이 : " + hm.get("age") + "\t\t");
						System.out.print("이름 : " + hm.get("irum") + "\t");
						System.out.print("부서 : " + hm.get("part") + "\t\n");
					}
				}
			}
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
			System.out.println("삭제입니다.");
			String irumDelete;
			System.out.println("삭제할 사람의 이름을 입력해주세요");
			System.out.print("이름 : ");
			irumDelete = scanner.next();
			for(int i=0; i<haksaList.size(); i++) {
				HashMap<String,String> hm = haksaList.get(i);
				if(hm.get(gubun).equals("1")) { //학생
					if(hm.get("irum").equals(irumDelete)) {
						hm.remove("age");
						hm.remove("irum");
						hm.remove("hakbun");
						haksaList.remove(0);
						System.out.println(irumDelete + " 님을 삭제하였습니다.");
					}
				}
				if(hm.get(gubun).equals("2")) { //교수
					if(hm.get("irum").equals(irumDelete)) {
						hm.remove("age");
						hm.remove("irum");
						hm.remove("subject");
						haksaList.remove(1);
						System.out.println(irumDelete + " 님을 삭제 하였습니다.");
					}
				}
				if(gubun.equals("3")) { //관리자
					if(hm.get("irum").equals(irumDelete)) {
						hm.remove("age");
						hm.remove("irum");
						hm.remove("part");
						haksaList.remove(2);
						System.out.println(irumDelete + " 님을 삭제 하였습니다.");
					}
				}
			}
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
			System.out.println("======전체출력======");
			for(int i=0; i<haksaList.size(); i++) {
				HashMap<String,String> hm = haksaList.get(i);
				if(hm.get(gubun).equals("1")) { //학생
					System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 학번 : " + hm.get("hakbun"));
				}

				if(hm.get(gubun).equals("2")) { //교수
					System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 과목 : " + hm.get("subject"));
				}

				if(hm.get(gubun).equals("3")) { //관리자
					System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 부서 : " + hm.get("part"));
				}
			}
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
			System.out.println("수정입니다.");
			System.out.print("키보드로 수정할 이름을 입력하세요. ");
			String irumUpdate = scanner.next();

			for(int i=0; i<haksaList.size(); i++) {
				HashMap<String,String> hm = haksaList.get(i);
				if(hm.get(gubun).equals("1")) {
						if(hm.get("irum").equals(irumUpdate)) {
							System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 학번 : " + hm.get("hakbun"));
							System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
							String modify = scanner.next();
							if(modify.equals("yes") || modify.equals("YES")) {
								System.out.print("나이 : ");
								String age4 = scanner.next();
								System.out.print("이름 : ");
								String irum4 = scanner.next();
								System.out.print("학번 : ");
								String hakbun4 = scanner.next();
								hm.put("age", age4);
								hm.put("irum", irum4);
								hm.put("hakbun", hakbun4);
								System.out.println("학생이 수정되었습니다.");
								haksaList.set(i, hm); //haksaList에 0번지에 있는 해시맵을 바꿈.
							}
							else if(modify.equals("no") || modify.equals("NO")) {
								System.out.println("원래 데이터로 되돌아갑니다.");
								continue;
						}
					}
				}
				if(hm.get(gubun).equals("2")) {
					if(hm.get("irum").equals(irumUpdate)) {
						System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 과목 : " + hm.get("subject"));
						System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
						String modify = scanner.next();
								if(modify.equals("yes") || modify.equals("YES")) {
									System.out.print("나이 : ");
									String age4 = scanner.next();
									System.out.print("이름 : ");
									String irum4 = scanner.next();
									System.out.print("과목 : ");
									String subject4 = scanner.next();
									hm.put("age", age4);
									hm.put("irum", irum4);
									hm.put("subject", subject4);
									System.out.println("교수님이 수정되었습니다.");
									haksaList.set(i, hm); //haksaList에 1번지에 있는 해시맵을 바꿈.
								}
								else if(modify.equals("no") || modify.equals("NO")) {
									System.out.println("원래 데이터로 되돌아갑니다.");
									continue;
							}
					}
				}
				if(hm.get(gubun).equals("3")) {
					if(hm.get("irum").equals(irumUpdate)) {
						System.out.println("이름 : " + hm.get("irum") + "\t 나이 : " + hm.get("age") + "\t 부서 : " + hm.get("part"));
						System.out.print("변경하기 전 내용입니다. 수정할까요? (YES/NO 를 입력해주세요.)");
						String modify = scanner.next();
							if(modify.equals("yes") || modify.equals("YES")) {
								System.out.print("나이 : ");
								String age4 = scanner.next();
								System.out.print("이름 : ");
								String irum4 = scanner.next();
								System.out.print("부서 : ");
								String part4 = scanner.next();
								hm.put("age", age4);
								hm.put("irum", irum4);
								hm.put("part", part4);
								System.out.println("관리자님이 수정되었습니다.");
								haksaList.set(i, hm); //haksaList에 2번지에 있는 해시맵을 바꿈.
							}

							else if(modify.equals("no") || modify.equals("NO")) {
								System.out.println("원래 데이터로 되돌아갑니다.");
								continue;
						}
					}
				}
			}
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
