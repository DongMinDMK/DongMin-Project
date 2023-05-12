package overroadAndoverridingEx;

class School{
	String korea;
	String math;
	String eng;
	String pt;
	
	public School(String korea, String math, String eng, String pt) {
		this.korea = korea;
		this.math = math;
		this.eng = eng;
		this.pt = pt;
	}

	public void show() {
		System.out.println("남녀공학 중학교입니다.");
	}
	
	public void study(String korea, String math, String eng) { //오버로딩 : 메소드의 매개변수가 바로 밑의 메소드와 다름. 메소드의 이름은 같음.
		System.out.println("학교에서 " + this.korea + " 과목, " + this.math + " 과목, " + this.eng + " 과목을 배우고 있습니다.");
	}
	
	public void study(String korea, String math, String eng, String pt) { //오버로딩 : 메소드의 매개변수가 다름.
		System.out.println("학교에서 " + this.korea + " 과목, " + this.math + " 과목, " + this.eng + " 과목, " + this.pt + " 과목을 배우고 있습니다.");
	}
	
	
	
}

class ManSchool extends School{
	String computer;
	
	public ManSchool(String korea, String math, String eng, String pt, String computer) {
		super(korea, math, eng, pt); //부모 School 클래스의 생성자 매개변수를 먼저 호출. 그럴때 super()를 사용, 매개변수 있는 생성자를 호출하여야 함. 왜냐하면 부모클래스가 기본 생성자가 아닌 매개변수가 있는 생성자로 설정되었기 때문, 즉 super는 재사용 - 덧붙임
		this.computer = computer; //ManSchool 만에만 있는 computer 멤버변수 선언
	}
	@Override
	public void show() { //오버라이딩
		System.out.println("남자 중학교 입니다."); //부모클래스의 show 메소드를 자식클래스에서 재정의
	}
	public void study() {
		System.out.println("학교에서 " + korea + " 과목, " + math + " 과목, " + eng + " 과목, " + pt + " 과목, " + this.computer + " 과목을 배우고 있습니다.");
	} //부모클래스를 상속을 받았기에 korea, math, eng, pt와 원래의 자식 멤버변수인 computer까지 사용할 수 있음.
	
}

class WomanSchool extends School{
	String gajong;
	
	public WomanSchool(String korea, String math, String eng, String pt, String gajong) {
		super(korea, math, eng, pt); //부모 School 클래스의 생성자 매개변수를 먼저 호출. 그럴때 super()를 사용
		this.gajong = gajong; //WomanSchool 만에만 있는 gajong 멤버변수 선언
	}
	
	@Override
	public void show() { //오버라이딩
		System.out.println("여자 중학교 입니다."); //부모클래스의 show 메소드를 자식클래스에서 재정의
	}
	
	public void study() {
		System.out.println("학교에서 " + korea + " 과목, " + math + " 과목, " + eng + " 과목, " + pt + " 과목, " + this.gajong + " 과목을 배우고 있습니다.");
	}//부모클래스를 상속을 받았기에 korea, math, eng, pt와 원래의 자식 멤버변수인 gajong까지 사용할 수 있음.
	
}

public class OverroadAndOverridingEx {

	public static void main(String[] args) {
		
		School school = new School("국어", "수학", "영어", "체육");
		ManSchool mSchool = new ManSchool("국어", "수학", "영어", "체육", "컴퓨터");
		WomanSchool wSchool = new WomanSchool("국어", "수학", "영어", "체육", "가정");
		
		school.show();
		school.study("국어", "수학", "영어");
		school.study("국어", "수학", "영어", "체육"); //오버로딩
		System.out.println();
		
		mSchool.show(); //오버라이딩
		mSchool.study();
		System.out.println();
		
		wSchool.show(); //오버라이딩
		wSchool.study();
		
		System.out.println();
		ManSchool mSchool1 = new ManSchool("사회", "과학", "화학", "지구과학", "물리");
		mSchool1.show();
		mSchool1.study();
	
		
	

	}

}
