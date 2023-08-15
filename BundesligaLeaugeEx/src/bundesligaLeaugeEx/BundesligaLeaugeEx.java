package bundesligaLeaugeEx;

interface Bundesliga{
	abstract public void introduce();
	abstract public void typicalUniformColor();
}

class Bayern implements Bundesliga{
	String clubTeam;
	String typicalColor;
	String teamStadium;
	String typicalPlayer;
	
	public Bayern(String clubTeam, String typicalColor, String teamStadium, String typicalPlayer) {
		this.clubTeam = clubTeam;
		this.typicalColor = typicalColor;
		this.teamStadium = teamStadium;
		this.typicalPlayer = typicalPlayer;
	}

	@Override
	public void introduce() {
		System.out.println("독일 분데스리가 리그 중 제일 빅클럽은 당연 " + this.clubTeam + "이라고 할 수 있다.");
	}

	@Override
	public void typicalUniformColor() {
		System.out.println(this.clubTeam + "의 대표적인 유니폼 색깔은 " + this.typicalColor + "색이다.");
	}
	
	public void bayernMethod() {
		System.out.println(this.clubTeam + "은 현재 세계에서 2번째로 축구를 잘하는 팀으로 평가가 되고 있다.");
		System.out.println("이 팀의 홈 경기장은 독일의 뮌헨에 위치해있고 경기장 이름은 " + this.teamStadium + "이며, 대표적인 선수로는 우리나라 선수인 " + this.typicalPlayer + "선수가 활약해 뛰고 있다.");
	}

}

class Dortmund implements Bundesliga{
	String clubTeam;
	String typicalColor;
	String teamStadium;
	String typicalPlayer;
	
	public Dortmund(String clubTeam, String typicalColor, String teamStadium, String typicalPlayer) {
		this.clubTeam = clubTeam;
		this.typicalColor = typicalColor;
		this.teamStadium = teamStadium;
		this.typicalPlayer = typicalPlayer;
	}

	@Override
	public void introduce() {
		System.out.println("독일 분데스리가 리그 중 탑5안에 드는 구단 중 한 구단으로 별명이 꿀벌구단이라고 부르며, 클럽이름은 " + this.clubTeam + " 이다.");
	}

	@Override
	public void typicalUniformColor() {
		System.out.println(this.clubTeam + "의 대표적인 유니폼 색깔은 " + this.typicalColor + "색이다.");
	}
	
	public void dortmundMethod() {
		System.out.println(this.clubTeam + " 구단의 홈 경기장은 " + this.teamStadium + "경기장 이며, " + this.typicalPlayer + " 등 우리나라 선수가 뛰었던 적이 있다. ");
	}
}

class Leverkusen implements Bundesliga{
	
	String clubTeam;
	String typicalColor;
	String teamStadium;
	String typicalPlayer;
	
	public Leverkusen(String clubTeam, String typicalColor, String teamStadium, String typicalPlayer) {
		this.clubTeam = clubTeam;
		this.typicalColor = typicalColor;
		this.teamStadium = teamStadium;
		this.typicalPlayer = typicalPlayer;
	}

	@Override
	public void introduce() {
		System.out.println("독일 분데스리가 리그 중 탑5안에 드는 구단 중 한 구단으로 클럽이름은 " + this.clubTeam + " 이다.");
	}

	@Override
	public void typicalUniformColor() {
		System.out.println(this.clubTeam + "의 대표적인 유니폼 색깔은 " + this.typicalColor + "색이다.");
	}
	
	public void leverkusenMethod() {
		System.out.println(this.clubTeam + "구단의 홈 경기장은 " + this.teamStadium + "경기장이며, 우리나라 선수 중 " + this.typicalPlayer + "선수가 뛴 경험이 있다.");
	}
}
public class BundesligaLeaugeEx {

	public static void main(String[] args) {
		Bundesliga bun = new Bayern("바이에른 뮌헨", "빨강색", "알리안츠 아레나", "김민재");
		bun.introduce();
		bun.typicalUniformColor();
		
		Bayern bayern = (Bayern)bun;
		bayern.bayernMethod();
		
		System.out.println();
		
		bun = new Dortmund("도르트문트", "노랑색", "지그날 이두나 파크", "이영표, 지동원, 박주호");
		bun.introduce();
		bun.typicalUniformColor();
		
		Dortmund dortmund = (Dortmund)bun;
		dortmund.dortmundMethod();
		
		System.out.println();
		
		bun = new Leverkusen("레버쿠젠", "빨강색", "바이아레나", "차범근, 차두리, 손흥민");
		bun.introduce();
		bun.typicalUniformColor();
		
		Leverkusen leverkusen = (Leverkusen)bun;
		leverkusen.leverkusenMethod();
		

	}

}
