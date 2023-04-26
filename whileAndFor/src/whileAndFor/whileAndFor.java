package whileAndFor;
import java.util.*;

public class whileAndFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("While문과 For문을 사용하는 간단한 코드를 작성합니다.");
		
		int array[] = new int[5];
		
		int switchTest = 3;
		
		while(true) { //while문의 무한루프, break문을 만나야 빠져나옴
			System.out.println("무수히 반복되는 코드입니다. 그만을 입력해야 빠져나옴");
			System.out.println("계속 무한반복합니다.");
			System.out.println("그만을 입력하고 빠져나와야 다음 단계를 도전할 수 있습니다.");
			String meetingBreak = scanner.next();
					
			if(meetingBreak.equals("그만")) {
				break;
			}
			
		}
		
		for(int i=0; i<5; i++) {
			System.out.print("정수 5개를 입력하세요.");
			int number = scanner.nextInt();
			
			array[i] = number;
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Switch-Case 문으로 break문을 안만났을때는 테스트합니다. switchTest의 초깃값은 3으로 넣었습니다.");
		switch(switchTest) {
		case 1:
			switchTest++;
			break;
		case 2:
			switchTest--;
			break;
		case 3:
			switchTest+=10; //여기가 중요함!! 일부러 break문을 안넣었음 switch-case문은 break문이 없으면 마지막까지 쭉 수행
		case 4:
			switchTest-=10;
		case 5:
			switchTest++;
		case 6:
			switchTest--;
		case 7:
			switchTest+=100;
		case 8:
			switchTest+=200;
		case 9:
			switchTest-=10;
		default:
			switchTest+=1000;
		
		}
		
		System.out.println("break문을 안적고나서 쭉 수행된 switchTest는 " + switchTest + "값이 나오게 된다.");
		
		
	}

}


