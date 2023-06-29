package kiosqueEx16;
import java.util.Scanner;

public class KiosqueEx16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		int count = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 과일주스 판매점입니다.");
			System.out.print("주문하시겠습니까?(YES/NO/종료) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("YES") || yesorno.equals("yes")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.println("저희 매장은 1. 키위주스 2. 망고주스 3. 바나나주스 4. 딸기주스 등 다양한 주스를 판매하고 있습니다.");
				System.out.print("원하시는 주스의 번호를 눌러주세요 : ");
				int fruitSelect = scanner.nextInt();
				
				if(fruitSelect == 1) { //키위주스
					System.out.println("키위주스를 선택하셨습니다. 키위주스는 정말 몸에 좋고 맛있는 키위를 갈아서 즙으로 만들었습니다.");
					System.out.print("키위주스는 사이즈가 S/M/L/XL 4가지의 사이즈가 준비되어있습니다. 원하시는 사이즈를 골라주세요(S/M/L/XL) : ");
					String size = scanner.next();
					
					if(size.equals("S") || size.equals("s")) {
						System.out.println("키위주스 S 사이즈를 선택하셨습니다.");
						System.out.println("S 사이즈의 가격은 3000원입니다.");
						cost += 3000;
						count++;
					}else if(size.equals("M") || size.equals("m")) {
						System.out.println("키위주스 M 사이즈를 선택하셨습니다.");
						System.out.println("M 사이즈의 가격은 4000원입니다.");
						cost += 4000;
						count++;
					}else if(size.equals("L") || size.equals("l")) {
						System.out.println("키위주스 L 사이즈를 선택하셨습니다.");
						System.out.println("L 사이즈의 가격은 6000원입니다.");
						cost += 6000;
						count++;
					}else if(size.equals("XL") || size.equals("xl")) {
						System.out.println("키위주스 XL 사이즈를 선택하셨습니다.");
						System.out.println("XL 사이즈의 가격은 7500원입니다.");
						cost += 7500;
						count++;
					}
				}else if(fruitSelect == 2) { //망고주스
					System.out.println("망고주스를 선택하셨습니다. 망고주스는 정말 몸에 좋고 맛있는 망고를 갈아서 즙으로 만들었습니다.");
					System.out.print("망고주스는 사이즈가 S/M/L/XL 4가지의 사이즈가 준비되어있습니다. 원하시는 사이즈를 골라주세요(S/M/L/XL) : ");
					String size = scanner.next();
					
					if(size.equals("S") || size.equals("s")) {
						System.out.println("망고주스 S 사이즈를 선택하셨습니다.");
						System.out.println("S 사이즈의 가격은 4000원입니다.");
						cost += 4000;
						count++;
					}else if(size.equals("M") || size.equals("m")) {
						System.out.println("망고주스 M 사이즈를 선택하셨습니다.");
						System.out.println("M 사이즈의 가격은 5000원입니다.");
						cost += 5000;
						count++;
					}else if(size.equals("L") || size.equals("l")) {
						System.out.println("망고주스 L 사이즈를 선택하셨습니다.");
						System.out.println("L 사이즈의 가격은 6500원입니다.");
						cost += 6000;
						count++;
					}else if(size.equals("XL") || size.equals("xl")) {
						System.out.println("망고주스 XL 사이즈를 선택하셨습니다.");
						System.out.println("XL 사이즈의 가격은 8000원입니다.");
						cost += 8000;
						count++;
					}
				}else if(fruitSelect == 3) { //바나나주스
					System.out.println("바나나주스를 선택하셨습니다. 바나나주스는 정말 몸에 좋고 맛있는 바나나를 갈아서 즙으로 만들었습니다.");
					System.out.print("바나나주스는 사이즈가 S/M/L/XL 4가지의 사이즈가 준비되어있습니다. 원하시는 사이즈를 골라주세요(S/M/L/XL) : ");
					String size = scanner.next();
					
					if(size.equals("S") || size.equals("s")) {
						System.out.println("바나나주스 S 사이즈를 선택하셨습니다.");
						System.out.println("S 사이즈의 가격은 3000원입니다.");
						cost += 3000;
						count++;
					}else if(size.equals("M") || size.equals("m")) {
						System.out.println("바나나주스 M 사이즈를 선택하셨습니다.");
						System.out.println("M 사이즈의 가격은 4500원입니다.");
						cost += 4500;
						count++;
					}else if(size.equals("L") || size.equals("l")) {
						System.out.println("바나나주스 L 사이즈를 선택하셨습니다.");
						System.out.println("L 사이즈의 가격은 7000원입니다.");
						cost += 7000;
						count++;
					}else if(size.equals("XL") || size.equals("xl")) {
						System.out.println("바나나주스 XL 사이즈를 선택하셨습니다.");
						System.out.println("XL 사이즈의 가격은 8500원입니다.");
						cost += 8500;
						count++;
					}
				}else if(fruitSelect == 4) { //딸기주스
					System.out.println("딸기주스를 선택하셨습니다. 딸기주스는 정말 몸에 좋고 맛있는 딸기를 갈아서 즙으로 만들었습니다.");
					System.out.print("딸기주스는 사이즈가 S/M/L/XL 4가지의 사이즈가 준비되어있습니다. 원하시는 사이즈를 골라주세요(S/M/L/XL) : ");
					String size = scanner.next();
					
					if(size.equals("S") || size.equals("s")) {
						System.out.println("딸기주스 S 사이즈를 선택하셨습니다.");
						System.out.println("S 사이즈의 가격은 5000원입니다.");
						cost += 5000;
						count++;
					}else if(size.equals("M") || size.equals("m")) {
						System.out.println("딸기주스 M 사이즈를 선택하셨습니다.");
						System.out.println("M 사이즈의 가격은 6000원입니다.");
						cost += 6000;
						count++;
					}else if(size.equals("L") || size.equals("l")) {
						System.out.println("딸기주스 L 사이즈를 선택하셨습니다.");
						System.out.println("L 사이즈의 가격은 7500원입니다.");
						cost += 7500;
						count++;
					}else if(size.equals("XL") || size.equals("xl")) {
						System.out.println("딸기주스 XL 사이즈를 선택하셨습니다.");
						System.out.println("XL 사이즈의 가격은 8500원입니다.");
						cost += 8500;
						count++;
					}
				}
			}else if(yesorno.equals("NO") || yesorno.equals("no")) {
				System.out.println("고민하시고 주문하실때 저희 키오스크를 이용해주시면 됩니다.");
			}else if(yesorno.equals("종료")) {
				System.out.println("지금까지 주문한 과일쥬스의 수는 " + count + "개이며, 총 가격은 " + cost + "원입니다.");
				break;
			}
		}
		
		System.out.println("항상 저희 DMK 과일주스 판매점을 이용해주셔서 감사합니다.");
		System.out.println("오늘도 좋은 하루 되세요!!");
		
	}

}
