package layoutManagement;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JListJTableJToolJProgressbar extends JFrame {
	JList<String> list;
	JTree tree;
	JTable table;
	JProgressBar bar;

	public JListJTableJToolJProgressbar() {
		// list
		String[] country = { "Nepal", "India", "Pakistan" };
		list = new JList<String>(country);
		list.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		add(list);

		// tree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
		DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("FRUITS");
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("APPLE");
		DefaultMutableTreeNode mango = new DefaultMutableTreeNode("MANGO");
		fruits.add(apple);
		fruits.add(mango);
		root.add(fruits);
		tree = new JTree(root);// root is added to tree also
		add(tree);

		// Table
		String[] info = { "Name", "Address", "Contact" };
		String[][] data = { { "Harendra", "Kathmandu", "909090" }, { "Ram", "Janakpur", "8988" } };

		table = new JTable(data, info);
		JScrollPane sbar = new JScrollPane(table);
		add(sbar);
//		add(table);

		// ProgressBar
		JButton pbtn = new JButton("Progress");
		bar = new JProgressBar();
		bar.setStringPainted(true);
		pbtn.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				count = count + 10;
//				if (count > 99) {
//					bar.setString("Done");
//				} else if (count > 80) {
//					bar.setString("Almost Done");
//				} else {
//					bar.setValue(count);
//				}
//				while(count !=100) {

//					bar.setValue(count);	
//				}
			}
		});
		add(bar);
		add(pbtn);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JListJTableJToolJProgressbar();
	}

}
