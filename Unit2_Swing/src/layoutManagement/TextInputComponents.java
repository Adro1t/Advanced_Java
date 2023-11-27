package layoutManagement;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextInputComponents extends JFrame {
	JLabel lbl;
	JTextField text;
	JPasswordField pass;
	JTextArea area;

	public TextInputComponents() {

		setTitle("Text input frame");
		setLayout(new GridLayout(2, 2));
		setSize(200, 200);
		
		lbl = new JLabel("Username");
		text = new JTextField(20);
		pass = new JPasswordField(20);
		area = new JTextArea(5, 20);

		add(lbl);
		add(text);
		add(pass);
		add(area);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TextInputComponents();
	}

}
