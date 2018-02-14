/**File: Section_P02_CenteredText.java
 * ------------------------------------------
 * this program draws a centered text
 */
package Week03.Lect03;

import acm.graphics.*;
import acm.program.*;

public class Section_P02_CenteredText extends GraphicsProgram  {
	/**run mathod
	 * ****************************************
	 * program starts here
	 */
	public void run() {
		GLabel text = new GLabel("CS106A");
		text.setFont("SansSerif-28");
		double x = getWidth()/2 - text.getWidth()/2;
		double y = getHeight()/2 - text.getAscent()/2;
		add(text,x,y);
	}
}
