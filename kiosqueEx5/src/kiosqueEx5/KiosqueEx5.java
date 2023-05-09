package kiosqueEx5;
import java.util.*;

public class KiosqueEx5 {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요. DMK 스터디카페에 오신것을 환영합니다.");
		System.out.println("저희 스터디카페는 회원가입을 하시면 많은 혜택을 누리실 수 있습니다.");
		
		System.out.print("회원가입을 하시겠습니까? (YES/NO)");
		String select = scanner.next();
		
		if(select.equals("yes") || select.equals("YES")) {
			System.out.println("회원가입을 선택하셨습니다.");
			System.out.print("이름을 입력하세요. ");
			String name = scanner.next();
			System.out.print("새로 지정할 아이디를 입력하세요. ");
			String id = scanner.next();
			
			System.out.print("회원가입을 하시겠습니까?(YES/NO)");
			String yesorno = scanner.next();
			
			if(yesorno.equals("yes") || yesorno.equals("YES")) {
				System.out.println("회원가입이 완료되었습니다 !");
				
				System.out.println("회원님은 회원가입을 하셨기에 혜택이 있습니다!");
				System.out.println("음료를 한번 시키시면 공짜로 한번 더 리필해드립니다 !!");
				
				System.out.print("음료를 시키시겠습니까? (YES/NO)");
				String drink = scanner.next();
				
				if(drink.equals("yes") || drink.equals("YES")) {
					System.out.print("음료는 1. 아메리카노 2. 카페라떼 3. 마끼야또 가 있습니다. 원하시는 번호를 입력해주세요. ");
					int coffeeSelect = scanner.nextInt();
					
					if(coffeeSelect == 1) {
						System.out.println("아메리카노를 선택하셨습니다!!");
						System.out.println("아메리카노는 2000원입니다.");
						System.out.println("회원님은 아메리카노를 1번 무료 리필을 받으실 수 있습니다.");
					}
					else if(coffeeSelect == 2) {
						System.out.println("카페라떼를 선택하셨습니다!!");
						System.out.println("카페라떼는 4000원입니다.");
						System.out.println("회원님은 카페라떼를 1번 무료 리필을 받으실 수 있습니다.");
					}
					else if(coffeeSelect == 3) {
						System.out.println("마끼야또를 선택하셨습니다!!");
						System.out.println("마끼야또는 5000원입니다.");
						System.out.println("회원님은 마끼야또를 1번 무료 리필을 받으실 수 있습니다.");
					}
				}
				else if(drink.equals("no") || drink.equals("NO")) {
					System.out.println("음료가 필요하시면 말씀해주세요!");
				}
				
			}
			else if(yesorno.equals("no") || yesorno.equals("NO")) {
				System.out.println("다음에 회원가입을 하시는군요! 꼭 회원가입을 하십시오. 많은 혜택을 누릴 수 있습니다!");
			}
			
		}
		else if(select.equals("no") || select.equals("NO")) {
			System.out.println("비회원을 선택하셨습니다.");
			
			System.out.print("음료를 시키시겠습니까? ");
			String drink1 = scanner.next();
			
			if(drink1.equals("yes") || drink1.equals("YES")) {
				System.out.print("음료는 1. 아메리카노 2. 카페라떼 3. 마끼야또가 있습니다. 원하시는 번호를 입력해주세요. ");
				int coffeeSelect1 = scanner.nextInt();
				
				if(coffeeSelect1 == 1) {
					System.out.println("아메리카노를 선택하셨습니다!!");
					System.out.println("아메리카노는 2500원입니다.");
				}
				else if(coffeeSelect1 == 2) {
					System.out.println("카페라떼를 선택하셨습니다!!");
					System.out.println("카페라떼는 4500원입니다.");
				}
				else if(coffeeSelect1 == 3) {
					System.out.println("마끼야또를 선택하셨습니다!!");
					System.out.println("마끼야또는 5500원입니다.");
				}
			}
			else if(drink1.equals("no") || drink1.equals("NO")) {
				System.out.println("음료가 필요하실 때 콜해주세요!");
			}
			
		}
		
		System.out.println("항상 저희 DMK 스터디카페를 이용해주셔서 감사합니다!");
		System.out.println("즐거운 시간 되십시오!");

	}

}
