package northAmericaEx;

interface NorthAmericaInter{
	public abstract void typicalMethod();
	public abstract void introduce();
}

class USA implements NorthAmericaInter{
	String peopleCount;
	String countryName;
	
	public USA(String peopleCount, String countryName) {
		this.peopleCount = peopleCount;
		this.countryName = countryName;
	}

	@Override
	public void typicalMethod() {
		System.out.println(this.countryName + "은 대표적으로 베이글빵이 유명하며 또한 큰 강(미시시피 강)이 유명합니다");
	}

	@Override
	public void introduce() {
		System.out.println(this.countryName + "은 인구가 " +  this.peopleCount + "정도라하며, 땅 면적은 9억정도의 면적을 갖고 있다고 합니다.");
	}
}

class Canada implements NorthAmericaInter{
	String peopleCount;
	String countryName;
	
	public Canada(String peopleCount, String countryName) {
		this.peopleCount = peopleCount;
		this.countryName = countryName;
	}

	@Override
	public void typicalMethod() {
		System.out.println(this.countryName + "은 대표적으로 폭포중 나이아가라폭포가 유명하며, 스포츠 종목 중에선 아이스하키가 유명합니다.");
	}

	@Override
	public void introduce() {
		System.out.println(this.countryName + "은 인구가 " + this.peopleCount + "정도이며, 땅 면적은 9억정도의 면적을 갖고 있다라고 합니다.");
	}
	
}

public class NorthAmerica {

	public static void main(String[] args) {
		
		NorthAmericaInter nai = new USA("3억명", "미국"); //업캐스팅
		nai.typicalMethod(); //업캐스팅하여 부모 인터페이스를 호출했지만 자식에서 다시 오버라이딩으로 재정의를 함으로 재정의 한 자식 메소드를 호출
		nai.introduce(); //업캐스팅하여 부모 인터페이스를 호출했지만 자식에서 다시 오버라이딩으로 재정의를 함으로 재정의 한 자식 메소드를 호출
		
		System.out.println();
		
		nai = new Canada("3800만명", "캐나다"); //업캐스팅
		nai.typicalMethod(); //업캐스팅하여 부모 인터페이스를 호출했지만 자식에서 다시 오버라이딩으로 재정의를 함으로 재정의 한 자식 메소드를 호출
		nai.introduce(); //업캐스팅하여 부모 인터페이스를 호출했지만 자식에서 다시 오버라이딩으로 재정의를 함으로 재정의 한 자식 메소드를 호출

	}

}
