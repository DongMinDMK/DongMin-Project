package footballteamex;

interface FootballTeam{
	public abstract void show();
}

class Tottenham implements FootballTeam{
	String location;
	String name;
	String mainColor;
	
	public Tottenham(String location, String name, String mainColor) {
		this.location = location;
		this.name = name;
		this.mainColor = mainColor;
	}

	@Override
	public void show() {
		System.out.println( this.name + " 팀은 " + this.location + "위치에 있고, 메인 유니폼 색깔은 " + this.mainColor + "입니다.");
	}
	
	public void totMainPlayerMethod() {
		System.out.println(this.name + " 의 메인 선수는 손흥민과 케인입니다.");
	}
}

class PSG implements FootballTeam{
	String location;
	String name;
	String mainColor;
	
	public PSG(String location, String name, String mainColor) {
		this.location = location;
		this.name = name;
		this.mainColor = mainColor;
	}

	@Override
	public void show() {
		System.out.println( this.name + " 팀은 " + this.location + "위치에 있고, 메인 유니폼 색깔은 " + this.mainColor + "입니다.");
	}
	
	public void psgMainPlayerMethod() {
		System.out.println(this.name + " 팀의 메인 선수는 네이마르, 음바페 그리고 이강인입니다.");
	}
	
}

class Bayernmunich implements FootballTeam{
	String location;
	String name;
	String mainColor;
	
	public Bayernmunich(String location, String name, String mainColor) {
		this.location = location;
		this.name = name;
		this.mainColor = mainColor;
	}

	@Override
	public void show() {
		System.out.println( this.name + " 팀은 " + this.location + "위치에 있고, 메인 유니폼 색깔은 " + this.mainColor + "입니다.");
	}
	
	public void munichMainPlayerMethod() {
		System.out.println(this.name + " 팀의 메인 선수는 뮐러, 노이어, 그리고 김민재입니다.");
	}
}

public class FootballTeamEx {

	public static void main(String[] args) {
		System.out.println("--------- 잉글랜드 프리미어리그 --------");
		
		FootballTeam fb = new Tottenham("영국 런던", "토트넘 홋스퍼", "흰색과 남색");
		fb.show();
		Tottenham tot = (Tottenham)fb;
		tot.totMainPlayerMethod();
		
		System.out.println("---------- 프랑스 리그앙 ----------");
		
		fb = new PSG("프랑스 파리", "파리생제르맹", "남색");
		fb.show();
		PSG psg = (PSG)fb;
		psg.psgMainPlayerMethod();
		
		System.out.println("---------- 독일 분데스리가 ---------");
		fb = new Bayernmunich("독일 바이에른", "바이에른 뮌헨", "빨강색");
		fb.show();
		Bayernmunich bm = (Bayernmunich)fb;
		bm.munichMainPlayerMethod();

	}

}
