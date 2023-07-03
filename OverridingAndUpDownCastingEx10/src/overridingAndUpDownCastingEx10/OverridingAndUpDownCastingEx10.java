package overridingAndUpDownCastingEx10;

interface Company{
	public abstract void communicate();
	public abstract void show();
}

class DMKPerson implements Company{
	
	int age;
	String name;
	String location;
	
	public DMKPerson(int age, String name, String location) {
		this.age = age;
		this.name = name;
		this.location = location;
	}

	@Override
	public void communicate() {
		System.out.println("DMK 사원이 소속된 회사는 다른 직원들과 소통을 자주 즐겨하는 그러한 좋은 회사입니다.");
	}

	@Override
	public void show() {
		System.out.println("DMK 회사의 실적은 정말 높은 수치를 기록하고 있습니다.");
	}
	
	public void DMKPersonMethod() {
		System.out.println(this.age + "살, " + this.name + "사원은 " + this.location + "에 위치해 있습니다.");
	}
}

class AnonPerson implements Company{
	int age;
	String name;
	String location;
	
	public AnonPerson(int age, String name, String location) {
		this.age = age;
		this.name = name;
		this.location = location;
	}

	@Override
	public void communicate() {
		System.out.println("익명의 사람의 익명의 회사는 소통을 잘 진행하지 않습니다.");
	}

	@Override
	public void show() {
		System.out.println("소통을 잘하지 않는 회사는 실적이 오르기 많이 어렵습니다.");
	}
	
	public void AnonMethod() {
		System.out.println("소통을 잘하지 않는 회사는 실패의 지름길입니다.");
	}
}

public class OverridingAndUpDownCastingEx10 {

	public static void main(String[] args) {
		
		Company company = new DMKPerson(26, "김동민", "서울시 노원구");
		
		company.communicate();
		company.show();
		
		DMKPerson person = (DMKPerson)company;
		
		person.DMKPersonMethod();
		
		System.out.println();
		
		company = new AnonPerson(30, "익명의누군가", "익명의사람위치");
		
		company.communicate();
		company.show();
		
		AnonPerson person2 = (AnonPerson)company;
		person2.AnonMethod();

	}

}
