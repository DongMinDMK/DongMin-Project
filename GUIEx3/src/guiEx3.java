import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class guiEx3 extends JFrame {
	
	public guiEx3() {
		setTitle("DMK의 GUI 만들기(3)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("이 텍스트를 클릭해보세요.(클릭된 횟수만큼 올라갑니다.)");
		
		c.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) { //마우스로 클릭할 때
				la.setText("텍스트를 클릭한 횟수 : " + e.getClickCount()); //텍스트 라벨을 클릭한 횟수를 구함, 그리고 setText 메소드는 텍스트를 재지정하는 메소드이다.
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) { //마우스 포인터가 GUI 화면 밖으로 나갔을 때
				Container c1 = (Container)e.getSource();
				c1.setBackground(Color.YELLOW);	// 배경색을 노랑색으로 지정	
				la.setText("현재 마우스 포인터가 GUI 밖으로 나가있는 상태입니다.");
			}
			
		});
		
		c.addMouseMotionListener(new MouseMotionListener()
		{

			@Override
			public void mouseDragged(MouseEvent e) { //마우스를 드래그할 때
				la.setText("마우스가 드래그할 때 x,y의 위치 (" + e.getX() + "," + e.getY() + ")");	//드래그할 때 마우스 포인터 위치에 따라 (x,y)가 설정	
				Container c2 = (Container)e.getSource();
				c2.setBackground(Color.GREEN); //마우스를 드래그할 때 배경색을 녹색으로 지정
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				la.setText("마우스가 움직일 때 x,y의 위치 (" + e.getX() + "," + e.getY() + ")"); //마우스가 GUI 안에서 움직일 때 마우스 포인터 위치에 따라 (x,y)가 설정
				Container c3 = (Container)e.getSource();
				c3.setBackground(Color.CYAN); //GUI에서 마우스 포인터가 움직일 때 배경색을 CYAN 색으로 설정
			}
			
		});
		
		c.addMouseWheelListener(new MouseWheelListener()
		{

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
			Container c4 = (Container)e.getSource();
			c4.setBackground(Color.BLACK);
						
		}
			
		});
		
		c.add(la);
		setVisible(true);
		setSize(400,400);
	}

	public static void main(String[] args) {
		new guiEx3();

	}

}
