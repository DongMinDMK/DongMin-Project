package ifelsePracticeEx;

public class IfelsePractice {

	public static void main(String[] args) {
		
		int sum = 0;
		int mul = 1;
		
		int array[] = new int[5];
		
		for(int i=0; i<2; i++) {
			array[i] = 3;
		}
		for(int i=2; i<5; i++) {
			array[i] = 5;
		}
		
		
		System.out.println("현재 배열 0번 인덱스 요소에 들어있는 값은 " + array[0]);
		
		
		if(array[0] == array[1]) {
			System.out.println("현재 배열 0번과 1번은 같은 값이 들어 있습니다.");
		}else {
			System.out.println("현재 배열 0번과 1번은 같은 값이 들어있지 않습니다.");
		}
		
		if(array[0] == array[2]) {
			System.out.println("현재 배열 0번과 2번은 같은 값이 들어있습니다.");
		}else {
			System.out.println("현재 배열 0번과 2번은 같은 값이 들어있지 않습니다.");
		}
		
		
		if(array[2] == array[4]) {
			System.out.println("현재 배열 0번과 4번은 같은 값이 들어있습니다.");
		}else {
			System.out.println("현재 배열 0번과 4번은 같은 값이 들어있지 않습니다.");
		}
		
		System.out.println();
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 10;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("arr[] 배열의 들어있는 값의 총합은 " + sum);
		
		for(int i=0; i<arr.length; i++) {
			mul *= arr[i];
		}
		
		System.out.println("arr[] 배열의 들어있는 값의 곱은 " + mul);

	}

}
