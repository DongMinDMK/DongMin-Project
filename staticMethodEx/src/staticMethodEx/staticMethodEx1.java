package staticMethodEx;

public class staticMethodEx1 {

	public static void main(String[] args) {
//static 메소드의 장점은 객체를 생성하지 않고도 사용할 수 있는 멤버이다.
//객체 지정 없이 바로 클래스명을 인스턴스로 생각해 static메소드로 바로 접근한다.
		System.out.println("평균을 제외하고 static 메소드에 10과 5를 대입했을 때는 가정합니다.");
	    System.out.println("덧셈은 " + Calculator.sum(10, 5)); //static은 오른쪽으로 살짝 기울임꼴 형태로 나타난다.
	    System.out.println("뺄셈은 " + Calculator.sub(10, 5));
	    System.out.println("곱셈은 " + Calculator.mul(10, 5));
	    System.out.println("나눗셈의 몫은 " + Calculator.div(10, 5));
	    System.out.println("나눗셈의 나머지는 " + Calculator.remain(10, 5));
	    System.out.println("평균은 " + Calculator.avg(10, 5, 3));
	    System.out.println("두 수 중(10,5) 큰 수는 " + Calculator.max(10, 5));
	    System.out.println("두 수 중(10,5) 작은 수는 " + Calculator.min(10, 5));
	    
// static은 객체생성없이 바로 클래스로 접근할 수 있기 때문에 간편하다.
	}

}
class Calculator{
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static int remain(int a, int b) {
		return a%b;
	}
	public static double avg(int a, int b, int c) {
		return (a+b+c) / 2;
	}
	public static int max(int a, int b) {
		return (a > b)? a : b; //삼항 연산자로 a가 b보다 크면 a : b에서 왼쪽에 있는 a를 리턴시키고, a가 b보다 작으면 오른쪽에 있는 b를 리턴시킨다. 즉 : 를 기준으로 왼쪽이 조건을 참조하였을 때 참, 오른쪽이 거짓이다.
	}
	public static int min(int a, int b) {
		return (a > b)? b : a; //삼항 연산자로 a가 b보다 크면 b : a에서 왼쪽에 있는 b를 리턴시키고, a가 b보다 작으면 오른쪽에 있는 a를 리턴시킨다. 
	}
}
