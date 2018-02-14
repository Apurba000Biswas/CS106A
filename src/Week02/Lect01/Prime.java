/** File: Prime.java
 *  Apurba
 */

package Week02.Lect01;

import acm.program.*;

public class Prime extends ConsoleProgram {
	
	/**run() method
	 * ----------------------
	 * Program starts here
	 */
	public void run() {
		while(true) {
			int num = readInt("Enter Number: ");
			if(isPrime(num)) {
				println("Yes");
			}else {
				println("No");
			}
		}
	}
	/**isPrime method
	 * ----------------------------
	 * @param n
	 * @return
	 */
	private boolean isPrime(int n) {
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
