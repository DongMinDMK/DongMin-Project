package calendarEx;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance(); //Calendar 클래스는 추상클래스이기 때문에 new 연산자를 사용하지 못하기 때문에 생성된 인스턴스를 받아오는 형식으로 선언
		
		System.out.print("연도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("월을 입력하세요 : ");
		int month = scanner.nextInt();
		
		cal.set(year, month - 1, 1); //Calendar 클래스는 월이 0부터 시작이기 때문에 -1을 빼줌.
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastDate = cal.getActualMaximum(Calendar.DATE); //입력한 달의 마지막 날짜를 구함. 구하고 lastDate 변수에 저장
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //입력한 달의 시작하는 요일을 구함. 구해서 week 변수에 저장
		
		for(int i=1; i<week; i++) { //1주는 7일이니까 기본적으로 주말이 있을거기 때문에 달력 시작날을 주말로 처리
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDate; i++) { //1일부터 마지막날까지 반복문을 통해 하나씩 일수 출력
			System.out.printf("%d\t", i);  //정수로 약간의 공백인 \t을 이용하여 출력
			
			if(week % 7 == 0) { //1주일은 7일인데 마지막 7일이 되면 즉 일요일부터 1주가 시작이되기로 설정을 해놨기 때문에 토요일일때 토요일 날짜를 표시하고 줄바꿈
				System.out.println();
			}
			week++; //week이 1주에서 2주로 늘어남
		}
		
		scanner.close();
		
	}

}
