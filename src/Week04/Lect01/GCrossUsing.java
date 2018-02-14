/**File: GCrossUsing.java
 * -----------------------------
 */
package Week04.Lect01;

import java.awt.Color;

import acm.program.*;

public class GCrossUsing extends GraphicsProgram{
	/**run mehtod
	 * **********************
	 * program starts here
	 */
	public void run() {
		GCross cross = new GCross(100);
		cross.setFilled(true);
		cross.setColor(Color.RED);
		add(cross, getWidth()/2, getHeight()/2);
	}
}
