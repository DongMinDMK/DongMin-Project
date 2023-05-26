package practiceEx;

class Cafe{
	String person;
	String machine;
	String chair;
	String desk;
	
	public Cafe() {
		
	}
	public Cafe(String person, String machine, String chair, String desk) {
		this.person = person;
		this.machine = machine;
		this.chair = chair;
		this.desk = desk;
	}
	
	public void introduce() {
		System.out.println("저희 카페에는 " + this.person + ", " + this.machine + ", " + this.chair + ", " + this.desk + "이 있습니다.");
	}
	
	public void welcome() {
		System.out.println("환영합니다 !!");
	}
	
	
}

class Coffee extends Cafe{
	String americano;
	String latte;
	String caramelmacchiato;
	String iceTea;
	
	public Coffee(String person, String machine, String chair, String desk, String americano, String latte, String caramelmacchiato, String iceTea) {
		super(person, machine, chair, desk);
		this.americano = americano;
		this.latte = latte;
		this.caramelmacchiato = caramelmacchiato;
		this.iceTea = iceTea;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("또한 저희가 판매하는 커피는 " + this.americano + ", " + this.latte + ", " + this.caramelmacchiato + ", " + this.iceTea + "를 판매하고 있습니다.");
	}
	
	public void taste() {
		System.out.println("커피를 드셔보시고 맛을 평가해주십시오!");
	}
	
	
}

class Drink extends Cafe{
	String milk;
	String strawbarryMilk;
	String chocolateMilk;
	String juice;
	
	public Drink(String person, String machine, String chair, String desk, String milk, String strawbarryMilk, String chocolateMilk, String juice) {
		super(person, machine, chair, desk);
		this.milk = milk;
		this.strawbarryMilk = strawbarryMilk;
		this.chocolateMilk = chocolateMilk;
		this.juice = juice;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("또한 저희 카페는 다양한 음료수도 판매하고 있습니다. 종류로는 " + this.milk + ", " + this.strawbarryMilk + ", " + this.chocolateMilk + ", " + this.juice + "를 판매합니다.");
	}
	
	public void cheap() {
		System.out.println("현재 저희 카페 음료수는 매우 값싼 가격으로 할인행사중입니다. 많은 이용부탁드립니다.");
	}
	
}

public class OverridingUpDownCastingEx {

	public static void main(String[] args) {
		Cafe cafe = new Cafe("사람", "기계", "의자", "책상");
		Coffee coffee = new Coffee("사람", "기계", "의자", "책상", "아메리카노", "라떼", "카랴멜마끼야또", "아이스티");
		Drink drink = new Drink("사람", "기계", "의자", "책상", "우유", "딸기우유", "초코유유", "쥬스");
		
		cafe.introduce();
		cafe.welcome();
		
		coffee.introduce();
		coffee.taste();
		
		drink.introduce();
		drink.cheap();
		
		System.out.println("------------------------------------------------------------");
		
		Cafe cafe2 = (Cafe)coffee; //업캐스팅(자식 클래스 사용못함, 부모클래스 멤버변수와 메소드 사용가능 -> 하지만 오버라이딩은 예외, 오버라이딩된 메소드가 있으면 오버라이딩된 자식 클래스의 메소드 사용가능)
		cafe2.introduce(); //오버라이딩 메소드
		cafe2.welcome();
		
		Coffee coffee2 = (Coffee)cafe2; //다운캐스팅(강제로 부모클래스에서 자식클래스로 형변환, 이러면 부모클래스의 멤버변수와 메소드는 사용못함, 형변환한 자식클래스의 멤버변수와 메소드를 사용할 수 있음. 자식클래스만 가지고 있는 메소드를 사용할 때 다운캐스팅을 사용하기도함.)
		coffee2.taste(); //Coffee클래스에만 있는 taste 메소드를 다운캐스팅을 통해서 강제 호출
		
		//Drink클래스도 위에 설명동일
		
		Cafe cafe3 = (Cafe)drink; //업캐스팅
		cafe3.introduce();
		cafe3.welcome();
		
		Drink drink2 = (Drink)cafe3; //다운캐스팅
		drink2.cheap();
	}

}
