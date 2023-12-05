import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventDemo extends WindowAdapter {
	JFrame frame;

	public WindowEventDemo() {
		frame = new JFrame();
		frame.addWindowListener(this);

		frame.setTitle("WindowEvent Frame");
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new WindowEventDemo();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(frame, "Welcome");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(frame, "Bye");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		JOptionPane.showMessageDialog(frame, "See you soon");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		JOptionPane.showMessageDialog(frame, "Welcome back");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window is activated");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window is de-activated");
	}

}
