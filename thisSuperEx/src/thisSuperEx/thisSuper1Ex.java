package thisSuperEx;

public class thisSuper1Ex {

	public static void main(String[] args) {
		
		Car car = new Car("빨강", "포르쉐", 100000000);
		car.CarShowMethod();
		
		Car car1 = new Avante("파랑", "아반테", 50000000, "살색"); //부모 클래스에서 자식 클래스인 Avante 생성, 동적바인딩
		car1.CarShowMethod();
		
		Car car2 = new Genesis("청록", "제네시스", 70000000, "남색"); //부모 클래스에서 자식 클래스인 Genesis 생성, 동적바인딩
		car2.CarShowMethod();
	}

}
class Car{
	String color;
	String carName;
	int carPrice;
	
	public Car(String color, String carName, int carPrice) {
		this.color = color;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	
	public void CarShowMethod() {
		System.out.println("차는 " + this.color + "색이며, 차 이름은 " + this.carName + "이고, 가격은 " + carPrice + "원 입니다.");
	}

}
class Avante extends Car{
	
	String sheetColor;
	
	public Avante(String color, String carName, int carPrice, String sheetColor){
		super(color, carName, carPrice);
		this.sheetColor = sheetColor;
	}
	
	@Override
	public void CarShowMethod() {
		super.CarShowMethod(); //부모 메소드인 CarShowMethod 먼저 호출
		System.out.println("또한 아반테는 차 시트 색깔이 " + this.sheetColor + " 입니다."); // 부모 메소드를 먼저 실행하고 나서 이 문장 실행
	}
}
class Genesis extends Car{
	String sheetColor2;
	
	public Genesis(String color, String carName, int carPrice, String sheetColor2){
		super(color, carName, carPrice);
		this.sheetColor2 = sheetColor2;
	}
	
	@Override
	public void CarShowMethod() {
		super.CarShowMethod(); //부모 메소드인 CarShowMethod 먼저 호출
		System.out.println("또한 제네시스는 차 시트 색깔이 " + this.sheetColor2 + " 입니다."); // 부모 메소드를 먼저 실행하고 나서 이 문장 실행
	}
}


