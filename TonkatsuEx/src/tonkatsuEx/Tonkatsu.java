package tonkatsuEx;
import java.util.Scanner;

public class Tonkatsu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		String arr[] = {"왕돈가스", "일반돈가스", "등심돈가스", "안심돈가스", "등심+등심 돈가스", "안심+안심 돈가스", "등심+안심 돈가스"};
		
		
		System.out.print("환영합니다!! DMK 돈가스음식점입니다. 주문하시겠습니까? (네/아니오) : ");
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			System.out.println("저희 음식점에는 (왕돈가스, 일반돈가스, 등심돈가스, 안심돈가스, 등심+등심돈가스, 안심+안심돈가스, 등심+안심돈가스 등) 여러가지 돈가스를 판매하고 있습니다.");
			System.out.println("------------- (괄호 안에 있는 문자열 그대로 입력해야 함!! 오타나면 출력안됨) ------------------");
			System.out.print("원하시는 돈가스의 이름을 입력해주세요 (왕돈가스, 일반돈가스, 등심돈가스, 안심돈가스, 등심+등심돈가스, 안심+안심돈가스, 등심+안심돈가스) : ");
			String tonkatsu = scanner.next();
			
			for(int i=0; i<1; i++) {
				switch(tonkatsu) {
				case "왕돈가스" :
					arr[i] = "왕돈가스";					
					System.out.println("왕돈가스를 선택하셨습니다!!!");
					cost = 8000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "일반돈가스" :
					arr[i] = "일반돈가스";					
					System.out.println("일반돈가스를 선택하셨습니다!!!");
					cost = 9000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "등심돈가스" :
					arr[i] = "등심돈가스";					
					System.out.println("등심돈가스를 선택하셨습니다!!!");
					cost = 10000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "안심돈가스" :
					arr[i] = "안심돈가스";					
					System.out.println("안심돈가스를 선택하셨습니다!!!");
					cost = 8000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "등심+등심돈가스":
					arr[i] = "등심+등심돈가스";					
					System.out.println("등심+등심돈가스를 선택하셨습니다!!!");
					cost = 11000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "안심+안심돈가스" :
					arr[i] = "안심+안심돈가스";					
					System.out.println("안심+안심돈가스를 선택하셨습니다!!!");
					cost = 11000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				case "등심+안심돈가스" :
					arr[i] = "등심+안심돈가스";					
					System.out.println("등심+안심돈가스를 선택하셨습니다!!!");
					cost = 13000;
					System.out.println(arr[i] + " : " + cost + "원");
					break;
				}
				System.out.println(arr[i] + "을 선택하셨군요!! 잘선택하셨습니다!!");
				System.out.print(cost + "원을 결제하시겠습니까?(네) : ");
				String yesorno2 = scanner.next();
				
				if(yesorno2.equals("네")) {
					System.out.println("항상 저희 DMK 돈가스점을 이용해주셔서 감사합니다!!");
					
				}
			}
			
		}else if(yesorno.equals("아니오")) {
			System.out.println("주문하실 때 직원을 호출해주세요!");
		}
		
		
		

	}

}
