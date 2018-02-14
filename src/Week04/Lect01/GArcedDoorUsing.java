/**File: GArcedDoorUsing.java
 * ------------------------------
 * this program creates an arced door on the canvas
 */
package Week04.Lect01;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class GArcedDoorUsing extends GraphicsProgram{
	/**run() mehtod
	 ****************************
	 *program starts here 
	 */
	public void run() {
		GArchedDoor door = new GArchedDoor(50, 80);
		door.setFilled(true);
		door.setColor(Color.BLUE);
		add(door, getWidth()/2,getHeight()/2);
	}
}
