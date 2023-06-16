package kiosqueEx11;
import java.util.*;

public class KiosqueEx11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
		System.out.println("안녕하세요 DMK 문구점입니다.");
		System.out.print("원하시는 제품을 선택하세요. (1. 샤프 2. 샤프심 3. 지우개 4. 노트 5. 수정테이프 0. 종료) : ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.print("샤프의 가격은 1000원, 3000원, 5000원, 10000원 샤프가 준비되어 있습니다. 가격이 높으면 높을수록 질이 좋은 샤프입니다. 원하시는 샤프의 가격을 선택해주세요 : ");
			int sharfSelect = scanner.nextInt();
			
			if(sharfSelect == 1000) {
				System.out.println("1000원 샤프를 선택하셨습니다.");
				sum += 1000;
			}else if(sharfSelect == 3000) {
				System.out.println("3000원 샤프를 선택하셨습니다.");
				sum += 3000;
			}else if(sharfSelect == 5000) {
				System.out.println("5000원 샤프를 선택하셨습니다.");
				sum += 5000;
			}else if(sharfSelect == 10000) {
				System.out.println("10000원 샤프를 선택하셨습니다.");
				sum += 10000;
			}
		}else if(select == 2) {
			System.out.print("샤프심은 (0.1, 0.5, 0.9, 1.0) 등 4가지의 샤프심이 존재합니다. 원하시는 샤프심을 선택하세요 : ");
			String simSelect = scanner.next();
			
			if(simSelect.equals("0.1")) {
				System.out.println("샤프심 0.1을 선택하셨습니다. 가격은 500원입니다.");
				sum += 500;
			}else if(simSelect.equals("0.5")) {
				System.out.println("샤프심 0.5를 선택하셨습니다. 가격은 500원입니다.");
				sum += 500;
			}else if(simSelect.equals("0.9")) {
				System.out.println("샤프심 0.9를 선택하셨습니다. 가격은 500원입니다.");
				sum += 500;
			}else if(simSelect.equals("1.0")) {
				System.out.println("샤프심 1.0를 선택하셨습니다. 가격은 500원입니다.");
				sum += 500;
			}
		}else if(select == 3) {
			System.out.println("지우개의 가격은 1000원입니다.");
			sum+= 1000;
		}else if(select == 4) {
			System.out.print("노트는 (1000원, 3000원, 4000원)짜리 노트가 있습니다. 원하시는 가격의 노트를 선택해주세요 : ");
			int noteSelect =  scanner.nextInt();
			
			if(noteSelect == 1000) {
				System.out.println("1000원짜리 노트를 선택하셨습니다.");
				sum+=1000;
			}else if(noteSelect == 3000) {
				System.out.println("3000원짜리 노트를 선택하셨습니다.");
				sum+=3000;
			}else if(noteSelect == 4000) {
				System.out.println("4000원짜리 노트를 선택하셨습니다.");
				sum+=4000;
			}
		}else if(select == 5) {
			System.out.println("수정테이프를 선택하셨습니다. 수정테이프는 1000원입니다.");
			sum+=1000;
		}else if(select == 0) {
			System.out.println("현재 누적된 금액은 " + sum + "원입니다.");
			break;
		}
		
	}
		
		System.out.println("항상 저희 DMK 문구점을 이용해주셔서 감사합니다.");

	}

}
