package callByValueEx;
class Person{
	String name;
	int age;
	String gender;
	int height;
	
	public Person() { //초기화하는 생성자 생성 -> 이 생성자가 없으면 class Person에 진입을 못함. 
		name = null;
		age = 0;
		gender = null;
		height = 0;
	}
	
	public void introduce(String name, int age, String gender, int height) {
		System.out.println("사람의 이름은 " + name + "이고, 나이는 " + age + "이며, 성별은 " + gender + "이고, 키는 " + height + "cm 입니다.");
	}
	public void welcome(String name) {
		System.out.println(name + " 회원님 환영합니다!!");
	}
}

public class CallByValueEx {

	public static void main(String[] args) {
		Person person = new Person(); // 생성자 person 생성, String 변수 name, gender 와 int 변수 age, height이 디폴트 값이 삽입.
		person.introduce("DMK", 26, "남성", 174); // (call by value) -> 디폴트값에서 person 인스턴스를 통해 값을 대입하여 변경
		person.welcome("DMK"); // (call by value)
		
		person.name = "김가을"; // person 인스턴스를 통해 이름 대입, 대입하면 디폴트 값이 저절로 사라지고 새로 정의한 값으로 변경하여 저장
		person.age = 30; //person 인스턴스를 통해 나이 대입, 대입하면 디폴트 값이 저절로 사라지고 새로 정의한 값으로 변경하여 저장
		person.gender = "여성"; //person 인스턴스를 통해 성별 대입, 대입하면 디폴트 값이 저절로 사라지고 새로 정의한 값으로 변경하여 저장
		person.height = 160; //person 인스턴스를 통해 키 대입, 대입하면 디폴트 값이 저절로 사라지고 새로 정의한 값으로 변경하여 저장
		
		System.out.println(person.name + "님의 나이는 " + person.age + "세 이며, 성별은 " + person.gender + "이고, 키는 " + person.height + "cm 입니다.");
		person.welcome("김가을"); // (call by value)
		
	}

}
