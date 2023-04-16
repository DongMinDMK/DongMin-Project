import java.util.*;

public class phoneInfoEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("전화번호부에 입력할 수 : ");
		int count = scanner.nextInt();
		
		PhoneInfo[] pInfo = new PhoneInfo[count]; //위에서 입력받은 수만큼 배열 칸 생성
		
		for(int i=0; i<count; i++) {
			pInfo[i] = new PhoneInfo(); //클래스의 객체를 생성하기 위해 배열에 각각의 요소에다가 생성자 생성해서 데이터를 입력받으면 각각의 요소에다가 데이터 대입
		}
		
		for(int i=0; i<pInfo.length; i++) { //pInfo.length 와 count 아무거나 적어도 상관없음 둘다 입력받은 그 개수만큼 반복
			System.out.print("이름, 전화번호, 사는 위치, 나이를 순서대로 입력해주세요 ");
			
			String name1 = scanner.next();
			pInfo[i].name = name1; // 배열 각각의 요소에다가 이름 넣기
			
			String tel1 = scanner.next();
			pInfo[i].tel = tel1; // 배열 각각의 요소에다가 전화번호 넣기
			
			String loc1 = scanner.next();
			pInfo[i].loc = loc1; // 배열 각각의 요소에다가 위치 넣기
		
			int age1 = scanner.nextInt();
			pInfo[i].age = age1; // 배열 각각의 요소에다가 나이 넣기
			
		}
		
		System.out.println("저장하였습니다. 이제 여기서부터 데이터에 입력되어있는 데이터를 검색할 수 있습니다.");
		
		for(int i=0; i<count; i++) {
			System.out.print("검색할 이름 >> 그만 입력하면 종료 ");
			String selectName = scanner.next(); //검색할 이름을 적고 그것은 selectedName 이라는 변수에 대입
			
			if(selectName.equals("그만")) {
				break;
			}
			
			if(selectName.equals(pInfo[i].name)) { //만약 검색할 이름의 이름과 배열에 있는 각각의 요소(칸)의 이름과 같으면
				pInfo[i].show();  // PhoneInfo 클래스에 있는 메소드인 show() 메소드 호출
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		
		}

	}

}

class PhoneInfo{ //PhoneInfo 클래스
	String name;
	String tel;
	String loc;
	int age;
	
	public PhoneInfo() {
		this.name = name;
		this.tel = tel;
		this.loc = loc;
		this.age = age;
	}
	
	
	public void show() {
		System.out.println(this.name + "의 번호는 " + this.tel + "이고, " + this.name + "이 거주하고 있는 지역은 " + this.loc + "이며, 나이는 " + this.age + "입니다.");
	}
	
}
