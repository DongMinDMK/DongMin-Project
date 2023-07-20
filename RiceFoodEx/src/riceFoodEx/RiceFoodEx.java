package riceFoodEx;

import java.util.Scanner;

public class RiceFoodEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.print("안녕하세요 DMK 음식점입니다!! 주문하시겠습니까? (Y/N/C) : ");
			String yn = scanner.next();
			
			if(yn.equals("Y") || yn.equals("y")) {
				System.out.println("주문하기를 선택하셨습니다.");
				System.out.println("저희 음식점에는 1. 오므라이스 2. 돈가스오므라이스 3. 주먹밥 등이 준비되어 있습니다.");
				System.out.print("원하시는 음식의 메뉴의 번호를 입력해주세요 : ");
				int riceSelect = scanner.nextInt();
				
				if(riceSelect == 1) {
					System.out.println("오므라이스를 선택하셨습니다.");
					System.out.print("일반 오므라이스와 곱빼기 오므라이스가 있습니다. 어떤 사이즈를 드시겠습니까? (일반/곱빼기) : ");
					String omriceSize = scanner.next();
					
					switch(omriceSize) {
					case "일반":
						System.out.println("오므라이스 일반을 선택하셨습니다. 오므라이스 일반 가격은 8000원입니다.");
						cost += 8000;
						break;
					case "곱빼기":
						System.out.println("전메뉴의 곱빼기는 1000원이 추가됩니다. 따라서 오므라이스 곱빼기의 가격은 9000원입니다.");
						cost += 9000;
						break;
					}
				}else if(riceSelect == 2) {
					System.out.println("돈가스오므라이스를 선택하셨습니다.");
					System.out.print("일반 돈가스오므라이스와 곱빼기 돈가스오므라이스가 있습니다. 어떤 사이즈를 드시겠습니까? (일반/곱빼기) : ");
					String tonkatsuomriceSize = scanner.next();
					
					if(tonkatsuomriceSize.equals("일반")) {
						System.out.println("돈가스오므라이스 일반 가격은 9000원입니다.");
						cost += 9000;
					}else if(tonkatsuomriceSize.equals("곱빼기")) {
						System.out.println("전메뉴의 곱빼기는 1000원이 추가됩니다. 따라서 돈가스오므라이스 곱빼기 가격은 10000원입니다.");
						cost += 10000;
					}
				}else if(riceSelect == 3) {
					System.out.println("주먹밥을 선택하셨습니다.");
					System.out.println("주먹밥에는 (참치주먹밥, 스팸주먹밥, 김치주먹밥)이 준비되어 있습니다.");
					
					System.out.print("원하시는 주먹밥의 맛을 선택해주세요 : ");
					String rockRice = scanner.next();
					
					switch(rockRice) {
					case "참치주먹밥":
						System.out.println("참치주먹밥을 선택하셨네요!!");
						System.out.println("저희 주먹밥은 손수 손으로 직접 주물러서 만들어서 더더욱 맛있습니다!!");
						System.out.println("참치주먹밥의 가격은 3000원입니다.");
						cost += 3000;
						break;
					case "스팸주먹밥":
						System.out.println("스팸주먹밥을 선택하셨네요!!");
						System.out.println("저희 주먹밥은 손수 손으로 직접 주물러서 만들어서 더더욱 맛있습니다!!");
						System.out.println("스팸주먹밥의 가격은 3000원입니다.");
						cost += 3000;
						break;
					case "김치주먹밥":
						System.out.println("김치주먹밥을 선택하셨네요!!");
						System.out.println("저희 주먹밥은 손수 손으로 직접 주물러서 만들어서 더더욱 맛있습니다!!");
						System.out.println("김치주먹밥의 가격은 3000원입니다.");
						cost += 3000;
						break;
					}
					
				}
			}else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용하시거나 알바생을 불러주세요!!");
				continue;
			}else if(yn.equals("C") || yn.equals("c")) {
				System.out.println("총 주문하신 음식의 가격은 " + cost + "원입니다.");
				System.out.println("항상 저희 DMK 음식점을 이용해주셔서 감사드리고 오늘도 즐거운 시간 보내시기 바랍니다!!");
				break;
			}
			
		}

	}

}
