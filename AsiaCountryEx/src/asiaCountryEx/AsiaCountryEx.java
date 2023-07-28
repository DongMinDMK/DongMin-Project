package asiaCountryEx;

class Asia{
	String countryName;
	String avgPersonCount;
	
	public Asia() {
		
	}
	
	public Asia(String countryName, String avgPersonCount) {
		this.countryName = countryName;
		this.avgPersonCount = avgPersonCount;
	}
	
	public void asiaMethod() {
		System.out.println("---------------------");
		System.out.println("아시아라는 대륙에는 수많은 나라들이 존재합니다.");
		System.out.println("그 중에 대표적인 나라의 이름과 평균 각 나라 인구수를 알려드리겠습니다.");
	}
}

class Korea extends Asia{
	String countryNameKorea;
	String avgPersonCountKorea;
	String celebrity;
	
	public Korea() {
		
	}
	
	public Korea(String countryNameKorea, String avgPersonCountKorea, String celebrity) {
		this.countryNameKorea = countryNameKorea;
		this.avgPersonCountKorea = avgPersonCountKorea;
		this.celebrity = celebrity;
	}
	
	public void koreaMethod() {
		super.asiaMethod();
		System.out.println();
		System.out.println(this.countryNameKorea + "은 아시아의 대표적인 국가이며, 평균 인구수는 " + this.avgPersonCountKorea + "명 이며, 대표적인 유명인사는 " + this.celebrity + "입니다.");
	}
	
	public void koreaLoveMethod() {
		System.out.println("제가 태어난 나라이기도 하며, 정말 치안이 좋고, 안전한 나라이며, 모든 국민들이 친절합니다.");
	}
}

class Japan extends Asia{
	String countryNameJP;
	String avgPersonCountJP;
	
	public Japan() {
		
	}
	
	public Japan(String countryNameJP, String avgPersonCountJP) {
		this.countryNameJP = countryNameJP;
		this.avgPersonCountJP = avgPersonCountJP;
	}
	
	public void japanMethod() {
		super.asiaMethod();
		System.out.println(this.countryNameJP + "은 아시아의 대표적인 국가이며, 평균 인구수는 " + this.avgPersonCountJP + "명입니다.");
	}
}

class Vietnam extends Asia{
	String countryNameVT;
	String avgPersonCountVT;
	
	public Vietnam() {
		
	}
	
	public Vietnam(String countryNameVT, String avgPersonCountVT) {
		this.countryNameVT = countryNameVT;
		this.avgPersonCountVT = avgPersonCountVT;
	}
	
	public void vietnamMethod() {
		super.asiaMethod();
		System.out.println(this.countryNameVT + "은 아시아의 국가이며, 평균 인구수는 " + this.avgPersonCountVT + "명입니다.");
	}
}
public class AsiaCountryEx {

	public static void main(String[] args) {
		
		Asia asia = new Asia();
		asia.asiaMethod();
		
		Korea korea = new Korea("대한민국(한국)", "5천만명", "BTS");
		korea.koreaMethod();
		korea.koreaLoveMethod();
		
	    Japan jp = new Japan("일본", "1억 2천만명");
	    jp.japanMethod();
		
	    Vietnam vt = new Vietnam("베트남", "9800만명");
	    vt.vietnamMethod();
		
		

	}

}
