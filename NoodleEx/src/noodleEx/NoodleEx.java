package noodleEx;
import java.util.Scanner;

public class NoodleEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.print("DMK 국수집에 오신것을 환영합니다. 주문하시겠습니가? (네/아니오) : ");
		String orderYesorNo = scanner.next();
		if(orderYesorNo.equals("네")) {
			System.out.print("저희 국수집에는 1. 잔치국수 2. 비빔국수 3. 김치말이국수 를 판매하고 있습니다. 드시고 싶은 국수의 번호를 입력해주세요 : ");
			int noodleSelect = scanner.nextInt();
			
			switch(noodleSelect) {
			case 1:
				System.out.println("잔치국수를 선택하셨습니다.");
				System.out.println("잔치국수는 따뜻한 멸치국물에 나오는 국수가 정말 맛있습니다.");
				System.out.println("잔치국수의 가격은 7000원입니다.");
				cost += 7000;
				break;
			case 2:
				System.out.println("비빔국수를 선택하셨습니다.");
				System.out.println("비빔국수는 김치와 국수를 섞어서 만들며 정말 맛있습니다.");
				System.out.println("비빔국수의 가격은 8000원입니다.");
				cost += 8000;
				break;
			case 3:
				System.out.println("김치말이국수를 선택하셨습니다.");
				System.out.println("김치말이국수는 김치와 국물, 그리고 국수를 섞어서 만들며 정말 맛있습니다.");
				System.out.println("비빔국수의 가격은 9000원입니다.");
				cost += 9000;
				break;
			}
		}else if(orderYesorNo.equals("아니오")) {
			System.out.println("주문하실 때 저희 점원을 호출해주세요");
		}
		
		System.out.print("음식 맛있게 잘 드셨습니까? 계산할까요? (네/아니오) : ");
		String calculate = scanner.next();
		if(calculate.equals("네")) {
			System.out.print("지불하실 금액을 입력해주세요 : ");
			int userPay = scanner.nextInt();
			if(userPay > cost) {
				System.out.println("거스름돈 " + (userPay-cost) + "원을 지급해드리겠습니다.");
				System.out.println("이용해주셔서 감사합니다. 오늘도 즐거운 하루 되세요!");
			}else if(userPay < cost) {
				System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
			}else if(userPay == cost) {
				System.out.println("결제가 완료되었습니다. 이용해주셔서 감사합니다.");
				System.out.println("오늘도 즐거운 하루 되세요!");
			}
		}

	}

}
