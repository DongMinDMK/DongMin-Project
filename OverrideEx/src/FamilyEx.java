import java.util.*;
public class FamilyEx {

	public static void main(String[] args) {
		Family fm = new Family(4);
		fm.show();
		
		Family fm1 = new Father(5, 60, "남성", "등산하기"); //Family 부모 클래스를 이용해서 상속을 받아 Father 자식 클래스 객체로 생성
		fm1.show(); // show() 매소드의 오버라이딩 으로 가족의 수를 재정의
		
		Family fm2 = new Mother(6, 56, "여성", "산책하기"); //Family 부모 클래스를 이용해서 상속을 받아 Mother 자식 클래스 객체로 생성
		fm2.show(); // show() 매소드의 오버라이딩 으로 가족의 수를 재정의
		
		Family fm3 = new Sister(7, 29, "여성", "운동하기"); //Family 부모 클래스를 이용해서 상속을 받아 Sister 자식 클래스 객체로 생성
		fm3.show(); // show() 매소드의 오버라이딩 으로 가족의 수를 재정의
		
		Family fm4 = new Me(8, 26, "남성", "음악듣기와 코딩하기"); //Family 부모 클래스를 이용해서 상속을 받아 Me 자식 클래스 객체로 생성
		fm4.show(); // show() 매소드의 오버라이딩 으로 가족의 수를 재정의
		
	}

}
class Family{
	int familyCount;
	
	public Family(int familyCount) {
		this.familyCount = familyCount;
	}
	
	public void show() {
		System.out.println("DMK의 가족은 총 " + familyCount + "명으로 구성되어 있습니다.");
	}
}

class Father extends Family{
	int age;
	String gender;
	String hobby;
	
	public Father(int familyCount, int age, String gender, String hobby) {
		super(familyCount); //부모클래스(Family)의 생성자 호출
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	@Override
	public void show() {
		System.out.println("가족의 수는 총 " + familyCount + "명으로 구성되어 있고, 아빠의 나이는 " + this.age + "세, 성별은 " + this.gender + ", 취미는 " + this.hobby + "입니다.");
	}
	
}

class Mother extends Family{
	int age;
	String gender;
	String hobby;
	
	public Mother(int familyCount, int age, String gender, String hobby) {
		super(familyCount);
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	@Override
	public void show() {
		System.out.println("가족의 수는 총 " + familyCount + "명으로 구성되어 있고, 엄마의 나이는 " + this.age + "세, 성별은 " + this.gender + ", 취미는 " + this.hobby + "입니다.");
	}
}

class Sister extends Family{
	
	int age;
	String gender;
	String hobby;
	
	public Sister(int familyCount, int age, String gender, String hobby) {
		super(familyCount);
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	@Override
	public void show() {
		System.out.println("가족의 수는 총 " + familyCount + "명으로 구성되어 있고, 누나의 나이는 " + this.age + "세, 성별은 " + this.gender + ", 취미는 " + this.hobby + "입니다.");
	}
}

class Me extends Family{
	int age;
	String gender;
	String hobby;
	
	public Me(int familyCount, int age, String gender, String hobby) {
		super(familyCount);
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	@Override
	public void show() {
		System.out.println("가족의 수는 총 " + familyCount + "명으로 구성되어 있고, 나(DMK)의 나이는 " + this.age + "세, 성별은 " + this.gender + ", 취미는 " + this.hobby + "입니다.");
	}
}