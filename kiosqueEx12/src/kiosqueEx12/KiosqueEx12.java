package kiosqueEx12;
import java.util.*;

public class KiosqueEx12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int cost = 0;
	    
		
		   while(true){
			System.out.print("안녕하세요 DMK 한국 음식점입니다. 주문하시겠습니까? (네/아니오/종료) : ");
			String select = scanner.next();
			
			if(select.equals("네")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.print("저희 음식점에는 다양한 한국 음식들이 준비되어 있습니다. 1. 비빔밥 2. 불고기덮밥 3. 잡채덥밥 4. 삼계탕이 있습니다. 원하시는 음식의 번호를 선택해주세요 : ");
				int koreanSelect = scanner.nextInt();
				
				if(koreanSelect == 1) {
					System.out.println("비빔밥을 선택하셨습니다.");
					System.out.println("비빔밥은 밥에 각종 나물을 넣고, 장을 넣어서 비벼 먹는 전통 한국 요리입니다.");
					System.out.println("비빔밥은 8000원입니다. ");
					cost += 8000;
					
				}else if(koreanSelect == 2) {
					System.out.println("불고기덮밥을 선택하셨습니다.");
					System.out.println("불고기덮밥은 밥에 불고기를 넣고 비벼서 먹는 한국요리입니다.");
					System.out.println("불고기덮밥은 9000원입니다.");
					cost += 9000;
				}
				else if(koreanSelect == 3) {
					System.out.println("잡채덮밥을 선택하셨습니다.");
					System.out.println("잡채덮밥은 한국의 대표음식인 잡채와 밥을 합쳐 먹는 한국의 요리입니다.");
					System.out.println("잡채덮밥은 8500원입니다.");
					cost += 8500;
				}	
				else if(koreanSelect == 4) {
					System.out.println("삼계탕을 선택하셨습니다.");
					System.out.println("삼계탕은 한국에서 대표하는 건강식을 위한 한국요리입니다. 삼계탕은 정말 몸에좋고 건강식이며 맛까지 있어 남녀노소 누구나 좋아하는 음식입니다.");
					System.out.println("삼계탕은 10000원입니다.");
					cost += 10000;
				}
			}else if(select.equals("아니오")) {
				System.out.println("주문하실 때 키오스크에서 주문하시면 됩니다.");
			}else if(select.equals("종료")) {
				System.out.println("지금까지 주문한 금액은 " + cost + "원입니다.");
				System.out.print("계산하시겠습니까?(네/아니오) : ");
				String calculate = scanner.next();
				
				if(calculate.equals("네")) {
					System.out.print("얼마를 지불하시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > cost) {
						System.out.println("거스름돈 " + (userCost - cost) + "원을 드리겠습니다.");
					}else if(userCost < cost) {
						System.out.println("돈이 부족하여 계산을 못합니다. 다시 메뉴로 돌아가겠습니다.");
						continue;
					}
				}else if(calculate.equals("아니오")) {
					System.out.println("메뉴로 돌아갑니다.");
					continue;
				}
				System.out.println("항상 DMK 한국음식점을 이용해주셔서 감사합니다.");
				break;
			}
		}
		
	}

}
