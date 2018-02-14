package Week02.Lect03;
import java.applet.Applet;
/**File : AddNIntegers.java
 * ----------------------------------------
 * Apurba
 * 
 */

import acm.program.*;


public class AddNInteger extends ConsoleProgram {
	//Class variable
	private static final int N = 100;
	/**run method
	 * -----------------------------------
	 */
	public void run() {
		
		println("This program adds " + N + " numbers.");
		int total = 0;
	      for (int i = 0; i < N; i++) {
	         int value = readInt(" ? ");
	         total += value;
	      }
	      println("The total is " + total + ".");

	}
	
}
