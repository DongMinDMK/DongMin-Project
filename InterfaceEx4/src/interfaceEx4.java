
public class interfaceEx4 {

	public static void main(String[] args) {
		ReconizedHuman rh = new ReconizedHuman();
		System.out.println("오늘 날씨 : 비");
		rh.raining();
		rh.putUmbrella();
		rh.putRaincoat();
		
		System.out.println("내일 날씨는 : 눈");
		rh.snowing();
		rh.putUmbrella();
		
		System.out.println("내일 모레 날씨 : 맑음");
		rh.sunning();
		
		System.out.println("글피의 날씨 : 천둥(비)");
		rh.thundering();
		rh.raining();
		rh.putUmbrella();
		rh.putRaincoat();
		
		rh.meDMK();




	}

}

interface Weather{ //인터페이스는 무조건 자식에서 상속을 받아 오버라이딩으로 재정의를 해야한다.(=추상 클래스, 추상 메소드)
	public void snowing();
	public void sunning();
	public void raining();
	public void thundering();
}
interface human{
	public void putUmbrella();
	public void putRaincoat();
}

class ReconizedHuman implements Weather, human{ //인터페이스인 Weather와 human을 한꺼번에 상속받는 클래스 ReconizedHuman 클래스 생성, 이 클래스에서 위에 구현한 인터페이스 메소드들을 하나씩 오버라이딩하여 구현해야함

	@Override
	public void putUmbrella() {
		System.out.println("우산을 챙겨야합니다.");
	}

	@Override
	public void putRaincoat() {
		System.out.println("우비를 챙겨야합니다.");
	}

	@Override
	public void snowing() {
		System.out.println("눈이 옵니다.");
	}

	@Override
	public void sunning() {
		System.out.println("해가 비춥니다. 산책이나 한번 해도 좋은 날씨네요!");
	}

	@Override
	public void raining() {
		System.out.println("비가 내립니다!");
	}

	@Override
	public void thundering() {
		System.out.println("천둥이 칩니다!! ");
	}
	
	public void meDMK() {
		System.out.println("나 DMK는 인지하고 있는 사람입니다.");
	}
	
}

