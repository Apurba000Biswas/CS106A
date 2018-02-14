/**File: DragObject.java
 * ------------------------
 */
package Week04.Lect01;

import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DragObject extends GraphicsProgram{
	//instance variable
	private GObject gobj;
	private double lastX;
	private double lastY;
	
	/**run() method
	 * *****************************
	 * program starts here
	 */
	public void run() {
		GRect rect = new GRect(100,100,150,100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(300,115,100,70);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		addMouseListeners();
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
