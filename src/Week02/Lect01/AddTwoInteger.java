package Week02.Lect01;
/**file AddTwoInteger.java
 * -----------------------------------
 * this program adds two integer number 
 * and those are taken from user
 */

import acm.graphics.*;
import acm.program.*;
/**
 * 
 *  Apurba
 *
 */

public class AddTwoInteger extends ConsoleProgram {
	public void run() {
		println("This program adds two integer");
		int num1 = readInt("Enter number 1 : ");
		int num2 = readInt("Enter number 2 : ");
		int result = num1 + num2;
		println("Result is :" + result + ".");
	}
}
