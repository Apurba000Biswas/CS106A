/**File:EvenNumberWithPredicateMethod
 * ----------------------------------
 * Apurba
 */

package Week03.Lect01;

import acm.program.*;

public class EvenNumberWithPredicateMethod extends ConsoleProgram{
	/**run method
	 * -----------------------------
	 * program starts here
	 */
	public void run() {
		println("This program prints all even number from 0 to 100");
		
		for(int i=0; i<=100; i++) {
			if(isEven(i)) {
				println(i);
			}
		}
	}
	/**isEven() method
	 * -----------------------------
	 * return boolean reasult(called as predicate method)
	 */
	private boolean isEven(int number) {
		return(number %2 == 0);
	}
}
