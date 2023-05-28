package kiosqueEx6;
import java.util.Scanner;

public class KiosqueEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price = 0;
		
		
		System.out.println("환영합니다. DMK 레스토랑입니다. 저희 레스토랑은 다양한 음식을 판매하고 있습니다.");
		while(true) {
		System.out.print("주문하시겠습니까? (YES/NO) 종료하시려면 (종료) 를 눌러주세요. : ");
		
		String yesorno = scanner.next();
		
		if(yesorno.equals("YES") || yesorno.equals("yes")) {
			System.out.println("음식 주문을 선택하셨습니다.");
			System.out.print("저희 음식점은 1. 스파게티 2. 파스타 3. 제육덮밥 4. 햄버거 5. 피자 6. 치킨 7. 와플 8. 스시 등 다양한 음식을 판매하고 있습니다. 원하시는 음식의 번호를 눌러주세요 >> ");
			int select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("스파게티를 선택하셨습니다.");
				System.out.println("스파게티의 가격은 6000원입니다.");
				
				price += 6000;
				
			}else if(select == 2) {
				System.out.println("파스타를 선택하셨습니다.");
				System.out.println("파스타의 가격은 8000원입니다.");
				
				price += 8000;
			}else if(select == 3) {
				System.out.println("제육덮밥을 선택하셨습니다.");
				System.out.println("제육덥밥의 가격은 7000원입니다.");
				
				price += 7000;
			}else if(select == 4) {
				System.out.println("햄버거를 선택하셨습니다.");
				System.out.println("햄버거 가격은 9000원입니다.");
				
				price += 9000;
			}else if(select == 5) {
				System.out.println("피자를 선택하셨습니다.");
				System.out.println("피자 가격은 11000원입니다.");
				
				price += 11000;
			}
			else if(select == 6) {
				System.out.println("치킨을 선택하셨습니다.");
				System.out.println("치킨의 가격은 9000원입니다.");
				
				price += 17000;
			}
			else if(select == 7) {
				System.out.println("와플 선택하셨습니다.");
				System.out.println("와플의 가격은 9000원입니다.");
				
				price += 5000;
			}else if(select == 8) {
				System.out.println("스시를 선택하셨습니다.");
				System.out.println("스시의 가격은 10000원입니다.");
				
				price += 10000;
			}
			
			
		}else if(yesorno.equals("NO") || yesorno.equals("no")) {
			System.out.println("주문하실때 저희 직원분들께 콜 부탁드립니다.");
		}else if(yesorno.equals("종료")) {
			System.out.println("음식주문을 종료합니다.");
			break;
		}
	}
		System.out.println("총 주문하신 음식의 가격은 " + price + "원 입니다.");
		System.out.println("항상 저희 DMK 레스토랑을 이용해주셔서 감사합니다.");

	}

}
