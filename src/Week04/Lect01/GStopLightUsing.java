/**File: GStopLightUsing.java
 * ----------------------------
 */
package Week04.Lect01;

import java.awt.Color;

import acm.program.*;

public class GStopLightUsing extends GraphicsProgram{
	/**run () method
	 * *****************************
	 */
	public void run() {
		GStopLight stopLight= new GStopLight();
		add(stopLight,getWidth()/2,getHeight()/2);
		stopLight.setColor(Color.RED);
		
		GStopLight stopLight2= new GStopLight();
		add(stopLight2,getWidth()/2+100,getHeight()/2);
		stopLight2.setColor(Color.RED);
		while(true) {
			runLight(stopLight);
			runLight(stopLight2);
		}
	}
	/**runLight(GStopLight stopLight) mehtod
	 * ****************************************
	 * @param stopLight
	 */
	private void runLight(GStopLight stopLight) {
			stopLight.setState(Color.RED);
			pause(300);
			stopLight.setState(Color.YELLOW);
			pause(300);
			stopLight.setState(Color.GREEN);
			pause(300);
	}
}
