/**File: BouncingBall.java
 * -------------------------------
 * this program creates a simple animation.
 * a bounching ball travel the window 
 */
package Week03.Lect03;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class BouncingBall extends GraphicsProgram {
	
	private double X = 0.0;
	private double Y = 0.0;
	/**run() mehtod
	 * *********************************************
	 * program starts here
	 */
	public void run() {	
	TopDown_LeftRight(X,Y);
	TopDown_RightLeft(X,Y);
	if(X >=0 && Y< getHeight()) {
		TopDown_LeftRight(X,Y);
		}
	}
	/**drawBall(x,y) mehtod
	 * ********************************************
	 */
	private void drawBall(double x, double y) {
		GOval ball = new GOval(x,y,20,20);
		ball.setFilled(false);
		ball.setColor(Color.blue);
		add(ball);
		pause(10);
	}
	private void TopDown_LeftRight(double x,double y) {
		while(x < getWidth()-10) {
			x++;
			y++;
			drawBall(x,y);
		}
		X = x;
		Y = y;
	}
	private void TopDown_RightLeft(double x,double y) {
		while(x>0 && y< getHeight()) {
			x--;
			y++;
			drawBall(x,y);
		}
		X = x;
		Y = y;
	}
}
