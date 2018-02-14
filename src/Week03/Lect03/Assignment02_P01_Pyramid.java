/**File: Assignment02_P01_Pyramid.java
 * -------------------------------------
 * this progam draws a pyramid
 */
package Week03.Lect03;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Assignment02_P01_Pyramid extends GraphicsProgram{
	//defining constant
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 12;
	private static final double BRICK_IN_BASE = 14;
	/**run method
	 * *************************************
	 * program starts here
	 */
	public void run() {
		int n = (int)BRICK_IN_BASE;
		double y = getHeight()-BRICK_HEIGHT-2;
		double x = 10;
		while(n>0) {
			drawRow(n,x,y);
			x = x+7;
			y = y-14;
			n--;
		}
	}
	/**drawRow(n) method
	 * *************************************
	 * @param n
	 */
	private void drawRow(int n,double x, double y) {
		for(int i=1; i<n; i++) {
			DrawBrick(x,y);
			x = x+14;
		}
	}
	
	private void DrawBrick(double x,double y) {
		GRect Brick = new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT);
		Brick.setFilled(false);
		Brick.setColor(Color.BLACK);
		add(Brick);
	}
}
