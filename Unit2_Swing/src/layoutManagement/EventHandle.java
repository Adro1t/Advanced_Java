package layoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventHandle extends JFrame {
	JPanel panel;
	JButton btn, btn1, btn2;

	public EventHandle() {
		panel = new JPanel();
		panel.setBackground(Color.RED);
		btn = new JButton("Change Color");
		btn.setBackground(Color.BLACK);
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		panel.add(btn1);
		panel.add(btn2);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setBackground(Color.GREEN);
			}
		});

		add(panel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		setTitle("Event Frame");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new EventHandle();
	}

}
