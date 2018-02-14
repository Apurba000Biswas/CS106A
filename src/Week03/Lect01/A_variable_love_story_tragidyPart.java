/**A_variable_love_story_tragidyPart.java
 * -------------------------------------------
 * Apurba
 * 
 */

package Week03.Lect01;

import acm.program.*;

public class A_variable_love_story_tragidyPart extends ConsoleProgram {
	/**run mehtod
	 * -----------------------------------------
	 * program start here
	 */
	public void run() {
		int x = 5;
		if(lookingForLove()) {
			int y = 5;
		}
		//println(y);//y is dead outside of the if satement(scop)
	}
	
	/**lookingForLove() method
	 * ------------------------------------------
	 * @return
	 */
	private boolean lookingForLove() {
		return true;
	}
}
