/**File: Section_P03_RobotFace.java
 * --------------------------------------
 * this program draws a robot face
 */
package Week03.Lect03;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Section_P03_RobotFace extends GraphicsProgram{
	
	//defining Constant
	private static final double HEAD_WIDTH = 100;
	private static final double HEAD_HEIGHT = 150;
	private static final double EYE_RADIUS = 20;
	private static final double MOUTH_WIDTH = 70;
	private static final double MOUTH_HEIGHT = 30;
	/**run method
	 * *****************************************
	 * program starts here
	 */
	public void run() {
		DrawHead();
		DrawEyes();
		DrawMouth();
	}
	/**DrawHead() method
	 * *****************************************
	 * this method draws the head
	 */
	private void DrawHead() {
		GRect head = new GRect(20,10,HEAD_WIDTH,HEAD_HEIGHT);
		head.setFilled(true);
		head.setColor(Color.GRAY);
		add(head);
	}
	/**DrawEyes() method
	 * ****************************************
	 * this method draws eyes of the robot
	 */
	private void DrawEyes() {
		GOval eye1 = new GOval(HEAD_WIDTH/3,30,EYE_RADIUS,EYE_RADIUS);
		eye1.setFilled(true);
		eye1.setColor(Color.YELLOW);
		add(eye1);
		GOval eye2 = new GOval(HEAD_WIDTH/3+50,30,EYE_RADIUS,EYE_RADIUS);
		eye2.setFilled(true);
		eye2.setColor(Color.YELLOW);
		add(eye2);
	}
	/**DrawMouth() method
	 * ***************************************
	 * this mehtod draws the mouth of the robot
	 */
	private void DrawMouth() {
		GRect mouth = new GRect(HEAD_WIDTH/2-MOUTH_WIDTH/4,HEAD_HEIGHT-40,MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}
}
