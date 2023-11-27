package layoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame {
	JPanel panel;

	public ToolBarDemo() {
		setTitle("ToolBAr Frame");
		panel = new JPanel();

		Action runaction = new AbstractAction("Play", new ImageIcon(getClass().getResource("play.PNG"))) {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
		};
		Action openaction = new AbstractAction("Open", new ImageIcon(getClass().getResource("open.PNG"))) {

			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(ToolBarDemo.this);// panel use gareni hunxa
			}
		};
		JToolBar tbar = new JToolBar();
		tbar.add(runaction);
		tbar.add(openaction);
		add(tbar, BorderLayout.NORTH);
		add(panel);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ToolBarDemo();
	}

}
