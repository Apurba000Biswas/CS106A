/**File: TableLayoutButtns.java
 * ------------------------------
 */
package Week04.Lect02;

import acm.program.*;
import javax.swing.*;
import java.awt.*;
import acm.gui.*;

public class TableLayoutButtns extends Program{
	
	public void init() {
		setLayout(new TableLayout(2,3));
		add(new JLabel("heading"),"gridwidth = 3");
		
	}
}
