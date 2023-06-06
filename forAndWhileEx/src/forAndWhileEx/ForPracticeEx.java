package forAndWhileEx;

public class ForPracticeEx {

	public static void main(String[] args) {
		
		int array[] = new int[6];
		int sum = 0;
		int calculate = 1;
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("배열안에 들어있는 수의 합은 " + sum);
		
		
		int array1[] = new int[5];
		
		
		array1[0] = 10;
		array1[1] = 5;
		array1[2] = 3;
		array1[3] = 7;
		array1[4] = 10;
		
		for(int j=0; j<array1.length; j++) {
			System.out.print(array1[j] + " ");
		}
		
		System.out.println();
	
		
		for(int j=0; j<array1.length; j++) {
			calculate *= array1[j];
		}
		
		System.out.println("배열안에 들어있는 곱은 " + calculate);
		
		
		
		

	}

}
