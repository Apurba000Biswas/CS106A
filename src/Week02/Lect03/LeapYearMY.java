/**LeapYearMy.java
 * --------------------------------
 */

package Week02.Lect03;

import acm.program.*;

public class LeapYearMY extends ConsoleProgram {
	private static final int SENTINIEL = 0;
	/**run method
	 * --------------------------------
	 */
	public void run() {
		println("This program finds out whether a year is a leap year or not");
		println("Enter a year per line or Use " + SENTINIEL+ " to signal exit");
		while(true) {
			int Year = readInt(" ? : ");
			if(Year == SENTINIEL) break;
			if(((Year%4 == 0) && (Year%100 != 0)) || (Year%400 == 0)) {
				println("The Year is Leap Year.");
			} else {
				println("The Year is not Leap Year.");
			}
		}
	}
}
