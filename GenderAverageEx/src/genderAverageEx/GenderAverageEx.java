package genderAverageEx;
import java.util.Scanner;

class Man {
	String play;
	
	public Man() {
		
	}
	
	public static void manMethod() {
		System.out.println("남성분들은 대부분 게임을 좋아합니다.");
	}
}

class Girl {
	String sing;
	
	public Girl() {
		
	}
	
	public static void girlMethod() {
		System.out.println("여성분들은 대부분 노래를 부르는 것을 좋아하며 즐깁니다.");
	}
}

public class GenderAverageEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("지정하시고 싶은 장소를 입력해주세요(노래방/PC방/스터디카페) : ");
		String selectUser = scanner.next();
		
		switch(selectUser){
		case "노래방":
			System.out.println("노래방은 주로 남성분들보다 여성분들이 더 많이 찾으시는 다중이용시설 중 한곳입니다.");
			System.out.println("노래방은 스트레스를 풀기에 좋다는 평이 있습니다.");
			Girl.girlMethod(); //static 메소드를 호출하기 위해선 클래스명을 직접적으로 호출하여 출력
			break;
		case "PC방":
			System.out.println("PC방은 주로 여성분들보단 남성분들이 더 많이 찾으시는 다중이용시설 중 한곳입니다.");
			Man.manMethod();
			break;
		default:
			System.out.println("스터디카페는 남녀를 가리지 않고 남성, 여성 둘 다 자주 찾는 곳입니다.");
			System.out.println("스터디카페에서는 조용한 분위기 속에 자기만의 공부를 하기에 적합한 장소입니다.");
			break;
		}
	}

}
