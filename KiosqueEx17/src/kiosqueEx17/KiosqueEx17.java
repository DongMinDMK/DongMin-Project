package kiosqueEx17;
import java.util.Scanner;

class Money{
	int cost1;
	
	public Money(int cost1) {
		this.cost1 = cost1;
	}
	
	public void moneyMethod() {
		System.out.println("현재 지금까지 주문하신 주류의 총 금액은 " + cost1 + "원 입니다.");
	}
	
	
}

public class KiosqueEx17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		
		while(true) {
			System.out.println("안녕하세요 DMK 카페입니다. 저희 매장에선 정말 다양한 음료들을 판매하고 있습니다.");
			System.out.print("주문하시겠습니까?(YES/NO/EXIT) : ");
			String select = scanner.next();
			
			if(select.equals("YES") || select.equals("yes")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.print("저희 DMK 카페는 1. 아메리카노 2. 카페라떼 3. 바닐라라떼 4. 스무디 등을 판매하고 있습니다. 원하시는 주류의 번호를 눌러주세요. : ");
			    int userSelect = scanner.nextInt();
			    
			    if(userSelect == 1) { //아메리카노
			    	System.out.println("아메리카노를 선택하셨습니다.");
			    	System.out.print("아메리카노는 ICE와 HOT이 있습니다. ICE를 드시겠습니까? HOT을 드시겠습니까? : ");
			    	String iceandhotSelect = scanner.next();
			    	
			    	if(iceandhotSelect.equals("ICE") || iceandhotSelect.equals("ice")) {
			    		System.out.println("아이스 아메리카노의 가격은 3000원입니다.");
			    		cost += 3000;
			    	}else if(iceandhotSelect.equals("HOT") || iceandhotSelect.equals("hot")) {
			    		System.out.println("따뜻한 아메리카노의 가격은 2500원입니다.");
			    		cost+= 2500;
			    	}
			    }else if(userSelect == 2) { //카페라떼
			    	System.out.println("카페라떼를 선택하셨습니다.");
			    	System.out.print("카페라떼는 ICE와 HOT이 있습니다. ICE를 드시겠습니까? HOT을 드시겠습니까? : ");
			    	String iceandhotSelect = scanner.next();
			    	
			    	if(iceandhotSelect.equals("ICE") || iceandhotSelect.equals("ice")) {
			    		System.out.println("아이스 카페라떼의 가격은 5000원입니다.");
			    		cost += 5000;
			    	}else if(iceandhotSelect.equals("HOT") || iceandhotSelect.equals("hot")) {
			    		System.out.println("따뜻한 카페라떼의 가격은 4000원입니다.");
			    		cost+= 4000;
			    	}
			    }else if(userSelect == 3) { //바닐라라떼
			    	System.out.println("바닐라라떼를 선택하셨습니다.");
			    	System.out.print("바닐라라떼는 ICE와 HOT이 있습니다. ICE를 드시겠습니까? HOT을 드시겠습니까? : ");
			    	String iceandhotSelect = scanner.next();
			    	
			    	if(iceandhotSelect.equals("ICE") || iceandhotSelect.equals("ice")) {
			    		System.out.println("아이스 바닐라라떼의 가격은 6000원입니다.");
			    		cost += 6000;
			    	}else if(iceandhotSelect.equals("HOT") || iceandhotSelect.equals("hot")) {
			    		System.out.println("따뜻한 바닐라라떼의 가격은 4500원입니다.");
			    		cost+= 4500;
			    	}
			    }else if(userSelect == 4) { //스무디
			    	System.out.println("스무디를 선택하셨습니다.");
			    	System.out.print("스무디는 키위스무디, 딸기스무디, 망고스무디, 포도스무디 등이 있습니다. 원하시는 스무디의 과일을 입력해주세요(키위,딸기,망고,포도) : ");
			    	String smoothySelect = scanner.next();
			    	
			    	if(smoothySelect.equals("키위")) {
			    		System.out.println("키위스무디를 선택하셨습니다.");
			    		System.out.println("키위스무디의 가격은 6000원입니다.");
			    		cost += 6000;
			    	}else if(smoothySelect.equals("딸기")) {
			    		System.out.println("딸기스무디를 선택하셨습니다.");
			    		System.out.println("딸기스무디의 가격은 6500원입니다.");
			    		cost += 6500;
			    	}
			    	else if(smoothySelect.equals("망고")) {
			    		System.out.println("망고스무디를 선택하셨습니다.");
			    		System.out.println("망고스무디의 가격은 6500원입니다.");
			    		cost += 7000;
			    	}
			    	else if(smoothySelect.equals("포도")) {
			    		System.out.println("포도스무디를 선택하셨습니다.");
			    		System.out.println("포도스무디의 가격은 6500원입니다.");
			    		cost += 8000;
			    	}
			    }
			}else if(select.equals("NO") || select.equals("no")) {
				System.out.println("주문하실 때 앞에 키오스크를 이용해주시기 바랍니다.");
			}else if(select.equals("EXIT") || select.equals("exit")) {
				Money money = new Money(cost);
				money.moneyMethod();
				System.out.print("결제할까요? : (YES/NO) : ");
				String buyyesorno = scanner.next();
				
				if(buyyesorno.equals("YES") || buyyesorno.equals("yes")) {
					System.out.print("얼마를 지불하시겠습니까? ");
					int userCost = scanner.nextInt();
					
					if(userCost > cost) { //만약 주류를 주문하신 사용자가 준 돈이 총 결제할 금액보다 크면
						System.out.println((userCost - cost) + "원 거스름돈입니다.");
						System.out.println("항상 저희 DMK 카페를 운영해주셔서 감사합니다.");
						break;
					}else if(userCost < cost) { //만약 주류를 주문하신 사용자의 돈이 총 금액보다 적으면 결제되지않고 처음으로 돌아가기
						System.out.println("돈이 부족하여 결제를 진행할 수가 없습니다.");
						System.out.println("메뉴로 돌아갑니다.");
						continue;
					}
				}else if(buyyesorno.equals("NO") || buyyesorno.equals("no")) {
					System.out.println("메뉴로 돌아갑니다.");
					continue;
				}
			}
			
		}
		

	}

}
