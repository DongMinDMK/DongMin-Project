package switchcaseExAndbreak;
import java.util.Scanner;

public class SwitchCaseAndBreak {

	public static void main(String[] args) {
		//switch-case문에서는 break를 무조건 넣어야 하는데 안넣으면 지정한 조건부터 끝까지 계속해서 수행한다. 그것을 간단한 코드로 작성.
		
		System.out.println("DMK 대학교 컴퓨터학과입니다. 저희 학과는 수많은 과목들을 배우고 있습니다.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("저희 학과는 C언어, 자바, 데이터베이스, 운영체제, 자료구조 등 여러가지 과목을 전공으로 배우고있습니다. 원하시는 전공을 선택해주세요. ");
		String selectSubject = scanner.next();
		
		//일부러 자바와 운영체제에 break문을 뺐습니다. 이러면 결과가 그 다음 출력결과까지 함께 출력이 됩니다.
		
		switch(selectSubject) {
		case "C언어":
			System.out.println("C언어를 선택하셨습니다.");
			System.out.println("C언어는 컴퓨터학과 전공자분들이라면 가장 기본적으로 배워야 하는 과목입니다.");
			break;
		case "자바":
			System.out.println("자바를 선택하셨습니다.");
			System.out.println("자바는 객체지향적 언어이며 동시에 우리나라에서 많은 인기를 끌고 있는 프로그래밍 언어 과목입니다.");
			
		case "데이터베이스":
			System.out.println("데이터베이스를 선택하셨습니다.");
			System.out.println("데이터베이스는 일상생활에 존재하는 것들을 모두 데이터라고 할 수 있으며 데이터를 저장하는 공간을 데이터베이스라고 하는데 정말 중요한 과목중 하나입니다.");
			break;
		case "운영체제":
			System.out.println("운영체제를 선택하셨습니다.");
			System.out.println("운영체제는 프로그래밍 언어와 더불어 컴퓨터 전공자분이라면 기본적으로 알아야 하는 과목입니다. 운영체제의 가장 대표적인 예는 지금 사용하고 있는 윈도우즈가 있습니다.");
			
		case "자료구조":
			System.out.println("자료구조를 선택하셨습니다.");
			System.out.println("자료구조에는 스택과 큐 등 중요하고 핵심적인 과목입니다. 자료구조를 알고있으면 정말 도움이 많이 되는 그런 과목입니다.");
			break;
		}
		
		System.out.println("이렇게 switch-case문은 break문을 적어줘야 그 지정한 조건에 따른 결과만 수행하고 break문으로 인해 빠져나갑니다.");
		System.out.println("하지만 입력받은 조건에 대해 break문을 적지 않았다면 다음 조건까지 연쇄적으로 출력을 하기 때문에 무조건 break문을 적어줘야 합니다.");
		

	}

}
