package kiosqueEx20;
import java.util.Scanner;

class ShowClass{
	
	public static void show() {
		System.out.println("항상 저희 DMK 과일주스점을 이용해주셔서 감사합니다.");
		System.out.println("저희 DMK 과일주스점은 많은 프랜차이즈를 이용하고 있습니다!");
	}
}

public class KiosqueEx20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요 DMK 과일주스점입니다");
		System.out.print("주문하시겠습니까? : (YES/NO) : ");
		String yesorno = scanner.next();
		
		if(yesorno.equals("YES") || yesorno.equals("yes")) {
			System.out.println("저희 DMK 과일주스점에는 1. 포도주스 2. 키위주스 3. 바나나주스 4. 딸기+바나나 주스 5. 키위+바나나 주스 총 5가지 메뉴가 준비되어 있습니다.");
			System.out.print("원하시는 주스의 번호를 눌러주세요 : ");
			int fruitJuice = scanner.nextInt();
			
			if(fruitJuice == 1) {
				System.out.println("포도주스를 선택하셨습니다!");
				System.out.print("포도주스의 사이즈는 M/L/XL 사이즈가 준비되어 있습니다. 드실 사이즈를 입력해주세요!!(M/L/XL) : ");
				String grapeJuiceSize = scanner.next();
				
				if(grapeJuiceSize.equals("M") || grapeJuiceSize.equals("m")) {
					System.out.println("포도주스 M 사이즈를 선택하셨습니다.");
					System.out.println("포도주스 M 사이즈의 가격은 7000원입니다.");
				}else if(grapeJuiceSize.equals("L") || grapeJuiceSize.equals("l")) {
					System.out.println("포도주스 L 사이즈를 선택하셨습니다.");
					System.out.println("포도주스 L 사이즈의 가격은 8000원입니다.");
				}else if(grapeJuiceSize.equals("XL") || grapeJuiceSize.equals("xl") || grapeJuiceSize.equals("Xl") || grapeJuiceSize.equals("xL")) {
					System.out.println("포도주스 XL 사이즈를 선택하셨습니다.");
					System.out.println("포도주스 XL 사이즈의 가격은 9000원입니다.");
				}
				
				System.out.println("포도주스는 몸에 좋은 포도를 갈아서 만든 생과일주스입니다 !!");
				System.out.println("드셔보시고 맛있으시면 또 놀러와주시고 방문해주세요!");
			}else if(fruitJuice == 2) {
				System.out.println("키위주스를 선택하셨습니다!");
				System.out.print("키위주스의 사이즈는 M/L/XL 사이즈가 준비되어 있습니다. 드실 사이즈를 입력해주세요!!(M/L/XL) : ");
				String kiwiJuiceSize = scanner.next();
				
				if(kiwiJuiceSize.equals("M") || kiwiJuiceSize.equals("m")) {
					System.out.println("키위주스 M 사이즈를 선택하셨습니다.");
					System.out.println("키위주스 M 사이즈의 가격은 8000원입니다.");
				}else if(kiwiJuiceSize.equals("L") || kiwiJuiceSize.equals("l")) {
					System.out.println("키위주스 L 사이즈를 선택하셨습니다.");
					System.out.println("키위주스 L 사이즈의 가격은 9000원입니다.");
				}else if(kiwiJuiceSize.equals("XL") || kiwiJuiceSize.equals("xl") || kiwiJuiceSize.equals("Xl") || kiwiJuiceSize.equals("xL")) {
					System.out.println("키위주스 XL 사이즈를 선택하셨습니다.");
					System.out.println("키위주스 XL 사이즈의 가격은 10000원입니다.");
				}
				
				System.out.println("키위주스는 몸에 좋은 키위를 갈아서 만든 생과일주스입니다 !!");
				System.out.println("드셔보시고 맛있으시면 또 놀러와주시고 방문해주세요!");
			}else if(fruitJuice == 3) {
				System.out.println("바나나주스를 선택하셨습니다!");
				System.out.print("바나나주스의 사이즈는 M/L/XL 사이즈가 준비되어 있습니다. 드실 사이즈를 입력해주세요!!(M/L/XL) : ");
				String bananaJuiceSize = scanner.next();
				
				if(bananaJuiceSize.equals("M") || bananaJuiceSize.equals("m")) {
					System.out.println("바나나주스 M 사이즈를 선택하셨습니다.");
					System.out.println("바나나주스 M 사이즈의 가격은 6000원입니다.");
				}else if(bananaJuiceSize.equals("L") || bananaJuiceSize.equals("l")) {
					System.out.println("바나나주스 L 사이즈를 선택하셨습니다.");
					System.out.println("바나나주스 L 사이즈의 가격은 7000원입니다.");
				}else if(bananaJuiceSize.equals("XL") || bananaJuiceSize.equals("xl") || bananaJuiceSize.equals("Xl") || bananaJuiceSize.equals("xL")) {
					System.out.println("바나나주스 XL 사이즈를 선택하셨습니다.");
					System.out.println("바나나주스 XL 사이즈의 가격은 8000원입니다.");
				}
				
				System.out.println("바나나주스는 몸에 좋은 바나나를 갈아서 만든 생과일주스입니다 !!");
				System.out.println("드셔보시고 맛있으시면 또 놀러와주시고 방문해주세요!");
			}else if(fruitJuice == 4) {
				System.out.println("딸기+바나나 주스를 선택하셨습니다!");
				System.out.print("딸기+바나나 주스의 사이즈는 M/L/XL 사이즈가 준비되어 있습니다. 드실 사이즈를 입력해주세요!!(M/L/XL) : ");
				String strawbananaJuiceSize = scanner.next();
				
				if(strawbananaJuiceSize.equals("M") || strawbananaJuiceSize.equals("m")) {
					System.out.println("딸기+바나나 주스 M 사이즈를 선택하셨습니다.");
					System.out.println("딸기+바나나 주스 M 사이즈의 가격은 10000원입니다.");
				}else if(strawbananaJuiceSize.equals("L") || strawbananaJuiceSize.equals("l")) {
					System.out.println("딸기+바나나 주스 L 사이즈를 선택하셨습니다.");
					System.out.println("딸기+바나나 주스 L 사이즈의 가격은 11000원입니다.");
				}else if(strawbananaJuiceSize.equals("XL") || strawbananaJuiceSize.equals("xl") || strawbananaJuiceSize.equals("Xl") || strawbananaJuiceSize.equals("xL")) {
					System.out.println("딸기+바나나 주스 XL 사이즈를 선택하셨습니다.");
					System.out.println("딸기+바나나 주스 XL 사이즈의 가격은 12000원입니다.");
				}
				
				System.out.println("딸기+바나나 주스는 몸에 좋은 딸기와 바나나를 갈아서 만든 생과일주스입니다 !!");
				System.out.println("드셔보시고 맛있으시면 또 놀러와주시고 방문해주세요!");
			}else if(fruitJuice == 5) {
				System.out.println("키위+바나나 주스를 선택하셨습니다!");
				System.out.print("키위+바나나 주스의 사이즈는 M/L/XL 사이즈가 준비되어 있습니다. 드실 사이즈를 입력해주세요!!(M/L/XL) : ");
				String kiwibananaJuiceSize = scanner.next();
				
				if(kiwibananaJuiceSize.equals("M") || kiwibananaJuiceSize.equals("m")) {
					System.out.println("키위+바나나 주스 M 사이즈를 선택하셨습니다.");
					System.out.println("키위+바나나 주스 M 사이즈의 가격은 10000원입니다.");
				}else if(kiwibananaJuiceSize.equals("L") || kiwibananaJuiceSize.equals("l")) {
					System.out.println("키위+바나나 주스 L 사이즈를 선택하셨습니다.");
					System.out.println("키위+바나나 주스 L 사이즈의 가격은 11000원입니다.");
				}else if(kiwibananaJuiceSize.equals("XL") || kiwibananaJuiceSize.equals("xl") || kiwibananaJuiceSize.equals("Xl") || kiwibananaJuiceSize.equals("xL")) {
					System.out.println("키위+바나나 주스 XL 사이즈를 선택하셨습니다.");
					System.out.println("키위+바나나 주스 XL 사이즈의 가격은 12000원입니다.");
				}
				
				System.out.println("키위+바나나 주스는 몸에 좋은 키위와 바나나를 갈아서 만든 생과일주스입니다 !!");
				System.out.println("드셔보시고 맛있으시면 또 놀러와주시고 방문해주세요!");
			}
			
		}else if(yesorno.equals("NO") || yesorno.equals("no")) {
			System.out.println("주문하실 때 앞의 키오스크를 이용해주세요!!");
		}
		
		ShowClass.show();
		

	}

}
