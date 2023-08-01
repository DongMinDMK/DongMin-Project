package throwsExceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionEx {
	
	//메서드 내부에서 try-catch문으로 예외를 처리할 수도 있지만 메서드 내부에서 try-catch문 예외처리를 하지않고, 해당 메서드를 호출한 쪽에 try-catch문을 작성하여 예외를 처리할 수 있도록 함.
	//이유 : 메서드에서 예외를 각각 처리하면 자체의 코드가 길어지거나 유지보수 측면에서 효율이 떨어질 수 있다. 따라서 메서드를 호출한 쪽에서 예외처리 try-catch문을 적으면 좀 더 수월하게 처리가 가능함.
	
	public static void checkYourBodySelf(Scanner scanner) throws InputMismatchException {
		System.out.println("1. 사람들과 어울려 지내는 외향적인 성격인 것 같다 2. 사람들과 어울리는것보단 혼자만의 시간과 생활을 즐겨갖는 내향적인 성격인 것 같다. ");
		System.out.print("선택해주세요 >> ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.println("당신의 MBTI는 ENFP에 가깝네요!!");
		}else if(select == 2) {
			System.out.println("당신의 MBTI는 ISFP에 가깝네요!!");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("------------------- 개인 성격의 유형을 검사하겠습니다. -------------------");
			
			ThrowsExceptionEx.checkYourBodySelf(scanner);
		} catch (Exception e) {
			System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
