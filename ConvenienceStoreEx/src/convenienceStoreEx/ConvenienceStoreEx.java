package convenienceStoreEx;

class ConvStore{
	String gimbap;
	String beverage;
	String bread;
	String snack;
	
	public ConvStore(String gimbap, String beverage, String bread, String snack) {
		this.gimbap = gimbap;
		this.beverage = beverage;
		this.bread = bread;
		this.snack = snack;
	}
	
	public void convStoreMethod() {
		System.out.println("한국에는 수많은 편의점이 있습니다.");
		System.out.println("편의점 안에는 정말 많은 것들이 있지만 인기가 많은 것은 " + this.gimbap + ", " + this.beverage + ", " + this.bread + ", " + this.snack + "이 있습니다.");
	} 
	
	public void otherConvStoreMethod() {
		System.out.println("이 뿐만 아니라 컵라면, 쿠키, 아이스크림 심지어 치킨까지도 값싼 가격으로 판매합니다.");
	}
}

class Me extends ConvStore{
	int age;
	String name;
	
	public Me(String gimbap, String beverage, String bread, String snack, int age, String name) {
		super(gimbap, beverage, bread, snack);
		this.age = age;
		this.name = name;
	}
	
	public void myMethod() {
		System.out.println("저 역시도 편의점을 자주 애용합니다.");
		System.out.println("편의점에서는 간단한 끼를 해결하기 위해서 " + this.gimbap + "과, " + this.beverage + "를 자주 마십니다.");
	}
}

public class ConvenienceStoreEx {

	public static void main(String[] args) {
		
		ConvStore cvStore = new ConvStore("김밥", "음료수", "빵", "과자");
		cvStore.convStoreMethod();
		cvStore.otherConvStoreMethod();
		
		System.out.println();
		
		Me me = new Me("김밥", "음료수", "빵", "과자", 26, "DMK");
		me.myMethod();
		
		

	}

}
