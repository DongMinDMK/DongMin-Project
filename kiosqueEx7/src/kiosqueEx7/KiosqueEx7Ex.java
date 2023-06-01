package kiosqueEx7;
import java.util.*;

public class KiosqueEx7Ex {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		System.out.println("환영합니다. DMK 카페입니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(YES/NO) 총 주문개수와 가격 보기는 (보기)를 눌러주세요 : ");
			String select = scanner.next();
			
			if(select.equals("YES") || select.equals("yes")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.println("저희 카페에는 다양한 음료를 포함한 커피를 주문하실 수 있습니다.");
				System.out.print("저희는 1. 아메리카노 2. 카페라떼 3. 아이스티 4. 미숫가루 5. 에이드 등 준비되어 있습니다 원하시는 음료의 번호를 눌러주세요 : ");
				int drinkSelect = scanner.nextInt();
				
				if(drinkSelect == 1) { //아메리카노
					System.out.println("아메리카노를 선택하셨습니다.");
					System.out.print("아메리카노를 ICE로 드시겠습니까? HOT으로 드시겠습니까? (ICE/HOT) : " );
					String americano = scanner.next();
					
					if(americano.equals("ICE") || americano.equals("ice")) {
						System.out.println("아이스 아메리카노를 선택하셨습니다.");
						System.out.println("아이스 아메리카노의 가격은 2000원입니다.");
						count++;
						sum += 2000;
					}else if(americano.equals("HOT") || americano.equals("hot")){
						System.out.println("따뜻한 아메리카노를 선택하셨습니다.");
						System.out.println("따뜻한 아메리카노의 가격은 1500원입니다.");
						count++;
						sum += 1500;
					}
				}else if(drinkSelect == 2) { //카페라떼
					System.out.println("카페라떼를 선택하셨습니다.");
					System.out.print("카페라떼를 ICE로 드시겠습니까? HOT으로 드시겠습니까? (ICE/HOT) : " );
					String latte = scanner.next();
					
					if(latte.equals("ICE") || latte.equals("ice")) {
						System.out.println("아이스 카페라떼를 선택하셨습니다.");
						System.out.println("아이스 카페라떼의 가격은 3500원입니다.");
						count++;
						sum += 3500;
					}else if(latte.equals("HOT") || latte.equals("hot")){
						System.out.println("따뜻한 카페라떼를 선택하셨습니다.");
						System.out.println("따뜻한 카페라떼의 가격은 3000원입니다.");
						count++;
						sum += 3000;
					}
				}else if(drinkSelect == 3) { //아이스티
					System.out.println("아이스티를 선택하셨습니다.");
					System.out.println("아이스티의 가격은 2500원 입니다.");
					count++;
					sum+= 2500;
					
				}else if(drinkSelect == 4) { //미숫가루라떼
					System.out.println("미숫가루라떼를 선택하셨습니다.");
					System.out.print("미숫가루라떼 ICE로 드시겠습니까? HOT으로 드시겠습니까? (ICE/HOT) : " );
					String misoot = scanner.next();
					
					if(misoot.equals("ICE") || misoot.equals("ice")) {
						System.out.println("아이스 미숫가루라떼를 선택하셨습니다.");
						System.out.println("아이스 미숫가루라떼의 가격은 4000원입니다.");
						count++;
						sum += 4000;
					}else if(misoot.equals("HOT") || misoot.equals("hot")){
						System.out.println("따뜻한 미숫가루라떼를 선택하셨습니다.");
						System.out.println("따뜻한 미숫가루라떼의 가격은 1500원입니다.");
						count++;
						sum += 1500;
					}
				}else if(drinkSelect == 5) { //에이드
					System.out.println("에이드를 선택하셨습니다.");
					System.out.print("에이드 ICE로 드시겠습니까? HOT으로 드시겠습니까? (ICE/HOT) : " );
					String ade = scanner.next();
					
					if(ade.equals("ICE") || ade.equals("ice")) {
						System.out.println("에이드를 선택하셨습니다.");
						System.out.println("에이드의 가격은 3000원입니다.");
						count++;
						sum += 3000;
					}else if(ade.equals("HOT") || ade.equals("hot")){
						System.out.println("따뜻한 에이드를 선택하셨습니다.");
						System.out.println("따뜻한 에이드의 가격은 2500원입니다.");
						count++;
						sum += 2500;
					}
				}
				
			}else if(select.equals("NO") || select.equals("no")){
				System.out.println("주문하실때 키오스크를 이용하시기 바랍니다.");
			}else if(select.equals("보기")) {
				System.out.println("총 주문량은 " + count + "개 입니다.");
				System.out.println("계산결과 총 " + sum + "원입니다. ");
				break;
			}
		}
		
		System.out.println("항상 저희 DMK 카페를 이용해주셔서 감사합니다.");
		
		

	}

}
