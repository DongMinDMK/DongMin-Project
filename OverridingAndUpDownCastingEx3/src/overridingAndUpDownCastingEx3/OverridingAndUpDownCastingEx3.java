package overridingAndUpDownCastingEx3;

interface Animal{
	public abstract void run();
	public abstract void walk();
}

class Human implements Animal{
	int age;
	String name;
	String gender;
	
	public Human(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public void run() { //인터페이스를 상속받아 오버라이딩
		System.out.println("사람이 뜁니다.");
		System.out.println("사람이 뛰면서 주위를 살펴봅니다.");
	}

	@Override
	public void walk() { //인터페이스를 상속받아 오버라이딩
		System.out.println("사람이 걷습니다.");
	}
	
	public void help() {
		System.out.println("사람이 도움을 요청합니다.");
	}
	
	public void show() {
		System.out.println("사람의 나이는 " + this.age + "살이고, 이름은 " + this.name + "이며, 성별은 " + this.gender + "입니다.");
	}
	
	
}

class Lion implements Animal{
	int age;
	String name;
	String gender;
	
	public Lion(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public void run() {
		System.out.println("사자가 뜁니다.");
		System.out.println("사자가 뛰면서 주위를 살펴봅니다.");
	}

	@Override
	public void walk() {
		System.out.println("사자가 걷습니다.");
	}
	
	public void hear() {
		System.out.println("사자는 귀가 발달되어 먹잇감의 소리를 잘듣습니다.");
	}
	
	public void show2() {
		System.out.println(this.age + "살짜리 사자는 이름이 " + this.name + "이며, 성별은 " + this.gender + "입니다.");
	}
	
}

class Tiger implements Animal{
	int age;
	String name;
	String gender;
	
	public Tiger(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public void run() {
		System.out.println("호랑이가 뜁니다.");
		System.out.println("호랑이가 뛰면서 주위를 살펴봅니다.");
	}

	@Override
	public void walk() {
		System.out.println("호랑이가 걷습니다.");
	}
	
	public void smellandeyes() {
		System.out.println("호랑이는 후각과 시각이 발달되어있어 먹잇감을 사냥할때 후각과 시각으로 사냥합니다.");
	}
	
	public void show3() {
		System.out.println(this.age + "살 호랑이는 이름이 " + this.name + "이며, 성별은 " + this.gender + "입니다.");
	}

}

public class OverridingAndUpDownCastingEx3 {

	public static void main(String[] args) {
		
		Animal animal = new Human(26, "홍길동", "남성"); //업캐스팅
		animal.run();
		animal.walk();
		
		Human human = (Human)animal; //다운캐스팅
		human.help();
		human.show();
		
		System.out.println();
		
		Animal animal2 = new Lion(5, "대한", "여성"); //업캐스팅
		animal2.run();
		animal2.walk();
		
		Lion lion = (Lion)animal2; //다운캐스팅
		lion.hear();
		lion.show2();
		
		System.out.println();
		
		Animal animal3 = new Tiger(3, "민국", "여성"); //업캐스팅
		
		animal3.run();
		animal3.walk();
		
		Tiger tiger = (Tiger)animal3; //다운캐스팅
		tiger.smellandeyes();
		tiger.show3();
		

	}

}
