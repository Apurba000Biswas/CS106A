/**A_variable_love_story_happyEndingPart.java
 * ----------------------------------------------
 *  Apurba
 */
package Week03.Lect01;

import acm.program.*;

public class A_variable_love_story_happyEndingPart extends ConsoleProgram{
	/*run() mehtod
	 * -------------------------------------------
	 * program start here
	 */
	public void run() {
		int x = 5;
		if(lookingForLove()) {
			int y = 5;
			println("This is Happy Ending and x+y =  " + (x+y));
		}
	}
	/**lookingForLove() method
	 * --------------------------------------------
	 */
	private boolean lookingForLove() {
		return true;
	}
}
