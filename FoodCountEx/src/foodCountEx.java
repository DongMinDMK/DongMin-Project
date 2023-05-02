import java.util.*;
public class foodCountEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		
		// 음식점에서 메뉴를 선택한만큼 카운트하는 간단한 프로그램 작성
		System.out.println("안녕하세요 DMK 음식점입니다.");
		System.out.print("주문하시겠습니까? 주문을 원하시면 1번을 눌러주세요. ");
		int select = scanner.nextInt();
		
		
		while(true) {
		System.out.println("DMK 음식점에는 김치볶음밥, 참치볶음밥, 오므라이스, 김치참치볶음밥, 돈가스, 비빔밥 까지 여러가지 메뉴들을 판매하고 있습니다. 그만하시려면 0번을 입력하세요 ");
		System.out.print("원하시는 메뉴의 이름을 입력해주세요.");
		String foodName = scanner.next();
		
			if(foodName.equals("김치볶음밥")) {
					System.out.println("김치볶음밥이 추가되었습니다.");
					count++;
			}
		
			else if(foodName.equals("참치볶음밥")) {
				System.out.println("참치볶음밥이 추가되었습니다.");
				count++;
			}
			else if(foodName.equals("오므라이스")) {
				System.out.println("오므라이스가 추가되었습니다.");
				count++;
			}
			else if(foodName.equals("김치참치볶음밥")) {
				System.out.println("김치참치볶음밥이 추가되었습니다.");
				count++;
			}
			else if(foodName.equals("돈가스")) {
				System.out.println("돈가스가 추가되었습니다.");
				count++;
			}
			else if(foodName.equals("비빔밥")) {
				System.out.println("비빔밥이 추가되었습니다.");
				count++;
			}
			
			else if(foodName.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
		}
		
		System.out.println("현재 주문한 메뉴의 수는 " + count + "개 입니다.");
		

	}

}
