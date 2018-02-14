/**File: DrawLines.java
 * -------------------------------
 */
package Week04.Lect02;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawLines extends GraphicsProgram{
	//consatnt
	private GLine line;
	
	/** init() method
	 * ****************************
	 * program starts here
	 */
	public void init() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(),e.getY(),e.getX(),e.getX());
		
	}
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
		add(line);
	}
}
