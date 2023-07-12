package oneweekreport;

interface Week{
	public abstract void onedayMethod();
}

class Monday implements Week{
	String weather;
	int walkingCount;
	
	public Monday(String weather, int walkingCount) {
		this.weather = weather;
		this.walkingCount = walkingCount;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 월요일은 날씨가 매우 " + this.weather + " 했으며, " + this.walkingCount + "보를 걸었습니다.");
	}
}

class Tuesday implements Week{
	String weather;
	int walkingCount;
	
	public Tuesday(String weather, int walkingCount) {
		this.weather = weather;
		this.walkingCount = walkingCount;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 화요일은 " + this.weather + ", 정말 습하였고, 우산을 쓴 채로 " + this.walkingCount + "보를 걸었습니다.");
	}
}

class Wednesday implements Week{
	String weather;
	
	public Wednesday(String weather) {
		this.weather = weather;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 수요일은 날씨가 " + this.weather + "관계로, 밖에 나갈수가 없었습니다.");
	}
	
	
}

class Thursday implements Week{
	String weather;
	int walkingCount;
	
	public Thursday(String weather, int walkingCount) {
		this.weather = weather;
		this.walkingCount = walkingCount;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 목요일은 날씨가 " + this.weather + "했으며, " + this.walkingCount + "보 정도 걸었습니다.");
	}
}

class Friday implements Week{
	String weather;
	int walkingCount;
	String dinner;
	
	public Friday(String weather, int walkingCount, String dinner) {
		this.weather = weather;
		this.walkingCount = walkingCount;
		this.dinner = dinner;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 금요일은 날씨가 " + this.weather + "로 습하였고, 우산을 쓴 채 " + this.walkingCount + "보 정도를 걸었으며, " + this.dinner + "을 진행하여 늦은 밤 퇴근을 하였습니다.");
	}
	
	
}

class Saturday implements Week{
	String weather;
	int walkingCount;
	String familyDinner;
	
	public Saturday(String weather, int walkingCount, String familyDinner) {
		this.weather = weather;
		this.walkingCount = walkingCount;
		this.familyDinner = familyDinner;
	}

	@Override
	public void onedayMethod() {
		System.out.println("이번주 토요일은 날씨가 " + this.weather + "했으며, " + this.walkingCount + "보 정도를 걸었고, " + this.familyDinner + "을 진행하였습니다.");
	}
}

class Sunday implements Week{
	String weather;
	int walkingCount;
	String watching;
	
	public Sunday(String weather, int walkingCount, String watching) {
		this.weather = weather;
		this.walkingCount = walkingCount;
		this.watching = watching;
	}

	@Override
	public void onedayMethod() {
		System.out.println("일기를 적는 오늘(일요일은) 날씨가 " + this.weather + "로 많이 와서 습하였고, " + this.walkingCount + "보를 걸었고, 오늘은 해외축구를 하는 날이라 " + this.watching + "를 시청함으로 하루를 마무리했습니다.");
	}
	
	
}
public class OneWeekReport {

	public static void main(String[] args) {
		
		System.out.println("-------DMK의 1주일 일기 -------");
		
		Week week = new Monday("화창", 10000);
		week.onedayMethod();
		
		week = new Tuesday("비가 많이 와서", 6000);
		week.onedayMethod();
		
		week = new Wednesday("천둥 번개가 치는");
		week.onedayMethod();
		
		week = new Thursday("화창", 20000);
		week.onedayMethod();
		
		week = new Friday("비가 많이 오는 ",7000,"회식");
		week.onedayMethod();
		
		week = new Saturday("화창", 25000, "가족외식");
		week.onedayMethod();
		
		week = new Sunday("비", 9000, "라이브 해외축구");
		week.onedayMethod();

	}

}
