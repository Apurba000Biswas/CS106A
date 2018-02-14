/**File: AddingImage.java
 * --------------------------------
 * This program simply adds an image on the graphics window
 */
package Week04.Lect01;

import acm.graphics.*;
import acm.program.*;

public class AddingImage extends GraphicsProgram {
	/**run method
	 * *****************************
	 * program starts here
	 */
	public void run() {
		add(new GImage("dubai_night-wide.jpg"));
	}
}
