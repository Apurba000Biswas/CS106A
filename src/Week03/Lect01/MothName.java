/**File: MothName.java
 * -----------------------------------
 * Apurba
 */
package Week03.Lect01;

import acm.program.*;

public class MothName extends ConsoleProgram {
	/**run method
	 * -------------------------------
	 * program start here
	 */
	public void run() {
		println("This program print month valaue correspond to its value");
		
		while(true) {
			int MonthNumber = readInt("Number: ");
			String MonthName = monthName(MonthNumber);
			println(MonthName);
		}
	}
	/**monthName(MothNumber) method
	 * -------------------------------
	 */
	private String monthName(int MonthNumber) {
		switch (MonthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Illegal Month Number";
		}
	}
}
