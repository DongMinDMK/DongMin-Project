package comboBoxEx;

import java.awt.*;
import javax.swing.*;

public class comboBoxEx1 extends JFrame{
	public String[] names = {"dongmin", "chulsu", "heechan", "heungmin", "jisung", "minjae"};
	public String[] ages = {"26", "50", "28", "32", "35", "28"};
	public String[] heights = {"174", "170", "173", "183", "175", "190"};
	public String[] sports = {"축구", "농구", "수영", "야구", "배구"};
	
	public comboBoxEx1() {
		setTitle("DMK의 GUI 프로젝트 만들기(5)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel la = new JLabel("대한민국 화이팅!");
		
		JComboBox<String> nameCombo = new JComboBox<String>(names);//콤보박스를 만들기 위해서는 제네릭을 사용한다.
		JComboBox<String> ageCombo = new JComboBox<String>(ages);
		JComboBox<String> heightCombo = new JComboBox<String>(heights);
		JComboBox<String> sportsCombo = new JComboBox<String>(sports);
		
		c.add(nameCombo, BorderLayout.NORTH);
		c.add(ageCombo, BorderLayout.WEST);
		c.add(heightCombo, BorderLayout.EAST);
		c.add(sportsCombo, BorderLayout.SOUTH);
		c.add(la, BorderLayout.CENTER);
		
		
		setSize(250, 250);
		setVisible(true);
		
	}
		
	

	public static void main(String[] args) {
		new comboBoxEx1();

	}

}
