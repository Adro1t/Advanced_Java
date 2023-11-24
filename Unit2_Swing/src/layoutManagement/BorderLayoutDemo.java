package layoutManagement;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public BorderLayoutDemo() {
		setLayout(new BorderLayout(10,10));
		btn1=new JButton("Button 1");
		add(btn1,BorderLayout.NORTH);
		btn2=new JButton("Button 2");
		add(btn2,BorderLayout.SOUTH);
		btn3=new JButton("Button 3");
		add(btn3,BorderLayout.WEST);
		btn4=new JButton("Button 4");
		add(btn4,BorderLayout.EAST);
		btn5=new JButton("Button 5");
		add(btn5,BorderLayout.CENTER);
		//configuration of JFrame
		setTitle("Border Layout Frame");//title of Jframe
		setSize(400,400);//size of JFrame in pixel
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutDemo();
	}

}
