import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//GUI의 텍스트 Label에서 키 리스너를 받았을 때
public class guiEx4 extends JFrame{
	
	public guiEx4() {
		setTitle("DMK의 GUI 만들기(4)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //컨테이너에 아무것도 없는 상태에서 키 리스너를 사용해야 되기 때문에 레이아웃을 null로 설정
		
		JLabel la = new JLabel("움직이는 텍스트(방향키를 상하좌우를 입력하면 텍스트가 움직임)"); 
		
		la.setLocation(10, 10); //처음 GUI를 생성했을 때 보일 Label의 초깃값 위치 설정(텍스트를 길게 해서 그런지 10,10 위치 처럼 안보임...)
		la.setSize(380, 380); //텍스트를 다 나오게 하기 위해 (380, 380)으로 지정
		
		la.addKeyListener(new KeyAdapter() //어댑터로 지정한 이유 : 리스너로 지정하면 키 리스너 관련 메소드인 KeyPressed, KeyReleased,KeyTyped을 만들어야 한다. 어댑터를 사용하면 사용할 메소드만 적으면 되기 때문에 어댑터를 사용해 KeyPressed 메소드에만 구현했다.
		{
			@Override
			public void keyPressed(KeyEvent e) {
				int keyInput = e.getKeyCode(); // 밑에 switch-case 문에 keyInput을 넣어 활용을 하기 위해 keyInput 라는 int형 변수 생성
				
				// 키는 중앙 점을 기준으로 x축은 왼쪽이 -, 오른쪽이 + 이며, y축은 중앙점을 기준으로 위는 -, 아래가 + 이다.
				switch(keyInput) {
				case KeyEvent.VK_UP :
					la.setLocation(la.getX(), la.getY() - 5); // 방향키에서 위쪽 키를 누르면 y쪽에서 - 방향으로 5만큼 움직인다. setLocation은 위치를 재지정하라는 메소드 명령어
					break;
				case KeyEvent.VK_DOWN :
					la.setLocation(la.getX(), la.getY() + 5); // 방향키에서 아래쪽 키를 누르면 y쪽에서 + 방향으로 5만큼 움직인다.
					break;
				case KeyEvent.VK_LEFT :
					la.setLocation(la.getX() - 5, la.getY()); // 방향키에서 왼쪽 키를 누르면 x쪽에서 - 방향으로 5만큼 움직인다.
					break;
				case KeyEvent.VK_RIGHT :
					la.setLocation(la.getX() + 5, la.getY()); // 방향키에서 오른쪽 키를 누르면 x쪽에서 + 방향으로 5만큼 움직인다.
					break;
				}
			}
			
		});
		
		la.setFocusable(true); //텍스트 Label을 포커스로 지정
		la.requestFocus(); // 텍스트 Label을 포커스로 지정해야 키 관련 리스너(어댑터)가 포커스를 받아 방향키 입력대로 움직임.
		c.add(la); //컨테이너에 라벨 삽입
		
		setSize(600, 600); //GUI 전체 크기 사이즈 설정
		setVisible(true); // GUI가 이 명령을 수행함으로써 화면에 띄워짐
		
		
	}

	public static void main(String[] args) {
		new guiEx4();
	}

}
