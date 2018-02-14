/**File: HelloGUUI.java
 * ------------------------------
 */
package Week04.Lect02;

import acm.program.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class HelloGUUI extends ConsoleProgram{
	private JTextField nameField;
	
	/**run() method
	 * ****************************
	 * program starts here
	 */
	public void init() {
	    nameField = new JTextField(10);
	    add(new JLabel("Name"),SOUTH);
	    add(nameField,SOUTH);
	    nameField.addActionListener(this);
	    
	   }

	   public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == nameField) {
	       println("Hello, " + nameField.getText());
	    }
	 }

}
