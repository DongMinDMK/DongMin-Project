package interfaceAndinterfaceextends;

interface Animal{
	public abstract void run();
	public abstract void born();
}

class Person implements Animal{ 
	String hear;
	int leg;
	
	
	public Person() {
		
	}
	
	@Override
	public void run() {
		System.out.println("사람은 동물이며, 2발로 뛸 수 있습니다.");
	}

	@Override
	public void born() {
		System.out.println("동물은 아기를 낳습니다.");
	} 
	
}

class Mammal extends Person implements Animal{ //클래스와 클래스끼리 상속, 클래스에서 인터페이스 Animal 상속

	int leg;
	
	public Mammal(int leg) {
		this.leg = leg;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("포유류는 대부분 " + this.leg + "발로 뛸 수 있습니다.");
	}

	@Override
	public void born() {
		super.born();
		System.out.println("포유류는 대표적인 아기를 낳는 종이라고 할 수 있습니다.");
		
	}
	
}



public class InterfaceAndInterfaceExtendsEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.run();
		person.born();
		
		System.out.println();
		
		Mammal mammal = new Mammal(4); 
		
		//mammal 메소드를 호출했지만 person 클래스를 갔다가옴(super 메소드 때문)
		mammal.run();
		mammal.born();
		
		//person클래스를 먼저 호출하는것을 볼 수 있음(부모클래스를 상속받기 때문)
		
	}

}
