package Week02.Lect01;
/**File:AddTwoDouble.java
 *---------------------------------------
 */
import acm.graphics.*;
import acm.program.*;


public class AddTwoDouble extends ConsoleProgram {
	/**run method---------------------------
	 * 
	 * the program stats here
	 */
	public void run() {
		println("this program adds two double");
		double num1 = readDouble("Enter first number : ");
		double num2 = readDouble("Enter second number : ");
		double result = num1 + num2;
		println("Result is : " + result +" ");
	}
}
