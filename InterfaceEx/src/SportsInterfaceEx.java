
public class SportsInterfaceEx {

	public static void main(String[] args) {
		
		System.out.println("-------공을 사용하는 스포츠 입니다.-------");
	     
	     Sports sports = new ball_Sports();
	     sports.soccer();
	     sports.basketball();
	     sports.baseball();
	     sports.volleyball();
	     
	     System.out.println();
	     System.out.println("-------공을 사용하지 않는 스포츠 입니다.-------");
	     
	     Sports2 sports2 = new nonBall_Sports();
	     sports2.swim();
	     sports2.taekwondo();
	     sports2.speedskating();
	     sports2.cycle();
	 }

}
interface Sports{
	abstract void soccer();
	abstract void basketball();
	abstract void baseball();
	abstract void volleyball();
}
interface Sports2{
	abstract void swim();
    abstract void taekwondo();
    abstract void speedskating();
    abstract void cycle();
}

class ball_Sports implements Sports{
	
	@Override
	public void soccer() {
		System.out.println("공을 사용하는 축구 스포츠 입니다.");
	}

	@Override
	public void basketball() {
		System.out.println("공을 사용하는 농구 스포츠 입니다.");
	}

	@Override
	public void baseball() {
		System.out.println("공을 사용하는 야구 스포츠 입니다.");
	}

	@Override
	public void volleyball() {
		System.out.println("공을 사용하는 배구 스포츠 입니다.");
	}
	
}

class nonBall_Sports implements Sports2{

	@Override
	public void swim() {
		System.out.println("공을 사용하지 않는 수영 스포츠입니다.");
	}

	@Override
	public void taekwondo() {
		System.out.println("공을 사용하지 않는 태권도 스포츠입니다.");
	}

	@Override
	public void speedskating() {
		System.out.println("공을 사용하지 않는 스피드스케이팅 스포츠입니다.");
	}

	@Override
	public void cycle() {
		System.out.println("공을 사용하지 않는 사이클 스포츠입니다.");
	}
	
}
