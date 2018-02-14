/**File: StopLight.java
 * ------------------------------
 */
package Week03.Lect02;

import java.awt.*;

public class StopLight {
	//defining constant****************************
	public static final Color Green = Color.GREEN;
	public static final Color Yellow = Color.YELLOW;
	public static final Color Red = Color.RED;
	//*********************************************
	private int state;//instance variable
	//defining Constructor*************************
	public StopLight() {
		state = 0;
	}
	/**getState() mehtod
	 * ********************************************
	 * @return
	 */
	public Color getState() {
		switch(state) {
		case 0: return Green;
		case 1: return Yellow;
		case 2: return Red;
		default: return null;
		}
	}
	public void advance() {
		state = state+1;
	}
}
