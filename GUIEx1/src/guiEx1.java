import java.awt.*;
import javax.swing.*;
public class guiEx1 extends JFrame{ //JFrame을 상속하여 GUI 구현, JFrame은 클래스의 Object 클래스처럼 제일 최상위 컨테이너라고 보면 됨.
	
	//BorderLayout 이라는 레이아웃 틀을 이용하여 컨테이너 위에 컴포넌트 삽입하기
	
	public guiEx1() {
		setTitle("DMK님의 첫번째 gui 프로젝트 만들기"); //컨테이너(JFrame) 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 컨테이너(JFrame)에서 오른쪽 상단 닫기 버튼을 누르면 컨테이너(JFrame) 창이 닫아짐과 동시에 종료
	    Container c = getContentPane(); // 컨테이너(JFrame)을 c 즉, 인스턴스 변수 생성
	    c.setLayout(new BorderLayout()); //BorderLayout이라는 레이아웃은 왼쪽에서 오른쪽으로 순서대로 하나씩 컴포넌트 삽입
	    JButton btn = new JButton("버튼 생성"); //버튼이라는 컴포넌트 하나 생성
	    JRadioButton radioButton1 = new JRadioButton("radiobutton1"); //라디오버튼 컴포넌트 생성
	    JRadioButton radioButton2 = new JRadioButton("radiobutton2"); //라디오버튼 컴포넌트 생성
	    JTextField tf = new JTextField("테스트를 입력해주세요.", 20); // 텍스트필드 컴포넌트 생성
	    JSlider sl = new JSlider(); //슬라이더 컴포넌트 생성
	    
	    
	    c.add(btn, BorderLayout.NORTH); // 컨테이너(JFrame)에 버튼이라는 컴포넌트 삽입(북쪽)
	    c.add(radioButton1, BorderLayout.WEST); //컨테이너(JFrame)에 라디오버튼 컴포넌트 삽입(서쪽)
	    c.add(radioButton2, BorderLayout.EAST); //컨테이너(JFrame)에 라디오버튼 컴포넌트 삽입(동쪽)
	    c.add(tf, BorderLayout.CENTER); //컨테이너(JFrame)에 텍스트필드 삽입(중앙)
	    c.add(sl, BorderLayout.SOUTH); //컨테이너(JFrame)에 슬라이더바 삽입(남쪽)
	    
		setVisible(true); // 컨테이너(JFrame)을 보여줌.
		setSize(400, 400); //컨테이너(JFrame)의 크기
	}

	public static void main(String[] args) {
		new guiEx1();
	}

}
