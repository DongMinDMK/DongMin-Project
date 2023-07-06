package hashMapPracEx;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPracEx {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>(); //해시맵은 키와 값으로 이루어져 있고 나중에 웹사이트를 구축할 때 사용되는 json 과 비슷한 형태이다. 잘 알아둘 필요가 있다.
		
		
		hm.put("soccerplayer", "DMK"); //해시맵으로 데이터를 삽입할 때는 PUT() 메소드를 이용한다. 
		hm.put("baseballplayer", "홍길동");
		hm.put("swimmingplayer", "김철수");
		hm.put("basketballplayer", "김이쁜");
		
		//해시맵은 꺼내서 그 안에 있는 데이터를 보여줄 때는 get()을 이용하며, 키로 접근을 하여 키 안에 들어가 있는 값을 출력한다.
		System.out.println(hm.get("soccerplayer"));
		System.out.println(hm.get("baseballplayer"));
		System.out.println(hm.get("swimmingplayer"));
		System.out.println(hm.get("basketballplayer"));
		
		hm.remove("swimmingplayer"); // 해시맵 중 키가 swimmingplayer인 데이터를 삭제
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		list.add(hm); //배열리스트에 해시맵으로 등록한 것을 하나씩 넣음
		
		for(int i=0; i<list.size(); i++) {
			hm = list.get(i); //배열리스트 0번 인덱스에 있는 데이터들을 하나씩 꺼내서 hm에 저장
			System.out.println(hm); //이것은 배열리스트 0번 인덱스에 해시맵에 들어있는 키 soccerplayer, baseballplayer, basketballplayer가 들어가있기 때문에 1번 반복되서 출력이 됨.
		}
		
		hm.put("skating", "홍길순");
		
		list.add(hm);
		
		for(int i=0; i<list.size(); i++) {
			hm = list.get(i); //배열리스트 0,1번 인덱스에 있는 데이터들을 하나씩 꺼내서 hm에 저장
			System.out.println(hm); //0번에 데이터 4개, 1번에 데이터가 4개가 들어가 있으므로 각각 4번씩 0,1번 인덱스 출력
		}
		System.out.println();
		System.out.println("키 존재 여부(true/false)");
		System.out.println("현재 키가 baseballplayer인 키가 존재할까요? " + hm.containsKey("baseballplayer"));
		System.out.println("현재 해시맵에 들어있는 키의 값이 존재할까요? " + hm.containsValue("홍길산"));
		

	}

}
