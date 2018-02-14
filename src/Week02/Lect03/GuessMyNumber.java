/**GuessMyNumber.java
 * -----------------------------
 *     Apurba
 */

package Week02.Lect03;
import acm.program.*;

public class GuessMyNumber extends ConsoleProgram {
	
	/**run mehtod*******************************
	 * ----------
	 * program start here
	 * 
	 */
	
	public void run() {
		int secretNumber = getHeight();
		println("I am thinking of number between 0 to 99");
		int guess = readInt("Enter a guess : ");
		while(guess != secretNumber) {
			if(guess < secretNumber) {
				println("Your guess is too low");
			}else {
				println("Your guess is too high");
			}
			println();
			guess = readInt("Guess Again : ");
		}
		println("Congrats! The number was : " + secretNumber);
	}
}
