/**File: Assignment02_P02_Target.java
 * -----------------------------------
 * this program draws a terget bar
 */
package Week03.Lect03;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Assignment02_P02_Target extends GraphicsProgram{
	/**run method
	 * **********************************
	 * program starts here
	 */
	public void run() {
		drawOuterCircle();
		drawMiddleCircle();
		drawInnerCircle();
	}
	/**drawOuterCircle() method
	 * *********************************
	 */
	private void drawOuterCircle() {
		double width=100;
		double height=100;
		double x=getWidth()/2-width/2;
		double y=getHeight()/2-height/2;
		Color c = Color.RED;
		drawCircle(x,y,width,height,c);
	}
	private void drawMiddleCircle() {
		double width = 65;
		double height = 65;
		double x=getWidth()/2-width/2;
		double y=getHeight()/2-height/2;
		Color c = Color.WHITE;
		drawCircle(x,y,width,height,c);
	}
	private void drawInnerCircle() {
		double width = 30;
		double height = 30;
		double x=getWidth()/2-width/2;
		double y=getHeight()/2-height/2;
		Color c = Color.RED;
		drawCircle(x,y,width,height,c);
	}
	/**drawricle() mehtod
	 * *********************************
	 */
	private void drawCircle(double x, double y,double w, double h,Color c) {
		GOval circle = new GOval (x,y,w,h);
		circle.setFilled(true);
		circle.setColor(c);
		add(circle);
	}
}
