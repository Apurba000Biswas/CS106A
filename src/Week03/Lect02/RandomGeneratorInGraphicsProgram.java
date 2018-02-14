/**File: RandomGeneratorInGraphicsProgram.java
 * -------------------------------------------
 * Apurba
 */
package Week03.Lect02;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class RandomGeneratorInGraphicsProgram extends GraphicsProgram {
	/**run method()
	 * ---------------------------------------
	 * program starts here
	 */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int sentiniel = 5;
	
	public void run() {
		
		double x = 0;
		double y = 0;
		while(x+110+x < getWidth()) {
			Color color = rgen.nextColor();
			drawRect(color,x,y);
			x++;
			y++;
		}
		while(x>0) {
			x--;
			y++;
			Color color = rgen.nextColor();
			drawRect(color,x,y);
		}
	}
	/**drawRect(colr) method
	 * --------------------------------------
	 */
	private void drawRect(Color color,double x,double y) {
		GRect rect = new GRect(50+x,50+y,60+x,60+x);
		rect.setFilled(true);
		rect.setColor(color);
		add(rect);
		pause(100);
	}
}
