package kiosqueEx15;
import java.util.*;

public class KiosqueEx15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.println("환영합니다. DMK 코인노래방입니다. ");
			System.out.println("원하시는 버튼을 클릭해주세요(4곡 1000원, 8곡 2000원, 12곡 3000원, 20곡 5000원, 50곡 10000원, 곡추가)");
			System.out.print("몇곡을 하실건지 입력해주세요(4/8/12/20/50/ 곡추가 -> (1) 선택) : ");
			int userSelect = scanner.nextInt();
			
			if(userSelect == 4) {
				System.out.println("4곡을 선택하셨습니다.");
				System.out.println("1000원입니다.");
				System.out.println("즐거운 시간 되시기 바랍니다.");
				cost += 1000;
				System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
			}else if(userSelect == 8) {
				System.out.println("8곡을 선택하셨습니다.");
				System.out.println("2000원입니다.");
				System.out.println("즐거운 시간 되시기 바랍니다.");
				cost += 2000;
				System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
			}else if(userSelect == 12) {
				System.out.println("12곡을 선택하셨습니다.");
				System.out.println("3000원입니다.");
				System.out.println("즐거운 시간 되시기 바랍니다.");
				cost += 3000;
				System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
			}else if(userSelect == 20) {
				System.out.println("20곡을 선택하셨습니다.");
				System.out.println("5000원입니다.");
				System.out.println("즐거운 시간 되시기 바랍니다.");
				cost += 5000;
				System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
			}else if(userSelect == 50) {
				System.out.println("50곡을 선택하셨습니다.");
				System.out.println("10000원입니다.");
				System.out.println("즐거운 시간 되시기 바랍니다.");
				cost += 10000;
				System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
			}else if(userSelect == 1) {
				System.out.println("곡추가를 선택하셨습니다.");
				System.out.print("몇곡을 추가하시겠습니까? (4/8/12/20/50) : ");
				int userAddSelect = scanner.nextInt();
				
				if(userAddSelect == 4) {
					System.out.println("4곡을 추가하겠습니다.");
					System.out.println("1000원이 추가됩니다.");
					cost += 1000;
					System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
					break;
				}else if(userAddSelect == 8) {
					System.out.println("8곡을 추가하겠습니다.");
					System.out.println("2000원이 추가됩니다.");
					cost += 2000;
					System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
					break;
				}else if(userAddSelect == 12) {
					System.out.println("12곡을 추가하겠습니다.");
					System.out.println("3000원이 추가됩니다.");
					cost += 3000;
					System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
					break;
				}else if(userAddSelect == 20) {
					System.out.println("20곡을 추가하겠습니다.");
					System.out.println("5000원이 추가됩니다.");
					cost += 5000;
					System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
					break;
				}else if(userAddSelect == 50) {
					System.out.println("50곡을 추가하겠습니다.");
					System.out.println("10000원이 추가됩니다.");
					cost += 10000;
					System.out.println("총 결제하실 금액은 " + cost + "원입니다.");
					break;
				}
			}
			
		}
		
		System.out.println("항상 저희 DMK 노래방을 찾아주셔서 감사합니다.");

	}

}
