import java.util.*;
public class food4Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price = 0;
		
		
		
		while(true) {
		System.out.print("안녕하세요 DMK 일식 음식점입니다. 1. 주문하기 2. 결제하기 3. 종료하기 중 원하시는 번호를 입력해주세요.");
		int select = scanner.nextInt();
		
		  switch(select) {
			case 1:
				System.out.print("저희 음식점에는 1. 돈가스 2. 차슈덮밥 3. 차슈라멘이 있습니다. 원하시는 음식의 번호를 입력해주세요. ");
				int selectedJP = scanner.nextInt();
				
				if(selectedJP == 1) {
					System.out.println("돈가스를 선택하셨습니다.");
					System.out.println("돈가스는 주문하자마자 즉시 튀기는 것을 진행하기 때문에 조금 더 시간이 지체될 수 있습니다.");
					System.out.println("돈가스의 가격은 11000원 입니다.");
					price += 11000;
					continue;
				}
				else if(selectedJP ==2) {
					System.out.println("차슈덮밥을 선택하셨습니다.");
					System.out.println("차슈덮밥의 가격은 9000원 입니다.");
					System.out.print("차슈덮밥은 일반가격과 곱빼기 가격이 있습니다. 곱빼기는 1000원 추가입니다. 곱빼기를 주문하시겠습니까? (Y/N 선택) ");
					char bap = scanner.next().charAt(0);
					if(bap == 'Y' || bap == 'y') {
						System.out.println("곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기의 가격은 1000원이 추가되어 10000원입니다.");
						price += 10000;
						continue;
					}
					else if(bap == 'N' || bap == 'n') {
						System.out.println("일반을 선택하셨습니다.");
						System.out.println("일반가격은 위에 안내드렸다시피 9000원입니다.");
						price += 9000;
						continue;
					}
				}
				else if(selectedJP == 3) {
					System.out.println("차슈라멘을 선택하셨습니다.");
					System.out.println("차슈라멘의 가격은 8000원 입니다.");
					System.out.print("차슈라멘은 일반가격과 곱빼기 가격이 있습니다. 곱빼기는 1000원 추가입니다. 곱빼기를 주문하시겠습니까? (Y/N 선택) ");
					char ramen = scanner.next().charAt(0);
					if(ramen == 'Y' || ramen == 'y') {
						System.out.println("곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기의 가격은 1000원이 추가되어 9000원입니다.");
						price += 9000;
						continue;
					}
					else if(ramen == 'N' || ramen == 'n') {
						System.out.println("일반을 선택하셨습니다.");
						System.out.println("일반가격은 위에 안내드렸다시피 8000원입니다.");
						price += 8000;
						continue;
					}
					break;
				}
			case 2:
				System.out.println("결제하기 버튼을 클릭하셨습니다.");
				System.out.println("현재 누적되어 있는 가격은 " + price + "원 입니다.");
				System.out.print("결제하시겠습니까? (Y/N 입력) ");
				char purchaseSelect = scanner.next().charAt(0);
				
				if(purchaseSelect == 'Y' || purchaseSelect == 'y') {
					System.out.println(price + "원이 결제되었습니다.");
					break;
				}
				else if(purchaseSelect == 'N' || purchaseSelect == 'n') {
					System.out.println("추가적으로 메뉴를 선택하러 돌아갑니다...");
					continue;
				}
				
			case 3:
				System.out.println("종료하기를 선택하셨습니다.");
				System.out.println("종료합니다...");
				break;
				
			}
			
		  break;
		}
		

	}

}
