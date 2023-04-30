import java.util.*;
public class food3Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("안녕하세요. DMK 한국 전통 음식점입니다. 주문을 원하시면 (Y/y) 을 눌러주시고, 좀 있다 주문하시기를 원하시면 (N/n)을 눌러주세요 ");
		char order = scanner.next().charAt(0);
		
		if(order == 'Y' || order == 'y') {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.println("저희 DMK 한국 전통 음식점은 많은 한국 음식이 준비되어 있습니다.");
			System.out.print("1. 비빔밥 2. 불고기비빔밥 3. 삼계탕 4. 팥죽이 있습니다. 원하시는 번호를 입력해주세요.");
			int koreaSelectFood = scanner.nextInt();
			
			switch(koreaSelectFood) {
			case 1:
				System.out.println("비빔밥을 선택하셨습니다.");
				System.out.println("비빔밥은 밥에 각종 나물을 넣고 장을 넣어 비벼서 먹는 한국의 전통적인 요리입니다.");
				System.out.print("비빔밥은 1. 일반과 2. 곱빼기가 있습니다. 원하시는 사이즈를 선택해주세요. ");
				System.out.println("곱빼기는 모든 메뉴에 1000원이 추가됩니다.");
				int bibimbap = scanner.nextInt();
				if(bibimbap == 1) {
					System.out.println("비빔밥 일반 사이즈 가격은 6000원입니다.");
				}
				else if(bibimbap == 2) {
					System.out.println("비빔밥 곱빼기 사이즈 가격은 7000원입니다.");
				}
				break;
			case 2:
				System.out.println("불고기비빔밥을 선택하셨습니다.");
				System.out.println("불고기비빔밥은 밥에 각종 나물을 넣고 장을 넣어 비벼서 먹는 한국의 전통적인 요리인 비빔밥에서 불고기까지 추가되어 더 맛있게 해주는 요리입니다.");
				System.out.println("다만, 조금 매울 수 있습니다.");
				System.out.print("불고기비빔밥은 1. 일반과 2. 곱빼기가 있습니다. 원하시는 사이즈를 선택해주세요. ");
				System.out.println("곱빼기는 모든 메뉴에 1000원이 추가됩니다.");
				int bulgogibibim = scanner.nextInt();
				if(bulgogibibim == 1) {
					System.out.println("불고기비빔밥 일반 사이즈 가격은 7000원입니다.");
				}
				else if(bulgogibibim == 2) {
					System.out.println("비빔밥 곱빼기 사이즈 가격은 8000원입니다.");
				}
				break;
			case 3:
				System.out.println("삼계탕을 선택하셨습니다.");
				System.out.println("삼계탕은 어린 닭에다가 찹쌀, 인삼, 대추, 밤, 황기 등을 넣고 푹 고아서 만든 닭 요리이며, 한국의 대표적인 보양식 요리입니다.");
				System.out.println("몸을 한번 충전해주신다 생각하시면 삼계탕을 한번 드셔보세요!");
				System.out.print("삼계탕의 가격은 9000원입니다. ");
				break;
			case 4:
				System.out.println("팥죽을 선택하셨습니다.");
				System.out.println("팥죽은 팥을 주재료로 하여 만든 죽이며, 한국에서는 동지에 귀신과 액운을 쫒아내기 위해 팥죽을 먹는다는 풍속이 있다.");
				System.out.println("팥죽의 가격은 4000원입니다.");
				break;
			default:
				System.out.println("1. 비빔밥 2. 불고기비빔밥 3. 삼계탕 4. 팥죽 중에서 번호를 입력해주세요!");
				
			}
			
			
		}
		else if(order == 'N' || order == 'n') {
			System.out.println("이따가 저희 직원을 호출해주세요. 그럼 그때 주문 도와드리겠습니다.");
		}

	}

}
