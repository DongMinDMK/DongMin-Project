package randomArrEx;
import java.util.*;

public class randomArrEx1 {

	public static void main(String[] args) {
		// 배열의 숫자를 랜덤으로 1~10까지 5번 출력
		int a[] = new int[5];
		
		System.out.println("1~10까지 숫자 중에서 랜덤으로 숫자를 5번 출력합니다.");
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10)+1; //1부터 10까지 랜덤으로 출력하기 위해 뒤에 +1 추가
		}
		
		System.out.println("랜덤으로 숫자를 출력한 배열 -> " + Arrays.toString(a));
		
		
		// 배열의 숫자를 랜덤으로 1~100까지 10번 출력
		int b[] = new int[10];
		
		System.out.println("1~100까지 숫자 중에서 랜덤으로 숫자를 10번 출력합니다.");
		
		for(int i=0; i<b.length; i++) {
			b[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("랜덤으로 숫자를 출력한 배열 -> " + Arrays.toString(b));
		
		
		// 배열의 숫자를 랜덤으로 1~1000까지 20번 출력
		int c[] = new int[20];
		
		System.out.println("1~1000까지 숫자 중에서 랜덤으로 숫자를 20번 출력합니다.");
		
		for(int i=0; i<c.length; i++) {
			c[i] = (int)(Math.random()*1000)+1;
		}
		
		System.out.println("랜덤으로 숫자를 출력한 배열 -> " + Arrays.toString(c));
		
	}

}
