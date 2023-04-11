import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class guiEx2 extends JFrame{
	
	public guiEx2() {
		setTitle("DMK의 GUI 만들기(2)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 레이아웃을 FlowLayout으로 설정
		
		JMenuBar menuBar = new JMenuBar(); //메뉴바 만들기
		JMenu mMenu = new JMenu("Menu"); //메뉴바 위에 메뉴 만들기
		JMenuItem mMenuItem = new JMenuItem("MenuItem"); // 메뉴를 선택하면 메뉴아이템이 보이게 메뉴아이템 만들기
		JMenuItem mSaveItem = new JMenuItem("SaveItem"); //메뉴를 선택하면 saveItem이 보임
		JMenuItem mFileItem = new JMenuItem("FileItem"); //메뉴를 선택하면 fileItem 보임
		
		JTextField tf = new JTextField("중앙에 들어갈 텍스트 입력", 15); //사용자의 내용이 입력될 텍스트 필드 생성
		JSlider slider = new JSlider(); //슬라이드바 생성
		JCheckBox checkBox = new JCheckBox("checkBox1"); //체크박스 생성
		JCheckBox checkBox2 = new JCheckBox("checkBox2");
		JCheckBox checkBox3 = new JCheckBox("checkBox3");
		JRadioButton radioButton = new JRadioButton("radiuButton");
		JButton btn = new JButton("여길 눌러보세요!"); //버튼 생성
		JButton btn1 = new JButton("종료!");
		
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) { //버튼에 이벤트가 발생하였을 때 실행
				JButton btn2 = (JButton)e.getSource(); //이벤트 발생한 컴포넌트 즉, 버튼에 이벤트가 발생하므로 버튼을 가져옴. 그리고 JButton으로 형변환을 한 이유는 getSource가 조상클래스인 Object를 상속받기 때문에 강제적으로 JButton으로 형변환을 해줘야한다.
				btn2.setBackground(Color.RED); //버튼 클릭시 버튼 색은 빨강으로 바뀜
				c.setBackground(Color.MAGENTA); // 버튼 클릭시 컨테이너 색은 megenta 색으로 바뀜
			}
		});
		
		mMenu.add(mMenuItem);
	    mMenu.add(mSaveItem);
	    mMenu.add(mFileItem);
	    menuBar.add(mMenu);
	    setJMenuBar(menuBar); //메뉴바를 현재 프레임의 메뉴로 지정
	    c.add(tf);
	    c.add(slider);
	    c.add(checkBox);
	    c.add(checkBox2);
	    c.add(checkBox3);
	    c.add(radioButton);
	    c.add(btn);
	    c.add(btn1);
	    
	    setVisible(true);
	    setSize(400, 400);
		
	}

	public static void main(String[] args) {
		new guiEx2();
		
	}

}
