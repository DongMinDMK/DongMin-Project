package favoriteEnglandFootballTeamEx;

interface EnglandPremierLeauge{
	public abstract void introduce();
	public abstract void teamLocation();
}

class Tottenham implements EnglandPremierLeauge{
	String typicalPlayer;
	String uniformColor;
	String typicalLogo;
	
	public Tottenham(String typicalPlayer, String uniformColor, String typicalLogo) {
		this.typicalPlayer = typicalPlayer;
		this.uniformColor = uniformColor;
		this.typicalLogo = typicalLogo;
	}

	@Override
	public void introduce() {
		System.out.println("잉글랜드 프리미어리그 중 토트넘은 중위권 클럽 중 하나입니다.");
	}

	@Override
	public void teamLocation() {
		System.out.println("토트넘은 영국 런던에 위치한 구단 중 하나입니다.");
	}
	
	public void totMethod() {
		System.out.println("토트넘의 대표적인 선수는 " + this.typicalPlayer + "이고, 대표 유니폼 색깔은 " + this.typicalPlayer + "입니다.");
		System.out.println("그리고 토트넘의 대표적인 엠블럼은 " + this.typicalLogo + "을 상징합니다.");
	}
}

class ManCity implements EnglandPremierLeauge{
	String typicalPlayer;
	String uniformColor;
	String typicalLogo;
	
	public ManCity(String typicalPlayer, String uniformColor, String typicalLogo) {
		this.typicalPlayer = typicalPlayer;
		this.uniformColor = uniformColor;
		this.typicalLogo = typicalLogo;
	}

	@Override
	public void introduce() {
		System.out.println("잉글랜드 프리미어리그 중 맨시티 빅클럽 중 하나입니다.");
	}

	@Override
	public void teamLocation() {
		System.out.println("맨시티는 잉글랜드에서 맨체스터 시 에 위치한 구단 중 하나입니다.");
	}
	
	public void manCityMethod() {
		System.out.println("맨시티에 대표적인 선수로는 " + this.typicalPlayer + "선수가 있고, 대표적인 유니폼 색깔은 " + this.uniformColor + "입니다.");
		System.out.println("또한 대표적인 엠블럼은 " + this.typicalLogo + "입니다.");
	}
}

class ManUtd implements EnglandPremierLeauge{
	String typicalPlayer;
	String uniformColor;
	String typicalLogo;
	
	public ManUtd(String typicalPlayer, String uniformColor, String typicalLogo) {
		this.typicalPlayer = typicalPlayer;
		this.uniformColor = uniformColor;
		this.typicalLogo = typicalLogo;
	}

	@Override
	public void introduce() {
		System.out.println("잉글랜드 프리미어리그 중 맨체스터 유나이티드는 빅클럽 중 하나입니다.");
	}

	@Override
	public void teamLocation() {
		System.out.println("맨체스터 유나이티드는 잉글랜드에서 맨체스터 시 에 위치한 구단 중 하나입니다.");
	}
	
	public void manUtdMethod() {
		System.out.println("맨체스터 유나이티드의 대표적인 선수로는 우리나라 선수로 " + this.typicalPlayer + " 선수가 뛴 경험이 있고, 대표적인 유니폼 색깔은 " + this.uniformColor + "입니다.");
		System.out.println("엠블럼은 " + this.typicalLogo + "입니다.");
	}
}

public class FavoriteEnglandFootballTeamEx {

	public static void main(String[] args) {
		EnglandPremierLeauge epl = new Tottenham("손흥민", "남색", "닭");
		epl.introduce();
		epl.teamLocation();
		
		Tottenham tot = (Tottenham)epl;
		tot.totMethod();
		
		System.out.println();
		
		epl = new ManCity("홀란드, 케빈 더브라위너", "하늘색", "배와 운하");
		epl.introduce();
		epl.teamLocation();
		
		ManCity mancity = (ManCity)epl;
		mancity.manCityMethod();
		
		System.out.println();
		
		epl = new ManUtd("박지성", "빨강색", "범선과 악마");
		epl.introduce();
		epl.teamLocation();
		
		ManUtd mu = (ManUtd)epl;
		mu.manUtdMethod();
	}

}
