/**File: FactorialLimitToLimit.java
 * --------------------------------------
 * Apurba
 */
package Week03.Lect01;

import acm.graphics.*;
import acm.program.*;

public class FactorialLimitToLimit extends ConsoleProgram {
		/**run method()
		 * -------------------------------
		 * this program starts hrer	
		 * */
	public void run() {
		
		println("This program finds factorial number ");
		int LowerLimit = readInt("Enter lower limit : ");
		int UperLimit = readInt("Enter Uper limit : ");
		for(int i=LowerLimit; i<=UperLimit; i++) {
			println(i + "! = " + factorial(i));
		}
		println("Lift off");
	}
	/**factorial(i) method
	 * ------------------------------------
	 */
	private int factorial(int num) {
		int result = 1;
		for(int i=1; i<=num; i++) {
			result *= i;
		}
		return result;
	}
}
