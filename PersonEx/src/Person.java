
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person2 ps = new Person2("980000", "김길동", 26, "서울시 송파구", "음악듣기와 스포츠보기", "남자");
	    
	    System.out.println(ps.toString());

	}

}
class Person2
{
	String birth;
	String name;
	int age;
	String location;
	String hobby;
	String gender;
	
	public Person2(String birth, String name, int age, String location, String hobby, String gender) {
		this.birth = birth;
		this.name = name;
		this.age = age;
		this.location = location;
		this.hobby = hobby;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "[생일은 " + birth + ", 이름은 " + name + ", 나이는 " + age + ", 주소는 " + location + ", 취미는 "
				+ hobby + ", 성별은 " + gender + "]";
	}
	
	
	
	
}