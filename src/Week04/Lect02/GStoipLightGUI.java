/**File: GStoipLightGUI.java
 * ----------------------------------
 */
package Week04.Lect02;

import Week04.Lect01.GStopLight;
import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.color.*;

public class GStoipLightGUI extends GraphicsProgram{
	//instance variable
	private GStopLight stopLight;
	/**init() method
	 * ******************************
	 * program starts here
	 */
	public void init() {
		stopLight = new GStopLight();
		add(stopLight, getWidth()/2, getHeight()/2);
		add(new JButton("Red"),SOUTH);
		add(new JButton("Yellow"),SOUTH);
		add(new JButton("Green"),SOUTH);
		addActionListeners();
	}
	/**actionPerformed(ActionEvent e)method
	 * *************************************
	 */
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Red")) {
			stopLight.setState(Color.RED);
		}else if(cmd.equals("Yellow")) {
			stopLight.setState(Color.YELLOW);
		}else if(cmd.equals("Green")) {
			stopLight.setState(Color.GREEN);
		}
	}
}
