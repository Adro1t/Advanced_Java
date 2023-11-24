package layoutManagement;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public GridLayoutDemo() {
		setLayout(new GridLayout(3,2,10,10));
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
		setTitle("Grid Layout Frame");// title of Jframe
		setSize(400, 400);// size of JFrame in pixel
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
