package layoutManagement;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class DemoDialog extends JDialog {
	public DemoDialog(JFrame owner) {
		super(owner, "Dialog Box", true);
		add(new JLabel("This is a dialog box"));
		setSize(200, 200);
		setVisible(true);
	}
}

public class JDialogDemonstration extends JFrame {
	JButton clickme;

	public JDialogDemonstration() {
		clickme = new JButton("Show Dialog");
		clickme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new DemoDialog(JDialogDemonstration.this);
			}
		});
		add(clickme);
		setTitle("Dialog Frame");
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JDialogDemonstration();
	}

}
