package koreaEx;

import java.util.Scanner;

interface Korea{
	public abstract void location();
	public abstract void famousFood();
}

class Seoul implements Korea{
	String amusementPark;
	String seoulStation;
	
	public Seoul(String amusementPark, String seoulStation) {
		this.amusementPark = amusementPark;
		this.seoulStation = seoulStation;
	}

	@Override
	public void location() {
		System.out.println("서울은 한국의 수도이며, 서울하면 생각나는 것은 " + this.amusementPark + "와 " + this.seoulStation + "이라고 할 수 있습니다.");
		System.out.println("이외에도 정말 많은 문화재나 관광지같은 곳이 있습니다.");
	}

	@Override
	public void famousFood() {
		System.out.println("서울하면 생각나는 음식은 각자 다르겠지만 그래도 설렁탕과 불고기, 빈대떡 등이 유명합니다.");
		System.out.println("이 음식들은 서울에서 번성했기 때문에 유명하고 인기가 많다고 할 수 있습니다.");
	}
}

class Cheonan implements Korea{
	String nutSnack;
	String sundae;
	
	public Cheonan(String nutSnack, String sundae) {
		this.nutSnack = nutSnack;
		this.sundae = sundae;
	}

	@Override
	public void location() {
       System.out.println("한국에는 천안이 있는데 천안은 충남 동북부에 위치에 있습니다.");
	}

	@Override
	public void famousFood() {
		System.out.println("천안하면 뭐니뭐니해도 " + this.nutSnack + "가 가장 유명하며, " + this.sundae + "도 많이 유명하여 관람객들이 천안에 찾으면 항상 " + this.nutSnack + "와, " + this.sundae + "를 찾는다고 합니다.");
	}
}

class Busan implements Korea{
	String ocean;
	String pigGukbap;
	
	public Busan(String ocean, String pigGukbap) {
		this.ocean = ocean;
		this.pigGukbap = pigGukbap;
	}

	@Override
	public void location() {
		System.out.println("한국에서 제주도를 제외하고 서울에서 가장 반대되는 위치에 있는 곳은 부산입니다. 부산은 서울에 이어 2번째로 큰 도시라고도 부르며, 제2의 수도라고 불리웁니다.");
		System.out.println("부산하면 생각나는 것은 " + this.ocean + "이라고 말할 수 있습니다.");
	}

	@Override
	public void famousFood() {
		System.out.println("또한 부산의 음식은 " + this.pigGukbap + "이 정말 유명합니다. 부산에 가면 꼭 먹어봐야하는 음식의 1순위라고 합니다.");
	}
	
	
}

public class KoreaEx {

	public static void main(String[] args) {
		
		Korea korea = new Seoul("롯데월드", "서울역"); //업캐스팅
		
		korea.location();
		korea.famousFood();
		
		System.out.println();
		
		korea = new Cheonan("호두과자", "천안순대"); //업캐스팅
		korea.location();
		korea.famousFood();
		
		System.out.println();
		
		korea = new Busan("해운대 해수욕장", "돼지국밥"); //업캐스팅
		korea.location();
		korea.famousFood();

	}

}
