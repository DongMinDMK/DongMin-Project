
public class OperatorEx {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		System.out.println("------ 증감연산자 ++ ------");
		
		//증감연산자(++)(현재 x는 100)
		System.out.println(x++); //후치 증가 연산자이기 때문에 먼저 출력하고 난 뒤 x값을 증가시킴. 따라서 x는 100이 먼저 출력
		System.out.println(++x); //x는 101인 상태에서 전치증가 연산자를 넣으면 x의 값을 먼저 1 증가시키고 출력, 따라서 x 값은 102
		
		
		System.out.println("----- 증감연산자 -- ------");
		
		//증감연산자(--)(현재 x는 102)
		System.out.println(x--); //현재 x값이 102인 상태에서 후치 감소 연산자를 수행하면 x의 값인 102가 먼저 출력되고 그 다음 x의 값을 1 감소시킨다.
		System.out.println(--x); //현재 x값이 1 감소된 상태이기 때문에 101에서 전치 감소 연산자를 수행하면 먼저 1이 감소되고(100)이 되고 나서 출력을 시킨다.
		
		System.out.println("증감 연산자를 수행한 x = " + x);
		System.out.println();
		
		int y = 1000;
		y++; //이렇게 증감연산자 뒤나 앞에 아무런 수식이 없고 증감연산자만 있을 경우에는 전치, 후치 상관없이 무조건 ++, --에 맞춰 올리거나 줄이면 된다. 따라서 y 같은 경우는 지금 1000이 들어가 있지만 증가 연산자에 앞뒤에 아무런 수식이 없기 때문에 y++로 증가하여 1001이 출력이된다.
		y++; //y 현재 1002;
		y += 1000; // (== y = y + 1000)과 같은 뜻이며 이렇게 되면 y는 2002 값이 들어간다.
		y--; //이렇게 증감연산자 뒤나 앞에 아무런 수식이 없고 증감연산자만 있을 경우 전치, 후치 상관없이 무조건 ++, --에 맞춰 올리거나 줄이면 된다. 따라서 지금 y 같은 경우에는 2002 값이 들어가 있다. 근데 감소 연산자 앞뒤에 아무런 수식이 없기 때문에 y--가 되어 2001로 다시 떨어진다.
		//따라서 증감연산자만 있을 경우에는 굳이 복잡하게 생각할 필요없이 뒤에 ++,--에 따라 올리거나 줄이면된다.
		System.out.println("증감연산자를 수행한 결과 y = " + y);

	}

}