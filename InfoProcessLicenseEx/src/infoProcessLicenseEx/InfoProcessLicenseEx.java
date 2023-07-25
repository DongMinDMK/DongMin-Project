package infoProcessLicenseEx;

interface InfoProcessLicense{ //인터페이스(인터페이스는 멤버변수, 생성자 생성 못함)
	public abstract void show(); //추상메소드
	public abstract void introduce();
}

class JobRequirement implements InfoProcessLicense{
	String school; //멤버변수
	String noChild;
	
	public JobRequirement(String school, String noChild) { //매개변수 있는 생성자
		this.school = school;
		this.noChild = noChild;
	}

	@Override
	public void show() { //오버라이딩 받은 메소드
		System.out.println("정보처리기사 자격증은 IT 관련 종사자들에게 필수적으로 취득해야하는 자격증입니다.");
	}

	@Override
	public void introduce() { //오버라이딩 받은 메소드
		System.out.println("정보처리기사는 자격요건이 있으며, 자격요건은 최소 " + this.school + "를 나와야 하며, " + this.noChild + "는(은) 응시자격이 없습니다.");
	}
}

class LevelOfDifficulty implements InfoProcessLicense{
	String difficult;
	String covid;
	
	public LevelOfDifficulty(String difficult, String covid) {
		this.difficult = difficult;
		this.covid = covid;
	}

	@Override
	public void show() { //오버라이딩 받은 메소드
		System.out.println("정보처리기사 자격증은 " + this.covid + "시대에 접어들면서 인기가 많아진 자격증 중 하나입니다.");
	}

	@Override
	public void introduce() { //오버라이딩 받은 메소드
		System.out.println("이 자격증 시험은 난이도가 최근들어 많이 " + this.difficult + "을 응시생들이 겪고 있습니다.");
	}
	
	public void levelOfDifficultyMethod() { //LevelOfDifficulty클래스에만 존재하는 메소드 선언
		System.out.println("정보처리기사 자격증은 최근(2020~2022) 기준 평균 합격률은 25%정도를 기록하고 있습니다.");
	}
	
	
}


public class InfoProcessLicenseEx {

	public static void main(String[] args) {
		InfoProcessLicense ipl = new JobRequirement("대학교 4년제", "어린이나 초중고등학생"); //업캐스팅
		ipl.show();
		ipl.introduce();
		
		System.out.println();
		
		ipl = new LevelOfDifficulty("어려움", "코로나");
		ipl.show();
		ipl.introduce();
		
		LevelOfDifficulty lod = (LevelOfDifficulty)ipl; //다운캐스팅 
		lod.levelOfDifficultyMethod();
	}

}
