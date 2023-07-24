package kiosqueEx21;

import java.util.Scanner;

public class KiosqueEx21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.print("안녕하세요 DMK 국수집입니다. 주문하시겠습니까? (네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.println("저희 국수집은 다양한 면 종류를 판매하고 있습니다.");
				System.out.print("잔치국수, 비빔국수, 옹골면, 김치말이국수 중 원하시는 메뉴를 선택해주세요 : ");
				String noodleSelect = scanner.next();
				
				if(noodleSelect.equals("잔치국수")) {
					System.out.println("잔치국수를 선택하셨습니다.");
					System.out.print("일반을 드시겠습니까 아니면 곱빼기를 드시겠습니까? (일반/곱빼기) : ");
					String noodleAmount = scanner.next();
					
					if(noodleAmount.equals("일반")) {
						System.out.println("잔치국수 일반을 선택하셨습니다.");
						System.out.println("잔치국수 일반은 7000원입니다.");
						cost += 7000;
					}else if(noodleAmount.equals("곱빼기")) {
						System.out.println("잔치국수 곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("잔치국수 곱빼기의 가격은 8000원입니다.");
						cost += 8000;
					}
				}else if(noodleSelect.equals("비빔국수")) {
					System.out.println("비빔국수를 선택하셨습니다.");
					System.out.print("일반을 드시겠습니까 아니면 곱빼기를 드시겠습니까? (일반/곱빼기) : ");
					String noodleAmount = scanner.next();
					
					if(noodleAmount.equals("일반")) {
						System.out.println("비빔국수 일반을 선택하셨습니다.");
						System.out.println("비빔국수 일반은 8000원입니다.");
						cost += 8000;
					}else if(noodleAmount.equals("곱빼기")) {
						System.out.println("비빔국수 곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("비빔국수 곱빼기의 가격은 9000원입니다.");
						cost += 9000;
					}
				}else if(noodleSelect.equals("옹골면")) {
					System.out.println("옹골면을 선택하셨습니다.");
					System.out.print("일반을 드시겠습니까 아니면 곱빼기를 드시겠습니까? (일반/곱빼기) : ");
					String noodleAmount = scanner.next();
					
					if(noodleAmount.equals("일반")) {
						System.out.println("옹골면 일반을 선택하셨습니다.");
						System.out.println("옹골면 일반은 5000원입니다.");
						cost += 5000;
					}else if(noodleAmount.equals("곱빼기")) {
						System.out.println("옹골면 곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("옹골면 곱빼기의 가격은 6000원입니다.");
						cost += 6000;
					}
				}else if(noodleSelect.equals("김치말이국수")) {
					System.out.println("김치말이국수를 선택하셨습니다.");
					System.out.print("일반을 드시겠습니까 아니면 곱빼기를 드시겠습니까? (일반/곱빼기) : ");
					String noodleAmount = scanner.next();
					
					if(noodleAmount.equals("일반")) {
						System.out.println("김치말이국수 일반을 선택하셨습니다.");
						System.out.println("김치말이국수 일반은 9000원입니다.");
						cost += 9000;
					}else if(noodleAmount.equals("곱빼기")) {
						System.out.println("김치말이국수 곱빼기를 선택하셨습니다.");
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("김치말이국수 곱빼기의 가격은 10000원입니다.");
						cost += 10000;
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문이 필요하시면 앞에 키오스크를 이용해주세요!");
			}else if(yesorno.equals("계산")) {
				System.out.print("카드로 계산하시겠습니까? 아니면 현금으로 계산하시겠습니까? ");
				String cardCashSelect = scanner.next();
				
				if(cardCashSelect.equals("카드")) {
					System.out.println("카드를 선택하셨습니다.");
					System.out.print("결제하시겠습니까? (네/아니오) : ");
					String cardSelect = scanner.next();
					
					if(cardSelect.equals("네")) {
						System.out.println("카드를 넣어주세요!!");
						System.out.println("결제가 완료되었습니다!!");
						System.out.println("항상 저희 DMK 국수집을 이용해주셔서 감사합니다. 즐거운 시간 되세요!!");
						break;
					}else if(cardSelect.equals("아니오")) {
						System.out.println("메인 메뉴로 돌아갑니다...");
						continue;
					}
				}else if(cardCashSelect.equals("현금")) {
					System.out.print("투입할 현금을 넣어주세요 : ");
					int cashSelect = scanner.nextInt();
					
					if(cashSelect > cost) {
						System.out.print("거스름돈 " + (cashSelect - cost) + "원을 반환하시겠습니까? (네/아니오) : ");
						String cashYesorNo = scanner.next();
						if(cashYesorNo.equals("네")) {
							System.out.println("거스름돈 " + (cashSelect - cost) + "원을 드리겠습니다.");
							System.out.println("이용해주셔서 감사합니다!");
							System.out.println("항상 저희 DMK 국수집을 이용해주셔서 감사합니다. 즐거운 시간 되세요!!");
							break;
						}
					}else if(cashSelect < cost) {
						System.out.println("납부하신 금액의 비용이 모자라 결제를 진행하실 수 없습니다.");
						continue;
					}
				}
			}
		}
	}

}
