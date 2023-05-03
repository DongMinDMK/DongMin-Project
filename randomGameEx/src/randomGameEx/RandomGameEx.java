package randomGameEx;
import java.util.*;

public class RandomGameEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("랜덤으로 숫자를 지정하여 그 랜덤으로 지정된 숫자를 맞추는 코드를 작성합니다.");
		System.out.println("숫자는 1~100까지로 제한합니다. 여기서 랜덤으로 지정되는 숫자를 하나씩 줄여가며 맞춰보세요!!");
		System.out.println("사용자님에게는 20번의 기회가 있습니다!");
		
		boolean corrected = false; //나중에 랜덤으로 지정된 숫자를 맞추면 true로 변환
		
		int randomNumber = (int)(Math.random()*100)+1;
		
		for(int i=0; i<20; i++) {
			System.out.print("어느 숫자를 입력하시겠습니까? ");
			int myThinkingNum = scanner.nextInt();
			
			if(myThinkingNum == randomNumber) {
				corrected = true;
				System.out.println("오 정답을 맞추셨군요!! 잘하셨습니다 !!");
				System.out.println("사용자님께서는 " + (i+1) + "번째에서 정답을 맞추셨습니다!");
				break;
			}
			
			else if(myThinkingNum > randomNumber) {
				System.out.println("사용자님께서 입력하신 숫자는 랜덤으로 지정된 숫자보다 큽니다. 좀 더 작은 숫자를 입력해보세요!");
			}
			else if(myThinkingNum < randomNumber) {
				System.out.println("사용자님께서 입력하신 숫자는 램덤으로 지정된 숫자보다 작습니다. 좀 더 큰 숫자를 입력해보세요!");
			}
		}
		
		if(!corrected) {
			System.out.println("20번 안에 정답을 맞추시지 못하셨습니다.");
			System.out.println("아쉽네요!! 다음번엔 꼭 맞추시기를 바랍니다.");
		}
		
		
		
	}

}
