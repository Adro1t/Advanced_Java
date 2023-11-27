package layoutManagement;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ChoiceComponents extends JFrame {

	JCheckBox csit, bca, bbm, bit;
	JRadioButton male, female, ns;
	JComboBox<String> country;

	ButtonGroup group;// Groups buttons

	public ChoiceComponents() {
		setTitle("Choice Frame");
		setSize(300, 300);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		// CheckBox Object
		csit = new JCheckBox("BSC CSIT");
		// csit.setSelected(true); // setSelected(true) -> Property to keep selected
		// csit.setEnabled(false);// setEnabled(false) -> unable to no check
		bca = new JCheckBox("BCA");
		bbm = new JCheckBox("BBM");
		bit = new JCheckBox("BIT");

		// Group Objects
		group = new ButtonGroup();
		
		// RadioButton Object
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		ns = new JRadioButton("Not Specified");
		
		// Add to group
		group.add(male);
		group.add(female);
		group.add(ns);

		// ComboBox Object
		String[] c = { "Nepal", "India", "China" };
		country = new JComboBox<String>(c);

		add(csit);
		add(bca);
		add(bbm);
		add(bit);

		add(male);
		add(female);
		add(ns);

		add(country);

		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ChoiceComponents();
	}

}
