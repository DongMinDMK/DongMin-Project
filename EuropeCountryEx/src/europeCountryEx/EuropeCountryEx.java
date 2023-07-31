package europeCountryEx;

interface Europe{
	public abstract void countryCount();
	public abstract void countrySymbol();
}

class France implements Europe{
	String countryName;
	String f_countryCount;
	
	public France(String countryName, String f_countryCount) {
		this.countryName = countryName;
		this.f_countryCount = f_countryCount;
	}

	@Override
	public void countryCount() {
		System.out.println(this.countryName + "라는 나라는 평균 인구수는 " + this.f_countryCount + "명입니다.");
	}

	@Override
	public void countrySymbol() {
		System.out.println(this.countryName + "는 대표적으로 파리의 에펠탑이 유명하며, 파리는 정말 아름다운 도시라고 합니다.");
	}
}

class Germany implements Europe{
	String countryName;
	String g_countryCount;
	
	public Germany(String countryName, String g_countryCount) {
		this.countryName = countryName;
		this.g_countryCount = g_countryCount;
	}

	@Override
	public void countryCount() {
		System.out.println(this.countryName + "라는 나라는 평균 인구수는 " + this.g_countryCount + "명입니다.");
	}

	@Override
	public void countrySymbol() {
		System.out.println(this.countryName + "은 대표적으로 " + this.countryName + "의 중심 바이에른과 바이에른의 중심 뮌헨, 그리고 베를린장벽이 유명하다고 합니다.");
	}
}

class England implements Europe{
	String countryName;
	String e_countryCount;
	
	public England(String countryName, String e_countryCount) {
		this.countryName = countryName;
		this.e_countryCount = e_countryCount;
	}

	@Override
	public void countryCount() {
		System.out.println(this.countryName + "라는 나라는 평균 인구수는 " + this.e_countryCount + "명입니다.");
	}

	@Override
	public void countrySymbol() {
		System.out.println(this.countryName + "는 대표적으로 잉글랜드 프리미어리그라는 축구리그가 유명합니다.");
	}
}

public class EuropeCountryEx {

	public static void main(String[] args) {
		
		Europe europe = new France("프랑스", "6400만명");
		europe.countryCount();  //(1)
		europe.countrySymbol(); //(1)
		
		System.out.println("----------------------");
		
		France france = new France("프랑스", "64000만명");
		france.countryCount(); //(2)
		france.countrySymbol();  //(2)
		
		//위의 (1),(2)는 같은 결과가 출력된다. 다만 다른점은 위에는 업캐스팅하여 추상메소드를 오버라이딩, 밑에는 프랑스 클래스는 직접 호출한것이다.
		//밑에 독일 클래스부턴 업캐스팅을 이용하여 호출하여 결과를 보여줄것임.
		
		System.out.println("----------------------");
		
		europe = new Germany("독일", "8330만명");
		europe.countryCount();
		europe.countrySymbol();
		
		System.out.println("----------------------");
		
		europe = new England("잉글랜드", "6770만명");
		europe.countryCount();
		europe.countrySymbol();

	}

}
