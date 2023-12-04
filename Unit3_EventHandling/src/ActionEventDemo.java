import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo extends JFrame implements ActionListener {
	JButton close;

	public ActionEventDemo() {
		setTitle("Action Frame");
		setSize(300, 300);
		setLayout(new FlowLayout());
		close = new JButton("Close");

		close.addActionListener(this);// register ActionListener
//		close.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
		add(close);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ActionEventDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {// Event Handler
		System.exit(0);
	}

}

//Event is a action that occurs when a component change the state.
//JButton - click-state change occurs event-ActionEvent-ActionListener
//KeyEvent-KeyListener
//MouseEvent-MouseListener
//FocusEvent-FocusListener
//WindowEvent-WindowListener
//ItemEvent-ItemListener -interface
//KeyEvent-KeyAdapter - class
//MouseEvent-MouseAdapter
//FocusEvent-FocusAdapter
//WindowEvent-WindowAdapter
