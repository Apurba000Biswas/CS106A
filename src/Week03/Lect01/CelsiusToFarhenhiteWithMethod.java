/**File:CelsiusToFarhenhiteWithMethod.java
 * ------------------------------------------
 * Apurba
 */

package Week03.Lect01;

import acm.program.*;

public class CelsiusToFarhenhiteWithMethod extends ConsoleProgram {
	/**run() method
	 * --------------------------------------
	 * program start here
	 */
	public void run() {
		println("This program convert temperature celsisus to farhenhite");
		while(true){
			double c = readInt("Enter temperature(celsius): ");
			double f = celsiusToFarhenhite(c);
			println("Farhenhite temperature is : " + f);
		}
	}
	/**celsiusToFarhenhite(c) method
	 * ---------------------------------------
	 */
	private double celsiusToFarhenhite(double c) {
		double f = 9.0/5.0 * c + 32;
		return f;
	}
}
