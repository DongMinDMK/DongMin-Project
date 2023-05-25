package practiceEx;

class Animal{
	String ear;
	String eyes;
	String leg;
	
	public Animal(String ear, String eyes, String leg) {
		this.ear = ear;
		this.eyes = eyes;
		this.leg = leg;
	}
	
	@Override
	public String toString() {
		return "Animal [ear=" + ear + ", eyes=" + eyes + ", leg=" + leg + "]";
	}



	public void show() {
		System.out.println("모든 동물들은 귀와 눈 그리고 다리를 가지고 태어납니다.");
	}
	

}

class Bear extends Animal{
	String power;
	
	public Bear(String ear, String eyes, String leg, String power) {
		super(ear, eyes, leg);
		this.power = power;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("더하여 곰은 힘을 가집니다.");
	}
}

class Monkey extends Animal{
	String fast;
	
	public Monkey(String ear, String eyes, String leg, String fast) {
		super(ear, eyes, leg);
		this.fast = fast;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("더하여 원숭이는 재빠르고 민첩합니다.");
	}
	
	
}

class Tiger extends Animal{
	String brave;
	
	public Tiger(String ear, String eyes, String leg, String brave) {
		super(ear, eyes, leg);
		this.brave = brave;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("호랑이는 멋있고 용감합니다.");
	}
	
	
}

public class OverridingandtoStringEx {

	public static void main(String[] args) {
		
		Animal animal = new Animal("귀", "눈", "다리");
		System.out.println(animal.toString());
		
		Bear bear = new Bear("귀", "눈", "다리", "힘");
		bear.show();
		
		Monkey monkey = new Monkey("귀", "눈", "다리", "재빠름");
		monkey.show();
		
		Tiger tiger = new Tiger("귀", "눈", "다리", "용감함");
		tiger.show();
		
		

	}

}
