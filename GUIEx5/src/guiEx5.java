import java.awt.*;
import javax.swing.*;
public class guiEx5 extends JFrame {

	private MyPanel panel = new MyPanel();
	
	public guiEx5() {
		setTitle("DMK의 GUI 만들기(5)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //컨텐트팬(컨테이너)를 내가 만든 MyPanel의 panel로 덮어씌움
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new guiEx5();
	}

}
class MyPanel extends JPanel{ //JPanel은 조상이므로 JPanel을 상속받는다 JPanel은 즉 아무것도 없는 빈 컨테이너이다. JPanel 같은 경우에는 그림을 그릴때 많이 사용한다.
	@Override
	public void paintComponent(Graphics g) { //JComponent의 추상메소드 중 하나인 paintComponent를 재정의(오버라이딩)을 하여 구현한다. JPanel에다가 그림을 그릴 때 거의 사용한다.
		super.paintComponent(g); //패널 내에 이전에 그려진 잔상들을 모두 지우기 위해 호출한다. 즉, setBackground()메소드에 의해 지정된 바탕색으로 모두 지우고 그 위에다가 내가 작성한 MyPanel을 그린다
		g.setColor(Color.BLACK); //검정색 설정
		g.drawLine(10, 10, 400, 400); // x축과 y축인 (10, 10)에서 (400,400)까지 대각선 검정색으로 선을 그린다.
		g.setColor(Color.RED); //빨강색 설정
		g.drawOval(400, 400, 50, 50); // 처음 시작값 (400,400)에서 너비 50, 높이 50 크기로 원을 그린다.
		g.setColor(Color.MAGENTA); //magenta 색 설정
		g.drawRect(300, 50, 60, 60); //(300, 50) 초기 위치에서 너비 60, 높이 60으로 된 사각형을 그린다.
		
		//도형안을 채우기
		g.setColor(Color.PINK);
		g.fillRect(50, 300, 60, 60); //(50,300) 초기 위치에서 너비 60, 높이 60으로 된 색칠된 사각형을 그린다.
		
	}
	
}
