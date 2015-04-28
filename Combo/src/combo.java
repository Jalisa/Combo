import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//ComboBox is added into JFrame
public class combo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String[] months = { "1, January", "2, February", "3, March", "4, April",
			"5, May", "6, June", "7, July", "8, August", "9, " + "September",
			"10, October", "11, November", "12, December"};
	String[] days = { "1" ,"2", "3", "4",
			"5", "6", "7", "8", "9, " ,
			"10", "11", "12", "13","14","15","16","17","18","19","20","21",
			"22","23","24","25","26","27","28","29","30","31"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	 JComboBox monthlist= new JComboBox(months);
	private ComboBoxModel date;
	@SuppressWarnings("rawtypes")
	JComboBox datelist= new JComboBox(date);

	// Labels created for JFrame
	JLabel monthlabel = new JLabel("Month");
	JLabel datelabel = new JLabel("Date");
	JLabel yearlabel = new JLabel("Year");
	JPanel Panel = new JPanel();

	// Labels are added into ComboBox
	public combo() {
		setLayout(new BorderLayout());
		Panel.setLayout(new GridLayout(3, 2));
		Panel.add(monthlabel);
		Panel.add(datelabel);
		Panel.add(yearlabel);
		add(monthlist);
		add(Panel, BorderLayout.WEST);

		// JFrame size set and action for closing window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setSize(400, 200);
		setLocationRelativeTo(null);
	}

	// Runs on Main class
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		combo c = new combo();
	}

}