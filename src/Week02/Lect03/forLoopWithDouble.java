/**File: forLoopWithDouble.java
 * ------------------------------
 *  Apurba
 */
package Week02.Lect03;

import acm.program.*;

public class forLoopWithDouble extends ConsoleProgram {
	/**run method
	 * -------------------------------
	 * program starts here
	 */
	
	public void run() {
		println("This program count double from a given number to its previous number");
		double n = readDouble("Enter a double number : ");
		for(double i=n; i>=n-1.0; i=i-0.1) {
			println(i);
		}
	}
}
