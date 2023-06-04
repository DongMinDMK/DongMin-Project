package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		//간단한 배열을 통해 오름차순이랑 내림차순 표현해내기
	
		int [] arr = {1,10,5,2,3,15,22,33,44,12,15,13,17,20};
		
		int compare = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					compare = arr[i];
					arr[i] = arr[j];
					arr[j] = compare;
				}
			}
		}
		
		System.out.println("정렬 후에 출력한 값(오름차순) : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		int[] arr2 = {3,8,6,13,18,55,22,88,66,27,35,33};
		
		int compare2 = 0;
		
		
		for(int i=0; i<arr2.length-1; i++) {
			for(int j = i+1; j<arr2.length; j++) {
				if(arr2[i] < arr2[j]) {
					compare2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = compare2;
				}
			}
		}
		
		System.out.println("정렬 후에 출력한 값(내림차순) : ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
