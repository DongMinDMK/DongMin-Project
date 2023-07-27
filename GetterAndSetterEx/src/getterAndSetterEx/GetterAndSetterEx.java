package getterAndSetterEx;
import java.util.Scanner;

class Human{
	private int age;
	private String hobby;
	
	public void setAge(int num) { //set 메소드는 입력하여 Human 클래스 age 멤버변수에 저장하는 메소드
		if(num <= 0) { //파라미터로부터 받아온 나이가 0보다 작거나 같으면
			System.out.println("사람은 0살과 0살이하의 나이는 없습니다. 1살 이상으로 나이를 입력해주세요.");
			
		}else if(num > 0) {
			System.out.println("나이를 잘 입력하셨습니다! 저장되었습니다.");
			age = num; 
		}	
	}
	
	public int getAge() { //정수형 age를 return을 통해 되돌려야 하기 때문에 자료형을 void가 아닌 int로 설정  
		return age;
	}
	
	public void setHobby(String hobbys) {
		hobby = hobbys;
		
		System.out.println("와우!! 좋은 취미를 가지고 계시는군요!!");
		
	}
	
	public String getHobby() {
		return hobby;
	}
}


public class GetterAndSetterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Human dmk = new Human();
		
		System.out.print("저장할 나이를 입력하세요 >> ");
		int age = scanner.nextInt();
		
		dmk.setAge(age);
		
		if(dmk.getAge() > 0) {
			System.out.println("dmk의 나이는 " + dmk.getAge() + "살입니다.");
		}
		
		System.out.print("취미가 무엇입니까? : ");
		String hobby = scanner.next();
		
		dmk.setHobby(hobby);
		
		System.out.println("dmk님의 취미는 " + dmk.getHobby() + "입니다.");
		
		
		
		
		

	}

}
