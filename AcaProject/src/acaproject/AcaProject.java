package acaproject;

import java.util.Scanner;

public class AcaProject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("환영합니다. DMK 학원입니다.");
		System.out.println("저희 회사는 다양한 팀프로젝트를 통해 학생들의 취직을 위하여 도움을 드릴수 있도록 노력하고있습니다.");
		
		while(true) {
			System.out.print("상담을 원하시면 YES 아니면 NO를 눌러주세요(YES/NO/추가적설명) : ");
			String consultSelect = scanner.next();
			
			if(consultSelect.equals("YES") || consultSelect.equals("yes")) {
				System.out.println("저희는 c 관련 수업과, java 관련 수업, spring 관련 수업 등으로 이루어져 있습니다.");
				System.out.print("원하시는 수업을 선택해주세요(C/JAVA/SPRING) : ");
				
				String courseSelect = scanner.next();
				
				if(courseSelect.equals("C") || courseSelect.equals("c")) {
					System.out.println("C관련 수업을 선택하셨습니다.");
					System.out.println("C 수업은 말그대로 프로그래밍 언어 중 아주 기본이 되고 발판이 되는 C수업을 진행합니다.");
					System.out.println("수업은 평일 월~금 매일 진행되며 매일 4시간정도 수업이 진행됩니다.");
					System.out.println("자세한 내용은 홈페이지를 참고해주세요!");
				}else if(courseSelect.equals("JAVA") || courseSelect.equals("java") || courseSelect.equals("Java")) {
					System.out.println("자바관련 수업을 선택하셨습니다.");
					System.out.println("자바 수업은 말그대로 프로그래밍 언어 중 백엔드 개발자가 나아갈 때 기본적으로 핵심이 되는 자바 수업을 진행합니다.");
					System.out.println("수업은 평일 월~금 매일 진행되며 매일 6시간정도 수업이 진행됩니다.");
					System.out.println("자세한 내용은 홈페이지를 참고해주세요!");
				}else if(courseSelect.equals("SPRING") || courseSelect.equals("spring") || courseSelect.equals("Spring")) {
					System.out.println("스프링관련 수업을 선택하셨습니다.");
					System.out.println("스프링 수업은 자바 언어 중 오버라이딩을 진행 할 때 어노테이션을 주로 자주 쓰는 언어입니다. 스프링 수업을 들을시기 전에 자바수업을 먼저 들으시기를 권고합니다!");
					System.out.println("수업은 평일 월~금 매일 진행되며 매일 8시간정도 수업이 진행됩니다.");
					System.out.println("자세한 내용은 홈페이지를 참고해주세요!");
				}
			}else if(consultSelect.equals("NO") || consultSelect.equals("no")) {
				System.out.println("상담이 필요하시면 00-0000-0000이나 00-0000-0000로 전화주시거나 직접 방문하셔서 데스크에 요청 부탁드립니다.");
			}else if(consultSelect.equals("추가적설명")) {
				System.out.println("저희 DMK 학원은 소통을 우선시로 하고있으며, 소통하면서 훈련생분들과 잦은 상담, 모의 면접을 통하여 취직을 할 수 있도록 많은 것을 제공해드리고 있습니다.");
				break;
			}
		}
		
		System.out.println("컴퓨터 관련 개발자 직종을 꿈꾸시는 분이라면 어느누구도 상담을 받아보실 수 있으니 마음껏 놀러와주세요!");

	}

}
