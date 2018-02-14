package Week02.Lect02;
/**file: InchesToCentimeters.java
 * ------------------------------
 * this program converts inches to centimetres
 */

import acm.graphics.*;
import acm.program.*;


public class InchesToCentimeters extends ConsoleProgram {
	/**run method
	 * -----------------------------
	 * program starts here
	 */
	public void run() {
		println("This program converts Inches to centimetrs");
		double Incs = readDouble("Enter Inches: ");
		double cm = Incs * CENTIMETER_PER_INCH;
		println(Incs +" Inces = " + cm + "Cm." );
	}
	//class variable--------------------
	private static final double CENTIMETER_PER_INCH = 2.54;

}
