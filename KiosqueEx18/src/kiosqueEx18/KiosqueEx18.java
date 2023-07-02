package kiosqueEx18;
import java.util.Scanner;

public class KiosqueEx18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요 DMK 백화점입니다. 저희 백화점은 수많은 다양한 의류를 판매하고 있습니다.");
		System.out.print("직장과 관련한 의상(ex.정장, 구두)을 보실거면 1층, 일상생활에서 편히 입을 수 있는 의류를 보시려면 3층(ex. 맨투맨), 신발과 관련한 것을 보시고 싶으시다면 5층으로 이동해주세요 : (1/3/5) : ");
		int userSelect = scanner.nextInt();
		
		
		
		switch(userSelect) {
		case 1: //1층 선택
			System.out.println("1층에는 다양한 직장과 관련한 의류들이 준비되어 있습니다.");
			System.out.print("왼쪽으로 가시면 정장과 관련한 의류가 준비되어 있고, 오른쪽으로 가시면 와이셔츠 관련한 의류, 직진하시면 구두와 관련한 신발이 준비되어있습니다. 어느위치로 가시겠습니까?(왼쪽/오른쪽/직진) : ");
			String firstFloorSelect = scanner.next();
			
			if(firstFloorSelect.equals("왼쪽")) {
				System.out.println("여기는 정장 상, 하의를 판매하고 있습니다.");
				System.out.println("정장 상,하의를 세트로 구매하시면 약간의 할인을 진행시켜드리고 있습니다.");
				System.out.print("일단, 색깔을 골라주십시오, 색깔은 검은색, 남색, 갈색이 있습니다.(검은색/남색/갈색) : ");
				String firstSuitColor = scanner.next();
				
				if(firstSuitColor.equals("검은색")) {
					System.out.print("검은색 상의, 하의 세트로 구매하시면 할인이벤트 행사로 할인 해드립니다. 단품으로 구매하시겠습니까? 아니면 세트로 구매하시겠습니까? (단품/세트) : ");
					String singleSet1 = scanner.next();
					
					if(singleSet1.equals("단품")) {
						System.out.print("정장 상의, 정장 하의 중 골라주세요 : (상의/하의) : ");
						String singleUpDown1 = scanner.next();
						
						if(singleUpDown1.equals("상의")) {
							System.out.println("검은색 상의 가격은 300000원 입니다.");
							
							break;
						}else if(singleUpDown1.equals("하의")) {
							System.out.println("검은색 하의 가격은 200000원 입니다.");
							
							break;
						}
					}else if(singleSet1.equals("세트")) {
						System.out.println("세트 구매를 선택하셨습니다.");
						System.out.println("세트 구매는 원래 정가론 600000원 이지만 할인이벤트로 450000원입니다.");
						
						break;
					}
				}else if(firstSuitColor.equals("남색")){
					System.out.print("남색 상의, 하의 세트로 구매하시면 할인이벤트 행사로 할인 해드립니다. 단품으로 구매하시겠습니까? 아니면 세트로 구매하시겠습니까? (단품/세트) : ");
					String singleSet1 = scanner.next();
					
					if(singleSet1.equals("단품")) {
						System.out.print("정장 상의, 정장 하의 중 골라주세요 : (상의/하의) : ");
						String singleUpDown1 = scanner.next();
						
						if(singleUpDown1.equals("상의")) {
							System.out.println("남색 상의 가격은 350000원 입니다.");
							
							break;
						}else if(singleUpDown1.equals("하의")) {
							System.out.println("남색 하의 가격은 250000원 입니다.");
							
							break;
						}
					}else if(singleSet1.equals("세트")) {
						System.out.println("세트 구매를 선택하셨습니다.");
						System.out.println("세트 구매는 원래 정가론 650000원 이지만 할인이벤트로 500000원입니다.");
						
						break;
					}
				}else if(firstSuitColor.equals("갈색")) {
					System.out.print("갈색 상의, 하의 세트로 구매하시면 할인이벤트 행사로 할인 해드립니다. 단품으로 구매하시겠습니까? 아니면 세트로 구매하시겠습니까? (단품/세트) : ");
					String singleSet1 = scanner.next();
					
					if(singleSet1.equals("단품")) {
						System.out.print("정장 상의, 정장 하의 중 골라주세요 : (상의/하의) : ");
						String singleUpDown1 = scanner.next();
						
						if(singleUpDown1.equals("상의")) {
							System.out.println("갈색 상의 가격은 250000원 입니다.");
							
							break;
						}else if(singleUpDown1.equals("하의")) {
							System.out.println("갈색 하의 가격은 150000원 입니다.");
							
							break;
						}
					}else if(singleSet1.equals("세트")) {
						System.out.println("세트 구매를 선택하셨습니다.");
						System.out.println("세트 구매는 원래 정가론 500000원 이지만 할인이벤트로 400000원입니다.");
					
						break;
					}
				}
			}else if(firstFloorSelect.equals("오른쪽")) {
				System.out.println("여기는 와이셔츠와 관련한 의류를 판매하고 있습니다.");
				System.out.println("와이셔츠는 색깔을 선택해주셔야 합니다.");
				System.out.print("와이셔츠 색깔은 흰색과 푸른색이 있습니다. 원하시는 색깔을 선택해주세요(흰색/푸른색) : ");
				String shirtColor = scanner.next();
				
				if(shirtColor.equals("흰색")) {
					System.out.println("흰색 와이셔츠 가격은 30000원입니다.");
					
					break;
				}else if(shirtColor.equals("푸른색")) {
					System.out.println("푸른색 와이셔츠 가격은 20000원입니다.");
					
					break;
				}
			}else if(firstFloorSelect.equals("직진")) {
				System.out.println("여기는 직장 구두와 관련한 신발을 판매하고 있습니다.");
				System.out.println("구두 신발 사이즈를 알아야 합니다.");
				System.out.print("구두 신발 사이즈를 입력해주세요 : (220/240/260/280) : ");
				int footSize = scanner.nextInt();
				
				if(footSize == 220) {
					System.out.println("구두 220 사이즈의 가격은 90000원입니다.");
					break;
				}else if(footSize == 240) {
					System.out.println("구두 240 사이즈의 가격은 90000원입니다.");
					break;
				}else if(footSize == 260) {
					System.out.println("구두 260 사이즈의 가격은 90000원입니다.");
					break;
				}else if(footSize == 280) {
					System.out.println("구두 280 사이즈의 가격은 90000원입니다.");
					break;
				}else {
					System.out.println("요청하신 신발 사이즈는 저희 매장에 준비되어 있지 않습니다.");
					break;
				}
			}
		case 3:
			System.out.println("3층에는 일상생활에서 돌아다니실 때 편하게 입을 수 있는 옷들이 준비되어 있습니다.");
			System.out.print("원하시는 옷의 종류를 선택해주세요: (맨투맨/니트/바람막이/패딩) : ");
			String secondFloorShirt = scanner.next();
			
			if(secondFloorShirt.equals("맨투맨")) {
				System.out.println("맨투맨 티의 가격은 40000원입니다.");
				break;
			}else if(secondFloorShirt.equals("니트")) {
				System.out.println("니트의 가격은 50000원입니다.");
				break;
			}else if(secondFloorShirt.equals("바람막이")) {
				System.out.println("바람막이의 가격은 20000원입니다.");
				break;
			}else if(secondFloorShirt.equals("패딩")) {
				System.out.println("패딩의 가격은 30000원입니다.");
				break;
			}
		case 5:
			System.out.println("5층에는 일상생활에서 돌아다니실 때 편하게 신으실 수 있는 신발들이 준비되어 있습니다.");
			System.out.print("원하시는 신발의 종류를 선택해주세요: (스니커즈/캠퍼스/아이다스) : ");
			String thirdFloorFoot = scanner.next();
			
			if(thirdFloorFoot.equals("스니커즈")) {
				System.out.print("스니커즈 신발의 사이즈를 선택해주세요(230/250/270/290) : ");
				int footSize2 = scanner.nextInt();
				
				if(footSize2 == 230) {
					System.out.println("스니커즈 신발 230 사이즈의 가격은 40000원입니다.");
					break;
				}else if(footSize2 == 250) {
					System.out.println("스니커즈 신발 250 사이즈의 가격은 40000원입니다.");
					break;
				}else if(footSize2 == 270) {
					System.out.println("스니커즈 신발 270 사이즈의 가격은 40000원입니다.");
					break;
				}else if(footSize2 == 290) {
					System.out.println("스니커즈 신발 290 사이즈의 가격은 40000원입니다.");
					break;
				}else {
					System.out.println("해당하는 스니커즈 신발 사이즈가 없습니다.");
					break;
				}
			}else if(thirdFloorFoot.equals("캠퍼스")) {
				System.out.print("캠퍼스 신발의 사이즈를 선택해주세요(220/240/260/280) : ");
				int footSize2 = scanner.nextInt();
				
				if(footSize2 == 230) {
					System.out.println("캠퍼스 신발 220 사이즈의 가격은 60000원입니다.");
					break;
				}else if(footSize2 == 250) {
					System.out.println("캠퍼스 신발 240 사이즈의 가격은 60000원입니다.");
					break;
				}else if(footSize2 == 270) {
					System.out.println("캠퍼스 신발 260 사이즈의 가격은 60000원입니다.");
					break;
				}else if(footSize2 == 290) {
					System.out.println("캠퍼스 신발 280 사이즈의 가격은 60000원입니다.");
					break;
				}else {
					System.out.println("해당하는 캠퍼스 신발 사이즈가 없습니다.");
					break;
				}
			}else if(thirdFloorFoot.equals("아디다스")) {
				System.out.print("아디다스 신발의 사이즈를 선택해주세요(210/230/250/260/280) : ");
				int footSize2 = scanner.nextInt();
				
				if(footSize2 == 210) {
					System.out.println("아디다스 신발 210 사이즈의 가격은 70000원입니다.");
					break;
				}else if(footSize2 == 230) {
					System.out.println("아디다스 신발 230 사이즈의 가격은 70000원입니다.");
					break;
				}else if(footSize2 == 250) {
					System.out.println("아디다스 250 사이즈의 가격은 70000원입니다.");
					break;
				}else if(footSize2 == 260) {
					System.out.println("아디다스 신발 260 사이즈의 가격은 70000원입니다.");
					break;
				}else if(footSize2 == 280) {
					System.out.println("아디다스 신발 280 사이즈의 가격은 70000원입니다.");
					break;
				}else {
					System.out.println("해당하는 아디다스 신발 사이즈가 없습니다.");
					break;
				}
			}

		}
		
		System.out.println("항상 저희 DMK 백화점을 이용해주셔서 감사합니다. 다음에 또 방문해주세요!");
	}

	

}
