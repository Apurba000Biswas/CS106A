/*File: LeapYearEricRobert.java
 * ---------------------------------
 */
package Week02.Lect03;

import acm.program.*;


public class LeapYearEricRobert extends ConsoleProgram {
	//class veriable
	private static final int SENTINIEL = 0;
	/** run method
	 * --------------------------
	 * program start here
	 */
	public void run() {
		println("This program finds out whether a year is a leap year or not");
		println("ENTER A YEAR OR USE " + SENTINIEL +" TO EXIT");
		while(true) {
			int Year = readInt(" ? : ");
			if(Year == SENTINIEL) break;
			boolean isLeapYear = ((Year%4 == 0) && (Year%100 != 0)) || (Year%400 == 0);
			if(isLeapYear) {
				println("The year is Leap Year");
			}else {
				println("The Year is not Leap Year");
			}
		}
	}
}
