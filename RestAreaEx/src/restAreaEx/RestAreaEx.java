package restAreaEx;

import java.util.Scanner;

public class RestAreaEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		
		while(true) {
			System.out.println("DMK 휴게소입니다. DMK 휴게소에는 정말 다양한 음식들을 판매하고 있습니다.");
			System.out.print("1. 호두과자 2. 소떡소떡 3. 통감자 4. 닭강정 5. 계산 을 판매하고 있습니다. 원하시는 음식의 번호를 입력해주세요(5번의 계산) : ");
			int foodSelect = scanner.nextInt();
			
			if(foodSelect == 1) { //호두과자
				System.out.println("호두과자를 선택하셨습니다.");
				System.out.println("호두과자는 최저 3000원치부터 3000, 5000, 7000, 10000원 어치를 판매하고 있습니다.");
				System.out.print("원하시는 호두과자의 가격을 입력해주세요(3000/5000/7000/10000) : ");
				int nutSnackPrice = scanner.nextInt();
				
				if(nutSnackPrice == 3000) {
					System.out.println("호두과자 3000원어치를 선택하셨습니다.");
					System.out.println("호두과자 3000원어치는 12개가 들어가있습니다.");
					price += 3000;
				}else if(nutSnackPrice == 5000) {
					System.out.println("호두과자 5000원어치를 선택하셨습니다.");
					System.out.println("호두과자 5000원어치는 18개가 들어가있습니다.");
					price += 5000;
				}else if(nutSnackPrice == 7000) {
					System.out.println("호두과자 7000원어치를 선택하셨습니다.");
					System.out.println("호두과자 7000원어치는 25개가 들어가있습니다.");
					price += 7000;
				}else if(nutSnackPrice == 10000) {
					System.out.println("호두과자 10000원어치를 선택하셨습니다.");
					System.out.println("호두과자 10000원어치는 40개가 들어가있습니다.");
					price += 10000;
				}
			}else if(foodSelect == 2) { //소떡소떡
				System.out.println("소떡소떡을 선택하셨습니다.");
				System.out.println("소떡소떡의 가격은 4000원입니다.");
				System.out.println("소떡소떡에는 떡과 소시지가 같이 있는 떡입니다. 떡과 소시지를 같이 먹으면 맛이 2배입니다.");
				price += 4000;
			}else if(foodSelect == 3) { //통감자
				System.out.println("통감자를 선택하셨습니다.");
				System.out.println("통감자의 가격은 6000원입니다.");
				price += 6000;
			}else if(foodSelect == 4) { //닭강정
				System.out.println("닭강정을 선택하셨습니다.");
				System.out.print("닭강정의 사이즈를 선택해주세요 사이즈는 소,중,대 가 준비되어 있습니다.(소/중/대) : ");
				String chickenSize = scanner.next();
				
				if(chickenSize.equals("소")) {
					System.out.println("닭강정의 소 사이즈를 선택하셨습니다.");
					System.out.println("닭강정의 소 사이즈의 가격은 12000원입니다.");
					price += 12000;
				}else if(chickenSize.equals("중")) {
					System.out.println("닭강정의 중 사이즈를 선택하셨습니다.");
					System.out.println("닭강정의 중 사이즈의 가격은 15000원입니다.");
					price += 15000;
				}else if(chickenSize.equals("대")) {
					System.out.println("닭강정의 대 사이즈를 선택하셨습니다.");
					System.out.println("닭강정의 대 사이즈의 가격은 18000원입니다.");
					price += 18000;
				}
			}else if(foodSelect == 5) { //계산
				System.out.print("계산하시겠습니까?(네/아니오) : ");
				String yesorno = scanner.next();
				
				if(yesorno.equals("네")) {
					System.out.print("지불하실 금액을 입력해주세요 : ");
					int userPay = scanner.nextInt();
					
					if(userPay > price) {
						System.out.println("거스름돈을 지불해드리겠습니다. ");
						System.out.println("거스름돈 : " + (userPay - price));
						System.out.println("저희 DMK 휴게소를 이용해주셔서 감사합니다. 즐거운 하루 되세요!");
						break;
					}else if(userPay < price) {
						System.out.println("지불하신 금액이 부족해 결제를 해드릴 수 없습니다.");
					}else {
						System.out.println("저희 DMK 휴게소를 이용해주셔서 감사합니다.");
						break;
					}
					
				}
			}
		}

	}

}
