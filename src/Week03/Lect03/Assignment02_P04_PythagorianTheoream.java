/**File: Assignment02_P04_PythagorianTheoream.java
 * -----------------------------------------------
 * this program calculate c = squarate of(a^2 + b^2)
 * The Pythagorean theoream
 */
package Week03.Lect03;

import acm.program.*;

public class Assignment02_P04_PythagorianTheoream extends ConsoleProgram{
	/**run() mentod
	 * **********************************************
	 * prigram starts here
	 */
	public void run() {
		println("This program calculate c =squareroot of (a^2 + b^2)[Pythagorean theoream]");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double m = a*a + b*b;
		double c = Math.sqrt(m);
		println("c: " + c);
	}
}
