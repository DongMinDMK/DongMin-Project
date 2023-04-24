package healthDMKEx;
import java.util.*;

public class healthEx {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("DMK 헬스클럽입니다.");
		
		while(true) {
		
		System.out.print("1. 당일권, 2. 월 회원권, 3.결제할 금액 4. 종료 중 하나를 선택하세요.");
		int number = scanner.nextInt();
		
		if(number == 4) {
			System.out.println("종료합니다.");
			break;
		}
		else if(number == 1) {
			System.out.println("당일권을 선택하셨습니다.");
			System.out.print("당일권은 1. 1000원(1시간 30분), 2. 3000원 (5시간), 3. 5000원 (10시간)입니다. 원하시는 번호를 선택해주세요.");
			int todayNumber = scanner.nextInt();
			if(todayNumber == 1) {
				System.out.println("1000원을 선택하셨습니다.");
				sum += 1000;
			}
			else if(todayNumber == 2) {
				System.out.println("3000원을 선택하셨습니다.");
				sum += 3000;
			}
			else if(todayNumber == 3) {
				System.out.println("5000원을 선택하셨습니다.");
				sum += 5000;
			}
			System.out.println("현재 " + sum + "원이 결제하실 금액입니다.");
		}
		else if(number == 2) {
			System.out.println("월 회원권을 선택하셨습니다.");
			System.out.println("월 회원권은 10000원 이상부터이며, 적립이 가능합니다.");
			System.out.print("월 회원권은 1. 10000원(15시간), 2. 15000원(20시간), 3. 20000원(25시간), 4. 30000원(30시간)입니다. 원하시는 번호를 선택해주세요.");
			int monthNumber = scanner.nextInt();
			if(monthNumber == 1) {
				System.out.println("10000원을 선택하셨습니다.");
				sum += 10000;
			}
			else if(monthNumber == 2) {
				System.out.println("15000원을 선택하셨습니다.");
				sum += 15000;
			}
			else if(monthNumber == 3) {
				System.out.println("20000원을 선택하셨습니다.");
				sum += 20000;
			}
			else if(monthNumber == 4) {
				System.out.println("30000원을 선택하셨습니다.");
				sum += 30000;
			}
			System.out.println("현재 " + sum + "원이 지불하실 금액입니다.");
			
		}
		else if(number == 3) {
				System.out.println("총 결제할 금액은 " + sum + "원 입니다.");
				System.out.println("DMK 헬스클럽을 이용해주셔셔 감사합니다. 좋은 하루 되세요!!!");
			}
		
		}

	}

}
