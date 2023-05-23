package practiceEx;

class Family{
	int age;
	String name;
	String gender;
	
	public Family() {
		age = 0;
		name = null;
		gender = null;
	}
	
	public Family(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() { //이 toString 메소드는 최 조상 클래스인 Object클래스의 toString 메소드를 오버라이딩 재정의 하여 사용함.
		return "Family [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}

class Father extends Family{
	String company;
	
	public Father(int age, String name, String gender, String company) {
		super(age, name, gender);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() { //이 toString 메소드는 최 조상 클래스인 Object클래스의 toString 메소드를 오버라이딩 재정의 하여 사용함.
		return "Father [company=" + company + "]";
	}
	
}

class Mother extends Family{
	String houseWork;
	
	public Mother(int age, String name, String gender, String houseWork) {
		super(age, name, gender);
		this.houseWork = houseWork;
	}

	public String getHouseWork() {
		return houseWork;
	}

	public void setHouseWork(String houseWork) {
		this.houseWork = houseWork;
	}

	@Override
	public String toString() { //이 toString 메소드는 최 조상 클래스인 Object클래스의 toString 메소드를 오버라이딩 재정의 하여 사용함.
		return "Mother [houseWork=" + houseWork + "]";
	}
	
	
}

public class OverridingandSetGetEx {

	public static void main(String[] args) {
		
		Family family = new Family();
		family.setAge(80);
		family.setName("가족");
		family.setGender("혼성");
		
		System.out.println("가족의 총 나이의 합은 " + family.getAge());
		System.out.println("가족의 이름은 " + family.getName());
		System.out.println("가족의 성별은 " + family.getGender());
		
		System.out.println("총 출력 : " + family.toString());
		
		Family family2 = new Father(50, "홍길동", "남자", "컴퓨터"); //업캐스팅 자식 클래스인 Father에서 부모 클래스 Family로 업캐스팅
		System.out.println(family2.toString()); //업캐스팅에 의하여 부모클래스밖에 쓰지 못하지만 오버라이딩을 했기 때문에 다시 자식 본인의 클래스의 toString() 메소드를 호출
		
		Family family3 = new Mother(40, "이쁜이", "여자", "항공서비스");
		System.out.println(family3.toString());
		
		

	}

}

