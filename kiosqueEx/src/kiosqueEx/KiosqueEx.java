package kiosqueEx;
import java.util.*;

public class KiosqueEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------사용자가 선택한 음식의 가격 출력--------------------");
		
		System.out.println("안녕하세요 DMK 레스토랑입니다. 주문은 앞에 키오스크에서 부탁드립니다.");
		System.out.print("안녕하세요 주문하시겠습니까? 주문하시려면 1번을 눌러주세요. ");
		int order = scanner.nextInt();
		
		if(order == 1) {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.print("저희 레스토랑에는 1. 햄버거 2. 필라프 3. 면 종류의 음식 카테고리가 있습니다. 원하시는 카테고리를 입력해주세요. ");
			int foodOrder = scanner.nextInt();
			
			if(foodOrder == 1) { //햄버거 선택
				System.out.println("햄버거를 선택하셨습니다.");
				System.out.print("햄버거는 단품과 세트메뉴가 있습니다. 단품을 드시겠습니까? 세트를 드시겠습니까? (단품/세트) ");
			    String burgerSelect = scanner.next();
			    
			    if(burgerSelect.equals("단품"))
			    {
			    	System.out.println("햄버거 단품 가격은 6000원입니다.");
			    }
			    else if(burgerSelect.equals("세트")) {
			    	System.out.println("햄버거 세트 가격은 8500원입니다.");
			    }
				
				
			}
			else if(foodOrder == 2) { //필라프 선택
				System.out.println("필라프를 선택하셨습니다. 필라프는 밥과 같습니다.");
				System.out.print("필라프는 보통과 곱빼기가 있습니다. 보통을 드시겠습니까? 곱빼기를 추가하여 드시겠습니까? (보통/곱빼기) ");
				String riceSelect = scanner.next();
				
				if(riceSelect.equals("보통")) {
					System.out.println("필라프의 보통가격은 7000원입니다.");
				}
				else if(riceSelect.equals("곱빼기")) {
					System.out.println("필라프의 곱빼기 가격은 8000원입니다.");
				}
				
			}
			
			else if(foodOrder == 3) { //면 선택
				System.out.println("면을 선택하셨습니다. 면은 우동과 스파게티 그리고 라면이 있습니다.");
				System.out.print("드실 면의 종류를 선택해주세요. 1. 우동 2. 스파게티 3. 라면 ");
				int noodleSelect = scanner.nextInt();
				
				if(noodleSelect == 1) { //우동
					System.out.println("우동을 선택하셨습니다.");
					System.out.println("우동은 5000원입니다.");
				}
				else if(noodleSelect == 2) { //스파게티
					System.out.println("스파게티를 선택하셨습니다.");
					System.out.println("스파게티는 7000원입니다.");
				}
				else if(noodleSelect == 3) { //라면
					System.out.println("라면을 선택하셨습니다.");
					System.out.println("라면은 3500원입니다.");
				}
			}
			
		}
		System.out.println("항상 저희 레스토랑을 이용해주셔서 감사합니다.");

	}

}
