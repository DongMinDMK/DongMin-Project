package kiosqueEx9;
import java.util.Scanner;

public class KiosqueEx9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int drinkprice = 0;
		int playprice = 0;
		int totalprice = 0;
		
		System.out.println("어서오세요 DMK 볼링장입니다.");
		System.out.print("몇 세트를 진행하시겠습니까? 3세트 이상 진행시 음료수를 공짜로 드립니다 ! ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.println("1세트를 선택하셨습니다.");
			System.out.println("1세트의 가격은 3000원입니다. 추가로 음료수를 드실거면 유료이시기 때문에 1000원이 추가됩니다.");
			drinkprice = 1000;
			playprice = 3000;
			totalprice = drinkprice + playprice;
			System.out.println("총 지출하실 금액은 "+ totalprice + "원 입니다.");
			
		}else if(select == 2) {
			System.out.println("2세트를 선택하셨습니다.");
			System.out.println("2세트의 가격은 6000원입니다. 추가로 음료수를 드실거면 유료이시기 때문에 1000원이 추가됩니다.");
			drinkprice = 1000;
			playprice = 6000;
			totalprice = drinkprice + playprice;
			System.out.println("총 지출하실 금액은 "+ totalprice + "원 입니다.");
			
		}else if(select == 3) {
			System.out.println("3세트를 선택하셨습니다.");
			System.out.println("3세트의 가격은 9000원이지만 1000원을 할인해 드려 8000원이고 음료수는 무료로 제공해드립니다.");
			drinkprice = 0;
			playprice = 8000;
			totalprice = drinkprice + playprice;
			System.out.println("총 지출하실 금액은 "+ totalprice + "원 입니다.");
			
		}else if(select == 4) {
			System.out.println("4세트를 선택하셨습니다.");
			System.out.println("4세트의 가격은 12000원이지만 1000원을 할인해 드려 11000원이고 음료수는 무료로 제공해드립니다.");
			drinkprice = 0;
			playprice = 11000;
			totalprice = drinkprice + playprice;
			System.out.println("총 지출하실 금액은 "+ totalprice + "원 입니다.");
			
		}else if(select == 5) {
			System.out.println("5세트를 선택하셨습니다.");
			System.out.println("5세트의 가격은 15000원이지만 1000원을 할인해 드려 14000원이고 음료수는 무료로 제공해드립니다.");
			drinkprice = 0;
			playprice = 14000;
			totalprice = drinkprice + playprice;
			System.out.println("총 지출하실 금액은 "+ totalprice + "원 입니다.");
			
		}
		
		System.out.println("항상 저희 DMK 볼링장을 이용해주셔서 감사합니다. 좋은 시간 되세요!");
		

	}

}
