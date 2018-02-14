/**File: NumberOfDaysInMonth_if_else.java
 * ------------------------------------------
 * using if else
 */
package Week02.Lect03;

import acm.program.*;

public class NumberOfDaysInMonth_if_else extends ConsoleProgram{
	
	/**run method
	 * ---------------------------------------
	 */
	public void run() {
		println("This program shows the number of days in a month");
		int Month = readInt("Enter numeric month(Ex-jan = 1 ) : ");
		if(Month == 2) {
			println("28 days(29 in Leap Year)");
		}else if(Month == 4 || Month == 6 || Month == 9|| Month == 12) {
			println("30 days");
		}else if(Month == 1 || Month == 3|| Month == 5 || Month == 7 || Month == 8 || Month == 11) {
			println("31 days");
		} else {
			println("Illegal month number");
		}
	}
}
