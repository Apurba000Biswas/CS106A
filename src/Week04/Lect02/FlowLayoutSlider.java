/**File: FlowLayoutSlider.java
 * ----------------------------
 */
package Week04.Lect02;

import acm.program.*;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutSlider extends Program{
	
	public void init() {
		setLayout(new FlowLayout());
		add(new JLabel("small"));
		add(new JSlider(0,100,50));
		add(new JLabel("Large"));
	}
}
