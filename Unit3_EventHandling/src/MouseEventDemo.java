import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventDemo extends JFrame implements MouseListener {
	JPanel panel;
	JLabel label;

	public MouseEventDemo() {
		panel = new JPanel();
		label = new JLabel();

		panel.addMouseListener(this);

//		panel.addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				label.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				label.setText("Pressed at (" + e.getX() + "," + e.getY() + ")");
//
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				label.setText("Released at (" + e.getX() + "," + e.getY() + ")");
//
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				label.setText("Entered (" + e.getX() + "," + e.getY() + ")");
//
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				label.setText("Exited at (" + e.getX() + "," + e.getY() + ")");
//
//			}

//		})

		panel.setBackground(Color.yellow);

		add(label, BorderLayout.NORTH);
		add(panel);

		setTitle("Mouse Frame");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseEventDemo();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		label.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setText("Pressed at (" + e.getX() + "," + e.getY() + ")");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Released at (" + e.getX() + "," + e.getY() + ")");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Entered (" + e.getX() + "," + e.getY() + ")");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Exited at (" + e.getX() + "," + e.getY() + ")");

	}

}
