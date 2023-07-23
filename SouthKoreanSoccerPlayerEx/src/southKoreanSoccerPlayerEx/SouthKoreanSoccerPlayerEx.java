package southKoreanSoccerPlayerEx;

interface SouthKoreaSoccerPlayer{
	public abstract void teams();
	public abstract void location();
    public abstract void mainfoot();
}

class Son implements SouthKoreaSoccerPlayer{
	int age;
	int height;
	String position;
	
	public Son(int age, int height, String position) {
		this.age = age;
		this.height = height;
		this.position = position;
	}

	@Override
	public void teams() {
		System.out.println("대한민국 Son 선수의 소속팀은 토트넘입니다.");
	}

	@Override
	public void location() {
		System.out.println("Son 선수의 소속팀의 위치는 잉글랜드 입니다.");
	}

	@Override
	public void mainfoot() {
		System.out.println("Son 선수의 주발은 양발입니다. 왼발, 오른발을 자유자재로 사용할 줄 아는 선수입니다.");
	}
	
	public void sonGoldenBallMethod() {
		System.out.println("Son 선수는 아시아 최초 잉글랜드 프리미어리그 득점왕을 차지한 선수입니다.");
	}
	public void sonIntroduce() {
		System.out.println("Son의 나이는 " + this.age + "살이고, 키는 " + this.height + "cm 이며, 포지션은 " + this.position + "입니다.");
	}
}

class Kim implements SouthKoreaSoccerPlayer{
	int age;
	int height;
	String position;
	
	public Kim(int age, int height, String position) {
		this.age = age;
		this.height = height;
		this.position = position;
	}

	@Override
	public void teams() {
		System.out.println("Kim 선수의 소속팀은 독일 명문 바이에른 뮌헨입니다.");
	}

	@Override
	public void location() {
		System.out.println("Kim 선수의 소속팀의 위치는 독일입니다.");
	}

	@Override
	public void mainfoot() {
		System.out.println("Kim 선수의 주발은 오른발입니다. 하지만 왼발도 잘 쓰고 사용을 잘합니다.");
	}
	
	public void kimBestElevenDefenderMethod() {
		System.out.println("Kim 선수는 타리그에서 베스트 11 수비수로 선정되었으며, 현재 제일 손꼽히는 수비수중 한명입니다.");
	}
	
	public void kimIntroduce() {
		System.out.println("Kim 선수는 나이가 " + this.age + "이고, 키는 " + this.height + "cm 이며, 포지션은 " + this.position + "입니다.");
	}
}

class Lee implements SouthKoreaSoccerPlayer{
	int age;
	int height;
	String position;
	
	public Lee(int age, int height, String position) {
		this.age = age;
		this.height = height;
		this.position = position;
	}

	@Override
	public void teams() {
		System.out.println("Lee 선수의 소속팀은 프랑스 명문 파리생제르맹 입니다.");
	}

	@Override
	public void location() {
		System.out.println("Lee 선수의 소속팀의 위치는 프랑스입니다.");
	}

	@Override
	public void mainfoot() {
		System.out.println("Lee 선수의 주발은 왼발입니다. 하지만 오른발로 정말 잘 사용하는 선수입니다.");
	}
	
	public void leeBestDribbleMethod() {
		System.out.println("Lee 선수는 베스트 드리블러 1위에 선정되었던 적이 있고 월드컵에서 골든볼을 수상했었습니다.");
	}
	
	public void leeIntroduce() {
		System.out.println("Lee 선수는 나이가 " + this.age + "로 아직 젊고 유망한 선수이며, 키는 " + this.height + "cm 이고, 포지션은 " +  this.position + "입니다.");
	}
	
	
}

public class SouthKoreanSoccerPlayerEx {

	public static void main(String[] args) {
		SouthKoreaSoccerPlayer sksp = new Son(32, 184, "공격수(윙)");
		sksp.teams();
		sksp.location();
		sksp.mainfoot();
		
		Son son = (Son)sksp;
		son.sonGoldenBallMethod();
		son.sonIntroduce();
		
		System.out.println();
		
		sksp = new Kim(28, 190, "수비수");
		sksp.teams();
		sksp.location();
		sksp.mainfoot();
		
		Kim kim = (Kim)sksp;
		kim.kimBestElevenDefenderMethod();
		kim.kimIntroduce();
		
		System.out.println();
		
		sksp = new Lee(23, 174, "미드필더");
		sksp.teams();
		sksp.location();
		sksp.mainfoot();
		
		Lee lee = (Lee)sksp;
		lee.leeBestDribbleMethod();
		lee.leeIntroduce();
		

	}

}
