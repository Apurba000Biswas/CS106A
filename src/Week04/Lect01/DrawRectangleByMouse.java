/**File: DrawRectangleByMouse.java
 * -------------------------------
 */
package Week04.Lect01;

import acm.graphics.*;
import acm.program.*;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawRectangleByMouse extends GraphicsProgram{
	//instance variable
	private GRect currentRect;
	private double startX;
	private double startY;
	
	/**run method
	 * ******************************
	 * program starts here
	 */
	public void run() {
		addMouseListeners();
	}
	/**mousePressed() mehtod
	 * ******************************
	 */
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		currentRect = new GRect(startX,startY,0,0);
		currentRect.setFilled(true);
		currentRect.setColor(Color.RED);
		add(currentRect);
	}
	public void mouseDragged(MouseEvent e) {
		double x = Math.min(e.getX(), startX);
		double y = Math.min(e.getY(), startY);
		double width = Math.abs(e.getX() - startX);
		double height = Math.abs(e.getY() - startY);
		currentRect.setBounds(x, y, width, height);
	}
}
