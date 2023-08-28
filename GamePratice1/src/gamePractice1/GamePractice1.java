package gamePractice1;

interface Overwatch_Tank{
	public void heroSkilMethod();
	public void heroCountryMethod();
}

class Roadhog implements Overwatch_Tank{
	String skils;
	String heroName;
	String heroCountry;
	
	public Roadhog(String skils, String heroName, String heroCountry) {
		this.skils = skils;
		this.heroName = heroName;
		this.heroCountry = heroCountry;
	}

	@Override
	public void heroSkilMethod() {
		System.out.println("오버워치라는 게임에서 탱커 중 " + this.heroName + "라는 영웅이 있다. 이 영웅의 스킬은 " + this.skils + " 등을 가지고 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "의 고향은 " + this.heroCountry + "이다.");
	}
	
	public void pigMethod() {
		System.out.println(this.heroName + "는 내가 가장 좋아하는 영웅이며 제일 많이 하는 영웅이다.");
	}

}

class DVA implements Overwatch_Tank{
	String skils;
	String heroName;
	String heroCountry;
	
	public DVA(String skils, String heroName, String heroCountry) {
		this.skils = skils;
		this.heroName = heroName;
		this.heroCountry = heroCountry;
	}

	@Override
	public void heroSkilMethod() {
		System.out.println("또한 오버워치라는 게임에서 탱커 중에 " + this.heroName + "라는 영웅이 있는데 이 영웅의 스킬은 " + this.skils + " 등 이다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "의 고향은 " + this.heroCountry + "이다.");
	}
	
	public void dvaMethod() {
		System.out.println("로드호그 다음으로 가장 내가 많이하는 영웅이며, " + this.heroCountry + "이 고향이기 때문에 많이 좋아한다.");
	}
	
}

class Winston implements Overwatch_Tank{
	String skils;
	String heroName;
	String heroCountry;
	
	public Winston(String skils, String heroName, String heroCountry) {
		this.skils = skils;
		this.heroName = heroName;
		this.heroCountry = heroCountry;
	}

	@Override
	public void heroSkilMethod() {
		System.out.println("또한 탱커 중 " + this.heroName + "이라는 영웅이 있는데 이 영웅은 고릴라라는 별명을 가지고 있으며, 스킬은 " + this.skils + " 등이 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "의 고향은 " + this.heroCountry + "이다.");
	}

}

public class GamePractice1 {

	public static void main(String[] args) {
		Overwatch_Tank ot = new Roadhog("갈고리로 당기기, 숨돌리면서 피 회복, 샷건", "로드호그", "호주"); //업캐스팅
		ot.heroSkilMethod();
		ot.heroCountryMethod();
		
		Roadhog roadhog = (Roadhog) ot; //강제 형변환 다운캐스팅
		roadhog.pigMethod();
		
		System.out.println();
		
		ot = new DVA("로봇탑승, 로봇부스터, 로봇로켓발사, 로봇던지기", "디바", "대한민국");
		ot.heroSkilMethod();
		ot.heroCountryMethod();
		
		DVA dva = (DVA) ot;
		dva.dvaMethod();
		
		System.out.println();
		
		ot = new Winston("점프뛰기, 방벽생성, 레이저건으로 지지기, 원시의 분노", "윈스턴", "(국적없음)");
		ot.heroSkilMethod();
		ot.heroCountryMethod();
		
				
	}

}
