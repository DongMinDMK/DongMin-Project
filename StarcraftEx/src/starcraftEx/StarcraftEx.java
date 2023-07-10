package starcraftEx;

class Starcraft{
	String protoss;
	String zerg;
	String terran;
	
	public Starcraft(String protoss, String zerg, String terran) {
		this.protoss = protoss;
		this.zerg = zerg;
		this.terran = terran;
	}
	
	public void introduce() {
		System.out.println("스타크래프트 게임에는 3가지 종족이 있습니다.");
	}
	
	public void parentMethod() {
		System.out.println("종족에는 " + this.protoss + ", " + this.zerg + ", " + this.terran + "이 있습니다.");
	}
}

class Protoss extends Starcraft{
	String zilot;
	String templer;
	String dragon;
	
	public Protoss(String protoss, String zerg, String terran, String zilot, String templer, String dragon) {
		super(protoss, zerg, terran);
		this.zilot = zilot;
		this.templer = templer;
		this.dragon = dragon;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("그 중에 프로토스는 비생명체 컨셉을 지니고 있으며 외계인 컨셉으로 지니고 있는 종족 중 하나입니다.");
	}

	@Override
	public void parentMethod() {
		super.parentMethod();
		System.out.println("프로토스의 유닛은 " + this.zilot + ", " + this.templer + ", " + this.dragon + "등이 있습니다.");
	}
}

class Zerg extends Starcraft{
	String juggling;
	String hydra;
	String ultra;
	
	public Zerg(String protoss, String zerg, String terran, String juggling, String hydra, String ultra) {
		super(protoss, zerg, terran);
		this.juggling = juggling;
		this.hydra = hydra;
		this.ultra = ultra;
	}

	@Override
	public void introduce() {
		
		System.out.println("그 중에 저그는 괴물컨셉으로 물량이 많아야 하기 때문에 손이 빨라야 하는 종족입니다.");
	}

	@Override
	public void parentMethod() {
		
		System.out.println("저그 유닛은 " + this.juggling + ", " + this.hydra + ", " + this.ultra + "등으로 이루어져 있습니다.");
	}
}

class Terran extends Starcraft{
	String marrin;
	String tank;
	String vulture;
	
	public Terran(String protoss, String zerg, String terran, String marrin, String tank, String vulture) {
		super(protoss, zerg, terran);
		this.marrin = marrin;
		this.tank = tank;
		this.vulture = vulture;
	}

	@Override
	public void introduce() {
		
		System.out.println("그 중에 테란은 사람(인간) 컨셉이며, 사람이 괴생명체나 괴물들에 맞써 싸우는 수비종족입니다.");
	}

	@Override
	public void parentMethod() {
		
		System.out.println("테란 유닛은 " + this.marrin + ", " + this.tank + ", " + this.vulture + "등으로 이루어져 있습니다.");
	}
	
	
}
public class StarcraftEx {

	public static void main(String[] args) {
		Starcraft sc = new Starcraft("프로토스", "저그", "테란");
		
		sc.introduce();
		sc.parentMethod();
		
		System.out.println();
		
		sc = new Protoss("프로토스", "저그", "테란", "질럿", "템플러", "드라군"); //업캐스팅
		sc.introduce();  //업캐스팅을 하여서 부모 클래스를 호출했지만 자식에서 오버라이딩으로 재정의를 함으로 자식클래스의 오버라이딩한 메소드가 출력
		sc.parentMethod(); //super 메소드를 호출 시 자동적으로 부모클래스의 메소드를 먼저 호출하는 것을 테스트하기 위해 protoss 클래스에만 적용시킴
		
		System.out.println();
		
		sc = new Zerg("프로토스", "저그", "테란", "저글링", "히드라", "울트라");
		sc.introduce(); //이하동문
		sc.parentMethod(); //이하동문
		
		System.out.println();
		
		sc = new Terran("프로토스", "저그", "테란", "마린", "탱크", "벌쳐");
		sc.introduce(); //이하동문
		sc.parentMethod(); //이하동문
		

	}

}
