
public class swapArrayEx {

	public static void main(String[] args) {
       // 배열을 하나 정의를 하고 배열에서 지정한 숫자가 그 다음 숫자보다 크면 스왑을 하는 간단한 코드를 작성.
		int ar[] = { 6, 4, 7, 8, 2, 3, 5, 8};
		int temp; // 임시 저장 공간 장소, 데이터를 잠시 temp라는 변수에 놔둠.
		
		System.out.print("현재 배열에는 [ ");
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " "); //현재 배열에 들어있는 값들 호출
		}
		System.out.println("] 들어가있습니다.");
		
		
		for(int i=0; i<ar.length - 1; i++){ // 배열의 마지막 값 이전 값은 더 이상 값을 비교할 수 가 없기 때문에 배열의 길이의 -1로 지정.
			for(int j = i + 1; j<ar.length; j++){ // 항상 배열의 지정된 값 다음값과 비교를 해야하기 때문에 j = i+1로 초깃값을 지정
				if(ar[i] > ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp; // 배열에서 지정된 값과 그 다음값을 하나씩 비교하여 결국 ar[0] 부터 제일 작은 수 순으로 오름차순 정렬이 됨.
					}
				
			}
			
		}
		
		System.out.print("배열을 오름차순으로 정렬을 하면 [ ");
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " "); // 정렬을 하고 배열에 있는 데이터를 출력
		}
		System.out.print("]");
		
	}

}
