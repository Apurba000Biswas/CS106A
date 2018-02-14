/**File:RandomGeneratorInConsoleProgram.java
 * ------------------------------------------
 * Apurba
 */
package Week03.Lect02;

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomGeneratorInConsoleProgram extends ConsoleProgram {
	/**run() method
	 * -------------------------------------
	 * program starts here
	 */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program prints two random number and flip a coin");
		int sentiniel = readInt("How many time?: ");
		while(sentiniel != 0) {
			randomInteger();
			coinFlip();
			sentiniel--;
		}
		println("Thanks!see you later");
	}
	/**randomInteger() mehtod
	 * ----------------------------
	 */
	private void randomInteger() {
		int num1 = rgen.nextInt(1, 10);
		int num2 = rgen.nextInt(10,20);
		println("Num 1 = " + num1);
		println("Num 2 = " + num2);
		println();
	}
	/**coinFlip() method
	 * ----------------------------
	 */
	private void coinFlip() {
		println(rgen.nextBoolean() ? "Head":"Tell");
		println();
	}
}
