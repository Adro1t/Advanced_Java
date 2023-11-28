package layoutManagement;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class DesktopPaneDemonstration extends JFrame {
	JDesktopPane dp;
	JInternalFrame if1, if2;

	public DesktopPaneDemonstration() {
		setTitle("Desktop frame");
		setSize(600, 600);
		setVisible(true);
		dp = new JDesktopPane();
		add(dp);// dp is a layer above JFrame
		if1 = new JInternalFrame("Frame 1", true, true, true, true);
		// true-=> resizeable,closeable,maximize,minimize
		if1.setLocation(20, 20);// if1 is at 20, 20 of Jframe or desktopPane
		if1.setSize(100, 100);
		if1.setVisible(true);
		dp.add(if1);
		if2 = new JInternalFrame("Frame 1", true, true, true, true);
		// true-=> resizeable,closeable,maximize,minimize
		if2.setLocation(250, 20);// if1 is at 20, 20 of Jframe or desktopPane
		if2.setSize(200, 200);
		if2.setVisible(true);
		dp.add(if2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new DesktopPaneDemonstration();
	}

}
