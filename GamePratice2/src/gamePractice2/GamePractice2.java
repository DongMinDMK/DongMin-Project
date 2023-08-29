package gamePractice2;

interface Overwatch_Dealer{
	public abstract void heroSkilsMethod();
	public abstract void heroCountryMethod();
}

class Hanzo implements Overwatch_Dealer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Hanzo(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println("오버워치라는 게임 중 탱커, 딜러, 힐러라는 포지션이 있다.");
		System.out.println("그 중에 딜러에서 " + this.heroName + "라는 영웅이 있다.");
		System.out.println(this.heroName + "영웅의 스킬은 " + this.heroSkils + " 등이 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "영웅의 국적은 " + this.heroCountry + "에서 태어났다고 한다.");
	}
}

class Reaper implements Overwatch_Dealer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Reaper(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println("또한 딜러 중에서 " + this.heroName + "영웅이 있다. 이 영웅의 스킬은 " + this.heroSkils + " 등을 가지고 있다.");
		System.out.println(this.heroName + "는 양쪽 손에 샷건을 가지고 가까운 영웅에게 큰 피해를 주는 영웅이다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "영웅의 국적은 " + this.heroCountry + "이다.");
	}
}

class Soldier implements Overwatch_Dealer{
	String heroName;
	String heroCountry;
	String heroSkils;
	
	public Soldier(String heroName, String heroCountry, String heroSkils) {
		this.heroName = heroName;
		this.heroCountry = heroCountry;
		this.heroSkils = heroSkils;
	}

	@Override
	public void heroSkilsMethod() {
		System.out.println("딜러 중 " + this.heroName + "라는 영웅이 있다. 이 영웅은 한국말로 해석하는대로 군인이다. 그렇기 때문에 스킬은 군인과 관련된 " + this.heroSkils + " 등이 있다.");
	}

	@Override
	public void heroCountryMethod() {
		System.out.println(this.heroName + "영웅의 국적은 " + this.heroCountry + "이다.");
	}
	
	
}

public class GamePractice2 {

	public static void main(String[] args) {
		Overwatch_Dealer od = new Hanzo("한조", "일본", "음파화살, 갈래화살, 용 뿌리기");
		od.heroSkilsMethod();
		od.heroCountryMethod();
		
		System.out.println();
		
		od = new Reaper("리퍼", "미국", "순간이동, 망령화, 죽음의 꽃");
		od.heroSkilsMethod();
		od.heroCountryMethod();
		
		System.out.println();
		
		od = new Soldier("솔져", "미국", "자가힐, 유도탄, 총쏘기");
		od.heroSkilsMethod();
		od.heroCountryMethod();
	}

}
