/**NumberOfDaysInMonth_switch_case.java
 * ------------------------------------------
 * Use of switch case
 */
package Week02.Lect03;

import acm.program.*;

public class NumberOfDaysInMonth_switch_case extends ConsoleProgram{
	/**run method
	 * -------------------------------------------
	 * program start here
	 */
	public void run() {
		println("This program shows the number of days in a month ");
		int Month = readInt("Enter numeric number of month(EX - jan = 1) : ");
		
		switch(Month) {
		case 2:
			println("28 days(29 days in Leap Year)");
			break;
		case 4: case 6: case 9: case 12:
			println("30 days");
			break;
		case 1: case 3: case 5: case 7: case 8: case 11:
			println("31 days");
			break;
		default:
			println("Illegal month number");
			break;
		}
	}
}
