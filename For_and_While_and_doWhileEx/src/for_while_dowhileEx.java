public class for_while_dowhileEx {

	public static void main(String[] args) {
		int array[] = {1, 3, 5, 8, 11, 15, 7};
		
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[0] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[1] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[2] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[3] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[4] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[5] + "] 입니다.");
		System.out.println("현재 배열 array에 들어있는 정수는 [" + array[6] + "] 입니다.");
		//이렇게 배열안에 있는 정수들을 하나씩 출력할 수야 있지만 반복문 없이는 출력하기엔 번거롭다. 따라서 반복문을 하나씩 써서 출력을 해볼 것이다.
		
		System.out.println("-------for 문 입니다. -------");
		
		//for문
		for(int i=0; i<array.length; i++)
		{
			System.out.println("현재 배열 array에 들어있는 정수는 [" + array[i] + "] 입니다.");
		}
		
		//이렇게 반복문을 쓰면 7줄을 직접 써야 하는 것과는 달리 1줄로 표현이 가능하다.
		
		//while문
		System.out.println("-------while 문 입니다. -------");
		
		int i=0;
		while(i<7) {
			System.out.println("현재 배열 array에 들어있는 정수는 [" + array[i] + "] 입니다.");
			i++;
		}
		
		//여기까지 보면 반복문인 for와 while문은 쓰는 형식만 조금 다른걸 제외하면 같은 반복문이다.
		
		int j;
		j=0;
		
		//do-while문
		System.out.println("-------do while 문 입니다. -------");
		System.out.println("무조건 1번은 실행되는 do-while문입니다.");
		do {
			System.out.println("현재 배열 array에 들어있는 정수는 [" + array[j] + "] 입니다.");
			j++;
			
		}while(j<7);
		
		System.out.println("현재 j값은 " + j + "이기 때문에 do-while문 조건에 불만족하여 빠져나옴.");
		
	
	}

}
