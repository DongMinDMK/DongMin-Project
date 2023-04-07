import java.util.*;
public class SquarePointEx1 {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>(); //Point 클래스를 Point 객체 요소로 다루는 벡터를 생성
		Vector<Square> s = new Vector<Square>(); //Square 클래스를 Square 객체 요소로 다루는 벡터를 생성
		
		//벡터에 Point 객체를 삽입
		v.add(new Point(10, 20));
		v.add(new Point(30, 30));
		v.add(new Point(50, 10));
		v.add(new Point(25, 25));
		
		System.out.println("현재 벡터에 삽입되어 있는 Point 개수는 " + v.size() + "개 입니다.");
		
		v.remove(3); //Point 벡터의 인덱스 3번째 요소 삭제
		v.remove(2); //Point 벡터의 인덱스 2번째 요소 삭제
		
		System.out.println("----- 벡터의 있는 요소 삭제 후 -----");
		
		System.out.println("현재 벡터에 삽입되어 있는 Point 개수는 " + v.size() + "개 입니다.");
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); //벡터에 있는 값을 하나씩 읽어(가져와서) Point p 변수에 저장
			System.out.println(p);
		}
		
		//벡터에 Square 객체를 삽입
		s.add(new Square(10, 10));
		s.add(new Square(30, 30));
		s.add(new Square(50, 50));
		s.add(new Square(70, 70));
		
		System.out.println("현재 벡터에 삽입되어 있는 Square 개수는 " + s.size() + "개 입니다.");
		
		s.remove(0); // Square 벡터의 인덱스 0번째 요소 삭제
		
		System.out.println("----- 벡터의 있는 요소 삭제 후 -----");
		
		System.out.println("현재 벡터에 삽입되어 있는 Square 개수는 " + s.size() + "개 입니다.");
		
		
		
		for(int i=0; i<s.size(); i++) {
			Square sq = s.get(i); //벡터에 있는 값을 하나씩 읽어(가져와서) Square의 sq 변수에 저장
			System.out.println(sq);
		}
		
		

	}

}
class Point{
	private int x,y;
	
	public Point(int x, int y) { //Point 클래스의 생성자 생성
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { //모든 클래스의 조상 클래스인 Object 클래스에서 toString 메소드를 오버라이딩해서 재정의
		return "(" + x + "," + y + ")";
	}
}
class Square{
	private int width, height;
	
	public Square(int width, int height){ // Square 클래스의 생성자 생성
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString(){ //모든 클래스의 조상 클래스인 Object 클래스에서 toString 메소드를 오버라이딩해서 재정의
		return "정사각형의 너비의 길이는 " + width + "이고, 높이는 " + height + "이다. 따라서 정사각형의 넓이는 " + (width * height) + " 입니다.";
		}
}
