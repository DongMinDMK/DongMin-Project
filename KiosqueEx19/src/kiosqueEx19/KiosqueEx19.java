package kiosqueEx19;
import java.util.Scanner;

public class KiosqueEx19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 월드입니다.");
			System.out.print("놀이기구를 이용하시는데 티켓을 사시겠습니까? (네/아니오/계산) : ");
			String buyticket = scanner.next();
			
			if(buyticket.equals("네")) {
				System.out.println("DMK 월드에서는 놀이기구 1. 자유이용권 2. 10회이용권 3. 5회이용권 4. 3회이용권이 준비되어 있습니다.");
				System.out.print("원하시는 이용권의 숫자를 눌러주세요 : ");
				int worldPlay = scanner.nextInt();
				
				if(worldPlay == 1) {
					System.out.println("자유이용권을 선택하셨습니다.");
					System.out.println("자유이용권을 결제하시면 모든 놀이기구를 얼마든지 이용하실 수 있습니다.");
					System.out.println("자유이용권의 가격은 30000원입니다.");
					money += 30000;
				}else if(worldPlay == 2) {
					System.out.println("10회이용권을 선택하셨습니다.");
					System.out.println("10회이용권은 결제하시면 DMK 월드에 있는 놀이기구를 10번 타실 수 있습니다.");
					System.out.println("10회이용권의 가격은 25000원입니다.");
					money += 25000;
				}else if(worldPlay == 3) {
					System.out.println("5회이용권을 선택하셨습니다.");
					System.out.println("5회이용권은 결제하시면 DMK 월드에 있는 놀이기구를 5번 타실 수 있습니다.");
					System.out.println("3회이용권의 가격은 20000원입니다.");
					money += 20000;
				}else if(worldPlay == 4) {
					System.out.println("3회이용권을 선택하셨습니다.");
					System.out.println("3회이용권은 결제하시면 DMK 월드에 있는 놀이기구를 3번 타실 수 있습니다.");
					System.out.println("3회이용권의 가격은 15000원입니다.");
					money += 15000;
				}
			}else if(buyticket.equals("아니오")) {
				System.out.println("티켓을 구매하셔야 놀이기구를 이용하실 수 있습니다!");
			}else if(buyticket.equals("계산")) {
				System.out.println("결제하실 금액은 총 " + money + "원 입니다.");
				System.out.print("결제하시겠습니까?(O/X) : ");
				String yesorno = scanner.next();
				
				if(yesorno.equals("O") || yesorno.equals("o") || yesorno.equals("0")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userMoney = scanner.nextInt();
					
					if(userMoney > money) {
						System.out.println("거스름돈을 반환해드리겠습니다. 거스름돈은 " + (userMoney - money) + "원입니다.");
						System.out.println("항상 저희 DMK 월드를 이용해주셔서 감사합니다.");
						break;
					}else if(userMoney < money) {
						System.out.println("잔액이 부족해 결제를 진행하실 수 없습니다.");
						continue;
					}else if(userMoney == money) {
						System.out.println("결제되셨습니다.");
						System.out.println("항상 저희 DMK 월드를 이용해주셔서 감사합니다.");
						break;
					}
				}
			}
		}
		
		System.out.print("DMK 월드는 동물원도 있습니다. 동물도 보시겠습니까?(YES/NO) : ");
		String userSelect = scanner.next();
		
		if(userSelect.equals("YES") || userSelect.equals("yes")) {
			System.out.println("앞으로 쭉 300m 직진하셔서 오른쪽으로 꺾으신 다음 500m 전진하시면 동물원 입구입니다.");
			System.out.println("동물원 입장료는 공짜입니다.");
			System.out.println("즐거운 시간 되십시오!");
		}else if(userSelect.equals("NO") || userSelect.equals("no")) {
			System.out.println("저희 DMK 동물원도 다음에 꼭 놀러와보세요!!");
		}
		

	}

}
