package sportsEx;

interface Sports{
	public abstract void playerCountMethod();
	public abstract void sportsRoleMethod();
	public abstract void playerPositionMethod();
}

class Soccer implements Sports{
	int playerCount;
	String soccerRole;
	String playerPosition;
	
	public Soccer(int playerCount, String soccerRole, String playerPosition) {
		this.playerCount = playerCount;
		this.soccerRole = soccerRole;
		this.playerPosition = playerPosition;
	}

	@Override
	public void playerCountMethod() {
		System.out.println("스포츠 종목 중 축구는 " + this.playerCount + "명의 선수들이 플레이하는 종목입니다.");
	}

	@Override
	public void sportsRoleMethod() {
		System.out.println("축구의 " + this.soccerRole + "은 전반, 후반으로 경기가 구분되어 있으며, 각각 45분 경기입니다. 그리고 골키퍼 제외 손은 사용할 수 없고, 발과 머리로 공을 사용할 수 있습니다. 총 90분으로 두팀이 경기를 치뤄 점수가 높은 팀이 승리를 하는 종목입니다.");
	}

	@Override
	public void playerPositionMethod() {
		System.out.println("축구라는 종목은 " + this.playerPosition + "이 나누어져 있습니다. 크게 4가지로 분류가 가능합니다. 골키퍼, 수비수, 미드필더, 공격수로 구분을 합니다.");
	}
	
	public void soccerMethod() {
		System.out.println("축구는 가장 인기 있는 스포츠 종목중 하나이며, 저도 또한 많이 좋아하는 스포츠 중 하나입니다.");
	}
}

class Baseball implements Sports{
	int playerCount;
	String baseballRole;
	String playerPosition;
	
	public Baseball(int playerCount, String baseballRole, String playerPosition) {
		this.playerCount = playerCount;
		this.baseballRole = baseballRole;
		this.playerPosition = playerPosition;
	}

	@Override
	public void playerCountMethod() {
		System.out.println("스포츠 종목 중 야구는 " + this.playerCount + "명의 선수들이 플레이하는 종목입니다.");
	}

	@Override
	public void sportsRoleMethod() {
		System.out.println("야구의 " + this.baseballRole + "은 1회부터 9회까지로 구성이 되어 있으며, 투수는 손으로 공을 던지며, 타자는 투수가 던진 공을 배트를 이용하여 치고 베이스로 출루하는 그런 종목입니다.");
	}

	@Override
	public void playerPositionMethod() {
		System.out.println("야구라는 종목은 " + this.playerPosition + "이 나누어져 있습니다. 크게 수비팀과 공격팀으로 나누어져 있는데 수비팀에는 투수, 포수, 내야수, 외야수로 나누며, 공격팀은 타자로 나뉩니다.");
	}
	public void baseballMethod() {
		System.out.println("야구는 가장 인기있는 스포츠 중 하나입니다.");
	}
}

class Maraton implements Sports{
	int playerCount;
	String maratonRole;
	String playerPosition;
	
	public Maraton(int playerCount, String maratonRole, String playerPosition) {
		this.playerCount = playerCount;
		this.maratonRole = maratonRole;
		this.playerPosition = playerPosition;
	}

	@Override
	public void playerCountMethod() {
		System.out.println("스포츠 종목 중 마라톤은 최대 " + this.playerCount + "명의 선수들이 플레이하는 종목입니다.");
	}

	@Override
	public void sportsRoleMethod() {
		System.out.println("마라톤의 " + this.maratonRole + "은 이전의 진행했던 종목들의 점수를 토대로 마라톤의 뛰는 선수들의 번호가 매겨지며, 이 번호대로 출발선에서 시작을 합니다. 그리고 시작과 동시에 마라톤 선수들은 42.195km를 달리기 시작하며, 달리고 마지막에 결승선에 통과하는 선수가 이기는 종목입니다.");
	}

	@Override
	public void playerPositionMethod() {
		System.out.println("마라톤이라는 종목은 " + this.playerPosition + "이 나누어져 있진 않습니다. 하지만 페이스메이커라는 동료가 있기에 마라톤 선수가 있습니다. 페이스메이커란 말그대로 마라톤 선수가 경기를 잘 뛸 수 있도록 경기에서 같이 보조하면서 뛰는 선수를 뜻합니다. 이것이 바로 진정한 스포츠맨십이라고 생각하는 스포츠입니다.");
	}
	
	public void maratonMethod() {
		System.out.println("마라톤은 정말 힘들면 같이 도와주고 같이 끌어주는 정말 아름다운 스포츠 종목 중 하나입니다.");
	}
	
}
public class SportsEx {

	public static void main(String[] args) {
		
		Sports sports = new Soccer(11, "규칙", "포지션");
		sports.playerCountMethod();
		sports.sportsRoleMethod();
		sports.playerPositionMethod();
		
		Soccer soccer = (Soccer)sports;
		soccer.soccerMethod();
		
		System.out.println();
		
		sports = new Baseball(18, "규칙", "포지션");
		sports.playerCountMethod();
		sports.sportsRoleMethod();
		sports.playerPositionMethod();
		
		Baseball baseball = (Baseball)sports;
		baseball.baseballMethod();
		
		System.out.println();
		
		sports = new Maraton(100, "규칙", "포지션");
		sports.playerCountMethod();
		sports.sportsRoleMethod();
		sports.playerPositionMethod();
		
		Maraton maraton = (Maraton)sports;
		maraton.maratonMethod();
		
		

	}

}
