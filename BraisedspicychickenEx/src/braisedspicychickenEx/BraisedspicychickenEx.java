package braisedspicychickenEx;

import java.util.Scanner;

public class BraisedspicychickenEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("안녕하세요! DMK 찜닭 코리아점입니다.");
			System.out.print("주문하시겠습니까? : (네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("저희 DMK 찜닭은 1. DMK치즈찜닭 2. DMK갈비찜 이렇게 2가지 메뉴를 판매하고있습니다. 어떤것을 주문하시겠습니까? : ");
				int foodSelect = scanner.nextInt();
				
				if(foodSelect == 1) {
					System.out.println("DMK치즈찜닭을 선택하셨습니다.");
				    System.out.print("이 메뉴는 순살과 뼈로 구성되어 있습니다. 순살을 드시겠습니까 아니면 뼈를 드시겠습니까?(순살/뼈) : ");
				    String foodOneSelect = scanner.next();
				    
				    if(foodOneSelect.equals("순살")) {
				    	System.out.println("순살을 선택하셨습니다.");
				    	System.out.print("맛을 선택해주세요: (순한맛/보통맛/매운맛) : ");
				    	String foodOneSelectTaste = scanner.next();
				    	
				    	if(foodOneSelectTaste.equals("순한맛")) {
				    		System.out.print("DMK치즈찜닭 순살 순한맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 순살 순한맛은 26000원입니다.");
				    			sum += 26000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}else if(foodOneSelectTaste.equals("보통맛")) {
				    		System.out.print("DMK치즈찜닭 순살 보통맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 순살 보통맛은 26000원입니다.");
				    			sum += 26000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}else if(foodOneSelectTaste.equals("매운맛")) {
				    		System.out.print("DMK치즈찜닭 순살 매운맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 순살 매운맛은 26000원입니다.");
				    			sum += 26000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}
				    }else if(foodOneSelect.equals("뼈")) {
				    	System.out.println("뼈을 선택하셨습니다.");
				    	System.out.print("맛을 선택해주세요: (순한맛/보통맛/매운맛) : ");
				    	String foodOneSelectTaste = scanner.next();
				    	
				    	if(foodOneSelectTaste.equals("순한맛")) {
				    		System.out.print("DMK치즈찜닭 뼈가 있는 순한맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 뼈 순한맛은 23000원입니다.");
				    			sum += 23000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}else if(foodOneSelectTaste.equals("보통맛")) {
				    		System.out.print("DMK치즈찜닭 뼈가있는 보통맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 뼈 보통맛은 23000원입니다.");
				    			sum += 23000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}else if(foodOneSelectTaste.equals("매운맛")) {
				    		System.out.print("DMK치즈찜닭 뼈가있는 매운맛을 선택하신게 맞습니까? :(네/아니오): ");
				    		String yesorno2 = scanner.next();
				    		if(yesorno2.equals("네")) {
				    			System.out.println("DMK치즈찜닭 뼈 매운맛은 23000원입니다.");
				    			sum += 23000;
				    		}else if(yesorno2.equals("아니오")) {
				    			System.out.println("다시 메뉴를 선택해주세요.");
				    			continue;
				    		}
				    	}
				    }
				}else if(foodSelect == 2) {
					System.out.println("DMK갈비찜을 선택하셨습니다.");
					System.out.print("DMK갈비찜은 토핑을 추가하실 수 있습니다. 토핑에는 치즈토핑, 떡토핑, 햄토핑을 추가하실 수 있습니다. 추가하시려면 (네)를 눌러주세요 : ");
					String foodTwoSelect = scanner.next();
					
					if(foodTwoSelect.equals("네")) {
						System.out.print("(치즈토핑/떡토핑/햄토핑) 중 하나를 선택해주세요 : ");
						String foodTwoSelectTopping = scanner.next();
						
						if(foodTwoSelectTopping.equals("치즈토핑") || foodTwoSelectTopping.equals("치즈")) {
							System.out.println("치즈토핑을 추가하겠습니다. 치즈토핑은 2000원 추가입니다.");
							sum += 2000;
						}else if(foodTwoSelectTopping.equals("떡토핑") || foodTwoSelectTopping.equals("떡")) {
							System.out.println("떡토핑을 추가하겠습니다. 떡토핑은 1000원 추가입니다.");
							sum += 1000;
						}else if(foodTwoSelectTopping.equals("햄토핑") || foodTwoSelectTopping.equals("햄")) {
							System.out.println("햄토핑을 추가하겠습니다. 햄토핑은 2000원 추가입니다.");
							sum += 2000;
						}
					}
					
					System.out.print("DMK 갈비찜은 맛을 선택하실 수 있습니다. (순한맛, 보통맛, 매운맛) 중에 하나를 선택해주세요 : ");
					String foodTwoSelectTaste = scanner.next();
					
					if(foodTwoSelectTaste.equals("순한맛")) {
						System.out.print("DMK갈비찜 순한맛을 선택하신게 맞습니까? (갈비찜은 메뉴가 뼈가 없고 순살입니다.) (네/아니오) : ");
						String foodTwoSelectYesorno = scanner.next();
						
						if(foodTwoSelectYesorno.equals("네")) {
							System.out.println("DMK갈비찜 순한맛 가격은 35000원입니다.");
							sum += 35000;
						}else if(foodTwoSelectYesorno.equals("아니오")) {
							System.out.println("메뉴로 돌아갑니다.");
							continue;
						}
					}else if(foodTwoSelectTaste.equals("보통맛")) {
						System.out.print("DMK갈비찜 보통맛을 선택하신게 맞습니까? (갈비찜은 메뉴가 뼈가 없고 순살입니다.) (네/아니오) : ");
						String foodTwoSelectYesorno = scanner.next();
						
						if(foodTwoSelectYesorno.equals("네")) {
							System.out.println("DMK갈비찜 보통맛 가격은 35000원입니다.");
							sum += 35000;
						}else if(foodTwoSelectYesorno.equals("아니오")) {
							System.out.println("메뉴로 돌아갑니다.");
							continue;
						}
					}else if(foodTwoSelectTaste.equals("매운맛")) {
						System.out.print("DMK갈비찜 매운맛을 선택하신게 맞습니까? (갈비찜은 메뉴가 뼈가 없고 순살입니다.) (네/아니오) : ");
						String foodTwoSelectYesorno = scanner.next();
						
						if(foodTwoSelectYesorno.equals("네")) {
							System.out.println("DMK갈비찜 매운맛 가격은 35000원입니다.");
							sum += 35000;
						}else if(foodTwoSelectYesorno.equals("아니오")) {
							System.out.println("메뉴로 돌아갑니다.");
							continue;
						}
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 카운터를 찾아와주시거나 알바생을 부르세요!");
			}else if(yesorno.equals("계산")) {
				System.out.println("맛있게 잘 드셨습니까? ㅎㅎ");
				System.out.print("결제를 진행하시겠습니다. 총 금액은 " + sum + "원 나오셨습니다. 결제하시겠습니까?(네/아니오) : ");
				String calculateYesorno = scanner.next();
				
				if(calculateYesorno.equals("네")) {
					System.out.print("지불하실 금액을 입력해주세요 : ");
					int userPay = scanner.nextInt();
					
					if(userPay > sum) {
						System.out.println("거스름돈을 반환해드리겠습니다. 거스름돈은 " + (userPay-sum) + "원입니다.");
						System.out.println("항상 저희 DMK찜닭 코리아점을 이용해주셔서 감사합니다.");
						break;
					}else if(userPay < sum) {
						System.out.println("지불하실 금액의 돈이 부족하여 결제를 진행할 수 없습니다.");
						System.out.println("메뉴로 돌아갑니다.");
						continue;
					}else {
						System.out.println("항상 저희 DMK찜닭 코리아점을 이용해주셔서 감사합니다.");
						break;
					}
				}else if(calculateYesorno.equals("아니오")) {
					continue;
				}
			}
			
		}
	}

}
