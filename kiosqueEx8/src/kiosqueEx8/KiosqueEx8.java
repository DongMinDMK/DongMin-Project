package kiosqueEx8;
import java.util.Scanner;

public class KiosqueEx8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 치킨 입니다.");
		while(true) {
		System.out.print("주문을 원하시면 YES를 눌러주시고 종료를 원하시면 종료를 눌러주세요 : ");
		String order = scanner.next();
		
		if(order.equals("YES") || order.equals("yes")) {
			System.out.println("주문하기를 선택하셨습니다.");
			System.out.println("저희 DMK 치킨은 1. 후라이드 치킨 2. 양념치킨 3. 후라이드반/양념반 4. 간장치킨 등 4가지 치킨 종류를 판매하고 있습니다.");
			System.out.print("원하시는 치킨의 번호를 눌러주세요.");
			int select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("후라이드 치킨을 선택하셨습니다.");
				System.out.print("후라이드 치킨은 순살과 뼈로 나눠져 있습니다. 순살과 뼈 중 어떤것을 원하십니까?(순살/뼈) ");
				String select2 = scanner.next();
				
				if(select2.equals("순살")) {
					System.out.println("후라이드 순살을 선택하셨습니다.");
					System.out.println("후라이드 순살은 14000원입니다.");
					cost += 14000;
				}else if(select2.equals("뼈")) {
					System.out.println("후라이드 뼈를 선택하셨습니다.");
					System.out.println("후라이드 뼈는 12500원입니다.");
					cost += 12500;
				}
			}else if(select == 2) {
				System.out.println("양념 치킨을 선택하셨습니다.");
				System.out.print("양념 치킨은 순살과 뼈로 나눠져 있습니다. 순살과 뼈 중 어떤것을 원하십니까?(순살/뼈) ");
				String select2 = scanner.next();
				
				if(select2.equals("순살")) {
					System.out.println("양념 순살을 선택하셨습니다.");
					System.out.println("양념 순살은 16000원입니다.");
					cost += 16000;
				}else if(select2.equals("뼈")) {
					System.out.println("양념 뼈를 선택하셨습니다.");
					System.out.println("양념 뼈는 14500원입니다.");
					cost += 14500;
				}
			}else if(select == 3) {
				System.out.println("후라이드반/양념반 치킨을 선택하셨습니다.");
				System.out.print("후라이드반/양념반 치킨은 순살과 뼈로 나눠져 있습니다. 순살과 뼈 중 어떤것을 원하십니까?(순살/뼈) ");
				String select2 = scanner.next();
				
				if(select2.equals("순살")) {
					System.out.println("후라이드반/양념반 순살을 선택하셨습니다.");
					System.out.println("후라이드반/양념반 순살은 17000원입니다.");
					cost += 17000;
				}else if(select2.equals("뼈")) {
					System.out.println("후라이드반/양념반 뼈를 선택하셨습니다.");
					System.out.println("후라이드반/양념반 뼈는 15500원입니다.");
					cost += 15500;
				}
			}else if(select == 4) {
				System.out.println("간장 치킨을 선택하셨습니다.");
				System.out.print("간장 치킨은 순살과 뼈로 나눠져 있습니다. 순살과 뼈 중 어떤것을 원하십니까?(순살/뼈) ");
				String select2 = scanner.next();
				
				if(select2.equals("순살")) {
					System.out.println("간장치킨 순살을 선택하셨습니다.");
					System.out.println("간장치킨 순살은 15000원입니다.");
					cost += 17000;
				}else if(select2.equals("뼈")) {
					System.out.println("간장치킨 뼈를 선택하셨습니다.");
					System.out.println("간장치킨 뼈는 13000원입니다.");
					cost += 13000;
				}
			}
		  }else if(order.equals("종료")) {
			  System.out.println("현재 시키신 치킨의 가격은 " + cost + "원입니다.");
			  System.out.println("항상 저희 DMK치킨을 이용해주셔서 감사합니다.");
			  break;
		  }
		
		}
	}

}
