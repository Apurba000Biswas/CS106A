/*File : AddIntegerList.java
 * -------------------------------
 * 
 */
package Week02.Lect03;

import acm.program.*;


public class AddIntegerList extends ConsoleProgram {
	//class variable
	public static final int SENTINIEL = 0;
	/**run method
	 * ----------------------------------
	 * program starts here
	 */
	public void run() {
		println("This program adds intger list");
		println("Enter a number per line to add");
		println("Use "+ SENTINIEL +" to signal end of list");
		int total = 0;
		while(true) {
			int value = readInt(" ? : ");
			if(value == SENTINIEL) break;
			total += value;
		}
		println("Total is : " + total);
	}
}
