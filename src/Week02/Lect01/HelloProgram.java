package Week02.Lect01;
/**File:HelloProgram.java
 * ----------------------------------------
 * this program displays hellow on the screen.
 */

import acm.graphics.*;
import acm.program.*;
/**
 * 
 * Apurba
 *
 */

public class HelloProgram extends GraphicsProgram{
	/**
	 * run method
	 * -------------------------------------
	 * program starts here
	 */
	public void run() {
		add(new GLabel("Hellow World"),100,75);
	}

}
