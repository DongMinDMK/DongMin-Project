package studycafeEx;
import java.util.Scanner;

class StudyCafe{
	int cost;
	String beverage;
	
	public StudyCafe(int cost, String beverage) {
		this.cost = cost;
		this.beverage = beverage;
	}
	
	public void studycafeMethod() {
		System.out.println("스터디 카페 " + this.cost + "원 정액을 이용하셨군요!!");
		System.out.println(this.beverage + "도 시키셨네요!!");
	}
}

public class StudyCafeEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("안녕하세요!! DMK 스터디카페입니다.");
			System.out.println("1시간 이용은 1500원, 3시간 이용은 3000원 5시간 이용은 4500원 10시간 이용은 10000원입니다.");
			System.out.print("원하시는 사용시간을 입력해주시고 돈을 넣어주세요!(1/3/5/10) : ");
			int useTime = scanner.nextInt();
			
			if(useTime == 1) { //1시간 이용
				System.out.print("음료수도 시키시겠습니까? : (네/아니오) : ");
				String beverageSelect = scanner.next();
				
				if(beverageSelect.equals("네")) {
					System.out.print("원하시는 음료수를 입력해주세요(아이스티/아메리카노/스무디) : ");
					String orderBeverage = scanner.next();
					
					if(orderBeverage.equals("아이스티")) {
						StudyCafe sc = new StudyCafe(1500, "아이스티");
						sc.studycafeMethod();
						
					}else if(orderBeverage.equals("아메리카노")) {
						StudyCafe sc = new StudyCafe(1500, "아메리카노");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("스무디")) {
						StudyCafe sc = new StudyCafe(1500, "스무디");
						sc.studycafeMethod();
					}
				}else if(beverageSelect.equals("아니오")) {
					System.out.println("1시간 이용 1500원을 결제되었습니다!");
				}
				System.out.println("즐거운 시간 되세요!!");
				break;
			}else if(useTime == 3) { //3시간 이용
				System.out.print("음료수도 시키시겠습니까? : (네/아니오) : ");
				String beverageSelect = scanner.next();
				
				if(beverageSelect.equals("네")) {
					System.out.print("원하시는 음료수를 입력해주세요(아이스티/아메리카노/스무디) : ");
					String orderBeverage = scanner.next();
					
					if(orderBeverage.equals("아이스티")) {
						StudyCafe sc = new StudyCafe(3000, "아이스티");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("아메리카노")) {
						StudyCafe sc = new StudyCafe(3000, "아메리카노");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("스무디")) {
						StudyCafe sc = new StudyCafe(3000, "스무디");
						sc.studycafeMethod();
					}
				}else if(beverageSelect.equals("아니오")) {
					System.out.println("3시간 이용 3000원을 결제되었습니다!");
				}
				System.out.println("즐거운 시간 되세요!!");
				break;
			}else if(useTime == 5) { //5시간이용
				System.out.print("음료수도 시키시겠습니까? : (네/아니오) : ");
				String beverageSelect = scanner.next();
				
				if(beverageSelect.equals("네")) {
					System.out.print("원하시는 음료수를 입력해주세요(아이스티/아메리카노/스무디) : ");
					String orderBeverage = scanner.next();
					
					if(orderBeverage.equals("아이스티")) {
						StudyCafe sc = new StudyCafe(4500, "아이스티");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("아메리카노")) {
						StudyCafe sc = new StudyCafe(4500, "아메리카노");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("스무디")) {
						StudyCafe sc = new StudyCafe(4500, "스무디");
						sc.studycafeMethod();
					}
				}else if(beverageSelect.equals("아니오")) {
					System.out.println("5시간 이용 5000원을 결제되었습니다!");
				}
				
				System.out.println("즐거운 시간 되세요!!");
				break;
			}else if(useTime == 10) {
				System.out.print("음료수도 시키시겠습니까? : (네/아니오) : ");
				String beverageSelect = scanner.next();
				
				if(beverageSelect.equals("네")) {
					System.out.print("원하시는 음료수를 입력해주세요(아이스티/아메리카노/스무디) : ");
					String orderBeverage = scanner.next();
					
					if(orderBeverage.equals("아이스티")) {
						StudyCafe sc = new StudyCafe(10000, "아이스티");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("아메리카노")) {
						StudyCafe sc = new StudyCafe(10000, "아메리카노");
						sc.studycafeMethod();
					}else if(orderBeverage.equals("스무디")) {
						StudyCafe sc = new StudyCafe(10000, "스무디");
						sc.studycafeMethod();
					}
				}else if(beverageSelect.equals("아니오")) {
					System.out.println("10시간 이용 10000원을 결제되었습니다!");
				}
				System.out.println("즐거운 시간 되세요!!");
				break;
			}else {
				System.out.println("괄호 안에 있는 숫자를 입력해주세요!!");
				continue;
			}

		}
	}

}
