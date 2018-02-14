package Week02.Lect02;

import acm.program.*;

public class CarbonDateing extends ConsoleProgram {
	//declaring instance variable
	int Half_life = 5730;
	double C14_in_Living_Organism = 13.6;
	
	/**run method
	 * ----------------------------
	 * program start here
	 */
	public void run() {
		UsedTheoream();
		double c = readDouble("What is the amount of c14 reaminig in your sample? : ");
		calculation(c);
	}
	/**UsedTheoream method
	 * ----------------------------
	 * this method prints the used mechanism
	 * for solving problem
	 */
	public void UsedTheoream() {
		println("Radioactive molecule = c14");
		println("Half life = " + Half_life + " years.");
		println("C14 in living organism = " + C14_in_Living_Organism + " dpm.");
		println("-------------------------------------------");
	}
	/**calculation method
	 * -----------------------------
	 * this method calculate the age of the sample
	 * then print on the screen
	 */
	public void calculation(double c) {
		double age = Math.log(c/C14_in_Living_Organism);
		println("Your sample is " + age/Math.log(0.5) * Half_life +" years old." );
	}
}
