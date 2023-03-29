import java.util.*;
public class switch_and_caseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("**** DMK 스터디 카페 입니다 !!! ****");
		System.out.println("먼저 회원가입을 진행하여 주십시오!!");
		System.out.print("1. 당일정액 2. 월정액 중 원하는 번호를 선택해주세요. ");
		int money = scanner.nextInt();
		
		int sum = 0;
		int mon_sum = 0;
		
		switch(money)
		{
		case 1 :
			System.out.println("당일정액을 선택하셨습니다.");
			System.out.print("1. 1000원 1시간 30분, 2. 2000원 3시간, 3. 3000원 4시간 30분을 충전할 수 있습니다. 원하는 번호를 입력해주세요. ");
			int time = scanner.nextInt();
			switch(time)
			{
			case 1:
				System.out.println("1시간 30분이 충전되었습니다!");
				sum += 1000;
				break;
			case 2:
				System.out.println("3시간이 충전되었습니다!");
				sum += 2000;
				break;
			case 3:
				System.out.println("4시간 30분이 충전되었습니다!");
				sum += 3000;
				break;
				
			}
			System.out.println("총 납부하실 당일 정액은 " + sum + "원 입니다.");
			break;
			
		case 2:
			System.out.println("월정액을 선택하셨습니다.");
			System.out.print("1. 10000원 12시간, 2. 20000원 24시간, 3. 30000원 36시간, 4. 40000원 50시간을 충전할 수 있습니다. 원하는 번호를 입력해주세요. ");
		    int mon_time = scanner.nextInt();
			switch(mon_time)
			{
			case 1:
			    System.out.println("12시간이 충전되었습니다!");
			    mon_sum += 10000;
			    break;
			case 2:
				System.out.println("24시간이 충전되었습니다!");
				mon_sum += 20000;
				break;
			case 3:
				System.out.println("36시간이 충전되었습니다!");
				mon_sum += 30000;
				break;
			case 4:
				System.out.println("50시간이 충전되었습니다!");
				mon_sum += 40000;
				break;
			}
			System.out.println("총 납부하실 월 정액은 " + mon_sum + "원 입니다.");
			break;
			
		}
		
		System.out.println("스터디 카페에서 자바 공부 화이팅!!");
		
	

	}

}