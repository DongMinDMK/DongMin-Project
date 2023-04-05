import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		//해시맵을 생성한다. 해시맵은 배열과 비슷한 개념이긴 하지만 키와 값으로 구성되어 있으며 키를 통해 값을 접근할 수 있다.
		HashMap<String,String> hm = new HashMap<String, String>();
		
		//해시맵에 데이터 삽입 -> put 이용
		hm.put("me", "나");
		hm.put("sister", "누나");
		hm.put("brother", "형");
		hm.put("mother", "엄마");
		hm.put("father", "아빠");
		hm.put("grandmother", "할머니");
		hm.put("grandfather", "할아버지");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("해시맵 데이터 : [me, sister, brother, mother, father, grandmother, grandfather]");
			System.out.println("현재 해시맵에 들어있는 한국어 찾기");
	        System.out.println("현재 해시맵에 들어있는 값들의 키워드는 '가족' 입니다. 가족에 관련한 단어를 영어로 입력하세요. exit를 누르면 프로그램 종료 ");
			String familyWord = scanner.next();
			if(familyWord.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String koreaWord = hm.get(familyWord); // get() 메소드를 이용하여 키(영어)로 접근하여 한국어 값을 찾아 koreaWord 변수에 저장
			
			if(koreaWord == null) {
				System.out.println(familyWord + "는 없는 단어입니다. 키워드는 '가족'입니다. 가족 중에서 입력하세요. ");
			}
			else {
				System.out.println(koreaWord);
			}
		}
		
	}

}
