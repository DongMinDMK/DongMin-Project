package overringAndUpDownCastingEx7;

interface Cafe{
	final int CAFE_SIZE = 300; //인터페이스에서는 변수선언과 생성자, 메소드 선언을 불가하지만, 상수선언과 추상메소드 선언은 가능하다.
	//상수선언된 값은 한번 만들어놓으면 절대 바꿀 수 없는 값으로 지정.
	
	public abstract void coffeeMethod();
	public abstract void tableMethod();
}

class Coffee implements Cafe{
	String americano;
	String latte;
	String icetea;
	
	public Coffee(String americano, String latte, String icetea) {
		this.americano = americano;
		this.latte = latte;
		this.icetea = icetea;
	}

	@Override
	public void coffeeMethod() {
		System.out.println("부모인터페이스에서 오버라이딩 받은 Coffee 클래스의 메소드이고, 재정의를 하였습니다.");
	}

	@Override
	public void tableMethod() {
		System.out.println("부모인터페이스에서 오버라이딩 받은 Coffee 클래스의 테이블 메소드이고 재정의를 하였습니다.");
	}
	
	public void classCoffeeMethod() { //이 클래스의 유일 메소드를 적기 위해선 만약 업캐스팅을 한 상태라면 다운캐스팅을 해야 쓸 수 있음.
		System.out.println("DMK 카페는 " + CAFE_SIZE + "평으로 자유롭게 돌아다니면서 커피를 주문하실수 있습니다."); //상수선언한 CAFE_SIZE을 활용하여 문자열 출력
		System.out.println("커피에는 " + this.americano + "와, " + this.latte + " 그리고, " + this.icetea + "가 있습니다.");
	}
	
}


public class OverringAndUpDownCastingEx7 {

	public static void main(String[] args) {
		
		Cafe cafe = new Coffee("아메리카노", "라떼", "아이스티");
		cafe.coffeeMethod();
		cafe.tableMethod(); //업캐스팅을 하여 부모 인터페이스를 가도 인터페이스 추상메소드 자체가 자식 클래스에서 오버라이딩하여 재정의하는 것이기에 오버라이딩 한 자식 메소드가 출력된다.
		
		//하지만 자식클래스에만 존재하는 메소드는 업캐스팅한 것을 다운캐스팅으로 바꿔야 해결이 된다.
		Coffee coffee = (Coffee) cafe;
		coffee.classCoffeeMethod();

	}

}
