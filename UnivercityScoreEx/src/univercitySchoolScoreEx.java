import java.util.*;
public class univercitySchoolScoreEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("DMK 대학교 입니다.");
		System.out.println("각각의 과목에 따른 점수의 학점을 출력하는 프로그램입니다.");
		String subject[] = {"국어", "수학", "영어", "컴퓨터"};
		
		for(int i=0; i<subject.length; i++) {
		System.out.print("DMK님께서는 이번학기에 국어, 수학, 영어, 컴퓨터를 수강하셨습니다. 학점을 확인할 과목 이름을 입력해주십시오. ");
		subject[i] = scanner.next();
		System.out.print(subject[i] + "의 성적을 입력하십시오.");
		int score = scanner.nextInt();
		if(score >= 95) {
			System.out.println("당신의 " + subject[i] + " 학점은 A+ 학점 입니다.");
			System.out.println("정말 잘하셨습니다."); 
			}
	    else if(score >= 90) {
	    	System.out.println("당신의 " + subject[i] + " 학점은 A- 학점 입니다.");
			System.out.println("살짝 아쉽지만 좋은 학점입니다!");
			}
		else if(score >= 85) {
			System.out.println("당신의 " + subject[i] + " 학점은 B+ 학점 입니다.");
			System.out.println("조금만 더 공부가 필요해보입니다!");
			}
		else if(score >= 80) {
			System.out.println("당신의 " + subject[i] + " 학점은 B- 학점 입니다.");
			System.out.println("다음 시험에는 좋은 결과가 있기를 바랍니다!"); 
			}
		else if(score >= 75) {
			System.out.println("당신의 " + subject[i] + " 학점은 C+ 학점 입니다.");
			System.out.println("이 학점에 너무 신경쓰지 맙시다!"); 
			}
		else if(score >= 70) {
			System.out.println("당신의 " + subject[i] + " 학점은 C- 학점 입니다.");
			System.out.println("아쉽군요!");
			}
		else{
			System.out.println("당신의 " + subject[i] + " 학점은 F 학점 입니다.");
			System.out.println("좀 많은 공부가 필요해보입니다.");
			}

		}
		    
	}

}
