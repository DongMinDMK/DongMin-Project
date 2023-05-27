package movieEx;
import java.util.*;

public class MovieCountEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		System.out.println("환영합니다. DMK 영화관입니다.");
		
		System.out.println("저희 영화관은 현재 1. 트랜스포머 2. 아이언맨 3. 헐크 4. 박물관이살아있다 4개의 영화를 상영중입니다.");
		System.out.print("원하시는 영화를 선택해주세요. >> ");
		int movieSelect = scanner.nextInt();
		
		switch(movieSelect) {
		case 1:
			System.out.println("트랜스포머 영화를 선택하셨습니다.");
			System.out.println("트랜스포머 영화는 2D, 3D, 4D 영화를 시청하실 수 있습니다. 어느 분류의 영화를 시청하시겠습니까? (2D/3D/4D)");
			String category = scanner.next();
			
			if(category.equals("2D") || category.equals("2d")) {
				System.out.println("2D를 선택하셨습니다.");
				System.out.println("2D의 가격은 10000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category.equals("3D") || category.equals("3d")) {
				System.out.println("3D를 선택하셨습니다.");
				System.out.println("3D의 가격은 15000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category.equals("4D") || category.equals("4d")) {
				System.out.println("4D를 선택하셨습니다.");
				System.out.println("4D의 가격은 20000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}
			break;
		case 2:
			System.out.println("아이언맨 영화를 선택하셨습니다.");
			System.out.println("아이언맨 영화는 2D, 3D, 4D 영화를 시청하실 수 있습니다. 어느 분류의 영화를 시청하시겠습니까? (2D/3D/4D)");
			String category2 = scanner.next();
			
			if(category2.equals("2D") || category2.equals("2d")) {
				System.out.println("2D를 선택하셨습니다.");
				System.out.println("2D의 가격은 10000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category2.equals("3D") || category2.equals("3d")) {
				System.out.println("3D를 선택하셨습니다.");
				System.out.println("3D의 가격은 15000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category2.equals("4D") || category2.equals("4d")) {
				System.out.println("4D를 선택하셨습니다.");
				System.out.println("4D의 가격은 20000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}
			break;
		case 3:
			System.out.println("헐크 영화를 선택하셨습니다.");
			System.out.println("헐크 영화는 2D, 3D, 4D 영화를 시청하실 수 있습니다. 어느 분류의 영화를 시청하시겠습니까? (2D/3D/4D)");
			String category3 = scanner.next();
			
			if(category3.equals("2D") || category3.equals("2d")) {
				System.out.println("2D를 선택하셨습니다.");
				System.out.println("2D의 가격은 10000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category3.equals("3D") || category3.equals("3d")) {
				System.out.println("3D를 선택하셨습니다.");
				System.out.println("3D의 가격은 15000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category3.equals("4D") || category3.equals("4d")) {
				System.out.println("4D를 선택하셨습니다.");
				System.out.println("4D의 가격은 20000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}
			break;
		case 4:
			System.out.println("박물관이 살아있다 영화를 선택하셨습니다.");
			System.out.println("박물관이 살아있다 영화는 2D, 3D, 4D 영화를 시청하실 수 있습니다. 어느 분류의 영화를 시청하시겠습니까? (2D/3D/4D)");
			String category4 = scanner.next();
			
			if(category4.equals("2D") || category4.equals("2d")) {
				System.out.println("2D를 선택하셨습니다.");
				System.out.println("2D의 가격은 10000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category4.equals("3D") || category4.equals("3d")) {
				System.out.println("3D를 선택하셨습니다.");
				System.out.println("3D의 가격은 15000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}else if(category4.equals("4D") || category4.equals("4d")) {
				System.out.println("4D를 선택하셨습니다.");
				System.out.println("4D의 가격은 20000원입니다.");
				System.out.println("즐거운 시간 되십시오");
			}
			break;
		}
		
		System.out.println("항상 저희 영화관을 이용해주셔서 감사합니다.");
		System.out.println("조만간 많은 이벤트를 진행할 예정이니 관심 부탁드립니다.");
		

	}

}
