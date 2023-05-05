package kiosqueEx1;
import java.util.*;

public class KiosqueEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int money = 0;
		
		while(true) {
		System.out.println("안녕하세요 DMK 카페입니다.");
		System.out.print("음료 주문을 원하시면 (예/아니오)를 눌러주시고, (종료)이라고 입력하시면 현재 주문개수와 주문가격 그리고 평균이 나옵니다. ");
		String yesorno = scanner.next();
		
		 if(yesorno.equals("예")) {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.print("저희 DMK 카페에서는 1. 아메리카노 2. 카페라떼 3. 카랴멜 마끼야또 4. 아이스티를 판매합니다. 원하시는 음료의 번호를 입력해주세요. ");
			int drinkSelect = scanner.nextInt();
			
			if(drinkSelect == 1) {
				System.out.println("아메리카노를 선택하셨습니다.");
				System.out.print("아메리카노는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
			    String iceorhot = scanner.next();
			    
			    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
			    	System.out.println("아이스 아메리카노를 선택하셨습니다.");
			    	System.out.println("아이스 아메리카노의 가격은 2000원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 2000;
			    	continue;
			    }
			    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
			    	System.out.println("따뜻한 아메리카노를 선택하셨습니다.");
			    	System.out.println("따뜻한 아메리카노의 가격은 1500원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 1500;
			    	continue;
			    }
			    
			}
			else if(drinkSelect == 2) {
				System.out.println("카페라떼를 선택하셨습니다.");
				System.out.print("카페라떼는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
			    String iceorhot = scanner.next();
			    
			    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
			    	System.out.println("아이스 카페라떼를 선택하셨습니다.");
			    	System.out.println("아이스 카페라떼의 가격은 3500원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 3500;
			    	continue;
			    }
			    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
			    	System.out.println("따뜻한 카페라떼를 선택하셨습니다.");
			    	System.out.println("따뜻한 카페라떼의 가격은 3000원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 3000;
			    	continue;
			    }
			}
			else if(drinkSelect == 3) {
				System.out.println("카라멜 마끼야또를 선택하셨습니다.");
				System.out.print("카라멜 마끼야또는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
			    String iceorhot = scanner.next();
			    
			    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
			    	System.out.println("아이스 카라멜 마끼야또를 선택하셨습니다.");
			    	System.out.println("아이스 카라멜 마끼야또의 가격은 4500원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 4500;
			    	continue;
			    }
			    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
			    	System.out.println("따뜻한 카라멜 마끼야또를 선택하셨습니다.");
			    	System.out.println("따뜻한 카라멜 마끼야또의 가격은 4000원입니다. 주문해주셔서 감사합니다.");
			    	count++;
			    	money += 4000;
			    	continue;
			    }
			}
			else if(drinkSelect == 4) {
				System.out.println("아이스티를 선택하셨습니다.");
				System.out.println("아이스티는 2500원입니다. 주문해주셔서 감사합니다.");
				count++;
				money += 2500;
			}
		}
		  else if(yesorno.equals("아니오")) {
			System.out.println("주문하실 때 키오스크에 와서 주문해주시기 바랍니다.");
		}
		  else if(yesorno.equals("종료")) {
			   System.out.println("현재 주문하신 음료는 " + count + "개 이며, 주문하신 음료의 총 가격은 " + money + "원 입니다.");
			   System.out.println("현재 주문하신 가격의 평균은 " + (money /count) + "원 입니다.");
			   System.out.println("주문해주셔서 감사합니다. 다음에 또 방문해주세요!");
			   break;
		    }
		}
		
	}

}
