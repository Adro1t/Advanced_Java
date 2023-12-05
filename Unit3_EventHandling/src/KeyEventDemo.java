import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame implements KeyListener {
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;

	public KeyEventDemo() {
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");

		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);

		resulttxt.addKeyListener(this);

		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);

		setTitle("KeyEvent Frame");
		setSize(300, 300);
		setLayout(new GridLayout(3, 2, 5, 5));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventDemo();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int first = Integer.parseInt(firsttxt.getText());// type casting
		int second = Integer.parseInt(secondtxt.getText());// type casting
		int result = 0;
		if (e.getKeyChar() == 'a')
			result = first + second;
		else if (e.getKeyChar() == 'b')
			result = first - second;
		else if (e.getKeyChar() == 'c')
			result = first * second;
		else if (e.getKeyChar() == 'd')
			result = first / second;
		else
			result = 0;
		resultlbl.setText(String.valueOf(result));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
