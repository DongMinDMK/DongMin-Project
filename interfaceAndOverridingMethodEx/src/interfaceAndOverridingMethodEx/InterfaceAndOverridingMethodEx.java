package interfaceAndOverridingMethodEx;

interface Player{
	public abstract void running();
	public abstract void practice();
}

class Park implements Player{
	String swim;
	
	public Park(String swim) {
		this.swim = swim;
	}

	@Override
	public void running() {
		System.out.println("박선수는 달리기를 잘합니다. 또한 박선수는 " + this.swim + "을 잘합니다.");
		
	}

	@Override
	public void practice() {
		System.out.println("박선수는 연습괴물입니다.");
	}
	
	
}
class Kim implements Player{
	String speed;
	
	public Kim(String speed) {
		this.speed = speed;
	}

	@Override
	public void running() {
		System.out.println("김선수는 달리기가 매우 빠르며 특기가 빠른속도로 치고 나가는 " + this.speed + "입니다.");
	}

	@Override
	public void practice() {
		System.out.println("김선수는 연습괴물입니다.");
	}
}

class Lee implements Player{
	String strong;
	
	public Lee(String strong) {
		this.strong = strong;
	}

	@Override
	public void running() {
		System.out.println("이 선수는 " + this.strong + "이 매우 쎄서 공을 던지는 데 아주 탁월합니다.");
	}

	@Override
	public void practice() {
		System.out.println("김선수는 연습벌레입니다.");
	}
	
	
}

public class InterfaceAndOverridingMethodEx {

	public static void main(String[] args) {
		Player player = new Park("수영");
		player.running();
		player.practice();
		
		Player player2 = new Kim("주력");
		player2.running();
		player2.practice();
		
		Player player3 = new Lee("힘");
		player3.running();
		player3.practice();

	}

}
