package serviceCenterEx;

import java.util.Scanner;

public class ServiceCenterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int repairCost = 0;
		
	    System.out.println("안녕하세요 DMK 서비스센터입니다.");
	    System.out.println("저희 매장에서는 다양한 전자기기를 수리를 할 수 있습니다.");
	    System.out.print("수리를 진행하시겠습니까?(네/아니오) : ");
	    String yesorno = scanner.next();
	    
	    if(yesorno.equals("네")) {
	    	System.out.print("수리하실 기기를 말씀해주세요 (노트북/휴대폰/이어폰/필름부착) : ");
	    	String userSelectMach = scanner.next();
	    	
	    	switch(userSelectMach) {
	    	case "노트북" :
	    		System.out.println("노트북 수리를 요청하셨습니다.");
	    		System.out.println("노트북 어디가 문제인지 상담 후 견적 내도록 하겠습니다.");
	    		System.out.println("----------상담 후 수리중..... --------");
	    		System.out.println("노트북 수리비는 30000원입니다.");
	    		repairCost = 30000;
	    		break;
	    	case "휴대폰" :
	    		System.out.println("휴대폰 수리를 요청하셨습니다.");
	    		System.out.println("휴대폰 어디가 문제인지 상담 후 견적 내도록 하겠습니다.");
	    		System.out.println("----------상담 후 수리중..... --------");
	    		System.out.println("휴대폰 수리비는 30000원입니다.");
	    		repairCost = 60000;
	    		break;
	    	case "이어폰" :
	    		System.out.println("이어폰 수리를 요청하셨습니다.");
	    		System.out.println("이어폰 어디가 문제인지 상담 후 견적 내도록 하겠습니다.");
	    		System.out.println("----------상담 후 수리중..... --------");
	    		System.out.println("이어폰 수리비는 80000원입니다.");
	    		repairCost = 80000;
	    		break;
	    	case "필름부착" :
	    		System.out.println("필름부착을 선택하셨습니다.");
	    		System.out.println("휴대폰을 제시하여 주세요...");
	    		System.out.println("------------ 필름부착 진행중 ...... -------------");
	    		System.out.println("필름부착이 성공적으로 완료되었습니다.");
	    		System.out.println("필름부착비는 10000원입니다.");
	    		repairCost = 10000;
	    		break;
	    	}
	    }else if(yesorno.equals("아니오")) {
	    	System.out.println("전자기기에 대한 수리가 필요하실 때 언제든지 DMK 서비스센터를 이용해주세요.");
	    }
	    
	    System.out.println("수리비 총 " + repairCost + "원이 나왔습니다.");
	    System.out.print("결제하시겠습니까? (네/아니오) : ");
	    String userPayFor = scanner.next();
	    
	    if(userPayFor.equals("네")) {
	    	System.out.print("카드로 하시겠습니까? 현금으로 하시겠습니까? : ");
	    	String userSelectCardCash = scanner.next();
	    	
	    	if(userSelectCardCash.equals("카드")) {
	    		System.out.println("카드를 삽입해 주세요.");
	    		System.out.println("-----결제 진행중....-----");
	    		System.out.println("결제가 완료되었습니다.");
	    		System.out.println("이용해주셔서 감사합니다.");
	    	}else if(userSelectCardCash.equals("현금")) {
	    		System.out.print("얼마를 내시겠습니까? : ");
	    		int userCashPay = scanner.nextInt();
	    		
	    		if(userCashPay >= repairCost) {
	    			System.out.println("성공적으로 결제가 완료되었습니다.");
	    			System.out.println("이용해주셔서 감사합니다.");
	    		}else if(userCashPay < repairCost) {
	    			System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
	    		}
	    	}
	    }else if(userPayFor.equals("아니오")) {
	    	System.out.println("현재 수리비는 " + repairCost + "원입니다. 결제를 진행하셔야만 수리 요청하신 전자기기를 받으실 수 있습니다.");
	    }
	    
	    

	}

}
