package southAmericaEx;

interface SouthAmerica{
	public abstract void show();
}

class Brazil implements SouthAmerica{
	String countryCount;
	String countryTypical;
	String countryName;
	
	public Brazil(String countryCount, String countryTypical, String countryName) {
		this.countryCount = countryCount;
		this.countryTypical = countryTypical;
		this.countryName = countryName;
	}

	@Override
	public void show() {
		System.out.println("남아메리카 중에서 대표적으로 " + this.countryName + "나라가 있다.");
	}
	
	public void brazilMethod() {
		System.out.println(this.countryName + "의 인구수는 " + this.countryCount + "명 정도이며, 세계에서 7번째로 인구수가 높다. ");
		System.out.println("또한 " + this.countryName + "은 " + this.countryTypical + " 대표적으로 매우 유명하다.");
	}
}

class Chile implements SouthAmerica{
	String countryCount;
	String countryTypical;
	String countryName;
	
	public Chile(String countryCount, String countryTypical, String countryName) {
		this.countryCount = countryCount;
		this.countryTypical = countryTypical;
		this.countryName = countryName;
	}

	@Override
	public void show() {
		System.out.println(this.countryName + "는 대표적으로 남아메리카에서 동서는 폭이 좁지만 남북이 폭이 긴 것이 특징이다.");
	}
	
	public void chileMethod() {
		System.out.println(this.countryName + "의 인구수는 " + this.countryCount + "명 정도이다.");
		System.out.println("또한 " + this.countryName + "는 대표적으로 " + this.countryTypical + "가 세계적으로 중요한 상을 수상할 만큼 인기가 많다고 한다.");
	}
}

class Argentina implements SouthAmerica{
	String countryCount;
	String countryTypical;
	String countryName;
	
	public Argentina(String countryCount, String countryTypical, String countryName) {
		this.countryCount = countryCount;
		this.countryTypical = countryTypical;
		this.countryName = countryName;
	}
	
	public void show() {
		System.out.println(this.countryName + "는 남아메리카하면 떠올리기 쉬운 국가 중 하나이다.");
	}
	
	public void argentinaMethod() {
		System.out.println(this.countryName + "의 인구수는 " + this.countryCount + "명 정도이며, 대표적으로 수도 부에노스아이레스에 위치한 " + this.countryTypical + "이 유명하다.");
		System.out.println(this.countryTypical + "를 가면 " + this.countryName + "의 대표적인 문화유산과 라틴아메리카의 뛰어난 예술품을 볼 수 있다고 한다.");
		
	}
}

public class SouthAmericaEx {

	public static void main(String[] args) {
		SouthAmerica sa = new Brazil("2억", "삼바, 축구", "브라질");
		sa.show();
		
		Brazil brazil = (Brazil) sa;
		brazil.brazilMethod();
		
		System.out.println();
		
		sa = new Chile("1900만", "칠레 요리", "칠레");
		sa.show();
		
		Chile chile = (Chile) sa;
		chile.chileMethod();
		
		System.out.println();
		
		sa = new Argentina("4500만", "국립박물관", "아르헨티나");
		sa.show();
		
		Argentina argentina = (Argentina) sa;
		argentina.argentinaMethod();
	}

}
