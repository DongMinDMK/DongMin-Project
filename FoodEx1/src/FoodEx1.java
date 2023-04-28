import java.util.*;
public class FoodEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("DMK 치킨입니다. 주문하시겠습니까? (YES/NO)중 입력해주십시오");
		String select = scanner.next();
		
		if(select.equals("YES") || select.equals("yes")) {
			System.out.print("주문할 치킨을 입력해주세요. 리스트에는 1. 후라이드, 2. 양념, 3. 뿌링클 치킨이 있습니다. ");
			int selectChicken = scanner.nextInt();
			
			if(selectChicken == 1) {
				System.out.println("후라이드 치킨을 선택하셨습니다.");
				System.out.print("후라이드는 1. 대, 2. 중, 3. 소 가 있습니다. 원하시는 크기를 선택하세요. ");
				int friedSize = scanner.nextInt();
				
				if(friedSize == 1) {
					System.out.println("후라이드 치킨 대 사이즈 가격은 20000원 입니다.");
				}
				else if(friedSize == 2) {
					System.out.println("후라이드 치킨 중 사이즈 가격은 15000원 입니다.");
				}
				else if(friedSize == 3) {
					System.out.println("후라이드 치킨 소 사이즈 가격은 10000원 입니다.");
				}
			}
			
			else if(selectChicken == 2) {
				System.out.println("양념 치킨을 선택하셨습니다.");
				System.out.print("양념치킨은 1. 대, 2. 중, 3. 소 가 있습니다. 원하시는 크기를 선택하세요. ");
				int spicySize = scanner.nextInt();
				
				if(spicySize == 1) {
					System.out.println("양념 치킨 대 사이즈 가격은 25000원 입니다.");
				}
				else if(spicySize == 2) {
					System.out.println("양념 치킨 중 사이즈 가격은 20000원 입니다.");
				}
				else if(spicySize == 3) {
					System.out.println("양념 치킨 소 사이즈 가격은 15000원 입니다.");
				}
			}
			
			else if(selectChicken == 3) {
				System.out.println("뿌링클 치킨을 선택하셨습니다.");
				System.out.print("뿌링클 치킨은 1. 대, 2. 중, 3. 소 가 있습니다. 원하시는 크기를 선택하세요. ");
				int bburinkleSize = scanner.nextInt();
				
				if(bburinkleSize == 1) {
					System.out.println("뿌링클 치킨 대 사이즈 가격은 30000원 입니다.");
				}
				else if(bburinkleSize == 2) {
					System.out.println("뿌링클 치킨 중 사이즈 가격은 25000원 입니다.");
				}
				else if(bburinkleSize == 3) {
					System.out.println("뿌링클 치킨 소 사이즈 가격은 20000원 입니다.");
				}
			}
			
			
			
		}
		else if(select.equals("NO") || select.equals("no")) {
			System.out.println("주문하실 때 불러주시길 바랍니다. ");
			
		}

	}

}
