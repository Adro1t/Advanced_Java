package layoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MenuAndToolbar extends JFrame {
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem open, save, status, copy, paste, exit;
	JPanel panel;

	public MenuAndToolbar() {
		bar = new JMenuBar();
		file = new JMenu("FILE");
		file.setMnemonic('F');// alt+f
		edit = new JMenu("EDIT");
		edit.setMnemonic('E');// alt+e
		view = new JMenu("VIEW");
		view.setMnemonic('V');// alt+v
		save = new JMenuItem("SAVE");
		save.setEnabled(false);
		open = new JMenuItem("OPEN");
		open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));// trigger event
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(bar);

			}
		});
		status = new JMenuItem("STATUS");
		copy = new JMenuItem("COPY");
		paste = new JMenuItem("PASTE");
		exit = new JMenuItem("EXIT", KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));// trigger event
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// terminate the program

			}
		});

		file.add(open);
		file.add(save);
		file.add(exit);
		edit.add(copy);
		edit.add(paste);
		view.add(status);
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		setJMenuBar(bar);// sets bar in top of

		// Toolbar
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
				new JFileChooser().showOpenDialog(panel);// panel use gareni hunxa
			}
		};
		JToolBar tbar = new JToolBar();
		tbar.add(runaction);
		tbar.add(openaction);
		add(tbar, BorderLayout.NORTH);
		add(panel);
		// JFrame Configuration
		setTitle("JMENU Frame");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MenuAndToolbar();
	}

}
