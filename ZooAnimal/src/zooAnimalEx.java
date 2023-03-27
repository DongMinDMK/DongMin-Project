
public class zooAnimalEx {

	public static void main(String[] args) {
		Animal animal = new Lion("사자", "수컷", "노랑색과 비슷한 황토색");
		animal.run();
		
		System.out.println();
		
		Bear bear = new Bear("곰", "암컷", "갈색");
		bear.run();
		
		System.out.println();
		
		Rabbit rabbit = new Rabbit("토끼", "암컷", "흰색");
		rabbit.run();
		
		System.out.println();
		



	}

}
class Animal{
	String name;
	String gender;
	
	public Animal(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public void run() {
		System.out.println("이 동물의 이름은 " + name  + "이고, 성별은 " + gender + "이며, ");
	}

}

class Lion extends Animal{
	String color;
	
	public Lion(String name, String gender, String color){
		super(name, gender);
		this.color = color;
	}
	
	
	@Override
	public void run(){
		super.run();
		System.out.println("사자의 색은 " + color + " 입니다.");
	}
}

class Bear extends Animal{
	String color;
	
	public Bear(String name, String gender, String color){
		super(name, gender);
		this.color = color;
	}
	
	@Override
	public void run(){
		super.run();
		System.out.println("곰의 색은 " + color + "입니다.");
	}
}

class Rabbit extends Animal{
    String color;
	
	public Rabbit(String name, String gender, String color){
		super(name, gender);
		this.color = color;
	}
	
	@Override
	public void run(){
		super.run();
		System.out.println("토끼의 색은 " + color + "입니다.");
	}
}

