package layoutManagement;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public JOptionPaneDemo() {
	}

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
		int secondNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
		int product = firstNum * secondNum;
//		JOptionPane.showMessageDialog(null, "The product is " + product, "Product", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "The product is " + product, "Product", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "The product is " + product,"Product", JOptionPane.INFORMATION_MESSAGE);

		}

}
