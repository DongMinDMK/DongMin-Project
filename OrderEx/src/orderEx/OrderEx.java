package orderEx;

import java.util.Scanner;

public class OrderEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String bookSelect = null;
		
		System.out.print("안녕하세요 DMK 서점입니다. 안내를 받으시겠습니까?(네/아니오) : ");
		
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			System.out.print("서점에는 많은 종류의 카테고리가 있습니다. 원하시는 카테고리가 무엇입니까?(취미/여행/반려동물/키즈) : ");
			String selectCategory = scanner.next();
			
			if(selectCategory.equals("취미")) {
				System.out.println("취미 카테고리를 선택하셨습니다.");
				System.out.println("취미 카테고리는 우리나라 5천만명 인구를 대상으로 빅데이터를 분석한 결과 순위가 높은 취미 관련 책들을 준비해놨습니다.");
				System.out.println("즐거운 시간 되세요!!");
				bookSelect = "취미";
			}else if(selectCategory.equals("여행")) {
				System.out.println("여행 카테고리를 선택하셨습니다.");
				System.out.println("여행 카테고리는 여행을 할 때 필요한 책들을 모아놨습니다. 우리나라 국내부터 해외여행까지 원하시는 나라와 관련된 책을 선택하여 마음껏 보세요!");
				System.out.println("즐거운 시간 되세요!!");
				bookSelect = "여행";
			}else if(selectCategory.equals("반려동물")) {
				System.out.println("반려동물 카테고리를 선택하셨습니다.");
				System.out.println("반려동물 카테고리는 집에 애완동물을 키우시는 분들을 위한 공간입니다. 애완동물에 대한 다양한 소식이 책에 정리되어 있으니 읽어보세요!");
				System.out.println("즐거운 시간 되세요!!");
				bookSelect = "반려동물";
			}else if(selectCategory.equals("키즈")) {
				System.out.println("키즈 카테고리를 선택하셨습니다.");
				System.out.println("키즈 카테고리는 자식이 있으신 분들을 위한 공간입니다. 만화책부터 어린이들이 손수 쉽게 읽어볼 수 있는 책들이 여러 권 준비되어 있습니다!");
				System.out.println("즐거운 시간 되세요!!");
				bookSelect = "키즈";
			}
			
		}else if(yesorno.equals("아니오")) {
			System.out.println("네 알겠습니다. 저희 DMK 서점에는 다양한 카테고리의 책들이 준비되어 있으니 많이 이용해주세요!!");
		}
		
		System.out.println();
		
		System.out.println("어우, 수많은 카테고리중 둘러보시면서 " + bookSelect + "카테고리를 선택하셨네요!!");
		
		if(bookSelect.equals("취미")) {
			System.out.println("취미 카테고리는 또 다른 취미를 찾을 수 있는 기회가 될 수 있습니다!! 자주 놀러와주세요!");
		}else if(bookSelect.equals("여행")) {
			System.out.println("다음번엔 또 다른 여행을 가고 싶지 않으신가요? 선택하신 여행지 외에도 저희 DMK 서점에는 다양한 곳의 여행의 책이 준비되어있습니다.");
		}else if(bookSelect.equals("반려동물")) {
			System.out.println("반려동물은 봐도봐도 지루하지 않죠!! 자주 놀러와주세요!");
		}else {
			System.out.println("다음번엔 또 다른 키즈 책들이 많으니 자주 놀러와주세요!!");
		}

	}

}
