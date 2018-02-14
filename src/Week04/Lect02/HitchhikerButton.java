/**File: HitchhikerButton,java
 * ----------------------------------
 */
package Week04.Lect02;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class HitchhikerButton extends ConsoleProgram{
	
	/**init() mehtod
	 * ********************************
	 * progarm starts here
	 */
	public void init() {
		add(new JButton("Red"),SOUTH);
		addActionListeners();
	}
	/**actionPerformed(ActionEvent e) mehtod
	 * ***************************************
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {
			println("Please do not press this button again");
		}
	}
}
