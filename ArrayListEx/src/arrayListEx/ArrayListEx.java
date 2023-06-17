package arrayListEx;

import java.util.ArrayList;
import java.util.HashMap;


public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> sportsList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//HashMap은 put를 이용하여 데이터를 삽입할 수 있으며 키와 값으로 이루어져 있습니다. 키를 통해 나중에 값을 가져올 때 사용합니다.
		// HashMap은 get()를 이용하여 삽입한 데이터를 꺼냅니다.
		
		hm.put("football", "축구");
		hm.put("basketball", "농구");
		hm.put("baseball", "야구");
		hm.put("volleyball", "배구");
		
		
		sportsList.add(hm); //해시맵에 데이터를 삽입한 것을 배열리스트 0번지에 집어넣는다. 즉, 축구, 농구, 야구, 배구가 배열리스트 0번지 요소에 저장된다.
		
		hm.put("cycle", "사이클");
		hm.put("swimming", "수영");
		hm.put("skating", "스케이트");
		hm.put("running", "육상");
		
		sportsList.add(hm); //해시맵에 데이터를 삽입한 것을 배열리스트 1번지에 집어넣는다. 사이클, 수영, 스케이트, 육상을 배열리스트 1번지 요소에 집어넣는다.
		
		for(int i=0; i<1; i++) { 
			HashMap<String,String> hm1 = sportsList.get(i); //배열리스트의 0번지 요소에 있는 데이터를 꺼내서 hm1 인스턴스 해시맵 변수에 넣고 get 함수를 이용하여 키를 사용하여 출력
			
			System.out.println("가장 인기있고 공을 사용하는 관중이 많은 스포츠는 " + hm1.get("football") + "입니다.");
			System.out.println(hm1.get("basketball") + ", " + hm1.get("baseball") + ", " + hm1.get("volleyball") + "이 뒤를 이어갑니다.");
			
			
		}
		
		for(int i=1; i<2; i++) {
			HashMap<String,String> hm2 = sportsList.get(i); //배열리스트의 1번지 요소에 있는 데이터를 꺼내서 hm2 인스턴스 해시맵 변수에 넣고 get 함수를 이용하여 키를 사용하여 출력
			System.out.println("공을 이용하지 않는 스포츠는 " + hm2.get("cycle") + "과 " + hm2.get("swimming") + ", " + hm2.get("skating") + ", " + hm2.get("running") + "등이 있습니다. 공을 사용하지 않는 스포츠도 인기가 정말 많습니다.");
		}
	    
	}

}
