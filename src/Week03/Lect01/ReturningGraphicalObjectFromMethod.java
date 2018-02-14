/**File: ReturningGraphicalObjectFromMethod.java
 * ---------------------------------------------
 * Apurba
 */
package Week03.Lect01;

import java.awt.*;
import acm.graphics.*;
import acm.program.*;

public class ReturningGraphicalObjectFromMethod extends GraphicsProgram{
	/**run method
	 * -----------------------------------------
	 * program starts here
	 */
	public void run() {
		println("This program draw a circle in the graphics window");
		
		double x = 100;
		double y = 100;
		double r = 40;
		Color c = Color.RED;
		GOval circle = createFilledCirlce(x,y,r,c);
		add(circle);
	}
	/**createFilledCirlce(x,y,r) method
	 * -----------------------------------------
	 */
	private GOval createFilledCirlce(double x,double y,double r,Color color) {
		GOval circle = new GOval(x-r,y-r,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
