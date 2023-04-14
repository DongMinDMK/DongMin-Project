package arrayEqualEx;
import java.util.*;

public class arrayEqualsEx {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
	
		
		System.out.println("숫자를 각각 데이터베이스에 3개를 넣고 비교하는 프로그램입니다.");
		System.out.print("첫번째 배열 데이터베이스에 넣을 숫자를 3번 입력해주세요 ");
		
		for(int i=0;i< a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.print("첫번째 데이터베이스에 삽입된 숫자는 [ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("두번째 배열 데이터베이스에 넣을 숫자를 3번 입력해주세요 ");
		for(int i=0; i<b.length; i++) {
			b[i] = scanner.nextInt();
		}
		
		System.out.print("두번째 데이터베이스에 삽입된 숫자는 [ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.println("각각의 데이터베이스에 입력된 값들을 하나씩 매칭하여 비교합니다...");
		
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {  //중첩 반복문 이용
		    	if(a[i] == b[j]) {
				System.out.println("현재 데이터베이스의 값이 첫번째 DB인 " + a[i] + ", 두번째 DB인 " + b[j] + "로 서로 같습니다.");
		    	}
			
		    	if(a[i] > b[j]) {
		        System.out.println("현재 데이터베이스 값에서 첫번째 DB인 " + a[i] + "값이 " + b[j] + "보다 더 큰 값이 입력되어 있습니다.");
		    	}
			
		    	if(a[i] < b[j]) {
		        System.out.println("현재 데이터베이스 값에서 두번째 DB인 " + b[j] + "값이 " + a[i] + "보다 더 큰 값이 입력되어 있습니다.");
		    	}
		    }
		}

	}

}
