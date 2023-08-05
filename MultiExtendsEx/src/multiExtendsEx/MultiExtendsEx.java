package multiExtendsEx;

interface Soccer{
	abstract public void postion();
}

interface Forward{
	abstract public void score();
}

interface Victory extends Soccer, Forward{ //인터페이스와 인터페이스끼리는 extends로 상속이 가능
	abstract public void victoryMethod();
}

class SoccerGameAttacker implements Victory{

	@Override
	public void postion() {
		System.out.println("축구는 포지션이 공격수와 미드필더, 그리고 수비수로 크게 분류됩니다.");
	}

	@Override
	public void score() {
		System.out.println("공격수는 골을 넣어야 하는 포지션이며, 골을 많이 넣으면 넣을수록 팀이 유리합니다.");
	}

	@Override
	public void victoryMethod() {
		System.out.println("공격수 + 골 = 승리로, 축구는 골을 넣어야 이기는 스포츠입니다.");
	}
	
}


public class MultiExtendsEx {

	public static void main(String[] args) {
		
		System.out.println("--- SoccerGameAttacker 클래스 ---");
		
		SoccerGameAttacker sga = new SoccerGameAttacker();
		sga.postion();
		sga.score();
		sga.victoryMethod();
		
		System.out.println("--- SoccerGameAttacker 클래스를 Victory 인터페이스로 강제변환 ---");
		Victory victory = sga;
		victory.postion();
		victory.score();
		victory.victoryMethod();
		
		System.out.println("SoccerGameAttacker 클래스를 Forward 인터페이스로 강제변환");
		Forward forward = sga;
		// forward.postion()와 forward.victoryMethod()는 호출불가
		forward.score();
		
		System.out.println("SoccerGameAttacker 클래스를 Soccer 인터페이스로 강제변환");
		Soccer soccer = sga;
		// soccer.score()와 soccer.victoryMethod()는 호출불가
		soccer.postion();
	}

}
