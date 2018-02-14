/** File : AvegareList.java
 * -------------------------------
 */

package Week02.Lect03;

import acm.program.*;

public class AverageList extends ConsoleProgram {
	//class variable
	private static final int SENTINIEL = 0;
	
	/**run method()
	 * -----------------------------
	 * program starts here
	 */
	public void run() {
		println("This program adds integer list and shows the average of them");
		println("Enter a number per line");
		println("Use " + SENTINIEL + " to signal end of list");
		int total = 0;
		int count = 0;
		while(true) {
			int value = readInt(" ? : ");
			if(value == SENTINIEL) break;
			total += value;
			count ++;
		}
		//println("Average is : " + (double)total/count);
		//or
		double Average = (double) total/count;
		println("Average is :" + Average);
	}
}
