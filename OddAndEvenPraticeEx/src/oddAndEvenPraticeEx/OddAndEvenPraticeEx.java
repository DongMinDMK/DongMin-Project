package oddAndEvenPraticeEx;

import java.util.ArrayList;
import java.util.List;

public class OddAndEvenPraticeEx {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //배열리스트(칸) 생성
		
		for(int i=1; i<20; i++) {
			int random = (int)(Math.random()*50)+1; //1부터 50까지 중에서 랜덤으로 숫자 20개를 뽑음
			list.add(random); //랜덤으로 숫자를 뽑아서 list 배열리스트 칸에 대입
			
		}
		
		System.out.println("랜덤으로 10개를 뽑은 숫자 리스트 : " + list);
		
		//랜덤으로 뽑은 숫자들 중에서 홀수와 짝수를 구분하여 출력하기
		
		System.out.print("홀수 : ");
		for(int i=0; i<list.size(); i++) {
			//list 배열리스트 칸에 들어있는 랜덤으로 뽑은 숫자들을 하나씩 뽑아서 홀수인지 짝수인지 비교
			int oddNumber = list.get(i);
			
			if(oddNumber % 2 == 1) { //홀수이면
				System.out.print(oddNumber + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("짝수 : ");
		for(int i=0; i<list.size(); i++) {
			//list 배열리스트 칸에 들어있는 랜덤으로 뽑은 숫자들을 하나씩 뽑아서 홀수인지 짝수인지 비교
			int evenNumber = list.get(i);
			
			if(evenNumber % 2 == 0) { //짝수이면
				System.out.print(evenNumber + " ");
			}
				
		}
		
		

	}

}
