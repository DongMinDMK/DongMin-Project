package internalClassPr;

interface ButtonClickListener{
	public abstract void pressClick();
}

public class InternalClassPr {
	
	//버튼 객체를 내부 클래스로 선언
	class Button{
		private ButtonClickListener listener; 
		
		//리스너를 파라미터(매개변수)를 통해 받는다.
		public void setButtonListener(ButtonClickListener listener) {
			this.listener = listener;
		}
		
	    public void pressClick() {
	    	if(listener != null) { //즉 마우스를 클릭했다면
	    		this.listener.pressClick();
	    	}
	    }
	}

	public static void main(String[] args) {
		InternalClassPr icpr = new InternalClassPr(); //외부클래스 선언
		InternalClassPr.Button button = icpr.new Button(); //외부 클래스를 통해서 내부에 있는 버튼 클래스를 선언한다.
		
		//내부 버튼 클래스의 인스턴스 button을 통해 안에 있는 setButtonListener를 호출
		button.setButtonListener(new ButtonClickListener() { //인터페이스를 익명 클래스로 선언하여 인터페이스 안에 있는 pressClick() 추상 메소드를 오버라이딩 하여 재정의하여 구현함.
			@Override
			public void pressClick() {
				System.out.println("지금 현재 메소드가 실행되었습니다!!");
			}
		}); 
		
		
		button.pressClick(); //pressClick() 메소드를 실행하면 콘솔창에서 오버라이딩으로 재정의한 출력문이 출력
	}

}
