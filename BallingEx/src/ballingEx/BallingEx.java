package ballingEx;

import java.util.Scanner;

public class BallingEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("안녕하세요 DMK 볼링센터입니다. 오신 여러분들을 환영합니다!");
		System.out.print("볼링을 치시기 전에 몇 세트를 치실 건지 결정하셔야 합니다. 몇 세트를 치시겠습니까?(1세트/2세트/3세트/4세트) : ");
		String selectSet = scanner.next();
		
		switch(selectSet) {
		case "1세트":
			int money1 = 3000;
			System.out.println("1세트를 선택하셨습니다.");
			System.out.print("몇명이 오셨습니까? : ");
			int count1 = scanner.nextInt();
			
			if(count1 > 0) {
				System.out.println("성인 1명당 가격은 1세트당 3000원을 받고 있습니다.");
			}
			
			System.out.println("따라서 총 " + (money1*count1) + "원이 나오셨습니다.");
			
			System.out.print("선 결제를 진행하신 후 볼링을 이용하실 수 있습니다. 결제하시겠습니까? (네/아니오) : ");
			String yesorno1 = scanner.next();
			
			if(yesorno1.equals("네")) {
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userPay = scanner.nextInt();
				
				if(userPay > (money1*count1)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("거스름돈 " + ((userPay-(money1*count1))) + "원입니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}else if(userPay < (money1*count1)) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					break;
				}else if(userPay == (money1*count1)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}
			}else if(yesorno1.equals("아니오")) {
				System.out.println("결제하시고 볼링을 이용하실 수 있습니다. 참고바랍니다!");
				break;
			}
		case "2세트":
			int money2 = 6000;
			System.out.println("2세트를 선택하셨습니다.");
			System.out.print("몇명이 오셨습니까? : ");
			int count2 = scanner.nextInt();
			
			if(count2 > 0) {
				System.out.println("성인 1명당 가격은 1세트당 3000원을 받고 있습니다.");
			}
			
			System.out.println("따라서 총 " + (money2*count2) + "원이 나오셨습니다.");
			
			System.out.print("선 결제를 진행하신 후 볼링을 이용하실 수 있습니다. 결제하시겠습니까? (네/아니오) : ");
			String yesorno2 = scanner.next();
			
			if(yesorno2.equals("네")) {
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userPay = scanner.nextInt();
				
				if(userPay > (money2*count2)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("거스름돈 " + ((userPay-(money2*count2))) + "원입니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}else if(userPay < (money2*count2)) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					break;
				}else if(userPay == (money2*count2)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}
			}else if(yesorno2.equals("아니오")) {
				System.out.println("결제하시고 볼링을 이용하실 수 있습니다. 참고바랍니다!");
				break;
			}
			
		case "3세트":
			int money3 = 9000;
			System.out.println("3세트를 선택하셨습니다.");
			System.out.print("몇명이 오셨습니까? : ");
			int count3 = scanner.nextInt();
			
			if(count3 > 0) {
				System.out.println("성인 1명당 가격은 1세트당 3000원을 받고 있습니다.");
			}
			
			System.out.println("따라서 총 " + (money3*count3) + "원이 나오셨습니다.");
			
			System.out.print("선 결제를 진행하신 후 볼링을 이용하실 수 있습니다. 결제하시겠습니까? (네/아니오) : ");
			String yesorno3 = scanner.next();
			
			if(yesorno3.equals("네")) {
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userPay = scanner.nextInt();
				
				if(userPay > (money3*count3)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("거스름돈 " + ((userPay-(money3*count3))) + "원입니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}else if(userPay < (money3*count3)) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					break;
				}else if(userPay == (money3*count3)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}
			}else if(yesorno3.equals("아니오")) {
				System.out.println("결제하시고 볼링을 이용하실 수 있습니다. 참고바랍니다!");
				break;
			}
			
		case "4세트":
			int money4 = 12000;
			System.out.println("4세트를 선택하셨습니다.");
			System.out.print("몇명이 오셨습니까? : ");
			int count4 = scanner.nextInt();
			
			if(count4 > 0) {
				System.out.println("성인 1명당 가격은 1세트당 3000원을 받고 있습니다.");
			}
			
			System.out.println("따라서 총 " + (money4*count4) + "원이 나오셨습니다.");
			
			System.out.print("선 결제를 진행하신 후 볼링을 이용하실 수 있습니다. 결제하시겠습니까? (네/아니오) : ");
			String yesorno4 = scanner.next();
			
			if(yesorno4.equals("네")) {
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userPay = scanner.nextInt();
				
				if(userPay > (money4*count4)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("거스름돈 " + ((userPay-(money4*count4))) + "원입니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}else if(userPay < (money4*count4)) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					break;
				}else if(userPay == (money4*count4)) {
					System.out.println("정상적으로 결제가 처리되었습니다.");
					System.out.println("정상적으로 결제가 처리되었습니다.");
					break;
				}
			}else if(yesorno4.equals("아니오")) {
				System.out.println("결제하시고 볼링을 이용하실 수 있습니다. 참고바랍니다!");
				break;
			}
			
		}

	}

}
