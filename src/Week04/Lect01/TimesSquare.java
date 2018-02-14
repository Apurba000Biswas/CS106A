/**File: TimesSquare.java
 * --------------------------
 * this program creates an animated label
 */
package Week04.Lect01;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class TimesSquare extends GraphicsProgram{
	private static final String HEADLINE = "Hellow. I am Apurba. WellCome to my World";
	private static final double DELTA_X = 2.0;
	private static final int PAUSE_TIME = 20;
	
	private GObject gobj;
	private double lastX;
	private double lastY;
	/**run
	 * 
	 * *****************************
	 * program starts here
	 */
	public void run() {
		addMouseListeners();
		while(true) {
			GLabel line = new GLabel(HEADLINE);
			line.setFont("Times-72");
			line.setColor(Color.RED);
			add(line,getWidth(),(getHeight() + line.getAscent())/2);
			while(line.getX()+line.getWidth() > 0) {
				line.move(-DELTA_X, 0);
				pause(PAUSE_TIME);
			}
		}/**
		GLabel end = new GLabel("See you.:)");
		end.setFont("Times-20");
		add(end,getWidth()/2-end.getWidth()/2, getHeight()/2);
		**/
	}
	/**mousePressed(MouseEvent e) mehtod
	 * *********************************
	 * Called on mouse press to record the coordinates of the click
	 */
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		gobj = getElementAt(lastX, lastY);
	}
	/**mouseDragged(MouseEvent e) mehtod
	 * **************************************
	 * Called on mouse drag to reposition the object
	 */
	public void mouseDragged(MouseEvent e) {
		if(gobj != null) {
			gobj.move(e.getX()-lastX, e.getY()-lastY);
			lastX = e.getX();
			lastY = e.getY();
		}
	}
	/**mouseClicked(MouseEvent e) method
	 * **************************************
	 * Called on mouse click to move this object to the front
	 */
	public void mouseClicked(MouseEvent e) {
		if(gobj != null) {
			gobj.sendToFront();
		}
	}
}
