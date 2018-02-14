/** File:centeredHellowWorld.java
 *  Apurba
 */

package Week03.Lect01;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class centeredHellowWorld extends GraphicsProgram {
	/**run() method
	 * ---------------------------------
	 * program starts here
	 */
	public void run() {
		GLabel label = new GLabel("Hellow World!");
		label.setFont("London-36");
		label.setColor(Color.RED);
		double x = (getWidth() - label.getWidth())/2;
		double y = (getHeight() + label.getAscent())/2;
		add(label,x,y);
	}
}
