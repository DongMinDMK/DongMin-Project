package weatherPracticeEx;

class Weather{
	String umbrella;
	String raincoat;
	String cap;
	
	public Weather(String umbrella, String raincoat, String cap) {
		this.umbrella = umbrella;
		this.raincoat = raincoat;
		this.cap = cap;
	}
	
	public void introduce() {
		System.out.println("날씨에 따라 " + this.umbrella + ", " + this.raincoat + ", " + this.cap + "이 필요합니다.");
	}
}

class Sunny extends Weather{
	
	String sunglasses;
	
	public Sunny(String umbrella, String raincoat, String cap, String sunglasses) {
		super(umbrella, raincoat, cap);
		this.sunglasses = sunglasses;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("더불어 햇빛이 비추는 날에는 " + this.sunglasses + "도 필요할 것입니다.");
	}
	
	
}

class Rain extends Weather{
	String boots;
	
	public Rain(String umbrella, String raincoat, String cap, String boots) {
		super(umbrella, raincoat, cap);
		this.boots = boots;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("더불어 비오는 날에는 " + this.boots + "도 필요합니다.");
	}
}

public class WeatherPraticeEx {

	public static void main(String[] args) {
		
		Weather wt2 = new Sunny("우산", "우비", "모자", "선글라스"); //업캐스팅
		wt2.introduce();
		
		Weather wt3 = new Rain("우산", "우비", "모자", "부츠"); //업캐스팅
		wt3.introduce();
		
		

	}

}
