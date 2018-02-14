package Week02.Lect02;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class ProgramminIsAwSomeGraphics extends GraphicsProgram {
	/**run method
	 * ---------------------------
	 * program start here
	 */
	public void run() {
		rectangleWithOval();
		programingIsAwsomeText();
	}
	/**rectangleWithOval() method
	 * ---------------------------
	 * this method creates rectangle with oval
	 * on the screen
	 */
	private void rectangleWithOval() {
		GRect rect = new GRect(100,100);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
		add(rect,70,70);
		
		GOval oval = new GOval(100,100);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval,75,75);
	}
	/**programingIsAwsomeText method
	 * ------------------------------
	 * this method creates text "Programming is Awsome !"
	 * on the screen
	 */
	private void programingIsAwsomeText() {
		GLabel text = new GLabel("Programing Is Awsome !",0,100);
		text.setFont("SansSerif-40");
		add(text);
	}
}
