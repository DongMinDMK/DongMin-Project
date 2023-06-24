package kiosqueEx14;
import java.util.Scanner;

public class KiosqueEx14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		
		while(true) {
			System.out.println("환영합니다. DMK 음식점입니다.");
			System.out.print("음식을 주문하시겠습니까 ?(네/아니오/종료) : ");
			String select = scanner.next();
			if(select.equals("네")) {
				System.out.println("참고로 저희 가게는 곱빼기는 지원하지 않고 있습니다. 죄송합니다.");
				System.out.print("저희 음식점에는 한식, 중식, 일식이 있습니다. 원하시는 음식의 종류를 눌러주세요(한식/중식/일식) : ");
				String countryFood = scanner.next();
				
				if(countryFood.equals("한식")) {
					System.out.print("한식을 선택하셨습니다. 한식은 1. 비빔밥 2. 삼계탕이 있습니다 원하시는 음식의 번호를 선택해주세요 : ");
					int koreaFoodSelect = scanner.nextInt();
					
					if(koreaFoodSelect == 1) {
						System.out.println("비빔밥을 선택하셨습니다. 비빔밥은 한국의 전통적인 음식입니다. 가격은 6000원입니다.");
						price += 6000;
					}else if(koreaFoodSelect == 2) {
						System.out.println("삼계탕을 선택하셨습니다. 삼계탕은 몸에 좋은 음식이며, 정말 맛있는 한국의 대표적인 음식입니다. 가격은 10000원입니다.");
						price += 10000;
					}
				}else if(countryFood.equals("중식")) {
					System.out.print("중식을 선택하셨습니다 중식메뉴는 1. 자장면 2. 짬뽕이 준비되어있습니다. 원하시는 음식의 번호를 눌러주세요 : ");
					int chinaFood = scanner.nextInt();
					
					if(chinaFood == 1) {
						System.out.println("자장면을 선택하셨습니다. 자장면은 8000원입니다.");
						price += 8000;
					}else if(chinaFood == 2) {
						System.out.println("짬뽕을 선택하셨습니다. 짬뽕은 9000원입니다.");
						price += 9000;
					}
					
				}else if(countryFood.equals("일식")) {
					System.out.print("일식을 선택하셨습니다. 일식메뉴로는 1. 돈가스 2. 규동가 준비되어있습니다. 원하시는 음식의 번호를 눌러주세요 : ");
					int japanFood = scanner.nextInt();
					
					if(japanFood == 1) {
						System.out.println("돈가스를 선택하셨습니다. 저희 돈가스는 기본적으로 디폴트가 왕돈가스입니다. 그리고 충분히 음식을 튀기고 손님들께 정성스럽게 대접해드리고 있습니다.");
						System.out.println("돈가스의 가격은 10000원입니다.");
						price += 10000;
					}else if(japanFood == 2) {
						System.out.println("규동 선택하셨습니다. 규동은 일본의 대표적인 밥 중 하나입니다.");
						System.out.println("규동은 9000원입니다.");
						price += 9000;
					}
					
				}
			}else if(select.equals("아니오")) {
				System.out.println("주문을 원하실 때 키오스크를 이용해주세요.");
			}else if(select.equals("종료")) {
				System.out.println("주문하신 음식가격은 총 " + price + "원입니다.");
				System.out.print("결제하시겠습니까? :(네/아니오) : ");
				String pricePay = scanner.next();
				
				if(pricePay.equals("네")) {
					System.out.print("얼마를 지불하시겠습니까? : ");
					int customerPay = scanner.nextInt();
					
					if(customerPay > price) {
						System.out.println("거스름돈을 돌려드겠습니다. 거스름돈은 " + (customerPay - price) + "원입니다.");
					}else if(customerPay < price) {
						System.out.println("지불하신 금액의 돈이 부족해 결제를 할 수 없습니다. 메인메뉴로 돌아갑니다.");
						continue;
					}
				}else if(pricePay.equals("아니오")) {
					System.out.println("추가메뉴를 주문하시는거 같으니 다시 메인메뉴로 돌아갑니다.");
					continue;
				}
				break;
			}
		}
		
		System.out.println("항상 저희 DMK 음식점을 이용해주셔서 감사합니다. 오늘도 즐거운 하루되시기 바랍니다.");

	}

}
