/**FIle: TemperatureConverter.java
 * -------------------------------
 */
package Week04.Lect02;

import acm.program.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import acm.graphics.GMath;
import acm.gui.*;

public class TemperatureConverter extends Program{
	//instance variable
	private IntField fahrenheitField;
	private IntField celsiusFiled;
	/**init() method
	 * ****************************
	 */
	public void init() {
		setLayout(new TableLayout(2,3));
		fahrenheitField = new IntField(32);
		fahrenheitField.setActionCommand("F -> C");
		fahrenheitField.addActionListener(this);
		celsiusFiled = new IntField(0);
		celsiusFiled.setActionCommand("C -> F");
		celsiusFiled.addActionListener(this);
		add(new JLabel("Degrees Fahrenheit"));
		add(fahrenheitField);
		add(new JButton("F -> C"));
		add(new JLabel("Degrees Celsius"));
		add(celsiusFiled);
		add(new JButton("C -> F"));
		addActionListeners();
	}
	/**actionPerformed(ActionEvent e) method
	 * ************************************
	 * for button action
	 */
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("F -> C")) {
			int f = fahrenheitField.getValue();
			int c = GMath.round((5.0/9.0) * (f - 32));
			celsiusFiled.setValue(c);
		}else if(cmd.equals("C -> F")) {
			int c = celsiusFiled.getValue();
			int f = GMath.round((9.0/5.0) * (c + 32));
			fahrenheitField.setValue(f);
		}
	}
}
