package southeastAsiaEx;

interface SoutheastAsia{
	public abstract void countryShow();
}

class Vietnam implements SoutheastAsia{
	String countryName;
	String peopleCount;
	String countryCapital;
	
	public Vietnam(String countryName, String peopleCount, String countryCapital) {
		this.countryName = countryName;
		this.peopleCount = peopleCount;
		this.countryCapital = countryCapital;
	}

	@Override
	public void countryShow() { //부모 인터페이스 추상 메소드로부터 오버라이딩을 받아 재정의
		System.out.println(this.countryName + "은 동남아시아 국가 중 대표적으로 생각나는 나라입니다.");
	}
	
	public void vietnamMethod() { //Vietnam 클래스만 가지고 있는 메소드1
		System.out.println(this.countryName + "의 인구수는 " + this.peopleCount + "명이며, " + this.countryName + "의 수도는 " + this.countryCapital + "이다.");
	}
	
	public void vietnamAddMethod() {
		System.out.println("추가적으로 우리나라 축구 감독이 " + this.countryName + "에 가서 " + this.countryName + "축구를 한층 더 성장시켰습니다.");
		System.out.println("그래서 한국과 " + this.countryName + "은 우호적인 관계를 지니고 있다고 합니다.");
	}
	
	
}

class Thailand implements SoutheastAsia{
	String countryName;
	String peopleCount;
	String countryCapital;
	
	public Thailand(String countryName, String peopleCount, String countryCapital) {
		this.countryName = countryName;
		this.peopleCount = peopleCount;
		this.countryCapital = countryCapital;
	}

	@Override
	public void countryShow() { //부모 인터페이스 추상 메소드로부터 오버라이딩을 받아 재정의
		System.out.println(this.countryName + "은 동남아시아 대륙에 위치해 있는 나라입니다.");
	}
	
	public void thailandMethod() {
		System.out.println(this.countryName + "의 인구수는 " + this.peopleCount + "명이고, " + this.countryName + "의 수도는 " + this.countryCapital + "입니다.");
	}
}

class India implements SoutheastAsia{
	String countryName;
	String peopleCount;
	String countryCapital;
	
	public India(String countryName, String peopleCount, String countryCapital) {
		this.countryName = countryName;
		this.peopleCount = peopleCount;
		this.countryCapital = countryCapital;
	}

	@Override
	public void countryShow() {
		System.out.println(this.countryName + "는 동남아쪽에 위치해 있고, 세계에서 인구가 가장 많은 나라입니다.");
	}
	
	public void indiaMethod() {
		System.out.println(this.countryName + "의 인구수는 무려 " + this.peopleCount + "명이고, " + this.countryName + "의 수도는 " + this.countryCapital + "입니다.");
	}
	
	public void indiaAddMethod() {
		System.out.println(this.countryName + "는 중국와 인구수 1~2위를 다투고 있고, 카레가 정말 유명한 나라입니다.");
	}
	
	
}

public class SoutheastAsiaEx {

	public static void main(String[] args) {
		SoutheastAsia sa = new Vietnam("베트남", "9800만", "하노이");
		sa.countryShow(); //업캐스팅으로 형변환했지만 부모 인터페이스는 추상메소드이므로 자식 클래스에서 오버라이딩 하여 재정의
		
		Vietnam vietnam = (Vietnam)sa; //다운캐스팅 형변환
		
		vietnam.vietnamMethod();
		vietnam.vietnamAddMethod();
		
		System.out.println();
		
		sa = new Thailand("태국", "7100만", "방콕");
		sa.countryShow();
		
		Thailand thailand = (Thailand)sa;
		thailand.thailandMethod();
		
		System.out.println();
		
		sa = new India("인도", "14억", "뉴델리");
		sa.countryShow();
		
		India india = (India)sa;
		
		india.indiaMethod();
		india.indiaAddMethod();
	}

}
