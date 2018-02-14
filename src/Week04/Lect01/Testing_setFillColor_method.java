/**File: Testing_setFillColor_method.java
 * ---------------------------------------
 * this program cteates a rectangle in the graphics window
 * but its border will be red color but it will be filled with
 * green color
 */
package Week04.Lect01;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Testing_setFillColor_method extends GraphicsProgram{
	/** run mehtod
	 * ***************************************
	 * this program starts here
	 */
	public void run() {
		GRect rect = new GRect(70,20);
		rect.setColor(Color.RED);
		rect.setFilled(true);
		rect.setFillColor(Color.GREEN);
		add(rect,50,50);
	}
}
