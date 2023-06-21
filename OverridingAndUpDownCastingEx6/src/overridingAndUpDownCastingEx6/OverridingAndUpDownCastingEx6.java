package overridingAndUpDownCastingEx6;

interface Hotel{
	public void room();
	public void elevator();
}

class HotelPeople implements Hotel{
	String walk;
	String clean;
	public HotelPeople() {
		
	}
	
	public HotelPeople(String walk, String clean) {
		this.walk = walk;
		this.clean = clean;
	}

	@Override
	public void room() {
		System.out.println("호텔직원들은 각각의 객실을 이용합니다.");
	}

	@Override
	public void elevator() {
		System.out.println("호텔직원들은 엘레베이터를 이용합니다.");
	}
	
	
}

class HotelVisitor implements Hotel{
	
	String reservation;
	String checkin;
	String checkout;
	
	public HotelVisitor(String reservation, String checkin, String checkout) {
		this.reservation = reservation;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public void room() {
		System.out.println("호텔방문객들은 호텔 방을 이용합니다.");
	}

	@Override
	public void elevator() {
		System.out.println("호텔방문객들은 엘레베이터를 이용합니다.");
	}
	
	public void visitorMethod() {
		System.out.println("호텔방문객들은 " + this.reservation + "을 하고 호텔을 들어올 수 있고, " + this.checkin + "을 하여 호텔의 방을 쓸 수 있으며, 나갈때는 반드시 " + this.checkout + "을 해야 합니다.");
	}
	
	
}

public class OverridingAndUpDownCastingEx6 {

	public static void main(String[] args) {
		
		Hotel hotel = new HotelPeople();
		hotel.room();
		hotel.elevator();
		
		hotel = new HotelVisitor("예약", "체크인", "체크아웃");
		
		hotel.room();
		hotel.elevator();
		
		HotelVisitor hv = (HotelVisitor)hotel;
		hv.visitorMethod();

	}

}
