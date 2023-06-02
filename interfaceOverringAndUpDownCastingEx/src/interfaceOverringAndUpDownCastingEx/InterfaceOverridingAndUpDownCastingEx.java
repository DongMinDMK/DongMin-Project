package interfaceOverringAndUpDownCastingEx;

interface Person{
	public void run();
	public void walk();
	public void speak();
}

class Student implements Person{
	int age;
	String name;
	String gender;
	String student_id;
	
	public Student(int age, String name, String gender, String student_id) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.student_id = student_id;
	}

	@Override
	public void run() {
		System.out.println("학생이 뜁니다.");
	}

	@Override
	public void walk() {
		System.out.println("학생이 걷습니다.");
	}

	@Override
	public void speak() {
		System.out.println("학생이 말을 합니다.");
	}
	
	public void introduce() {
		System.out.println("학생의 나이는 " + this.age + "살이고, 학생의 이름은 " + this.name + "이고, 학생의 성별은 " + this.gender + "이며, 학생의 학번은 " + this.student_id + "입니다.");
	}
	
	public void study() {
		System.out.println("교수들의 설명을 듣고 학생들은 공부합니다.");
	}
	
	
}

class Professor implements Person{
	int age;
	String name;
	String gender;
	String subject;
	
	public Professor(int age, String name, String gender, String subject) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.subject = subject;
	}

	@Override
	public void run() {
		System.out.println("교수가 뜁니다.");
	}

	@Override
	public void walk() {
		System.out.println("교수가 걷습니다.");
	}

	@Override
	public void speak() {
		System.out.println("교수가 말을 합니다.");
	}
	
	public void introduce() {
		System.out.println("교수의 나이는 " + this.age + "살이고, 교수의 이름은 " + this.name + "이고, 교수의 성별은 " + this.gender + "이며, 교수가 가르치는 과목은 " + this.subject + "입니다.");
	}
	
	public void teach() {
		System.out.println("교수가 학생들을 가르칩니다.");
	}
	
}

class Manager implements Person{
	int age;
	String name;
	String gender;
	String department;
	
	public Manager(int age, String name, String gender, String department) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}

	@Override
	public void run() {
		System.out.println("매니저가 뜁니다.");
	}

	@Override
	public void walk() {
		System.out.println("매니저가 걷습니다.");
	}

	@Override
	public void speak() {
		System.out.println("매니저가 말을 합니다.");
	}
	
	public void support() {
		System.out.println("교수와 학생을 매니저가 관리합니다.");
	}
	
	public void introduce() {
		System.out.println("매니저의 나이는 " + this.age + "살이고, 매니저의 이름은 " + this.name + "이고, 매니저의 성별은 " + this.gender + "이며, 매니저의 부서는 " + this.department + "입니다.");
	}
	
	
}



public class InterfaceOverridingAndUpDownCastingEx {

	public static void main(String[] args) {
		
		Person person = new Student(18, "김길동", "남성", "2017"); //업캐스팅
		Person person3 = new Student(19, "김길순", "여성", "2018");
		
		person.run();
		person.walk();
		person.speak();
		
		Student student = (Student)person; //다운캐스팅
		student.study();
		student.introduce();
		
		Student student1 = (Student)person3; //다운캐스팅
		student1.study();
		student1.introduce();
		
		Person person1 = new Professor(28, "홍길순", "여성", "컴퓨터"); //업캐스팅
		Person person4 = new Professor(34, "김철수", "남성", "체육");
		
		person1.run();
		person1.walk();
		person1.speak();
		
		Professor professor = (Professor)person1; //다운캐스팅
		
		professor.teach();
		professor.introduce();
		
		Professor professor1 = (Professor)person4; //다운캐스팅
		professor1.teach();
		professor1.introduce();
		
		
		Person person2 = new Manager(35, "김여운", "여성", "학사관리부"); //업캐스팅
		Person person5 = new Manager(40, "김순신", "남성", "인사부");
		
		person2.run();
		person2.walk();
		person2.speak();
		
		Manager manager = (Manager)person2; //다운캐스팅
		manager.support();
		manager.introduce();
		
		Manager manager1 = (Manager)person5; //다운캐스팅
		manager1.support();
		manager1.introduce();
		

	}

}
