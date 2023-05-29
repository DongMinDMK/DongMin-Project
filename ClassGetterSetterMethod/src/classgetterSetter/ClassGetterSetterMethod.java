package classgetterSetter;

class Student{
	String hakbun;
	String name;
	int age;
	String gender;
	
	public Student() {
		
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override //toString 메소드는 최조상 클래스인 Object 클래스의 toString 메소드를 상속받아서 구현한 것이다.
	public String toString() {
		return "Student [hakbun=" + hakbun + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

class Professor{
	int age;
	String name;
	String subject;
	String gender;
	
	public Professor() {
		
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Professor [age=" + age + ", name=" + name + ", subject=" + subject + ", gender=" + gender + "]";
	}
}

class Manager{
	int age;
	String name;
	String department;
	String gender;
	
	public Manager() {
		
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Manager [age=" + age + ", name=" + name + ", department=" + department + ", gender=" + gender + "]";
	}
}



public class ClassGetterSetterMethod {

	public static void main(String[] args) {
		
		Student student = new Student();
		Professor professor = new Professor();
		Manager manager = new Manager();
		
		
		student.setAge(26);
		student.setName("DMK");
		student.setHakbun("2017");
		student.setGender("남성");
		
		professor.setAge(35);
		professor.setName("홍명숙");
		professor.setSubject("컴퓨터학과");
		professor.setGender("여성");
		
		manager.setAge(40);
		manager.setName("김철수");
		manager.setDepartment("컴퓨터학부");
		manager.setGender("남성");
		
		System.out.println("학생은 " + student.getAge() + "세, 이름은 " + student.getName() + ", 학번은 " + student.getHakbun() + " 성별은 " + student.getGender() + "입니다.");
		System.out.println("교수는 " + professor.getAge() + "세, 이름은 " + professor.getName() + ", 과목은 " + professor.getSubject() + " 성별은 " + student.getGender() + "입니다.");
		System.out.println("관리자는 " + manager.getAge() + "세, 이름은 " + manager.getName() + ", 부서는 " + manager.getDepartment() + " 성별은 " + student.getGender() + "입니다.");
		
		System.out.println(student.toString());
		System.out.println(professor.toString());
		System.out.println(manager.toString());
		

	}

}
