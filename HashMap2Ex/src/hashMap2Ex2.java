import java.util.*;
public class hashMap2Ex2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("DMK 님의 수강한 과목과 점수입니다.");
		
		hm.put("국어", 80);
		hm.put("수학", 95);
		hm.put("체육", 95);
		hm.put("과학", 90);
		hm.put("사회", 80);
		hm.put("영어", 93);
		hm.put("컴퓨터", 98);
		hm.put("미술", 83);
		
		System.out.println("현재 해시맵에 들어있는 데이터는 총 " + hm.size() + "개 들어있습니다."); // size는 현재 해시맵에 들어있는 데이터들의 총 개수(size)를 알려줌.
		
		//Set 컬렉션은 hm 안에 들어있는 키와 값으로 들어있는 해시맵에서 키의 값 즉, 위에서 과목들의 점수가 키 이기 때문에 모든 키를 가진 set 컬렉션을 생성
		Set<String> keys = hm.keySet(); 
		Iterator<String> iter = keys.iterator(); //Iterator는 모든 키를 가진 set 컬렉션에서 하나씩 순서대로 검색하는 인터페이스이다. 따라서 <E> 에는 해시맵의 컬렉션의 매개변수와 동일한 타입을 지정해야 한다.
		// 이 결과 Iterator에 의하여 해시맵에 있는 데이터들이 하나씩 키로 과목 점수를 매칭하면서 그거에 맞는 값을 리턴해준다.
		
		while(iter.hasNext()) {
			String subjectName = iter.next(); // 해시맵에 데이터가 없을 때까지 반복해서 다음 키(과목이름)을 subjectName 변수에 저장
			int subjectScore = hm.get(subjectName); //해시맵의 키인 과목이름과 매칭되는 즉 일치하는 점수를 하나씩 subjectScore 변수에 저장
			
			System.out.println("DMK 수강생이 수강한 과목은 " + subjectName + "이며, 과목별 점수는 " + subjectScore + "점 입니다.");
		}
		
		hm.remove("국어"); //해시맵에 들어있는 데이터 '국어' 삭제
		hm.remove("사회"); //해시맵에 들어있는 데이터 '사회' 삭제
		hm.remove("미술"); //해시맵에 들어있는 데이터 '미술' 삭제
		
		System.out.println("현재 해시맵에 들어있는 데이터는 총 " + hm.size() + "개 들어있습니다.");
		
		Set<String> keys1 = hm.keySet(); 
		Iterator<String> iter1 = keys.iterator();
		
		while(iter1.hasNext()) {
			String subjectName = iter1.next(); 
			int subjectScore = hm.get(subjectName); 
			
			System.out.println("DMK 수강생이 수강한 과목은 " + subjectName + "이며, 과목별 점수는 " + subjectScore + "점 입니다.");
		}
	}

}
