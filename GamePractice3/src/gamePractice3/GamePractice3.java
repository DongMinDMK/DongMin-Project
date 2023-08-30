package gamePractice3;

interface Overwatch_Healer{
	public abstract void heroSkilsMethod();
	public abstract void heroCountryMethod();
}

class Ana implements Overwatch_Healer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Ana(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println(this.heroName + "라는 영웅은 힐러 포지션 영웅 중 하나이고, 이 영웅의 스킬은 " + this.heroSkils + " 등을 사용한다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "의 국적은 " + this.heroCountry + "이라고 한다.");
	}
	
	public void heroAnaMethod() {
		System.out.println(this.heroName + "은 딜러 포지션 중 파라라는 영웅의 어머니라고 알려져 있다.");
	}
	
}

class Merci implements Overwatch_Healer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Merci(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println(this.heroName + "라는 영웅은 힐러 포지션 영웅 중 하나이며, 이 영웅의 스킬은 " + this.heroSkils + " 등이 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "의 국적은 " + this.heroCountry + "이라고 한다.");
	}

}

class Lucio implements Overwatch_Healer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Lucio(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println(this.heroName + "영웅은 힐러 포지션 중 한 영웅이며, 이 영웅의 스킬은 " + this.heroSkils + " 등이 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "는 " + this.heroCountry + "국적의 힐러다.");
	}
	
	
}

public class GamePractice3 {

	public static void main(String[] args) {
		Overwatch_Healer oh = new Ana("아나", "이집트", "생체수류탄, 총으로 힐주기, 나노강화제");
		oh.heroSkilsMethod();
		oh.heroCountryMethod();
		Ana ana = (Ana) oh;
		ana.heroAnaMethod();
		
		System.out.println();
		
		oh = new Merci("메르시", "스위스", "지팡이로 힐주기, 수호천사, 아군 한번 살리기");
		oh.heroSkilsMethod();
		oh.heroCountryMethod();
		
		System.out.println();
		
		oh = new Lucio("루시우", "브라질", "소리방벽, 힐과 이속증가, 적군 밀쳐내기");
		oh.heroSkilsMethod();
		oh.heroCountryMethod();
	}

}
