/**StringArt.java
 * ---------------------------------------
 * 
 *  Apurba
 * 
 */

package Week02.Lect03;

import acm.graphics.*;
import acm.program.*;

public class StringArt extends GraphicsProgram {
	//Class variable declaration
	
	private static final int NUM_STRINGS = 10;
	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;
	
	/**run method
	 * -----------------------------------------
	 * program start here
	 */
	public void run() {
		double gap = getHeight() / NUM_STRINGS;
		for(int i = 0; i<NUM_STRINGS; i++) {
			double delta = i * gap;
			GLine l = new GLine (0,delta,delta,getHeight());
			double dx = delta;
			double dy = getHeight() - delta;
			double length = Math.sqrt(dx * dx + dy * dy);
			println(length);
			add(l);
		}
	}
}
