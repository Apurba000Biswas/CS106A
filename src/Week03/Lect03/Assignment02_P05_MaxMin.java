/**File: Assignment02_P05_MaxMin.java
 * -----------------------------------
 * this program shows max and min number of given inputs
 */
package Week03.Lect03;

import acm.program.*;

public class Assignment02_P05_MaxMin extends ConsoleProgram{
	private int max = -100000;
	private int min = 100000;
	/**run method
	 * **************************************
	 * program starts here
	 */
	public void run() {
		println("This program shows the largest and smallest number from given input");
		
		while(true) {
			int a = readInt("??: ");
			if(a == 0) {
				if(max == -100000) {
					println("No inputs are given");
				}else {
					println("Max = "+ max);
					println("Min = "+ min);
				}
				break;
			}
			MaxMin(a);
		}
		
	}
	/**MaxMin() method
	 * *************************************
	 * @param a
	 */
	private void MaxMin(int a) {
		if(max < a) {
			max = a;
		}
		if(min > a) {
			min = a;
		}
	}
}
