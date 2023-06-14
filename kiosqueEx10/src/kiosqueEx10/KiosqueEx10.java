package kiosqueEx10;
import java.util.Scanner;

public class KiosqueEx10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.print("환영합니다! DMK 햄버거입니다. 주문하시겠습니까?(YES/NO): 종료하시려면 (종료)를 눌러주세요 ");
			String select = scanner.next();
			
			if(select.equals("YES") || select.equals("yes")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.print("저희 DMK 햄버거는 1. 데리버거 2. 치킨버거 3. 새우버거 4. 불고기버거 등 다양한 버거를 판매하고 있습니다. 원하시는 버거의 번호를 눌러주세요 ");
				int burgerSelect = scanner.nextInt();
				
				if(burgerSelect == 1) { //데리버거
					System.out.println("데리버거를 선택하셨습니다. ");
					System.out.print("데리버거는 단품과 세트가 준비되어있습니다. 단품을 드시겠습니까? 아니면 세트를 드시겠습니까?(단품,세트) : ");
					String singleorset = scanner.next();
					
					if(singleorset.equals("단품")) {
						System.out.println("단품을 선택하셨습니다.");
						System.out.println("데리버거 단품의 가격은 4000원입니다.");
						cost += 4000;
					}else if(singleorset.equals("세트")) {
						System.out.println("세트를 선택하셨습니다.");
						System.out.println("세트는 햄버거와 음료수, 감자튀김이 제공됩니다.");
						System.out.println("데리버거 세트의 가격은 5800원입니다.");
						cost += 5800;
					}
				}else if(burgerSelect == 2) { //치킨버거
					System.out.println("치킨버거를 선택하셨습니다. ");
					System.out.print("치킨버거는 단품과 세트가 준비되어있습니다. 단품을 드시겠습니까? 아니면 세트를 드시겠습니까?(단품,세트) : ");
					String singleorset1 = scanner.next();
					
					if(singleorset1.equals("단품")) {
						System.out.println("단품을 선택하셨습니다.");
						System.out.println("치킨버거 단품의 가격은 5000원입니다.");
						cost += 5000;
					}else if(singleorset1.equals("세트")) {
						System.out.println("세트를 선택하셨습니다.");
						System.out.println("세트는 햄버거와 음료수, 감자튀김이 제공됩니다.");
						System.out.println("치킨버거 세트의 가격은 6800원입니다.");
						cost += 6800;
					}
				}else if(burgerSelect == 3) { //새우버거
					System.out.println("새우버거를 선택하셨습니다. ");
					System.out.print("새우버거는 단품과 세트가 준비되어있습니다. 단품을 드시겠습니까? 아니면 세트를 드시겠습니까?(단품,세트) : ");
					String singleorset2 = scanner.next();
					
					if(singleorset2.equals("단품")) {
						System.out.println("단품을 선택하셨습니다.");
						System.out.println("새우버거 단품의 가격은 7000원입니다.");
						cost += 7000;
					}else if(singleorset2.equals("세트")) {
						System.out.println("세트를 선택하셨습니다.");
						System.out.println("세트는 햄버거와 음료수, 감자튀김이 제공됩니다.");
						System.out.println("새우버거 세트의 가격은 8800원입니다.");
						cost += 8800;
					}
				}else if(burgerSelect == 4) { //불고기버거
					System.out.println("불고기버거를 선택하셨습니다. ");
					System.out.print("불고기버거는 단품과 세트가 준비되어있습니다. 단품을 드시겠습니까? 아니면 세트를 드시겠습니까?(단품,세트) : ");
					String singleorset3 = scanner.next();
					
					if(singleorset3.equals("단품")) {
						System.out.println("단품을 선택하셨습니다.");
						System.out.println("불고기버거 단품의 가격은 9000원입니다.");
						cost += 9000;
					}else if(singleorset3.equals("세트")) {
						System.out.println("세트를 선택하셨습니다.");
						System.out.println("세트는 햄버거와 음료수, 감자튀김이 제공됩니다.");
						System.out.println("불고기버거 세트의 가격은 11000원입니다.");
						cost += 11000;
					}
				}
				
			}else if(select.equals("NO") || select.equals("no")) {
				System.out.println("주문하실 때 키오스크에 오셔서 주문하시면 됩니다.");
			}else if(select.equals("종료")) {
				System.out.println("현재 주문하신 버거의 총 금액은 " + cost + "원입니다.");
				System.out.println("항상 DMK 햄버거를 이용해주셔서 감사합니다.");
				break;
			}
		
		}
	}

}
