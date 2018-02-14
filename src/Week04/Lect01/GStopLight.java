/**File: GStopLight.java
 * ------------------------------
 */
package Week04.Lect01;

import java.awt.*;
import acm.graphics.*;
import acm.program.*;

public class GStopLight extends GCompound{
	//defining constant
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;
	//defining instance variable
	private Color state;
	private GOval redLamp;
	private GOval yellowLamp;
	private GOval greenLamp;
	//constructor
	public GStopLight() {
		GRect frame = new GRect(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setColor(Color.GRAY);
		add(frame,-FRAME_WIDTH/2, -FRAME_HEIGHT/2);
		double dy = FRAME_HEIGHT/4 + LAMP_RADIUS/2;
		redLamp = createFilledCircle(0, -dy, LAMP_RADIUS);
		add(redLamp);
		yellowLamp = createFilledCircle(0, 0, LAMP_RADIUS);
		add(yellowLamp);
		greenLamp = createFilledCircle(0,dy,LAMP_RADIUS);
		add(greenLamp);
		setState(Color.GREEN);
	}
	/**setState(Color c) method
	 * *****************************************
	 * @param c
	 */
	public void setState(Color c) {
		if(c.equals(Color.RED)) {
			redLamp.setFillColor(Color.RED);
			yellowLamp.setFillColor(Color.GRAY);
			greenLamp.setFillColor(Color.GRAY);
		} else if(c.equals(Color.YELLOW)) {
			redLamp.setFillColor(Color.GRAY);
			yellowLamp.setFillColor(Color.YELLOW);
			greenLamp.setFillColor(Color.GRAY);
		} else if(c.equals(Color.GREEN)) {
			redLamp.setFillColor(Color.GRAY);
			yellowLamp.setFillColor(Color.GRAY);
			greenLamp.setFillColor(Color.GREEN);
		}
		state = c;
	}
	/**getState() method
	 * ******************************************
	 * @return
	 */
	public Color getState() {
		return state;
	}
	private GOval createFilledCircle(double x,double y, double r) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		return circle;
	}
}
