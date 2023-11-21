import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AWTConcept extends JFrame {
	JLabel userlbl, passlbl;
	JTextField usertxt;
	JPasswordField passtxt;
	JButton loginbtn;

	public AWTConcept() {
		setTitle("First GUI");
		userlbl = new JLabel("Username");
		passlbl = new JLabel("Password");
		usertxt = new JTextField(20);
		passtxt = new JPasswordField(20);
		loginbtn = new JButton("Sign In");
		setLayout(null);// to manage layout
		add(userlbl);
		userlbl.setBounds(0,20,100,20);
		add(usertxt);
		usertxt.setBounds(110,20,100,20);
		add(passlbl);
		passlbl.setBounds(0,40,100,20);
		add(passtxt);
		passtxt.setBounds(110,40,100,20);
		add(loginbtn);
		loginbtn.setBounds(110,60,100,20);
		setBounds(500, 500, 300, 300);
//		setLayout(new FlowLayout());// to manage layout
//		setSize(500, 300);// width and height in pixels
		setVisible(true);// by default false
//		setResizable(false);// fix size of JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		JFrame frame=new JFrame();
//		frame.setTitle("First GUI");
//		frame.setSize(300, 300);// width and height in pixels
//		frame.setVisible(true);// by default false
	}

	public static void main(String[] args) {
		new AWTConcept();
	}
}
//Frame-setSize(width,height), setLayout(obj of layout)
//setVisible(true)
