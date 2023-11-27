package layoutManagement;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.ChangedCharSetException;

public class SliderChoice extends JFrame {

	JPanel sliderpanel;
	JTextField valuetxt;
	ChangeListener listener;// used to handle ChangeEvent

	public SliderChoice() {
		setTitle("Slider Choice Frame");
		setSize(300, 300);
		sliderpanel = new JPanel();
		listener = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				valuetxt.setText("The selected value is : " + source.getValue());
			}
		};
//		JSlider slider = new JSlider();// by default horizontal with value 0 to 100
//		JSlider slider = new JSlider(SwingConstants.VERTICAL, 10, 100, 20);
		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 20);
		slider.setPaintLabels(true);// show tick label
		slider.setPaintTicks(true);// ticks are scale/line on slider
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(20);
		slider.setSnapToTicks(true);
		// slider.setInverted(true);
		Dictionary<Integer, Component> label = new Hashtable<Integer, Component>();
		label.put(0, new JLabel("A"));
		label.put(20, new JLabel("B"));
		label.put(40, new JLabel("C"));
		label.put(60, new JLabel("D"));
		label.put(80, new JLabel("E"));
		label.put(100, new JLabel("F"));

		slider.setLabelTable(label);
		slider.addChangeListener(listener);

		sliderpanel.add(slider);
		valuetxt = new JTextField(20);

		add(valuetxt, BorderLayout.SOUTH);
		add(sliderpanel, BorderLayout.NORTH);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new SliderChoice();
	}

}
