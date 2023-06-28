package overridingAndUpDownCastingEx8;

interface Developer{
	abstract public void introduce();
	abstract public void show();
}

class BackEnd implements Developer{
	String java;
	String spring;
	String springboot;
	String database;
	
	public BackEnd(String java, String spring, String springboot, String database) {
		this.java = java;
		this.spring = spring;
		this.springboot = springboot;
		this.database = database;
	}

	@Override
	public void introduce() {
		System.out.println("백엔드 개발자는 보통 프로그래밍 언어를 " + this.java + ", " + this.spring + ", " + this.springboot + ", 그리고 " + this.database + "를 주로 다룹니다.");
	}

	@Override
	public void show() {
		System.out.println("백엔드 개발자는 앞이 아닌 뒤(서버)쪽에서 개발하는 사람을 말합니다.");
	}
	
	public void backendMethod() {
		System.out.println("백엔드는 자바를 기반으로 다뤄지기 때문에 자바가 핵심 언어라고 표현합니다.");
	}
	
	
}

class FrontEnd implements Developer{
	String html;
	String css;
	String javascript;
	String jquery;
	
	public FrontEnd(String html, String css, String javascript, String jquery) {
		this.html = html;
		this.css = css;
		this.javascript = javascript;
		this.jquery = jquery;
	}

	@Override
	public void introduce() {
		System.out.println("프론트엔드 개발자들이 주로 사용하는 프로그래밍 언어는 " + this.html + ", " + this.css + ", " + this.javascript + ", " + this.jquery + "등을 다룹니다.");
	}
	

	@Override
	public void show() {
		System.out.println("프론트엔드 개발자는 주로 사용자들이 보는 UI를 많이 다루며 웹홈페이지 디자인과 개발을 주로 담당합니다.");
	}
	
	public void frontendMethod() {
		System.out.println("프론트엔드는 UI를 설계하기 때문에 HTML/CSS를 반드시 숙지하고 있어야 합니다.");
	}
	
	
}
public class OverridingAndUpDownCastingEx8 {

	public static void main(String[] args) {
		Developer developer = new BackEnd("자바", "스프링", "스프링부트", "데이터베이스"); //업캐스팅
		
		//업캐스팅이지만 부모가 인터페이스이기 때문에 오버라이딩하여 자식클래스의 오버라이딩 메소드가 실행
		developer.introduce();
		developer.show(); 
		
		BackEnd backend = (BackEnd)developer;
		
		backend.backendMethod(); //다운캐스팅
		
		developer = new FrontEnd("HTML", "CSS", "자바스크립트", "제이쿼리"); //업캐스팅
		//업캐스팅이지만 부모가 인터페이스이기 때문에 오버라이딩하여 자식클래스의 오버라이딩 메소드가 실행
		developer.introduce();
		developer.show();
		
		FrontEnd frontend = (FrontEnd)developer;
		frontend.frontendMethod(); //다운캐스팅

	}

}
