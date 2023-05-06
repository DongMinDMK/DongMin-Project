package kiosqueEx2;
import java.util.*;

public class KiosqueEx2 {
	static void americano(Scanner scanner) { //아메리카노
		System.out.println("아메리카노를 선택하셨습니다.");
		System.out.print("아메리카노는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
	    String iceorhot = scanner.next();
	    
	    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
	    	System.out.println("아이스 아메리카노를 선택하셨습니다.");
	    	System.out.println("아이스 아메리카노의 가격은 2000원입니다. 주문해주셔서 감사합니다.");
	    }
	    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
	    	System.out.println("따뜻한 아메리카노를 선택하셨습니다.");
	    	System.out.println("따뜻한 아메리카노의 가격은 1500원입니다. 주문해주셔서 감사합니다.");
	   }
	}
	static void cafeLatte(Scanner scanner){ //카페라떼
		System.out.println("카페라떼를 선택하셨습니다.");
		System.out.print("카페라떼는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
	    String iceorhot = scanner.next();
	    
	    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
	    	System.out.println("아이스 카페라떼를 선택하셨습니다.");
	    	System.out.println("아이스 카페라떼의 가격은 3500원입니다. 주문해주셔서 감사합니다.");
	    }
	    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
	    	System.out.println("따뜻한 카페라떼를 선택하셨습니다.");
	    	System.out.println("따뜻한 카페라떼의 가격은 3000원입니다. 주문해주셔서 감사합니다.");
	   }
	}
	static void caramelMacchiato(Scanner scanner){
		System.out.println("카라멜 마끼야또를 선택하셨습니다.");
		System.out.print("카라멜 마끼야또는 (ICE/HOT)으로 구분되어 있습니다. ICE로 드시겠습니까? HOT으로 드시겠습니까? ");
	    String iceorhot = scanner.next();
	    
	    if(iceorhot.equals("ICE") || iceorhot.equals("ice")) {
	    	System.out.println("아이스 카라멜 마끼야또를 선택하셨습니다.");
	    	System.out.println("아이스 카라멜 마끼야또의 가격은 4500원입니다. 주문해주셔서 감사합니다.");
	    	
	    	
	    }
	    else if(iceorhot.equals("HOT") || iceorhot.equals("hot")) {
	    	System.out.println("따뜻한 카라멜 마끼야또를 선택하셨습니다.");
	    	System.out.println("따뜻한 카라멜 마끼야또의 가격은 4000원입니다. 주문해주셔서 감사합니다.");
	    	
	    	
	    }
	}
	static void iceTea(){
		System.out.println("아이스티를 선택하셨습니다.");
		System.out.println("아이스티는 2500원입니다. 주문해주셔서 감사합니다.");
		
	}

	public static void main(String[] args) {
	 //어제 했던 키오스크1 프로젝트에서 음료별로 static 메소드로 하나씩 빼내기	
	
        Scanner scanner = new Scanner(System.in);
        
		while(true) {
		System.out.println("안녕하세요 DMK 카페입니다.");
		System.out.print("음료 주문을 원하시면 (예/아니오)를 눌러주세요.");
		String yesorno = scanner.next();
		
		 if(yesorno.equals("예")) {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.print("저희 DMK 카페에서는 1. 아메리카노 2. 카페라떼 3. 카랴멜 마끼야또 4. 아이스티를 판매합니다. 원하시는 음료의 번호를 입력해주세요. ");
			int drinkSelect = scanner.nextInt();
			
				if(drinkSelect == 1) { //아메리카노
					americano(scanner);
					continue;
				}
				else if(drinkSelect == 2) { //카페라떼
					cafeLatte(scanner);
					continue;
				}
				else if(drinkSelect == 3) { //카라멜 마키야또
					caramelMacchiato(scanner);
					continue;
				}
				else if(drinkSelect == 4) { //아이스티
					iceTea();
					continue;
				}
		 	}
		else if(yesorno.equals("아니오")) {
				System.out.println("주문 하신 음료 재빨리 만들어 갖다드리겠습니다.");
				break;
		    }
		}
		
		System.out.println("항상 저희 DMK 카페를 이용해주셔서 감사합니다.");
		

	}

}
