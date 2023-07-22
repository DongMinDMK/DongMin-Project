package abstractClassEx;

abstract class ITlanguage{
	String language;
	
	public ITlanguage(String language) {
		this.language = language;
	}
	
	public void introduce() {
		System.out.println("이 " + this.language + "(은)는 개발자의 꽃입니다.");
	}
}

class JAVA extends ITlanguage{
	public JAVA(String language) {
		super(language);
	}
	
	public void javaMethod() {
		System.out.println("백엔드 개발자는 자바를 유용하게 사용할 줄 알아야 합니다.");
	}
}

class SpringSTS extends ITlanguage{
	public SpringSTS(String language) {
		super(language);
	}
	
	public void springSTSMethod() {
		System.out.println("백엔드 개발자는 스프링 프레임워크와 스프링 부트를 잘 사용해야 합니다.");
	}
}

class DB extends ITlanguage{
	public DB(String language) {
		super(language);
	}
	
	public void dbMethod() {
		System.out.println("DB는 " + this.language + "라고 보기 어렵지만, 개발을 하기 위해서는 DB가 꼭 필요합니다.");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		
		//추상클래스는 new 연산자를 이용해서 객체를 생성할 수 없다.
		JAVA java = new JAVA("자바");
		java.introduce();
		java.javaMethod();
		
		System.out.println();
		
		SpringSTS sts = new SpringSTS("스프링 프레임워크");
		sts.introduce();
		sts.springSTSMethod();
		
		System.out.println();
		
		DB db = new DB("프로그래밍 언어");
		db.introduce();
		db.dbMethod();

	}

}
