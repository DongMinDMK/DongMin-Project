
public class classMethodEx {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook("DMK 컴퓨터", "LG", 1000000); //nb라는 인스턴스를 생성하고 현재 제작사는 LG
		nb.show();
		
		System.out.println("제작사를 변경합니다.");
		nb.setManuFac("Samsung"); // 노트북 제작사 변경
		System.out.println("현재 제작사는 " + nb.getManuFac() + "입니다."); 
		nb.show();
		
		System.out.println("가격을 변경합니다.");
		nb.setPrice(1300000);
		System.out.println("현재 가격은 " + nb.getPrice() + "원 입니다.");
		nb.show();
		
	}

}
class NoteBook{
	
	String name; //노트북 이름
	String Manufac; //제작사
	int price;
	
	public NoteBook(String name, String Manufac, int price) {
		this.name = name;
		this.Manufac = Manufac;
		this.price = price;
	}
	
	

	public void setManuFac(String Manufac) { //제작사 이름 재조정 하는 메소드
		this.Manufac = Manufac;
	}
	
	public String getManuFac() { //현재 NoteBook 클래스에 있는 제작사 리턴
		return Manufac;
	}
	
	public void setPrice(int price) { //가격 재조정 하는 메소드
		this.price = price;
	}
	
	public int getPrice() { //현재 NoteBook 클래스에 있는 가격 리턴
		return price;
	}
	
	public void show() {
		System.out.println("노트북의 이름은 " + this.name + "이고, 제작사는 " + this.Manufac + "이며, 노트북의 가격은 " + this.price + "원 입니다.");
	}
	
	
}
