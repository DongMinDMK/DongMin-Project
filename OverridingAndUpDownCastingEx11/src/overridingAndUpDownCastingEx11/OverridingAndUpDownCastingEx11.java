package overridingAndUpDownCastingEx11;

interface Theater{
	public abstract void theaterlocation();
	public abstract void peopleCount();
}

class MissionImpossible implements Theater{
	String theaterLocation;
	int peopleCount;
	int time;
	
	public MissionImpossible(String theaterLocation, int peopleCount, int time) {
		this.theaterLocation = theaterLocation;
		this.peopleCount = peopleCount;
		this.time = time;
	}

	@Override
	public void theaterlocation() {
		System.out.println("미션임파서블 상영관의 위치는 " + this.theaterLocation + "입니다.");
	}

	@Override
	public void peopleCount() {
		System.out.println(this.theaterLocation + "에서 미션 임파서블을 관람하시는 사람 수는 " + this.peopleCount + "명입니다.");
	}
	
	public void missionImpossibleMethod() {
		System.out.println("미션임파서블 상영시간은 " + this.time + "시 입니다.");
	}
}

class CrimeCity implements Theater{
	
	String theaterLocation;
	int peopleCount;
	int time;
	
	public CrimeCity(String theaterLocation, int peopleCount, int time) {
		this.theaterLocation = theaterLocation;
		this.peopleCount = peopleCount;
		this.time = time;
	}

	@Override
	public void theaterlocation() {
		System.out.println("범죄도시의 상영관 위치는 " + this.theaterLocation + "입니다.");
	}

	@Override
	public void peopleCount() {
		System.out.println(this.theaterLocation + "에서 범죄도시를 관람하시는 사람 수는 " + this.peopleCount + "명입니다.");
	}
	
	public void crimecityMethod() {
		System.out.println("범죄도시 상영시간은 " + this.time + "시 입니다.");
	}
	
	
}

class Avatar implements Theater{
	String theaterLocation;
	int peopleCount;
	int time;
	
	public Avatar(String theaterLocation, int peopleCount, int time) {
		this.theaterLocation = theaterLocation;
		this.peopleCount = peopleCount;
		this.time = time;
	}

	@Override
	public void theaterlocation() {
		System.out.println("아바타의 상영관 위치는 " + this.theaterLocation + "입니다.");
	}

	@Override
	public void peopleCount() {
		System.out.println(this.theaterLocation + "에서 아바타를 관람하시는 사람 수는 " + this.peopleCount + "명입니다.");
	}
	
	public void avatarMethod() {
		System.out.println("아바타 상영시간은 " + this.time + "시 입니다.");
	}
}
public class OverridingAndUpDownCastingEx11 {

	public static void main(String[] args) {
		
		//상영시간은 24시간 기준으로 하였습니다(ex. 오후 1시 : 13시, 오후 4시 : 16시)
		Theater th = new MissionImpossible("6관", 100, 12);
		th.theaterlocation();
		th.peopleCount();
		MissionImpossible mi = (MissionImpossible)th;
		mi.missionImpossibleMethod();
		
		System.out.println();
		
		th = new CrimeCity("8관", 130, 16);
		th.theaterlocation();
		th.peopleCount();
		
		CrimeCity cc = (CrimeCity)th;
		cc.crimecityMethod();
		
		System.out.println();
		
		th = new Avatar("3관", 150, 18);
		th.theaterlocation();
		th.peopleCount();
		
		Avatar avatar = (Avatar)th;
		avatar.avatarMethod();

	}

}
