package overridingAndUpDownCastingEx9;

interface Calendar{
	
	public abstract void thefirsthalfMethod();
	public abstract void thesecondhalfMethod();
}

class TheFirstHalf implements Calendar{
	String jan;
	String feb;
	String march;
	String april;
	String may;
	String june;
	
	public TheFirstHalf(String jan, String feb, String march, String april, String may, String june) {
		this.jan = jan;
		this.feb = feb;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
	}

	@Override
	public void thefirsthalfMethod() {
		System.out.println("상반기는 기본적으로 1년 12개월에서 앞의 절반까지를 이야기를 한다.");
		System.out.println("상반기에는 대부분 " + this.jan + ", " + this.feb + ", " + this.march + ", " + this.april + ", " + this.may + ", " + this.june + "월까지라 부른다.");
	}

	@Override
	public void thesecondhalfMethod() {
		System.out.println("여기 클래스는 상반기 클래스이다. 후반기 클래스는 밑에서 다룬다.");
	}
	
	public void firsthalfMethod() {
		System.out.println("상반기 클래스에만 들어있는 메소드다.");
	}
}

class TheSecondHalf implements Calendar{
	String july;
	String aug;
	String sep;
	String oct;
	String nov;
	String dec;
	
	public TheSecondHalf(String july, String aug, String sep, String oct, String nov, String dec) {
		this.july = july;
		this.aug = aug;
		this.sep = sep;
		this.oct = oct;
		this.nov = nov;
		this.dec = dec;
	}

	@Override
	public void thefirsthalfMethod() {
		System.out.println("여기는 하반기 클래스입니다. 상반기 클래스는 이미 다뤘다!!");
	}

	@Override
	public void thesecondhalfMethod() {
		System.out.println("하반기는 기본적으로 1년 12개월에서 뒤의 절반까지를 이야기를 한다.");
		System.out.println("하반기는 대부분 " + this.july + ", " + this.aug + ", " + this.sep + ", " + this.oct + ", " + this.nov + ", " + this.dec + "월까지 부른다.");
	}
	
	public void secondhalfMethod() {
		System.out.println("하반기 클래스에만 들어있는 메소드다.");
	}
	
	
}

public class OverridingAndUpDownCastingEx9 {

	public static void main(String[] args) {
		
		Calendar calendar = new TheFirstHalf("1월", "2월", "3월", "4월", "5월", "6");
		
		//업캐스팅을 시도했지만 Calendar가 인터페이스이기 때문에 오버라이딩을 받아 자식 클래스의 메소드를 호출하게됨.
		calendar.thefirsthalfMethod();
		calendar.thesecondhalfMethod();
		
		System.out.println("-------다운캐스팅을 해서 순수 상반기 클래스에 있는 메소드를 호출할거야!!!! ----------");
		
		TheFirstHalf tfh = (TheFirstHalf)calendar; //다운캐스팅
		tfh.firsthalfMethod();
		
		System.out.println();
		
		calendar = new TheSecondHalf("7월", "8월", "9월", "10월", "11월", "12"); //업캐스팅
		calendar.thefirsthalfMethod();
		calendar.thesecondhalfMethod();
		
		System.out.println("-------다운캐스팅을 해서 순수 하반기 클래스에 있는 메소드를 호출할거야!!!! ----------");
		
		TheSecondHalf tsh = (TheSecondHalf)calendar; //다운캐스팅
		tsh.secondhalfMethod();
		
		

	}

}

