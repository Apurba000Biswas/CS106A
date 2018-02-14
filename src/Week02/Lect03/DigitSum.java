/**File: DigitSum.java
 * ------------------------------
 */
package Week02.Lect03;


import acm.program.*;

public class DigitSum extends ConsoleProgram {
	
	/*run method
	 *--------------------------------
	 *this program starts here
	 */
	public void run() {
		println("This program adds the digit of a number");
		int number = readInt("Enter number : ");
		int total = 0;
		//int reminder = 0;
		while(number > 0) {
			//reminder = number % 10;
			total += number % 10;
			number = number/10;
			//total += reminder;
		}
		println("Sum of Digit is : " + total);
	}
}
