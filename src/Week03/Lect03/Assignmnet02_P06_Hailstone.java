/**File: Assignmnet02_P06_Hailstone.java
 * ---------------------------------------
 * this program finds the hailstone sequence
 * and keeps track to how many process it
 * needed to reach 1
 */
package Week03.Lect03;

import acm.program.*;

public class Assignmnet02_P06_Hailstone extends ConsoleProgram{
	
	/**run() mehtod
	 * *************************************
	 * program starts here
	 */
	public void run() {
		println("This program finds Hailstone squence until it reach 1");
		int num = readInt("Enter number: ");
		int totalProcess = Hailstone(num);
		println("The process took "+ totalProcess+" to reach 1");
	}
	/**Hailstone() method
	 * *************************************
	 * @param num
	 */
	private int Hailstone(int num) {
		int count = 0;
		while(num > 1) {
			if(isEven(num)) {
				println(num+" is even so i take half: "+num/2);
				num = num/2;
			}else {
				println(num+" is odd, so i make 3n+1: " +((3*num)+1));
				num = 3*num+1;
			}
			count++;
		}
		return count;
	}
	/**isEven method()
	 * *************************************
	 * @param n
	 * @return
	 */
	private boolean isEven(int n) {
		return n%2 == 0;
	}
}
