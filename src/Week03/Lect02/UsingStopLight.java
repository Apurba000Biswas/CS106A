/**File:UsingMyStopLight.java
 * ---------------------------------
 */
package Week03.Lect02;

import acm.program.*;
import acm.graphics.*;

public class UsingStopLight extends GraphicsProgram {
	public void run() {
		StopLight myStopLight = new StopLight();
		GRect rect = new GRect(20,20,120,120);
		rect.setFilled(true);
		rect.setColor(myStopLight.getState());
		add(rect);
		pause(1000);
		myStopLight.advance();
		rect.setColor(myStopLight.getState());
		add(rect);
		pause(1000);
		myStopLight.advance();
		rect.setColor(myStopLight.getState());
		add(rect);
	}
}
