package randomLottoEx;
import java.util.Scanner;

public class RandomLottoEx {

	public static void main(String[] args) {
		int lotto[][] = {{3,6,9,12,15,18,21},
						 {1,5,2,3,8,13,15},
						 {3,2,8,13,18,25,33},
						 {10,13,2,18,25,24,23},
						 {20,25,44,45,33,40,48}};
		
		Scanner scanner = new Scanner(System.in);
		String userSelectNum = "";
		
		System.out.print("당첨 숫자 7개를 입력해주세요(띄어쓰기 하지말고 입력) : ");
		userSelectNum = scanner.next();
		
		boolean isCorrect = false; //당첨되면 true로 바뀌고 디폴트는 false로 설정
		
		for(int i=0; i<lotto.length; i++) {
			String lottoSelectNumber = "";
			
			for(int j=0; j<lotto[i].length; j++) { //반복문을 돌면서 한 행의 나온 숫자들을 하나의 번호로 만들어서 lottoSelectNumber에 저장
				lottoSelectNumber += lotto[i][j];
				
			}
			
			if(userSelectNum.equals(lottoSelectNumber)) {
				isCorrect = true;
				break;
			}
		}
		
		if(isCorrect) { //isCorrect가 true 이면
			System.out.println(userSelectNum + "번은 당첨입니다!!");
		}else {
			System.out.println(userSelectNum + "이 번호는 당첨번호가 아닙니다.");
		}
	}

}
