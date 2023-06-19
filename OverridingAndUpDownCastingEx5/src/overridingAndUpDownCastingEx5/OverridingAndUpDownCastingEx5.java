package overridingAndUpDownCastingEx5;
interface Soccer{
	public void run();
	public void header();
}

class Forward implements Soccer{
	String score;
	
	public Forward(String score) {
		this.score = score;
	}

	@Override
	public void run() {
		System.out.println("공격수가 달립니다.");
		
	}

	@Override
	public void header() {
		System.out.println("공격수가 헤딩을 합니다.");
	}
	
	public void scored() {
		System.out.println("공격수가 " + this.score + "을 넣습니다."); 
	}
}

class Midfilder implements Soccer{
	String passing;
	
	public Midfilder(String passing) {
		this.passing = passing;
	}

	@Override
	public void run() {
		System.out.println("미드필더 선수가 달립니다.");
	}

	@Override
	public void header() {
		System.out.println("미드필더 선수가 헤딩을 합니다.");
	}
	
	public void passed() {
		System.out.println("미드필더가 " + this.passing + "를 공격수에게 찔러줍니다.");
	}
	
	
}

class Defender implements Soccer{
	String defense;
	
	public Defender(String defense) {
		this.defense = defense;
	}

	@Override
	public void run() {
		System.out.println("수비수가 달립니다.");
	}

	@Override
	public void header() {
		System.out.println("수비수가 헤딩을 합니다.");
	}
	
	public void defensed() {
		System.out.println("수비수가 " + this.defense + "를 합니다.");
	}
	
}

public class OverridingAndUpDownCastingEx5 {

	public static void main(String[] args) {
		
		Soccer soccer = new Forward("골"); //업캐스팅
		
		soccer.run();
		soccer.header();
		
		Forward forward = (Forward)soccer; //다운캐스팅
		
		forward.scored();
		
		System.out.println();
		
		soccer = new Midfilder("패스"); //업캐스팅
		
		soccer.run();
		soccer.header();
		
		Midfilder midfilder = (Midfilder)soccer; //다운캐스팅
		midfilder.passed();
		
		System.out.println();
		
		soccer = new Defender("수비"); //업캐스팅
		soccer.run();
		soccer.header();
		
		Defender defend = (Defender)soccer; //다운캐스팅
		
		defend.defensed();
		

	}

}
