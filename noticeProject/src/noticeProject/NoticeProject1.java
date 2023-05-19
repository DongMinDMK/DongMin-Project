package noticeProject;
import java.util.*;

public class NoticeProject1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HashMap<String, String>> personList = new ArrayList<HashMap<String, String>>();
	
		
		
		System.out.println("==== 게시판 작성 ====");
		
		while(true) {
			String title = null;
			String content = null;
			String str;
			System.out.print("R: 등록 S: 검색 D: 삭제 U: 수정 L: 목록 : X: 종료 ");
			String menu = scanner.next();
		
			if(menu.equals("R") || menu.equals("r")) { //게시판 등록
				HashMap<String, String> hm = new HashMap<String, String>();
			
				System.out.print("제목 : ");
				System.out.print("내용 : ");
				str = scanner.next(); //제목과 내용을 입력받을 때 예를들어 제목1 | 내용1 로 입력하였을 때 | 구분선을 두어 이 구분선을 기준으로 왼쪽은 제목으로, 오른쪽은 내용으로 지정함. 그럴때 charAt()함수로 문자 하나를(|) 지정하고 그 문자열을 기준으로 나누는 substring 함수를 이용하여 코딩한다.
				for(int i=0; i<str.length(); i++) {
					if(str.charAt(i) == '|') { // '|' 이게 i 라고 가정
						title = str.substring(0, i);
						content = str.substring(i+1);
					}
				}
				System.out.print("작성자 : ");
				String writer = scanner.next();
				System.out.print("날짜 : ");
				String date = scanner.next();
				System.out.print("조회수 : ");
				String hits = scanner.next();
				
				hm.put("title", title);
				hm.put("content", content);
				hm.put("writer", writer);
				hm.put("date", date);
				hm.put("hits", hits);
			
				personList.add(hm);
			
				System.out.println("게시글이 작성되었습니다.");
			
			}
			else if(menu.equals("S") || menu.equals("s")) { //게시판 검색
				
				System.out.print("찾는 게시글 제목 입력 : ");
				String searchTitle = scanner.next();
				
				int count = 0;
				
				for(int i=0; i<personList.size(); i++) {
					HashMap<String,String> hm = personList.get(i);
					
					count = Integer.parseInt(hm.get("hits"));
					count++;
					hm.replace("hits", Integer.toString(count));
					personList.set(i, hm); //조회수를 입력받은 조회수 수를 기준으로 count 변수를 활용하여 조회수를 조회할 때마다 계속 1씩 증가시키는 코드를 작성 
					
					if(hm.get("title").equals(searchTitle)) {
							System.out.println("제목 : " + hm.get("title") + "\t내용 : " + hm.get("content") + "\t작성자 : " + hm.get("writer") + "\t날짜 : " + hm.get("date") + "\t조회수 : " + hm.get("hits"));
							System.out.println("해당 게시글이 검색되었습니다.");
							
						}
					else if(hm.get("title") != searchTitle) {
						System.out.println("찾는 게시글을 다시 입력해주시기 바랍니다.");
						}
					
				}
			}
			
			else if(menu.equals("D") || menu.equals("d")) { //게시판 삭제
				
				System.out.println("게시판 삭제를 선택하셨습니다.");
				System.out.print("정말로 게시판을 삭제하시겠습니까? (YES/NO) ");
				String yesorno = scanner.next();
				
			
					if(yesorno.equals("YES") || yesorno.equals("yes")) {
						System.out.print("삭제할 게시글 제목 입력 : ");
						String deleteTitle = scanner.next();
						
						for(int i=0; i<personList.size(); i++) {
							HashMap<String,String> hm = personList.get(i);
							
							if(hm.get("title").equals(deleteTitle)) {
								personList.remove(i);
								System.out.println("해당 게시글은 삭제되었습니다.");
							}
							else if(hm.get("title") != deleteTitle) {
								System.out.println("게시글의 제목이 달라 삭제할 수 없습니다. 다시 입력해주세요.");
							}
						}
					}
					else if(yesorno.equals("NO") || yesorno.equals("no")) {
						System.out.println("게시글을 삭제하지 않았습니다. 메인 메뉴로 돌아갑니다.");
					}
				
			}
			else if(menu.equals("U") || menu.equals("u")) { //게시판 수정
				
				System.out.print("수정할 게시글 제목 입력 : ");
				String updateTitle = scanner.next();
				
				 for(int i=0; i<personList.size(); i++) {
				    	HashMap<String, String> hm = personList.get(i);
				    	
				    	if(hm.get("title").equals(updateTitle)) {
				    		System.out.println("수정 전 내용입니다.");
				    		System.out.println("제목 : " + hm.get("title") + "\t내용 : " + hm.get("content") + "\t작성자 : " + hm.get("writer") + "\t날짜 : " + hm.get("date") + "\t조회수 : " + hm.get("hits"));
					    	
					    	System.out.print("게시글을 수정할까요? (YES/NO) ");
					    	String yesorno2 = scanner.next();
					    	
					    	if(yesorno2.equals("YES") || yesorno2.equals("yes")) {
					    		System.out.print("수정할 제목을 입력하세요 : ");
					    		String updateTitle2 = scanner.next();
					    		System.out.print("수정할 내용을 입력하세요 : ");
					    		String updateContent2 = scanner.next();
					    		
					    		hm.put("title", updateTitle2);
					    		hm.put("content", updateContent2);
					    		
					    		personList.set(i, hm);
					    		
					    		System.out.println("게시글이 수정되었습니다.");
					    		
					    	}
					    	else if(yesorno2.equals("NO") || yesorno2.equals("no")) {
					    		System.out.println("수정할 제목을 다시 한번 확인하고 입력해주세요.");
					    	}
					    	
				    	}
				    }
			}
			else if(menu.equals("L") || menu.equals("l")) { //게시판 목록
				System.out.println("====전체출력====");
				
				for(int i=0; i<personList.size(); i++) {
					HashMap<String, String> hm = personList.get(i);
					
					System.out.println("제목\t 내용\t 작성자\t 날짜\t 조회수");
					System.out.println(hm.get("title") + " \t" + "  " +  hm.get("content") + " \t" + " " + hm.get("writer") + " \t" + " " +  hm.get("date") + " \t" + " " + hm.get("hits"));
					
				}
			}
			else if(menu.equals("X") || menu.equals("x")) { //게시판 종료
				System.out.println("게시판 프로젝트를 종료합니다.");
				break;
			}
			
		}
		


	}

}
