package schoolExtendsEx;

class School{
	String person;
	String conviencestore;
	String schoolbus;
	
	public School() {
		
	}
	
	public School(String person, String conviencestore, String schoolbus) {
		this.person = person;
		this.conviencestore = conviencestore;
		this.schoolbus = schoolbus;
	}
	
    public void schoolMethod() {
    	System.out.println("학교에서는 대부분 " + this.person + "과, " + this.conviencestore + ", 그리고 " + this.schoolbus + "가 있습니다.");
    }
}

class People extends School{
	String walk;
	String run;
	String talk;
	
	public People(String person, String conviencestore, String schoolbus, String walk, String run, String talk) {
		super(person, conviencestore, schoolbus); //부모 생성자 강제 호출(이동)
		this.walk = walk;
		this.run = run;
		this.talk = talk;
	}
	
	public void peopleMethod() {
		System.out.println("그리고 학교안에 사람들은 " + this.walk + ", " + this.run + ", " + this.talk + "를 즐겨합니다.");
	}
}

class Convience extends School{
	String chair;
	String coffee;
	String playground;
	
	public Convience(String person, String conviencestore, String schoolbus, String chair, String coffee, String playground) {
		super(person, conviencestore, schoolbus); //부모 생성자 강제 호출(이동)
		this.chair = chair;
		this.coffee = coffee;
		this.playground = playground;
	}
	
	public void convienceMethod() {
		System.out.println("또한 학교 내부 시설은 편히 앉을 수 있는 " + this.chair + "와, " + this.coffee + " 그리고, 뛰어놀 수 있는" + this.playground + "가 있습니다.");
	}
}

public class SchoolExtendsEx {

	public static void main(String[] args) {
		
		School school = new School("사람", "편의점", "스쿨버스");
		school.schoolMethod();
		
		People people = new People("사람", "편의점", "스쿨버스", "걷고", "뛰고", "이야기");
		people.peopleMethod();
		
		Convience cv = new Convience("사람", "편의점", "스쿨버스", "의자", "커피", "운동장");
		cv.convienceMethod();

	}

}
