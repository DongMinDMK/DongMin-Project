package abstractEx;

//추상 클래스는 객체를 생성할 수 없다.
abstract class Calc{ //추상 클래스 생성
	public abstract int add(int x, int y); //추상 메소드 생성(덧셈)
	public abstract int sub(int x, int y); //추상 메소드 생성(뺄셈)
	public abstract int mul(int x, int y); //추상 메소드 생성(곱셈)
	public abstract int div(int x, int y); //추상 메소드 생성(나눗셈 - 몫)
	public abstract int mod(int x, int y); //추상 메소드 생성(나눗셈 나머지)
	public abstract double average(int[] x); //추상 메소드 생성(평균)
}

//추상클래스는 반드시 서브 클래스에서 상속을 받아야 하며, 따라서 객체 생성을 안하는 인터페이스와 동일 개념으로 추상클래스나 인터페이스 같은 경우에는 반드시 서브클래스에서 부모 클래스의 추상 메소드를 재정의할 오버라이딩이 필요하다.
public class abstractCalcEx extends Calc { // Calc 추상 클래스를 상속받은 abstractCalcEx 생성
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		return x / y;
	}
	
	@Override
	public int mod(int x, int y) {
		return x % y;
	}

	@Override
	public double average(int[] x) { //메인 메소드에서 배열을 넘겨오는데 배열 같은 경우는 넘겨올 때 주소값이 넘겨온다.
		double sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		
		return sum / x.length;
	}

	public static void main(String[] args) {
		int [] arr = {5, 6, 7, 8, 2, 2};
		abstractCalcEx ac = new abstractCalcEx();
		System.out.println("덧셈을 수행한 결과는 " + ac.add(10, 5)); // 10과 5의 덧셈 결과 출력
		System.out.println("뺄셈을 수행한 결과는 " + ac.sub(10, 5)); // 10과 5의 뺄셈 결과 출력
		System.out.println("곱셈을 수행한 결과는 " + ac.mul(10, 5)); // 10과 5의 곱셈 결과 출력
		System.out.println("나눗셈을 수행한 결과의 몫은 " + ac.div(10, 5)); // 10과 5의 나눗셈 몫 결과 출력
		System.out.println("나눗셈을 수행한 결과의 나머지는 " + ac.mod(10, 3)); // 10과 3의 나눗셈 나머지 결과 출력
		System.out.println("평균을 수행한 결과는 " + ac.average(arr)); // arr 배열에 들어있는 정수 값 평균 출력

	}

}


