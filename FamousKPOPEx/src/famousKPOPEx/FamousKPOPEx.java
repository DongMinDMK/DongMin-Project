package famousKPOPEx;

class IVE{
	String album;
	String birthYear;
	
	public IVE(String album, String birthYear) {
		this.album = album;
		this.birthYear = birthYear;
	}
	
	public void iveAlbumMethod() {
		System.out.println("KPOP에서 요새 인기 많은 아이돌 중 하나로 그룹 이름은 아이브이다. 아이브는 데뷔한지 얼마 안됬지만 수많은 히트곡을 냈다.");
		System.out.println("대표적으로 " + this.album +  " 등이 있다.");
	}
	
	public void iveAgeMethod() {
		System.out.println("아이브는 6명으로 구성되어 있으며, " + this.birthYear + "까지 존재한다.");
		System.out.println("앞으로 차세대 KPOP을 이끌 여자아이돌 중 하나로 손꼽이고 있다.");
	}
}

class BTS{
	String album;
	String birthYear;
	String topManArtist;
	
	public BTS(String album, String birthYear, String topManArtist) {
		this.album = album;
		this.birthYear = birthYear;
		this.topManArtist = topManArtist;
	}
	
	public void btsAlbumMethod() {
		System.out.println("BTS는 한국 뿐만 아니라 전세계에서 모르는 사람이 거의 없을 정도로 인기가 많은 한국의 대표적인 아이돌이다.");
		System.out.println("BTS는 정말 수많은 앨범이 많지만 그중에 2개만 뽑자면 " + this.album + "이 내가 좋아하면서도 인기 있는 앨범 중 하나이다.");
	}
	
	public void btsAgeMethod() {
		System.out.println("BTS는 " + this.birthYear + "까지 존재하며, 멤버 인원은 총 7명이다.");
	}
	
	public void famousManMethod() {
		System.out.println("BTS에는 한국의 문화와 위상을 알리는 " + this.topManArtist + "아이돌이다.");
	}
}

class BlackPink{
	String album;
	String birthYear;
	String topGirlArtist;
	
	public BlackPink(String album, String birthYear, String topGirlArtist) {
		this.album = album;
		this.birthYear = birthYear;
		this.topGirlArtist = topGirlArtist;
	}
	
	public void blackpinkAlbumMethod() {
		System.out.println("블랙핑크도 BTS와 마찬가지로 정말 유명한 걸그룹 중 하나이다.");
		System.out.println("블랙핑크의 수많은 앨범 중 내가 좋아하는 앨범은 " + this.album + "이다. 내가 좋아하는 앨범이면서도 해외에서도 인기가 많다.");
	}
	
	public void blackpinkAgeMethod() {
		System.out.println("블랙핑크는 멤버 구성원은 총 4명이며, " + this.birthYear + "까지 존재한다.");
	}
	
	public void famousGirlMethod() {
		System.out.println("남자는 BTS라면 여자는 블랙핑크가 한국을 알리는 가장 " + this.topGirlArtist + "아이돌이며, 정말 유명하다.");
	}
}

public class FamousKPOPEx {

	public static void main(String[] args) {
		
		IVE ive = new IVE("LOVE DIVE, I AM", "2002~2007년생");
		ive.iveAlbumMethod();
		ive.iveAgeMethod();
		
		System.out.println();
		
		BTS bts = new BTS("Dynamite, Permission to dance", "1992~1997년생", "남자대표아티스트");
		bts.btsAlbumMethod();
		bts.btsAgeMethod();
		
		System.out.println();
		
		BlackPink blackpink = new BlackPink("마지막처럼, 불장난", "1995~1997년생", "여자대표아티스트");
		blackpink.blackpinkAlbumMethod();
		blackpink.blackpinkAgeMethod();

	}

}
