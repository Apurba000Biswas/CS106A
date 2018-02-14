package Week02.Lect02;
/**CenteredOval
 * -------------------------
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;



public class CenteredOval extends GraphicsProgram {
	/**run method
	 * ------------------------
	 * program start here
	 */
	public void run() {
		GOval oval = new GOval(getWidth(),getHeight());
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval,0,0);
	}

}
