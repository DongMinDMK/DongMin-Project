package soccerEx;

class Forward{
	String tarketer;
	String striker;
	
	public Forward(String tarketer, String striker) {
		this.tarketer = tarketer;
		this.striker = striker;
	}
	
	public void forwardMethod() {
		System.out.println("축구 포지션 중 공격수에는 " + this.tarketer + "와 " + this.striker + "가 있습니다.");
	}
}

class Midfilder{
	String attackingMidfilder;
	String centerMidfilder;
	String defenseMidfilder;
	
	public Midfilder(String attackingMidfilder, String centerMidfilder, String defenseMidfilder) {
		this.attackingMidfilder = attackingMidfilder;
		this.centerMidfilder = centerMidfilder;
		this.defenseMidfilder = defenseMidfilder;
	}
	
	public void midfilderMethod() {
		System.out.println("축구 포지션 중 미드필더에는 대략적으로 " + this.attackingMidfilder + ", " + this.centerMidfilder + ", 그리고 " + this.defenseMidfilder + "가 있습니다.");
	}
}

class Defenser{
	String sweeper;
	String libero;
	
	public Defenser(String sweeper, String libero) {
		this.sweeper = sweeper;
		this.libero = libero;
	}
	
	public void defenserMethod() {
		System.out.println("축구 포지션 중 수비수에는 대략적으로 " + this.sweeper + "라는 포지션과, " + this.libero + "라는 포지션이 있습니다.");
	}
}

public class SoccerEx {

	public static void main(String[] args) {
		
		Forward forward = new Forward("타겟터", "스트라이커(ST)");
		forward.forwardMethod();
		
		Midfilder midfilder = new Midfilder("공격형 미드필더(CAM)", "중앙 미드필더(CM)", "수비형 미드필더(CDM)");
		midfilder.midfilderMethod();
		
		Defenser defenser = new Defenser("스위퍼(SW)", "리베로(Lib)");
		defenser.defenserMethod();
		
		

	}

}
