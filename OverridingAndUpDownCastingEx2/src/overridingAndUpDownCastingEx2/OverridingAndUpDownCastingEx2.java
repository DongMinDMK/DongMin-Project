package overridingAndUpDownCastingEx2;

class Sports{
	String name;
	String location;
	
	public Sports(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public void show() {
		System.out.println("남녀노소 누구나 좋아하는 스포츠입니다.");
	}
}

class Baseball extends Sports{
	int playerCount;
	
	public Baseball(String name, String location, int playerCount) {
		super(name, location);
		this.playerCount = playerCount;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("그 중에 " + this.name + "는 " + this.location + "위치에 있고, " + this.playerCount + "명이 플레이하는 스포츠입니다.");
	}
	
	public void run() {
		System.out.println("야구는 주력이 정말 중요한 스포츠입니다.");
	}
}

class Football extends Sports{

	int playerCount;
	
	public Football(String name, String location, int playerCount) {
		super(name, location);
		this.playerCount = playerCount;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("그 중에 " + this.name + "는 " + this.location + "위치에 있고, " + this.playerCount + "명이 플레이하는 스포츠입니다.");
	}
	
	public void communication() {
		System.out.println("축구는 의사소통과 팀호흡이 중요한 스포츠입니다.");
	}
}

class Volleyball extends Sports{
	
	int playerCount;
	
	public Volleyball(String name, String location, int playerCount) {
		super(name, location);
		this.playerCount = playerCount;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("그 중에 " + this.name + "는 " + this.location + "위치에 있고, " + this.playerCount + "명이 플레이하는 스포츠입니다.");
	}
	
	public void defense() {
		System.out.println("배구는 수비가 정말 중요한 스포츠입니다.");
	}
}

public class OverridingAndUpDownCastingEx2 {

	public static void main(String[] args) {
		Sports sports = new Baseball("야구", "(잠실, 인천, 대구, 부산, 수원, 고척 등)", 9);
		sports.show();
		
		Sports sports2 = new Football("축구", "(서울, 대구, 안양, 인천, 제주 등)", 11);
		sports2.show();
		
		Sports sports3 = new Volleyball("배구", "(장충, 의정부 등)", 6);
		sports3.show();
		
		
		Baseball baseball = (Baseball)sports;
		baseball.run();
		
		
		Football football = (Football)sports2;
		football.communication();
		
		Volleyball volleyball = (Volleyball)sports3;
		volleyball.defense();
		

	}

}
