package interfaceOverrideEx;

interface Sports{
	public void exercise();
	public void entranceTicket();
}

class Soccer implements Sports{
	int playerCount;
	String referee;
	String ball;
	int ticket;
	
	public Soccer(int playerCount, String refree, String ball, int ticket) {
		this.playerCount = playerCount;
		this.referee = refree;
		this.ball = ball;
		this.ticket = ticket;
	}

	@Override
	public void exercise() {
		System.out.println("축구는 " + this.playerCount + "명의 선수가 플레이하는 종목이고, " + this.referee + "이 존재하며 " + this.ball + "을 다루는 스포츠입니다.");
	}

	@Override
	public void entranceTicket() {
		System.out.println("축구 입장료는 " + this.ticket + "원입니다.");
	}
	
	public void soccerMethod() { //Soccer 클래스만 가지고 있는 유일 메소드
		System.out.println("축구는 남녀노소 누구나 좋아하는 스포츠이며, 전반전 후반전으로 총 45분간 진행됩니다.");
	}
	
	
}

class Baseball implements Sports{
	int playerCount;
	String referee;
	String ball;
	int ticket;
	
	public Baseball(int playerCount, String refree, String ball, int ticket) {
		this.playerCount = playerCount;
		this.referee = refree;
		this.ball = ball;
		this.ticket = ticket;
	}
	@Override
	public void exercise() {
		System.out.println("야구는 " + this.playerCount + "명의 선수가 플레이하는 종목이고, " + this.referee + "이 존재하며 " + this.ball + "을 다루는 스포츠입니다.");
	}
	@Override
	public void entranceTicket() {
		System.out.println("야구 입장료는 " + this.ticket + "원입니다.");
	}
	
	public void baseballMethod() { //Baseball 클래스만 가지고 있는 유일 메소드
		System.out.println("야구는 남녀노소 누구나 좋아하는 스포츠이며, 9회까지 게임을 진행합니다.");
	}
	
	
}

class Cycling implements Sports{
	int playerCount;
	String referee;
	String ball;
	int ticket;
	
	public Cycling(int playerCount, String refree, String ball, int ticket) {
		this.playerCount = playerCount;
		this.referee = refree;
		this.ball = ball;
		this.ticket = ticket;
	}
	@Override
	public void exercise() {
		System.out.println("사이클는 " + this.playerCount + "명의 선수가 플레이하는 종목이고, " + this.referee + "이 존재하며 " + this.ball + "을 다루지 않는 스포츠입니다.");
	}
	@Override
	public void entranceTicket() {
		System.out.println("사이클 입장료는 " + this.ticket + "원입니다.");
	}
	
	public void cyclingMethod() {
		System.out.println("사이클은 남녀노소 누구나 좋아하는 스포츠이며, 헬멧 등 보호장비가 꼭 필요한 스포츠입니다.");
	}
	
	
}

public class InterfaceOverridingEx {

	public static void main(String[] args) {
		
		Sports sports = new Soccer(11, "심판", "공", 10000); //업캐스팅
		sports.exercise(); //업캐스팅이지만 자식클래스인 Soccer에서 오버라이딩을 하기 때문에 오버라이딩 된 메소드는 자식 클래스 메소드가 출력이된다. 하지만 업캐스팅이기 때문에 Soccer 클래스에서만 있는 soccerMethod는 사용을 하지 못한다.
		sports.entranceTicket(); //이하동문
		
		Sports sports2 = new Baseball(9, "심판", "공", 8000); 
		sports2.exercise();//업캐스팅이지만 자식클래스인 Baseball에서 오버라이딩을 하기 때문에 오버라이딩 된 메소드는 자식 클래스 메소드가 출력이된다. 하지만 업캐스팅이기 때문에 Baseball 클래스에서만 있는 baseballMethod는 사용을 하지 못한다.
		sports2.entranceTicket();
		
		Sports sports3 = new Cycling(8, "심판", "공", 12000); 
		sports3.exercise(); //업캐스팅이지만 자식클래스인 Cycling에서 오버라이딩을 하기 때문에 오버라이딩 된 메소드는 자식 클래스 메소드가 출력이된다. 하지만 업캐스팅이기 때문에 Cycling 클래스에서만 있는 cyclingMethod는 사용을 하지 못한다.
		sports3.entranceTicket();
		
		Soccer soccer = (Soccer)sports; //다운캐스팅
		soccer.soccerMethod(); //Soccer 클래스에만 존재하는 메소드 사용 가능(다운캐스팅을 이용했기 때문)
		
		Baseball baseball = (Baseball)sports2; //다운캐스팅
		baseball.baseballMethod();//Baseball 클래스에만 존재하는 메소드 사용 가능(다운캐스팅을 이용했기 때문)
		
		Cycling cycling = (Cycling)sports3; //다운캐스팅
		cycling.cyclingMethod();//Cycling 클래스에만 존재하는 메소드 사용 가능(다운캐스팅을 이용했기 때문)
		
	}

}
