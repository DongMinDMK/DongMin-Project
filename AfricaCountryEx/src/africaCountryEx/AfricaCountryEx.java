package africaCountryEx;

interface Africa{
	public abstract void interdouce();
}

class Egypt implements Africa{
	String peopleCount;
	String countryName;
	String famousTypical;
	
	public Egypt(String peopleCount, String countryName, String famousTypical) {
		this.peopleCount = peopleCount;
		this.countryName = countryName;
		this.famousTypical = famousTypical;
	}

	@Override
	public void interdouce() {
		System.out.println("아프리카의 있는 나라 중 대표적으로 생각나는 나라중 하나는 " + this.countryName + "라는 나라입니다.");
	}
	
	public void egyptMethod() {
		System.out.println("이 나라의 인구수는 " + this.peopleCount + "명 정도이며, 대표적으로 유명한 것은 " + this.famousTypical + " 입니다.");
	}
}

class Morocco implements Africa{
	String peopleCount;
	String countryName;
	String famousTypical;
	
	public Morocco(String peopleCount, String countryName, String famousTypical) {
		this.peopleCount = peopleCount;
		this.countryName = countryName;
		this.famousTypical = famousTypical;
	}

	@Override
	public void interdouce() {
		System.out.println("아프리카에는 " + this.countryName + "라는 나라도 있습니다.");
	}
	
	public void moroccoMethod() {
		System.out.println("이 나라의 인구수는 " + this.peopleCount + "명 정도이며, 이 나라의 유명한 것은 " + this.famousTypical + " 입니다.");
	}
}

class Senegal implements Africa{
	String peopleCount;
	String countryName;
	String famousTypical;
	
	public Senegal(String peopleCount, String countryName, String famousTypical) {
		this.peopleCount = peopleCount;
		this.countryName = countryName;
		this.famousTypical = famousTypical;
	} 

	@Override
	public void interdouce() {
		System.out.println("아프리카의 나라 중에는 " + this.countryName + "이름을 가진 나라도 존재합니다.");
	}
	
	public void senegalMethod() {
		System.out.println("이 나라의 인구수는 " + this.peopleCount + "명 정도이며, 대표적으로 유명한 것은 " + this.famousTypical + " 입니다.");
	}
}

public class AfricaCountryEx {

	public static void main(String[] args) {
		
		Africa africa = new Egypt("1억 1200만", "이집트", "피라미드, 파라오"); //업캐스팅
		africa.interdouce();
		
		Egypt egypt = (Egypt) africa; //다운캐스팅
		egypt.egyptMethod();
		
		System.out.println();
		
		africa = new Morocco("3700만", "모로코", "낙타, 사막"); //업캐스팅
		africa.interdouce();
		
		Morocco morocco = (Morocco) africa; //다운캐스팅
		morocco.moroccoMethod();
		
		System.out.println();
		
		africa = new Senegal("1770만", "세네갈", "세네갈 앵무새"); //업캐스팅
		africa.interdouce();
		
		Senegal senegal = (Senegal) africa; //다운캐스팅
		senegal.senegalMethod();

	}

}
