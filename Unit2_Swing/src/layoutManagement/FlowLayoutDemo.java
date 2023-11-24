package layoutManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public FlowLayoutDemo() {
		btn1 = new JButton("Button 1");
		add(btn1);
		btn2 = new JButton("Button 2");
		add(btn2);
		btn3 = new JButton("Button 3");
		add(btn3);
		btn4 = new JButton("Button 4");
		add(btn4);
		btn5 = new JButton("Button 5");
		add(btn5);
		// configuration of JFrame
		setTitle("Border Layout Frame");// title of Jframe
		setSize(400, 400);// size of JFrame in pixel
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo();
	}

}
