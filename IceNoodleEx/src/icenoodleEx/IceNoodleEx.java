package icenoodleEx;
import java.util.Scanner;

public class IceNoodleEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.print("안녕하세요 DMK 냉면집입니다. 주문하시겠습니까? : (네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.println("저희 냉면집은 안매운 하얀냉면, 덜매운 중간맛 냉면, 그리고 매운 냉면으로 구성되어있습니다.");
				System.out.print("원하시는 맛을 골라주세요(하얀냉면/중간맛냉면/매운냉면) : ");
				String noodleTaste = scanner.next();
				
				if(noodleTaste.equals("하얀냉면")) {
					System.out.println("하얀냉면을 선택하셨습니다.");
					System.out.println("하얀냉면의 가격은 5000원입니다.");
					cost += 5000;
				}else if(noodleTaste.equals("중간맛냉면")) {
					System.out.println("중간맛냉면을 선택하셨습니다.");
					System.out.println("중간맛냉면의 가격은 5000원입니다.");
					cost += 5000;
				}else if(noodleTaste.equals("매운냉면")) {
					System.out.println("매운냉면을 선택하셨습니다.");
					System.out.println("매운냉면의 가격은 5000원입니다.");
					cost += 5000;
				}
			}else if(order.equals("아니오")) {
				System.out.println("주문하실때 불러주시기 바랍니다.");
			}else if(order.equals("계산")) {
				System.out.println("잘드셨습니까? 총 나오신 금액은 " + cost + "원입니다. 항상 저희 DMK냉면을 이용해주셔서 감사합니다.");
				break;
			}

		}
	}

}
