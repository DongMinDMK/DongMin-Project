import java.util.*;
public class ChineseFoodEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("DMK 중국 음식점입니다!");
		System.out.print("주문하시겠습니까? 주문하시려면 (Y/N)을 눌러주세요! ");
		char yesorno = scanner.next().charAt(0);
		
		if(yesorno == 'Y' || yesorno == 'y') {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.print("저희 중국집에는 1. 자장면 2. 짬뽕 3. 탕수육이 있습니다. 주문하실 번호를 눌러주세요! ");
			int selectFood = scanner.nextInt();
			
			if(selectFood == 1) {
				System.out.println("자장면을 선택하셨습니다.");
				System.out.println("자장면은 일반 보통 사이즈와 곱빼기 사이즈가 있습니다.");
				System.out.print("보통과 곱빼기 사이즈 중 하나를 선택해주세요. 보통은 1번 곱빼기는 2번입니다. ");
				int selectSize = scanner.nextInt();
				
				if(selectSize == 1) {
					System.out.println("자장면 보통 사이즈를 선택하셨습니다.");
					System.out.println("자장면 보통 사이즈의 지불하실 금액은 7000원 입니다.");
				}
				else if(selectSize == 2) {
					System.out.println("자장면 곱빼기 사이즈를 선택하셨습니다.");
					System.out.println("곱빼기 사이즈는 전 메뉴의 1000원이 추가됩니다.");
					System.out.println("자장면 곱빼기 사이즈의 지불하실 금액은 8000원 입니다.");
				}
				
			}
			else if(selectFood == 2) {
				System.out.println("짬뽕을 선택하셨습니다.");
				System.out.println("짬뽕은 일반 보통 사이즈와 곱빼기 사이즈가 있습니다.");
				System.out.print("보통과 곱빼기 사이즈 중 하나를 선택해주세요. 보통은 1번 곱빼기는 2번입니다. ");
				int selectSize = scanner.nextInt();
				
				if(selectSize == 1) {
					System.out.println("짬뽕 보통 사이즈를 선택하셨습니다.");
					System.out.println("짬뽕 보통 사이즈의 지불하실 금액은 8000원 입니다.");
				}
				else if(selectSize == 2) {
					System.out.println("짬뽕 곱빼기 사이즈를 선택하셨습니다.");
					System.out.println("곱빼기 사이즈는 전 메뉴의 1000원이 추가됩니다.");
					System.out.println("짬뽕 곱빼기 사이즈의 지불하실 금액은 9000원 입니다.");
				}
			}
			else if(selectFood == 3) {
				System.out.println("탕수육을 선택하셨습니다.");
				System.out.print("탕수육은 1. 대 2. 중 3. 소 사이즈로 구분되어 있습니다. 원하시는 번호를 입력해주세요! ");
				int selectTang = scanner.nextInt();
				
				if(selectTang == 1) {
					System.out.println("탕수육 대 사이즈를 선택하셨습니다.");
					System.out.println("탕수육 대 사이즈의 지불하실 금액은 25000원 입니다.");
				}
				else if(selectTang == 2) {
					System.out.println("탕수육 중 사이즈를 선택하셨습니다.");
					System.out.println("탕수육 중 사이즈의 지불하실 금액은 20000원 입니다.");
				}
				else if(selectTang == 3) {
					System.out.println("탕수육 소 사이즈를 선택하셨습니다.");
					System.out.println("탕수육 소 사이즈의 지불하실 금액은 15000원 입니다.");
				}
			}
		}
		else if(yesorno == 'N' || yesorno == 'n') {
			System.out.println("주문을 원하실 때 저희 직원분을 호출하여 주시기 바랍니다!");
			System.out.println("감사합니다!");
		}
		
		System.out.println("항상 DMK 음식점을 사랑해주셔서 감사합니다!!");

	}

}
