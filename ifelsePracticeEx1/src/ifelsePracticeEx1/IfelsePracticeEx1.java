package ifelsePracticeEx1;
import java.util.Scanner;

public class IfelsePracticeEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		System.out.println("간단한 if-else문을 이용하여 질문에 대한 결과를 보여주는 코드 작성");
		
		System.out.print("구구단 중 몇단의 구구단을 보시겠습니까?(2단까지만): ");
	    int gugudanSelect = scanner.nextInt();
	    
	    if(gugudanSelect == 1) { //1단
	    	System.out.print("1단의 몇을 보시겠습니까?: ");
	    	int twogugudanSelect = scanner.nextInt();
	    	
	    	if(twogugudanSelect == 1) {
	    		System.out.print("1X1 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 1) {
	    			System.out.println("정답은 " + result + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 2) {
	    		System.out.print("1X2 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 2) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+1) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 3) {
	    		System.out.print("1X3 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 3) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+2) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 4) {
	    		System.out.print("1X4 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 4) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+3) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 5) {
	    		System.out.print("1X5 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 5) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+4) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 6) {
	    		System.out.print("1X6 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 6) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+5) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 7) {
	    		System.out.print("1X7 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 7) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+6) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 8) {
	    		System.out.print("1X8 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 8) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+7) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect == 9) {
	    		System.out.print("1X9 = ");
	    		int answer = scanner.nextInt();
	    		if(answer == 9) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+8) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}
	    }else if(gugudanSelect == 2) { //2단
	    	System.out.print("2단의 몇을 보시겠습니까?: ");
	    	int twogugudanSelect2 = scanner.nextInt();
	    	
	    	if(twogugudanSelect2 == 1) {
	    		System.out.print("2X1 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 2) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+1) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 2) {
	    		System.out.print("2X2 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 4) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+3) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 3) {
	    		System.out.print("2X3 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 6) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+5) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 4) {
	    		System.out.print("2X4 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 8) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+7) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 5) {
	    		System.out.print("2X5 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 10) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+9) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 6) {
	    		System.out.print("2X6 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 12) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+11) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 7) {
	    		System.out.print("2X7 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 14) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+13) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 3) {
	    		System.out.print("2X8 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 16) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+15) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}else if(twogugudanSelect2 == 9) {
	    		System.out.print("2X9 = ");
	    		int answer2 = scanner.nextInt();
	    		
	    		if(answer2 == 18) {
	    			System.out.println("맞췄습니다! 정답은 " + (result+17) + "입니다.");
	    		}else {
	    			System.out.println("정답이 틀렸습니다.");
	    		}
	    	}
	    }
	}

}
