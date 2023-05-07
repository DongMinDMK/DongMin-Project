package coinnoraebangEx;
import java.util.*;

public class CoinNoraebangEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    int count = 0;
	    
	    while(true) {
	    System.out.println("현재 " + count + "명이 사람이 DMK 노래방을 이용하고 있습니다.");	
	    System.out.println();
		System.out.println("DMK 코인 노래방입니다.");
		System.out.println("저희 노래방은 음료와 노래 시간 충전, 노래 코인 충전이 있습니다. 원하시는 서비스를 선택해주세요 ");
		System.out.print("음료 주문은 (음료주문), 노래 시간 충전은 (시간충전), 노래 코인 충전은 (코인충전)으로 입력해주시고, 종료하기를 원하시면 (종료)를 눌러주세요. ");
		String select = scanner.next();
		
			if(select.equals("음료주문")) {
				System.out.println("음료주문을 선택하셨습니다.");
				System.out.print("음료는 1.물 2. 아이스티 3. 옥수수수염차 가 있습니다. 원하시는 음료를 선택해주세요. ");
				int drink = scanner.nextInt();
			
				if(drink == 1) {
					System.out.println("물을 선택하셨습니다.");
					System.out.println("물은 1000원입니다.");
				}
				else if(drink == 2) {
					System.out.println("아이스티를 선택하셨습니다.");
					System.out.println("아이스티는 2000원입니다.");
				}
				if(drink == 3) {
					System.out.println("옥수수수염차를 선택하셨습니다.");
					System.out.println("옥수수수염차는 1500원입니다.");
				}
			}
			else if(select.equals("시간충전")) {
				System.out.println("시간충전을 선택하셨습니다.");
				System.out.println("시간은 30분은 1000원 1시간은 2000원 2시간은 4000원 3시간은 5000원 5시간은 7000원으로 구성되어 있습니다. 원하시는 금액을 선택해주세요.");
				System.out.print("30분을 원하시면 (1000), 1시간은 (2000), 2시간은 (4000), 3시간은 (5000), 5시간은 (7000)으로 입력해주세요. ");
				int time = scanner.nextInt();
			
				if(time == 1000) {
					System.out.println("30분을 선택하셨습니다.");
					System.out.println("1000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(time == 2000) {
					System.out.println("1시간을 선택하셨습니다.");
					System.out.println("2000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(time == 4000) {
					System.out.println("2시간을 선택하셨습니다.");
					System.out.println("4000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(time == 5000) {
					System.out.println("3시간을 선택하셨습니다.");
					System.out.println("5000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(time == 7000) {
					System.out.println("5시간을 선택하셨습니다.");
					System.out.println("7000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
			
			}
			else if(select.equals("코인충전")) {
				System.out.println("코인충전을 선택하셨습니다.");
				System.out.println("코인충전은 1000원 4곡, 2000원 8곡, 3000원 12곡, 4000원 16곡, 5000원 20곡, 10000원 50곡 으로 이루어져 있습니다.");
				System.out.print("4곡을 원하시면 (1000), 8곡을 원하시면 (2000), 12곡을 원하시면 (3000), 16곡을 원하시면 (4000), 20곡을 원하시면 (5000), 50곡을 원하시면 (10000)을 입력해주세요. ");
				int singSelect = scanner.nextInt();
			
				if(singSelect == 1000) {
					System.out.println("4곡을 선택하셨습니다.");
					System.out.println("1000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(singSelect == 2000) {
					System.out.println("8곡을 선택하셨습니다.");
					System.out.println("2000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
					
				}
				else if(singSelect == 3000) {
					System.out.println("12곡을 선택하셨습니다.");
					System.out.println("3000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
				}
				else if(singSelect == 4000) {
					System.out.println("16곡을 선택하셨습니다.");
					System.out.println("4000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
				}
				else if(singSelect == 5000) {
					System.out.println("20곡을 선택하셨습니다.");
					System.out.println("5000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
				}
				else if(singSelect == 10000) {
					System.out.println("50곡을 선택하셨습니다.");
					System.out.println("10000원을 결제하시고 즐거운 시간 되시기를 바랍니다.");
					System.out.println("항상 저희 노래방을 이용해주셔서 감사합니다.");
					count++;
				}
			
			}
			else if(select.equals("종료")) {
				break;
			}
	    }

	}

}
