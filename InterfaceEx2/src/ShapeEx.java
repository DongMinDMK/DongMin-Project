
public class ShapeEx {

	public static void main(String[] args) {
		Shape sp = new Rectangle(10, 5);
		int recArea; //사각형 넓이의 값을 리턴받을 recArea 변수 생성
		
		sp.area();
		recArea = sp.getArea(); // 그러면 가로 10 값과 세로 5 값을 곱한 50이 recArea 변수에 들어가게 된다.
		System.out.println("사각형의 넓이는 " + recArea);
		
		Shape sp1 = new Triangle(10, 3);
		int triArea; //삼각형 넓이의 값을 리턴받을 triArea 변수 생성
		
		sp1.area();
		triArea = sp1.getArea(); // 그러면 가로 10 값과 세로 5 값을 곱한 50이 recArea 변수에 들어가게 된다.
		System.out.println("삼각형의 넓이는 " + triArea);
		
	}

}
interface Shape{
	
	abstract public void area(); //너비와 높이는 알려주는 추상메소드 선언
	abstract public int getArea(); //넓이
	
}

class Rectangle implements Shape{ // 사각형, 인터페이스를 상속받기 때문에 implements를 활용
	int recWidth;
	int recHeight;
	
	public Rectangle(int recWidth, int recHeight) {
		this.recWidth = recWidth;
		this.recHeight = recHeight;
	}
	@Override
	public void area() {
		System.out.println("사각형의 너비(가로)는 " + this.recWidth + "이며, 사각형의 높이(세로)는 " + this.recHeight + "입니다.");
	}
	@Override
	public int getArea() {
		return recWidth * recHeight;
	}

}

class Triangle implements Shape{ // 삼각형
	
	int triWidth;
	int triHeight;
	
	public Triangle(int triWidth, int triHeight) {
		this.triWidth = triWidth;
		this.triHeight = triHeight;
	}
	
	@Override
	public void area() {
		System.out.println("삼각형의 너비(가로)는 " + this.triWidth + "이며, 삼각형의 높이(세로)는 " + this.triHeight + "입니다.");
	}

	@Override
	public int getArea() {
		return (triWidth * triHeight) / 2; 
	}
	
}