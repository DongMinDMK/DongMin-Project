package kiosqueEx13;
import java.util.*;

public class KiosqueEx13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int userRoomSelect = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 호텔입니다.");
			System.out.print("1. 체크인 2. 체크아웃 3. 직원도움요청 중 원하시는 번호를 눌러주세요 : ");
			int select = scanner.nextInt();
			
			if(select == 1) { //체크인
				System.out.println("체크인을 선택하셨습니다.");
				System.out.println("저희 호텔의 체크인은 1박을 기준으로 하며 50000원 룸, 30000원 룸, 20000원 룸이 있습니다.");
				System.out.println("50000원 룸은 20평이며, 30000원 룸은 15평, 그리고 20000원 룸은 10평으로 구성됩니다.");
				System.out.print("원하시는 방의 금액을 적어주세요(50000/30000/20000) : ");
				int roomSelect = scanner.nextInt();
				
				if(roomSelect == 50000) {
					System.out.println("50000원(20평) 룸을 선택하셨습니다. 즐거운 시간되시고, 결제는 체크아웃때 결제하도록 하겠습니다.");
					userRoomSelect = 50000;
				}else if(roomSelect == 30000) {
					System.out.println("30000원(15평) 룸을 선택하셨습니다. 즐거운 시간되시고, 결제는 체크아웃때 결제하도록 하겠습니다.");
					userRoomSelect = 30000;
				}else if(roomSelect == 20000) {
					System.out.println("20000원(10평) 룸을 선택하셨습니다. 즐거운 시간되시고, 결제는 체크아웃때 결제하도록 하겠습니다.");
					userRoomSelect = 20000;
				}
			}else if(select == 2) { //체크아웃
				System.out.print("체크아웃을 선택하셨습니다. 결제하시겠습니까?(네/아니오) : ");
				String yesorno = scanner.next();
				
				if(yesorno.equals("네")) {
					if(userRoomSelect == 50000) {
						System.out.println("당신은 50000원 룸을 사용했습니다. 50000원을 결제하도록 하겠습니다.");
						break;
					}else if(userRoomSelect == 30000) {
						System.out.println("당신은 30000원 룸을 사용했습니다. 30000원을 결제하도록 하겠습니다.");
						break;
					}else if(userRoomSelect == 20000) {
						System.out.println("당신은 20000원 룸을 사용했습니다. 20000원을 결제하도록 하겠습니다.");
						break;
					}
				}else if(yesorno.equals("아니오")) {
					System.out.println("메뉴로 돌아갑니다.");
					continue;
				}
			}else if(select == 3) {
				System.out.println("직원을 불러드리겠습니다. 잠시만 기다려주세요....");
			}
			
		}
		
		System.out.println("DMK 호텔을 이용해주셔서 감사합니다.");
		

	}

}
