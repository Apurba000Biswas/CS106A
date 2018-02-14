/**File: GStarUsing.java
 * ----------------------------------
 */
package Week04.Lect01;

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class GStarUsing extends GraphicsProgram{
	
	private RandomGenerator rgen = new RandomGenerator();
	private GObject gobj;
	private double lastX;
	private double lastY;
	
	
	/**run method
	 * *********************************
	 */
	public void run() {
		addMouseListeners();
		for(int i=0; i<30; i++) {
			GStar star = new GStar(rgen.nextDouble(20,100));
			star.setFilled(true);
			star.setColor(rgen.nextColor());
			double x = rgen.nextDouble(50,getWidth()-50);
			double y = rgen.nextDouble(50,getHeight()-50);
			add(star,x,y);
			pause(500);
		}
		
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
