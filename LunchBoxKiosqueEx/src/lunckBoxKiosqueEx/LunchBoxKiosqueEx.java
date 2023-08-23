package lunckBoxKiosqueEx;

import java.util.Scanner;

public class LunchBoxKiosqueEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.print("안녕하세요 주문하시겠습니까? (네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.println("저희 DMK도시락 음식점은 많은 종류의 도시락들을 판매하고 있습니다.");
				System.out.print("1. 제육도시락 2. 치킨마요도시락 3. 참치마요도시락 4. 돈가스고기도시락 5. 비빔밥도시락 까지 준비되어 있습니다. 원하시는 도시락의 번호를 입력해주세요 ");
				int lunchBoxSelect = scanner.nextInt();
				
				if(lunchBoxSelect == 1) {
					System.out.println("제육도시락을 선택하셨습니다. 제육도시락에는 밥과 제육, 김치, 무말랭이, 샐러드 까지 제공됩니다.");
					System.out.println("제육도시락의 가격은 6000원입니다.");
					System.out.print("밥 곱빼기를 추가하실 수 있습니다. 밥 곱빼기를 추가하시겠습니까?(네/아니오) : ");
					String riceAddSelect = scanner.next();
					
					if(riceAddSelect.equals("네")) {
						System.out.println("밥 곱빼기는 500원이 추가됩니다.");
						System.out.println("총 제육도시락(밥 곱빼기 추가)의 가격은 6500원입니다. ");
						cost += 6500;
					}else if(riceAddSelect.equals("아니오")) {
						System.out.println("제육도시락의 가격은 6000원입니다.");
						cost += 6000;
					}
				}else if(lunchBoxSelect == 2) {
					System.out.println("치킨마요도시락을 선택하셨습니다. 치킨마요도시락에는 밥과 치킨, 마요네즈, 무말랭이, 샐러드 까지 제공됩니다.");
					System.out.println("치킨마요도시락의 가격은 7000원입니다.");
					System.out.print("밥 곱빼기를 추가하실 수 있습니다. 밥 곱빼기를 추가하시겠습니까?(네/아니오) : ");
					String riceAddSelect = scanner.next();
					
					if(riceAddSelect.equals("네")) {
						System.out.println("밥 곱빼기는 500원이 추가됩니다.");
						System.out.println("총 치킨마요도시락(밥 곱빼기 추가)의 가격은 7500원입니다. ");
						cost += 7500;
					}else if(riceAddSelect.equals("아니오")) {
						System.out.println("치킨마요도시락의 가격은 7000원입니다.");
						cost += 7000;
					}
				}else if(lunchBoxSelect == 3) {
					System.out.println("참치마요도시락을 선택하셨습니다. 치킨마요도시락에는 밥과 참치, 마요네즈, 무말랭이, 샐러드 까지 제공됩니다.");
					System.out.println("참치마요도시락의 가격은 5000원입니다.");
					System.out.print("밥 곱빼기를 추가하실 수 있습니다. 밥 곱빼기를 추가하시겠습니까?(네/아니오) : ");
					String riceAddSelect = scanner.next();
					
					if(riceAddSelect.equals("네")) {
						System.out.println("밥 곱빼기는 500원이 추가됩니다.");
						System.out.println("총 참치마요도시락(밥 곱빼기 추가)의 가격은 5500원입니다. ");
						cost += 5500;
					}else if(riceAddSelect.equals("아니오")) {
						System.out.println("참치마요도시락의 가격은 5000원입니다.");
						cost += 5000;
					}
				}else if(lunchBoxSelect == 4) {
					System.out.println("돈가스고기도시락을 선택하셨습니다. 돈가스고기도시락에는 밥과 돈가스, 고기(조금), 무말랭이, 샐러드 까지 제공됩니다.");
					System.out.println("돈가스고기도시락의 가격은 8000원입니다.");
					System.out.print("밥 곱빼기를 추가하실 수 있습니다. 밥 곱빼기를 추가하시겠습니까?(네/아니오) : ");
					String riceAddSelect = scanner.next();
					
					if(riceAddSelect.equals("네")) {
						System.out.println("밥 곱빼기는 500원이 추가됩니다.");
						System.out.println("총 돈가스고기도시락(밥 곱빼기 추가)의 가격은 8500원입니다. ");
						cost += 8500;
					}else if(riceAddSelect.equals("아니오")) {
						System.out.println("돈가스고기도시락의 가격은 8000원입니다.");
						cost += 8000;
					}
				}else if(lunchBoxSelect == 5) {
					System.out.println("비빔밥도시락을 선택하셨습니다. 비빔밥도시락에는 밥과 초고추장, 무말랭이, 샐러드 까지 제공됩니다.");
					System.out.println("비빔밥도시락의 가격은 5000원입니다.");
					System.out.print("밥 곱빼기를 추가하실 수 있습니다. 밥 곱빼기를 추가하시겠습니까?(네/아니오) : ");
					String riceAddSelect = scanner.next();
					
					if(riceAddSelect.equals("네")) {
						System.out.println("밥 곱빼기는 500원이 추가됩니다.");
						System.out.println("총 비빔밥도시락(밥 곱빼기 추가)의 가격은 5500원입니다. ");
						cost += 5500;
					}else if(riceAddSelect.equals("아니오")) {
						System.out.println("비빔밥도시락의 가격은 5000원입니다.");
						cost += 5000;
					}
				}
			}else if(order.equals("아니오")) {
				System.out.println("음식 주문하실 때 앞의 키오스크를 이용해주세요!!");
			}else if(order.equals("계산")) {
				System.out.println("주문하신 총 금액은 " + cost + "원입니다.");
				System.out.print("결제하시겠습니까?(네/아니오) : ");
				String buySelect = scanner.next();
				
				if(buySelect.equals("네")) {
					System.out.print("지불하실 금액을 입력해주세요 : ");
					int customerCost = scanner.nextInt();
					
					if(customerCost > cost) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("거스름돈 " + (customerCost - cost) + "원을 드리겠습니다.");
						break;
					}else if(customerCost < cost) {
						System.out.println("잔액 부족으로 결제를 진행하실 수 없습니다.");
						continue;
					}else {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}
				}
			}
		}
		
		System.out.println("항상 DMK 도시락을 이용해주셔서 감사합니다.");
	}

}
