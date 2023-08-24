package asiaFootballTopEx;

interface AsiaFootballTop3{
	public abstract void introduce();
}

class Japan implements AsiaFootballTop3{
	String countryName;
	String asiaRank;
	String worldRank;
	
	public Japan(String countryName, String asiaRank, String worldRank) {
		this.countryName = countryName;
		this.asiaRank = asiaRank;
		this.worldRank = worldRank;
	}

	@Override
	public void introduce() {
		System.out.println("아시아 국가 중 " + this.countryName + "은 아시아에서 축구를 가장 잘하는 나라 탑3 중 하나이다.");
	}
	
	public void japanMethod() {
		System.out.println(this.countryName + "의 아시아에서의 축구 순위는 " + this.asiaRank + "이며, 전세계 축구 세계 랭킹은 " + this.worldRank + "이다.");
	}
}

class Iran implements AsiaFootballTop3{
	String countryName;
	String asiaRank;
	String worldRank;
	
	public Iran(String countryName, String asiaRank, String worldRank) {
		this.countryName = countryName;
		this.asiaRank = asiaRank;
		this.worldRank = worldRank;
	}

	@Override
	public void introduce() {
		System.out.println("아시아 국가 중 " + this.countryName + "은 아시아에서 축구를 가장 잘하는 나라 중 하나이다.");
	}
	
	public void iranMethod() {
		System.out.println(this.countryName + "은 아시아에서는 " + this.asiaRank + "이며, 전세계 축구 랭킹순위는 " + this.worldRank + "이다.");
		System.out.println(this.countryName + "의 위치는 중동에 위치해 있다.");
	}	
}

class SouthKorea implements AsiaFootballTop3{
	String countryName;
	String asiaRank;
	String worldRank;
	
	public SouthKorea(String countryName, String asiaRank, String worldRank) {
		this.countryName = countryName;
		this.asiaRank = asiaRank;
		this.worldRank = worldRank;
	}
	@Override
	public void introduce() {
		System.out.println("아시아 국가 중 " + this.countryName + "은 아시아에서 축구를 가장 잘하는 나라 탑3 중 하나이다.");
		System.out.println("현재 많은 " + this.countryName + "선수들이 해외무대에 나가서 열심히 뛰고있다.");
	}
	
	public void koreaMethod() {
		System.out.println(this.countryName + "의 아시아 축구 랭킹은 " + this.asiaRank + "이며, 전세계랭킹은 " + this.worldRank + "이다.");
	}
	
}

public class AsiaFootballTopEx {

	public static void main(String[] args) {
		
		AsiaFootballTop3 aft3 = new Japan("일본", "1위", "20위"); //업캐스팅 강제형변환
		aft3.introduce();
		
		Japan japan = (Japan) aft3; //다운캐스팅 강제형변환
		japan.japanMethod();
		
		System.out.println();
		
		aft3 = new Iran("이란", "2위", "22위"); //업캐스팅 강제형변환
		aft3.introduce();
		
		Iran iran = (Iran) aft3; //다운캐스팅 강제형변환
		iran.iranMethod();
		
		System.out.println();
		
		aft3 = new SouthKorea("대한민국", "3위", "28위"); //업캐스팅 강제형변환
		aft3.introduce();
		
		SouthKorea southKorea = (SouthKorea) aft3; //다운캐스팅 강제형변환
		southKorea.koreaMethod();
		

	}

}
