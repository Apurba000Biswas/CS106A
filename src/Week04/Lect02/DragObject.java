/**File: DragObject.java
 * ----------------------------------
 */
package Week04.Lect02;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class DragObject extends GraphicsProgram{
	
	private GPoint last;
	private GObject gobj;
	
	/**init() method
	 * ********************************
	 * program starts here
	 */
	public void init() {
		GRect rect = new GRect(100,100, 150,100);
		rect.setFilled(true);
		rect.setColor(Color.GRAY);
		add(rect);
		GOval oval = new GOval(50, 60, 100, 70);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		addMouseListeners();
		addKeyListeners() ;
	}
	/**mousePressed(MouseEvent e) mehtod
	 * ************************************
	 */
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	/**mouseDragged(MouseEvent e)
	 * *************************************
	 */
	public void mouseDragged(MouseEvent e) {
		if(gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	/**mouseClicked(MouseEvent e) method
	 * *************************************
	 */
	public void mouseClicked(MouseEvent e) {
		if(gobj != null) {
			gobj.sendToFront();
		}
	}
	/**KeyPressed(KeyEvent e) mehtod
	 * *************************************
	 * @param e
	 */
	public void keyPressed(KeyEvent e) {
		   if (gobj != null) {
		      switch (e.getKeyCode()) {
		         case KeyEvent.VK_UP:   
		        	 gobj.move(0, -1);
		        	 break;
		         case KeyEvent.VK_DOWN:  
		        	 gobj.move(0, +1);
		        	 break;
		         case KeyEvent.VK_LEFT:  
		        	 gobj.move(-1, 0);
		        	 break;
		         case KeyEvent.VK_RIGHT: 
		        	 gobj.move(+1, 0);
		        	 break;
		      }
		   }
		}
}
