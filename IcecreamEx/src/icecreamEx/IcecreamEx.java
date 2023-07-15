package icecreamEx;

import java.util.Scanner;

public class IcecreamEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 아이스크림 매점입니다.");
			System.out.print("주문하시겠습니까?(네/아니오/종료) : ");
			
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.println("저희 아이크스림 매점에는 다양한 아이스크림들을 판매하고 있습니다.");
				System.out.print("일단 아이크스림 종류에는 1. 막대아이스크림 2. 콘아이스크림 둘 중 어느것을 드시겠습니까? : ");
				int icecreamSelect = scanner.nextInt();
				
				if(icecreamSelect == 1) {
					System.out.println("막대아이크스림을 선택하셨습니다.");
					System.out.print("막대아이크스림에는 스크류바, 메로나, 비비빅, 와일드바디, 옥동자 등 다양한 막대아이스크림이 판매되고 있습니다. 원하시는 아이스크림의 이름을 입력해주세요(스크류바, 메로나, 비비빅, 와일드바디, 옥동자) : ");
					String stickIcecream = scanner.next();
					
					if(stickIcecream.equals("스크류바")) {
						System.out.println("스크류바 아이스크림을 선택하셨습니다. 스크류바 아이스크림 가격은 세일을 하여 600원입니다.");
						cost += 600;
					}else if(stickIcecream.equals("메로나")) {
						System.out.println("메로나 아이스크림을 선택하셨습니다. 메로나 아이스크림 가격은 세일을 하여 800원입니다.");
						cost += 800;
					}else if(stickIcecream.equals("비비빅")) {
						System.out.println("비비빅 아이스크림을 선택하셨습니다. 비비빅 아이스크림 가격은 세일을 하여 700원입니다.");
						cost += 700;
					}else if(stickIcecream.equals("와일드바디")) {
						System.out.println("와일드바디 아이스크림을 선택하셨습니다. 와일드바디 아이스크림 가격은 세일을 하여 900원입니다.");
						cost += 900;
					}else if(stickIcecream.equals("옥동자")) {
						System.out.println("옥동자 아이스크림을 선택하셨습니다. 옥동자 아이스크림 가격은 세일을 하여 800원입니다.");
						cost += 800;
					}
				}else if(icecreamSelect == 2) {
					System.out.println("콘아이스크림을 선택하셨습니다.");
					System.out.print("콘아이스크림에는 월드콘, 구구콘, 브라브콘 등 다양한 콘아이스크림이 판매되고 있습니다. 원하시는 아이스크림의 이름을 입력해주세요(월드콘, 구구콘, 브라브콘) : ");
					String conIcecream = scanner.next();
					
					if(conIcecream.equals("월드콘")) {
						System.out.println("월드콘을 선택하셨습니다.");
						System.out.println("월드콘의 가격은 1300원입니다.");
						cost += 1300;
					}else if(conIcecream.equals("구구콘")) {
						System.out.println("구구콘을 선택하셨습니다.");
						System.out.println("구구콘의 가격은 1400원입니다.");
						cost += 1400;
					}else if(conIcecream.equals("브라브콘")) {
						System.out.println("브라브콘을 선택하셨습니다.");
						System.out.println("브라브콘의 가격은 1500원입니다.");
						cost += 1500;
					}
				}
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 앞의 직원이나 키오스크를 이용해주세요!");
				continue;
			}else if(order.equals("종료")) {
				System.out.println("와우! 멋진 아이스크림들을 사셨네요!! 총 " + cost + "원이 나왔습니다!");
				System.out.println("오늘도 DMK 아이스크림 매점을 이용해주셔서 감사합니다!");
				break;
			}
		}
		

	}

}
