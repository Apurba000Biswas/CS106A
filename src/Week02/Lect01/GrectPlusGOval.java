package Week02.Lect01;
/**file:GerctPlusGoOval.java
 * 
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;
//import java.awt.color.*;


public class GrectPlusGOval extends GraphicsProgram{
	/**run mehtod
	 * ----------------------------------
	 * program start here
	 */
	public void run() {
		GRect rect = new GRect(100,50,125,60);
		//sending mesege to rect object
		rect.setFilled(true);
		rect.setColor(Color.RED);
		//now adding to the canvas
		add(rect);
		//creating new oval object
		GOval oval = new GOval(100,50,125,60);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
	}
}
