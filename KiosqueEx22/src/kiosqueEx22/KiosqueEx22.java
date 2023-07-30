package kiosqueEx22;

import java.util.Scanner;

public class KiosqueEx22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int asCost = 0;
		
		System.out.print("안녕하세요 DMK 서비스센터입니다. 수리하시겠습니까?(네/아니오) : ");
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			while(true) {
				System.out.print("수리하실 기기를 선택해주세요 1. 노트북 2. 휴대폰 3. 휴대폰액정 4. AS비 결제 : ");
				int selectAS = scanner.nextInt();
				
				if(selectAS == 1) {
					System.out.println("노트북 수리를 요청하셨습니다.");
					System.out.println("노트북 수리 결과 30000원 AS 비용이 나왔습니다.");
					asCost += 30000;
				}else if(selectAS == 2) {
					System.out.println("휴대폰 수리를 요청하셨습니다.");
					System.out.println("휴대폰 수리 결과 20000원 AS 비용이 나왔습니다.");
					asCost += 20000;
				}else if(selectAS == 3) {
					System.out.println("휴대폰액정 수리를 요청하셨습니다.");
					System.out.println("휴대폰액정 수리 결과 10000원 AS 비용이 나왔습니다.");
					asCost += 10000;
				}else {
					System.out.println("AS비를 결제하도록 하겠습니다.");
					System.out.print("현재 AS비용은 총 " + asCost + "원입니다. 결제를 진행하시겠습니까?(네/아니오) :  ");
					String asYesSelect = scanner.next();
					
					if(asYesSelect.equals("네")) {
						System.out.print("제안하실 금액을 입력해주세요 : ");
						int userCost = scanner.nextInt();
						
						if(userCost > asCost) {
							System.out.println("결제를 진행합니다....");
							System.out.println("거스름돈 " + (userCost - asCost) + "원이 반환되었습니다.");
							System.out.println("오늘도 저희 DMK 서비스센터를 이용해주셔서 감사합니다.");
							System.out.println("후기를 홈페이지에서 설문조사로 남겨주시기 바랍니다.");
							break;
						}else if(userCost < asCost) {
							System.out.println("주신 금액이 부족하여 결제를 진행하실 수 없습니다.");
							continue;
						}else if(userCost == asCost) {
							System.out.println("결제를 진행합니다....");
							System.out.println("오늘도 저희 DMK 서비스센터를 이용해주셔서 감사합니다.");
							System.out.println("후기를 홈페이지에서 설문조사로 남겨주시기 바랍니다.");
							break;
						}
					}else if(asYesSelect.equals("아니오")) {
						System.out.println("결제를 진행하시기 않으시기에 메인화면으로 돌아갑니다.");
						System.out.println("장바구니에 넣으셨던 물건의 금액은 유지됩니다.");
						continue;
					}
				}
			}
		}else if(yesorno.equals("아니오")) {
			System.out.println("서비스가 필요하실 때 앞에 키오스크를 이용해서 접수를 진행하여 주세요");
		}
	}

}
