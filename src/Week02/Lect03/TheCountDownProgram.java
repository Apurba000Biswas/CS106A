/**File: TheCountDownProgram.java
 * ------------------------------------
 */

package Week02.Lect03;

import acm.program.*;

public class TheCountDownProgram extends ConsoleProgram{
	/**run method
	 * -------------------------------
	 * program starts here
	 */
	public void run() {
		println("This program counts a given number to 0");
		int n = readInt("Enter number : ");
		for(int i=n; i>=0; i--) {
			println(i);
		}
		println("Liftoff");
	}
	
}
