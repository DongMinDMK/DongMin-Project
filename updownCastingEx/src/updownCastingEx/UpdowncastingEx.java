package updownCastingEx;

class People{
	int age;
	String name;
	int height;
	
	public People() {
		age = 0;
		name = null;
		height = 0;
	}
	
	void walking() {
		System.out.println("사람은 걷습니다.");
	}
	void speaking() {
		System.out.println("사람이 말을 합니다.");
	}
}
class Gildong extends People{

	@Override
	void walking() { //오버라이딩, 부모 클래스의 메소드를 재정의
		System.out.println("길동이가 걷습니다.");
	}

	@Override
	void speaking() {  //오버라이딩, 부모 클래스의 메소드를 재정의
		System.out.println("길동이가 말을 합니다.");
	}
	
	void exercising() { //Gildong 클래스가 갖고 있는 유일 메소드
		System.out.println("길동이가 운동을 합니다.");
	}
	
}

class Chulsu extends People{

	@Override
	void walking() { //오버라이딩, 부모 클래스의 메소드를 재정의
		System.out.println("철수가 걷습니다.");
	}

	@Override
	void speaking() { //오버라이딩, 부모 클래스의 메소드를 재정의
		System.out.println("철수가 말을 합니다.");
	}
	
	void cooking() { //Chulsu 클래스가 갖고 있는 유일 메소드
		System.out.println("철수가 요리를 합니다.");
	}
	
	
}

public class UpdowncastingEx {

	public static void main(String[] args) {
		
		People people = new Gildong(); //업캐스팅, 업캐스팅 수행 시 길동 클래스는 더이상 사용하지 못하며 부모 클래스인 People클래스만 사용가능하다. 하지만 여기서 오버라이딩을 통해 다시 길동 클래스의 오버라이딩 된 메소드는 사용이 가능하다.
		people.walking(); //오버라이딩으로 사용가능
		people.speaking(); //오버라이딩으로 사용가능
		
		Gildong gildong = (Gildong) people; //강제 다운캐스팅, 업캐스팅과 반대로 부모클래스의 멤버변수와 메서드를 사용하지 못하고 다운캐스팅을 했기 때문에 다운캐스팅된 길동 클래스를 다시 사용할 수 있다. 이때 길동 클래스에만 들어있던 메소드(exercising)을 사용할 수 있다.
		gildong.exercising(); //길동 클래스에만 있는 메소드
		
		//chulsu 클래스도 마찬가지이다. 긴 설명은 생략하겠다.
		
		People people2 = new Chulsu(); //업캐스팅
		people2.walking(); //오버라이딩
		people2.speaking(); //오버라이딩
		
		Chulsu chulsu = (Chulsu)people2; //강제 다운캐스팅
		chulsu.cooking(); //철수 클래스에만 있는 메소드
		
		
	}

}
