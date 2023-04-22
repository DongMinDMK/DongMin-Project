package arraysEx;

public class arrayExStaticMethodEx {
// 배열을 지정하고 2가지 배열에 있는 숫자들을 하나로 합치는 메소드를 작성하고 합친 데이터 배열 중 첫번째 요소와 마지막 요소의 데이터를 랜덤으로 바꾸는 코드 만들기
	public static void main(String[] args) {
		int arr1[] = {10, 30, 50, 80};
		int arr2[] = {-10, -80, -70, 100, 60};
		int arr3[] = ArrayStatic.connect(arr1, arr2); //리턴받은 z[]배열의 값을 arr3[]배열에 저장, static 메소드는 인스턴스를 생성하지 않고 바로 클래스명으로 접근하며, static 메소드는 왼쪽 코드에서 보이다시피 오른쪽 기울임꼴로 설정
		ArrayStatic.show(arr3);
		
		int ran = (int)(Math.random()*10); //랜덤함수를 1~9까지 만들어 ran 에 대입
		
		
		for(int i=0; i<1; i++) { 
			arr3[i] = ran; //1번반복할 때 그 랜덤 함수 ran을 arr3[i] 번지, 즉 0번 에 대입, 실행해보면 원래 10이였던 arr3[0]번 값이 1~9까지 중 랜덤으로 하나의 정수가 대입되는 것을 볼 수 있음
			ArrayStatic.show(arr3);
		}
		
		int ran1 = (int)(Math.random()*10);
		for(int i = 8; i<9; i++) {
			arr3[i] = ran1;
			ArrayStatic.show(arr3); //8번 값에 있는 즉, 마지막 값을 랜덤하게 1~9까지 중 대입, arr3배열의 결과를 보면 첫번째 값과 마지막 값이 유동적으로 실행할때마다 바뀌는 것을 볼 수 있음.
		}
		
		

	}

}
class ArrayStatic{
	public static int [] connect(int x[], int y[]) { //connect 메소드는 배열 안에 있는 요소들을 연결해주는, 즉 x[]의 배열 값 뒤에 y[] 배열 값을 연결해주는 메소드 지정.(concat 메소드로 적어도됨 <- 이것도 연결해주는 메소드) 여기서 배열을 static의 connect 메소드로 넘기기 때문에 배열의 주솟값을 넘기게 된다. 따라서 Call by Reference라고 한다
		int alength = 0;
		int blength = 0;
		for(int i=0; i<x.length; i++) {
			alength++; //현재 arr1[]배열에 있는 값을 x[]배열로 입력받고 그걸 하나씩 반복해서 alength는 총 4개가 된다.
		}
		for(int j=0; j<y.length; j++) {
			blength++; //현재 arr2[]배열에 있는 값을 y[]배열로 입력받고 그걸 하나씩 반복해서 blength는 총 5개가 된다.
		}
		int clength = alength + blength; //clength에는 alength의 4와 blength의 5를 더한 값을 저장한다
		
		int z[] = new int[clength]; //clength만큼의 즉,9 크기 만큼 z배열 생성
		
		for(int e=0; e<x.length; e++) {
			z[e] = x[e]; //새로 생성된 z배열에다가 일단 x의 배열의 있는 각각의 값들을 먼저 대입한다.
		}
		for(int e=0; e<y.length; e++) {
			z[alength] = y[e]; //z배열에 있는 x의 배열에 있는 값을 누적해서 그 다음에 입력을 해야하기 때문에 z[alength]에다가 저장을 하는 것이며, x 배열 뒤에다가 이어서 y[]배열에 있는 값을 붙인다.
			alength++; //그러면서 현재 있었던 alength의 값이 원래 4였지만, y[]배열에 있는 값들까지 connect()메소드에 의하여 alength 길이에 추가되었으므로 alength가 누적으로 반복문에 의해 올라가면서 결국 alength의 길이는 총 9가 된다.
		}
		
		return z; //x[]와 y[]를 이어서 붙인 값들이 들어있는 z[]배열을 리턴한다.
		
	}
	
	public static void show(int x[]) {
		System.out.print("[ ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " "); //총 9개의 배열이 들어있는 arr3[]배열의 주소값을 받는 x[]의 값들을 하나씩 반복문에 의해 출력
		}
		System.out.print("]");
		System.out.println();
	}
}
