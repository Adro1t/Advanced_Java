package layoutManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuDemonstration extends JFrame {
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem open, save, status, copy, paste, exit;

	public MenuDemonstration() {
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
//		zoom=new JRadioButtonMenuItem();
//		print = new JCheckBoxMenuItem();

		file.add(open);
		file.add(save);
		file.add(exit);
		edit.add(copy);
		edit.add(paste);
		view.add(status);
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		setJMenuBar(bar);// sets bar in top of JFrame

		// JFrame Configuration
		setTitle("JMENU Frame");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new MenuDemonstration();

	}

}
