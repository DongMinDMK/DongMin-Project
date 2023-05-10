package callbyReferenceEx;

class CallbyReference{
	public CallbyReference() {
		
	}
	public int sum(int [] arrays) {
		int totalSum = 0;
		
		for(int i=0; i<arrays.length; i++) {
			totalSum += arrays[i];
		}
		return totalSum;
	}
	
    public int sub(int [] arrays2, int[] arrays3) {
    	int subgap = 0;
      
    	for(int i=0; i<arrays2.length; i++) {
    		for(int j=0; j<arrays2.length; j++) {
    			if(arrays2[i] > arrays3[j]) {
    				subgap = arrays2[i] - arrays3[j];
    			}
    		}
    	}
    	
    	return subgap;
    }
}

public class CallbyreferenceEx {

	public static void main(String[] args) {
		//CallbyReference는 매개변수로 배열의 주솟값을 전달받아서 그 주소 안에 있는 데이터들을 하나씩 뽑아서 작업을 한다.
		int [] array1 = {500, 600, 700, 800};
		int [] array2 = {200, 400, 100, 100};
		
		CallbyReference crf = new CallbyReference();
		int sumA = crf.sum(array1);
		int sumB = crf.sum(array2);
		
		System.out.println("array1 배열의 총합은 " + sumA);
		System.out.println("array2 배열의 총합은 " + sumB);
		
		System.out.println("array1과 array2의 총합을 비교합니다.");
		
		if(sumA > sumB) {
			System.out.println("array1이 array2 배열보다 " + (sumA - sumB) + " 만큼 더 큽니다.");
		}
		
		
		CallbyReference crf2 = new CallbyReference();
		int subA = crf2.sub(array1, array2);
		
		System.out.println("배열 arrays1이 배열 arrays2 보다 제일 큰 차의 값은 " + subA); // 즉 array1 배열과 array2 배열을 비교해서 비교 차이가 가장 큰 (800-100)의 값인 700이 출력된다.
		
	}

}
