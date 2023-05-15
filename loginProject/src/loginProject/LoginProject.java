package loginProject;
import java.util.*;

class Member{
	String id;
	String pw;
	String location;
	String phone;
	
	public Member() {
		id = null;
		pw = null;
		location = null;
		phone = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}



public class LoginProject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner lineScanner = new Scanner(System.in);

		ArrayList<Member> memberList = new ArrayList<Member>();
		
		String session = null;
		
		
		while(true) {
			System.out.println("로그인프로젝트입니다.");
			System.out.print("R: 회원가입 L: 회원목록 S : ID찾기 D : 회원탈퇴 E: 회원수정 I : 로그인 O: 로그아웃 X : 종료 ");
			String menu = scanner.next();
			if(menu.equals("R") || menu.equals("r")) { //회원가입
					Member member = new Member();
					System.out.println("회원가입이 선택되었습니다.");
					System.out.print("아이디 입력 : ");
					String userID = scanner.next();
					System.out.print("패스워드 입력 : ");
					String userPW = scanner.next();
					System.out.print("주소 입력 : ");
					String userlocation = lineScanner.nextLine();
					System.out.print("전화번호 입력 : ");
					String userPhone = scanner.next();
					
					member.setId(userID);
					member.setPw(userPW);
					member.setLocation(userlocation);
					member.setPhone(userPhone);
					
					memberList.add(member);
					
					System.out.println("1명 회원이 등록되었습니다.");
				}
			 else if(menu.equals("S") || menu.equals("s")) { //ID 찾기
				 	boolean isTrue = false;
					System.out.println("ID 찾기 메뉴입니다.");
					
					System.out.print("찾는 ID 입력 : ");
					String searchID = scanner.next();
					
					for(int i=0; i<memberList.size(); i++) {
						Member member = memberList.get(i);
						if(member.getId().equals(searchID)) { //리스트에서 꺼내온 ID와 위에서 입력받은 ID가 일치하면
							System.out.println("회원아이디 : " + member.getId() + "\t 회원패스워드 : " + member.getPw() + "\t 회원주소 : " + member.getLocation() + "\t 회원전화번호 : " + member.getPhone());
							isTrue = true;
							break;
						}
						else if(isTrue) {
							System.out.println("회원아이디 : \t 회원패스워드 : \t 회원주소 : \t 회원전화번호 : \t");
							System.out.println("찾는 아이디가 없습니다.");
						}
					}
					
					
				}
				
			 else if(menu.equals("L") || menu.equals("l")) { //회원목록
				 	Member member = new Member();
					for(int i=0; i<memberList.size(); i++) {
						member = memberList.get(i);
						System.out.println("회원아이디 : " + member.getId() + "\t 회원패스워드 : " + member.getPw() + "\t 회원주소 : " + member.getLocation() + "\t 회원전화번호 : " + member.getPhone());
					}
				}

			else if(menu.equals("I") || menu.equals("i")) { //로그인
				Member member = new Member();
					System.out.println("로그인 메뉴입니다.");
					System.out.print("아이디 입력 : ");
					String loginInput = scanner.next();
					System.out.print("패스워드 입력 : ");
					String passwordInput = scanner.next();
					
					for(int i=0; i<memberList.size(); i++) {
						member = memberList.get(i);
						if(member.getId().equals(loginInput) && member.getPw().equals(passwordInput)) {
							session = loginInput; //로그인된 정보를 static loginList에 저장, 즉 session
							System.out.println("환영합니다. 로그인되었습니다.");
						}
						else if(member.getId() != loginInput && member.getPw() != passwordInput) {
							System.out.println("아이디 아니면 비밀번호가 잘못되었습니다. 다시 로그인 하시기 바랍니다.");
							
						}
					}
					//만약 리스트에 있는 ID와 위에서 입력받은 ID와 그리고 리스트에 있는 패스워드와 위에서 입력받은 패스워드가 같으면
					
				
				}
			
			else if(menu.equals("D") || menu.equals("d")) { //회원탈퇴
						System.out.println("회원탈퇴를 선택하셨습니다.");
						System.out.print("정말로 회원 탈퇴 하시겠습니까?(YES/NO) ");
						String yesorno = scanner.next();
						
						for(int i=0; i<memberList.size(); i++) {
							Member member = memberList.get(i);
							if(yesorno.equals("YES") || yesorno.equals("yes")) {
								for(int j=0; j<memberList.size(); j++) {
									member = memberList.get(j);
									if(member.getId().equals(session)) {
										memberList.remove(i);
										System.out.println("회원탈퇴되었습니다.");
									}
								}
							}
							else if(yesorno.equals("NO") || yesorno.equals("no")) {
								System.out.println("메인 메뉴로 돌아갑니다.");
								continue;
							}
							
						}
						
			}
			else if(menu.equals("E") || menu.equals("e")) { //회원수정
				Member member = new Member();
				for(int i=0; i<memberList.size(); i++) {
					member = memberList.get(i);
					System.out.println("수정하기 전 회원정보입니다.");
				    System.out.println("회원아이디 : " + member.getId() + "\t 회원패스워드 : " + member.getPw() + "\t 회원주소 : " + member.getLocation() + "\t 회원전화번호 : " + member.getPhone());
					System.out.print("정말로 수정하시겠습니까? (YES/NO)");
					String yesorno2 = scanner.next();
					
					for(int j=0; j<memberList.size(); j++) {
						member = memberList.get(j);
						if(yesorno2.equals("YES") || yesorno2.equals("yes")) {
							System.out.print("회원아이디 입력 : ");
							String updateID = scanner.next();
							System.out.print("회원패스워드 입력 : ");
							String updatePW = scanner.next();
							System.out.print("회원주소 입력 : ");
							String updateLocation = lineScanner.nextLine();
							System.out.print("회원전화번호 입력 : ");
							String updatePhone = scanner.next();
							
							member.setId(updateID);
							member.setPw(updatePW);
							member.setLocation(updateLocation);
							member.setPhone(updatePhone);
							
							System.out.println("1명 회원이 수정되었습니다.");
							
							memberList.set(i, member);
						}
						else if(yesorno2.equals("NO") || yesorno2.equals("no")) {
							System.out.println("메인메뉴로 돌아갑니다. ");
							continue;
						}
					}
					
				}
				
				
			}
			else if(menu.equals("O") || menu.equals("o")) { //로그아웃
				System.out.print("정말로 로그아웃 할까요?(YES/NO) ");
				String logoutSelect = scanner.next();
				if(logoutSelect.equals("YES") || logoutSelect.equals("yes")) {
					session = null;
					System.out.println("로그아웃되었습니다.");
					continue;
				}
					
			}
			else if(menu.equals("X") || menu.equals("x")) {
				System.out.println("가입프로젝트를 종료합니다.");
				break;
			}
					
		}



	}

}
