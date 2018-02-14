/**File: Section_P01_Fabonacci.java
 * --------------------------------------
 * this program fiands the fabonacci sequence from 0 to 10,000
 */
package Week03.Lect03;

import acm.program.*;

public class Section_P01_Fabonacci extends ConsoleProgram  {
	private int UperBound = 30;//instane varibale
	/**run() method
	 * *************************************************
	 * program starts here
	 */
	public void run() {
		int n = 0;
		int m = 1;
		println("fibonacci(" + n + ")" + " = " + n );
		println("fibonacci(" + m + ")" + " = " + m );
		for(int i=2; i<UperBound; i++) {
			int sum = n+m;
			println("fibonacci(" + i + ")" + " = " + n +"+"+ m + " = " + sum );
			n = m;
			m = sum;
		}
	}
}
