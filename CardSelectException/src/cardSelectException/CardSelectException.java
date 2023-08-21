package cardSelectException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CardSelectException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//예외처리에 대한 구문을 이해해야한다.
		//여기서는 InputMismatchException 예외처리와 ArrayIndexOutOfBoundsException 예외처리를 다룬다.
		//둘다 중요하고 자주 나오는 예외처리라 잘 알아둘 필요가 있다.
		
		try {
			int cards[] = {3,6,9,1,4,2,11,15};
			System.out.print("몇번째 카드를 뽑으시겠습니까? : ");
			int arrayCardIndex = scanner.nextInt();
			
			System.out.println("뽑은 카드 번호는 " + cards[arrayCardIndex] + "번 이네요!!"); //입력한 인덱스의 해당하는 데이터베이스의 번호를 출력
		}catch (InputMismatchException e) { //사용자가 입력한 인덱스 숫자가 아닌 문자를 입력한 경우 예외처리
			System.out.println("잘못입력하셨습니다. 숫자만 입력해주세요!!");
		}catch(ArrayIndexOutOfBoundsException e) { //배열안에 있는 인덱스의 숫자를 입력한 것이 아닌 배열 안에 없는 인덱스를 사용자가 입력한 경우 예외처리
			System.out.println("데이터베이스에 들어있는 숫자를 입력해주세요!! 입력하신 숫자의 카드는 없습니다.");
		}
		
		System.out.println("종료합니다...");
		scanner.close();

	}

}
