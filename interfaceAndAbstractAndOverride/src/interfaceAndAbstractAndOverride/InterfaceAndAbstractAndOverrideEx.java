package interfaceAndAbstractAndOverride;

interface Car{
	
	public abstract void run();
	public abstract void cost();
	
}

class Ferrari implements Car{
	
	String color;
	int wheel;
	
	public Ferrari(String color, int wheel) {
		this.color = color;
		this.wheel = wheel;
	}

	@Override
	public void run() {
		System.out.println("페라리가 씽씽 달립니다.");
	}

	@Override
	public void cost() {
		System.out.println("페리리의 가격은 300000000원 입니다.");
	}
	
	
	public void show() {
		System.out.println("페라리는 " + this.color + "색이고, 바퀴는 " + this.wheel + "개 입니다.");
	}
	
	
}

class Porsche implements Car{
	String color;
	int wheel;
	
	public Porsche(String color, int wheel) {
		this.color = color;
		this.wheel = wheel;
	}

	@Override
	public void run() {
		System.out.println("포르쉐가 씽씽 달립니다.");
	}

	@Override
	public void cost() {
		System.out.println("포르쉐의 가격은 250000000원 입니다.");
	}
	
	public void show2() {
		System.out.println("페라리는 " + this.color + "색이고, 바퀴는 " + this.wheel + "개 입니다.");
	}

}



public class InterfaceAndAbstractAndOverrideEx {

	public static void main(String[] args) {
		
		Car car = new Ferrari("빨강", 4);
		
		car.run();
		car.cost();
		
		System.out.println("-------------------------");
		
		Car car2 = new Porsche("파랑", 4);
		
	    car2.run();
	    car2.cost();
	    
	    System.out.println("-------------------------");
	    
	    Ferrari f = (Ferrari)car;
	    f.run();
	    f.cost();
	    f.show();
	    
	    System.out.println("-------------------------");
	    
	    Porsche p = (Porsche)car2;
	    p.run();
	    p.cost();
	    p.show2();
	    
	    System.out.println("-------------------------");
	    
	    
		
		

	}

}
