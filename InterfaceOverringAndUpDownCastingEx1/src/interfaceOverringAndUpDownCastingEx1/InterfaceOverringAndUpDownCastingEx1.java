package interfaceOverringAndUpDownCastingEx1;

interface Food{
	public abstract void foodTaste();
	public abstract void foodPrice();
}

class BulgogiRice implements Food{
	String bulgogi;
	String rice;
	
	public BulgogiRice(String bulgogi, String rice) {
		this.bulgogi = bulgogi;
		this.rice = rice;
	}

	@Override
	public void foodTaste() {
		System.out.println("불고기덮밥은 한국에서 인기가 많은 요리중 하나이며, 호불호가 갈리지 않는 맛을 갖고 있는 한국 인기요리중 하나입니다.");
	}

	@Override
	public void foodPrice() {
		System.out.println("불고기덮밥의 가격은 8000원 사이입니다. 곱빼기는 2000원 추가입니다.");
	}
	
	public void bulgogiRiceShow() {
		System.out.println("한국인 뿐만 아니라 외국인들도 자주 즐겨먹는 대표적인 한국 요리입니다.");
	}
	
	public void bulgogiRiceMethod() {
		System.out.println(this.bulgogi + "와, " + this.rice + "를 혼합해서 만든 불고기덥밥의 한국음식점을 자주 놀러와주세요!");
	}
}


class CasuRice implements Food{
	String casu;
	String rice;
	
	public CasuRice(String casu, String rice) {
		this.casu = casu;
		this.rice = rice;
	}

	@Override
	public void foodTaste() {
		System.out.println("차슈덮밥은 일본에서 유명한 덮밥 요리중 하나이며, 호불호가 없는 좋은 맛으로 이루어져 있다고 합니다.");
	}

	@Override
	public void foodPrice() {
		System.out.println("차슈덮밥은 11000원이며, 곱빼기는 2000원추가입니다.");
	}
	
	public void casuRiceShow() {
		System.out.println("일본에서 유명한 차슈덮밥은 전세계적으로도 인기있는 덮밥 요리중 하나입니다.");
	}
	
	public void casuRiceMethod() {
		System.out.println(this.casu + "와, " + this.rice + "를 혼합해서 만든 차슈덮밥을 먹으러 일본음식점에 자주 놀러와주세요!");
	}
}

class VietnamNoodle implements Food{
	String noodle;
	String rice;
	
	public VietnamNoodle(String noodle, String rice) {
		this.noodle = noodle;
		this.rice = rice;
	}

	@Override
	public void foodTaste() {
		System.out.println("베트남쌀국수는 베트남에서 가장 인기있는 음식중 하나이며 남녀노소 누구나 좋아하는 맛을 갖고 있습니다.");
	}

	@Override
	public void foodPrice() {
		System.out.println("베트남쌀국수는 가격이 저렴한 메뉴 중 하나로 속하며, 5000원으로 먹을 수 있으며 곱빼기는 1000원 추가입니다.");
		
	}
	
	public void vietnamNoodleShow() {
		System.out.println("베트남쌀국수는 전세계적으로 베트남하면 떠오르는 음식중 하나입니다.");
	}
	
	public void vietnamNoodleMethod() {
		System.out.println("베트남의 " + this.noodle + "과, " + this.rice + "로 이루어진 베트남쌀국수를 많이 드셔보시고 자주 놀러와주세요!");
	}
	
	
}
public class InterfaceOverringAndUpDownCastingEx1 {

	public static void main(String[] args) {
		
		Food food = new BulgogiRice("불고기", "밥");
		food.foodTaste();
		food.foodPrice();
		
		BulgogiRice br = (BulgogiRice) food;
		br.bulgogiRiceShow();
		br.bulgogiRiceMethod();
		
		System.out.println();
		food = new CasuRice("차슈", "밥");
		food.foodTaste();
		food.foodPrice();
		
		CasuRice cr = (CasuRice) food;
		cr.casuRiceShow();
		cr.casuRiceMethod();
		
		System.out.println();
		
		food = new VietnamNoodle("면", "쌀");
		food.foodTaste();
		food.foodPrice();
		
		VietnamNoodle vn = (VietnamNoodle) food;
		vn.vietnamNoodleShow();
		vn.vietnamNoodleMethod();
		
		

	}

}
