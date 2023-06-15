package overrindingAndUpDownCastingEx4;

interface Food{
	public abstract void show();
}
class KoreaFood implements Food{
	String bibimbab;
	String bulgogi;
	String kimchi;
	
	public KoreaFood(String bibimbab, String bulgogi, String kimchi) {
		this.bibimbab = bibimbab;
		this.bulgogi = bulgogi;
		this.kimchi = kimchi;
	}
	@Override
	public void show() {
		System.out.println("한국음식은 대표적으로 " + this.bibimbab + "과," + this.bulgogi + ", " + this.kimchi + "가 있습니다.");
	}
	
	public void countryKR() {
		System.out.println("한국음식은 몸에 좋으며 전세계적으로 인기있는 음식입니다.");
	}
	
	 
}
class JapanFood implements Food{ 
	String lamen;
	String sesi;
	
	public JapanFood(String lamen, String sesi) {
		this.lamen = lamen;
		this.sesi = sesi;
	}

	@Override
	public void show() {
		System.out.println("일본음식은 대표적으로 " + this.lamen + "과, " + this.sesi + "가 있습니다.");
	}
	
	public void countryJP() {
		System.out.println("일본음식은 맛있고 남녀노소 누구나 좋아하는 음식입니다.");
	}
	
}
class ChinaFood implements Food{
	String jajangmyeon;
	String jjamppong;
	
	public ChinaFood(String jajangmyeon, String jjamppong) {
		this.jajangmyeon = jajangmyeon;
		this.jjamppong = jjamppong;
	}

	@Override
	public void show() {
		System.out.println("중국음식은 대표적으로 " + this.jajangmyeon + "과, " + this.jjamppong + "이 있습니다.");
	}
	
	public void countryCP() {
		System.out.println("중국음식은 맛있고 남녀노소 누구나 좋아하는 음식입니다.");
	}
	
	
}

public class OverrindingAndUpDownCastingEx4 {

	public static void main(String[] args) {
		Food food = new KoreaFood("비빔밥", "불고기", "김치"); //업캐스팅
		food.show();
		
		KoreaFood koreafood = (KoreaFood)food; //다운캐스팅
		koreafood.countryKR();
		
		System.out.println();
		
		Food food1 = new JapanFood("라멘", "스시"); //업캐스팅
		food1.show();
		
		JapanFood japanfood = (JapanFood)food1; //다운캐스팅
		japanfood.countryJP();
		
		System.out.println();
		
		Food food2 = new ChinaFood("자장면", "짬뽕"); //업캐스팅
		food2.show();
		
		ChinaFood chinaFood = (ChinaFood)food2; //다운캐스팅
		chinaFood.countryCP();
		
		
		

	}

	

}
