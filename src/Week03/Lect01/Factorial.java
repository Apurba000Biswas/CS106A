/**Fiel: Factorial.java
 * ------------------------------------
 * Apurba
 */
package Week03.Lect01;

import acm.program.*;

public class Factorial extends ConsoleProgram{
	/**run method
	 * ------------------------------------
	 * program start here
	 */
	public void run() {
		println("This program finds out factorial of a number");
		while(true) {	
			int num = readInt("NUMBER: ");
			int result = factorial(num);
			println("Result is : " + result);
		}
		
	}
	/**factorial(num) method
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
