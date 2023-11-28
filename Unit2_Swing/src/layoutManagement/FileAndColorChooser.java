package layoutManagement;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileAndColorChooser extends JFrame {
	JFileChooser fc;
	JColorChooser cc;
	JPanel panel;

	public FileAndColorChooser() {
		setTitle("File and Color Frame");
		setSize(400, 400);
		panel = new JPanel();
		add(panel);
		fc = new JFileChooser();
		fc.showOpenDialog(this);
		cc = new JColorChooser();
		Color c = cc.showDialog(this, "Select COlor", Color.GREEN);
		panel.setBackground(c);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FileAndColorChooser();
	}

}
