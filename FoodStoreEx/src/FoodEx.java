import java.util.*;
public class FoodEx {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String list[] = new String[5];
        int count = 0;
        System.out.println("안녕하세요. DMK 음식점입니다.");    
		int sum = 0;
		
		String foodName = "";
		while(true) {
	    	System.out.print("원하는 번호를 입력해주세요. 1. 음식 주문하기 2. 주문한 음식 취소하기 3. 결제하기 4. 종료 ");
	    	 int num = scanner.nextInt();
	    	
	    	// 음식 주문하기
	    	if(num == 1) {
	    		System.out.println("음식 주문하기 버튼을 클릭하셨습니다.");
	    		System.out.println("주문 음식에는 1. 김치참치볶음밥 6000원, 2. 김치볶음밥 4500원,  3. 참치볶음밥 5000원,  4. 스파게티 7000원 이 들어있습니다.");
	    		System.out.print("주문할 음식의 번호를 입력해주세요. ");
	    		int orderNum = scanner.nextInt();
	    		
	    		switch(orderNum) {
	    		case 1:
	    			System.out.println("김치참치볶음밥이 추가되었습니다.");
	    			foodName = "김치참치볶음밥";
	    			sum += 6000;
	    			System.out.println("현재 누적금액은 " + sum + "원 입니다.");
	    			list[count] = foodName;
	    			count++;
	    			break;
	    			
				case 2:
	    			System.out.println("김치볶음밥이 추가되었습니다.");
	    			foodName = "김치볶음밥";
	    			sum += 4500;
	    			System.out.println("현재 누적금액은 " + sum + "원 입니다.");
	    			list[count] = foodName;
	    			count++;
	    			break;
	    			
	    		case 3:
	    			System.out.println("참치볶음밥이 추가되었습니다.");
	    			foodName = "참치볶음밥";
	    			sum += 5000;
	    			System.out.println("현재 누적금액은 " + sum + "원 입니다.");
	    			list[count] = foodName;
	    			count++;
	    			break;
	    			
	    		case 4:
	    			System.out.println("스파게티가 추가되었습니다.");
	    			foodName = "스파게티";
	    			sum += 7000;
	    			System.out.println("현재 누적금액은 " + sum + "원 입니다.");
	    			list[count] = foodName;
	    			count++;
	    			break;
	    			
	    		default:
	    			System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요.");
	    			continue;
	    	
	    			
	    		}
	    		
	    		
	        }
	    	//주문한 음식 취소하기
	    	if(num == 2) {
	    		System.out.println("주문한 음식 취소 버튼을 클릭하셨습니다.");
	    		System.out.println("현재 주문 리스트에 들어가있는 목록입니다.");
	    		
	    		for(int i=0; i<count; i++) {
	    			System.out.println(i+1 + ". " + list[i]); 
	    		}
	    		
	    		System.out.print("취소할 음식의 번호를 입력하세요.");
	    		int cancelNum = scanner.nextInt();
	    		
	    		if(1<= cancelNum && cancelNum <= count) {
	    			String cancelFoodMenu = list[cancelNum-1]; // 입력받은 번호를 cancelFoodMenu에 저장
	    			System.out.println(cancelFoodMenu + " 음식이 취소되었습니다."); 
	    			for(int i = cancelNum-1; i<count; i++) { //리스트에 있는 음식을 취소하고 뒤에 있는 음식을 앞으로 땡기는 작업
	    				list[i] = list[i+1];
	    			}
	    			switch(cancelNum) {
	    			case 1:
	    				sum -= 6000;
	    				break;
	    			case 2:
	    				sum -= 4500;
	    				break;
	    			case 3:
	    				sum -= 5000;
	    				break;
	    			case 4:
	    				sum -= 7000;
	    				break;
	    			
	    			}
	    			count--;
	    		}
	    		
	    		
	    	}
	    	// 결제하기
	    	if(num == 3) {
	    		System.out.println("결제하기 버튼을 클릭하셨습니다.");
	    		System.out.println("현재 리스트에 들어있는 값은 " + sum + "원 입니다. 결제하시겠습니까?");
	    		
	    		System.out.print("얼마를 내시겠습니까? ");
	    		int money = scanner.nextInt();
	    		
	    		if(money < sum) {
	    			System.out.println("지불한 금액이 낮아 결제하실 수 없습니다.");
	    			continue;
	    			}
	    		else {
	    			System.out.println(money + "원을 내셨습니다. 거스름돈은 " + (money - sum) + "원 입니다."); 
	    			sum = 0;
	    			count = 0;
	    			for(int i=0; i<5; i++) {
	    				list[i] = "";
	    			}
	    			
	    		}
	    		
	    	}
	    	if(num == 4) {
	    		System.out.println("프로그램을 종료합니다.");
	    		break;
	    	}
	    }

	}

}

