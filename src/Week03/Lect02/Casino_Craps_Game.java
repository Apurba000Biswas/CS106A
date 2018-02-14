/**Casino_Craps_Game.java
 * -----------------------------------------
 * This program plays Casino game of craps
 */

package Week03.Lect02;

import acm.program.*;
import acm.util.RandomGenerator;

public class Casino_Craps_Game extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/**run mehtod
	 * ************************************
	 * Program Starts here
	 */
	public void run() {
		int choice = 0;
		while(choice == 0) {
			int total = rollTwoDice();
			if(decision(total)) {
				playAgain(total);
			}
			choice = readInt("you Want to play again? Enter 0 to play or Any number to exit: ");
		}
		println("Thank you for Playing.");
	}
	/**rollTwoDice() method
	 * ************************************
	 */
	private int rollTwoDice(){
		int dice1 = rgen.nextInt(1, 6);
		int dice2 = rgen.nextInt(1, 6);
		int total = dice1 + dice2;
		println("Rollig two dice: "+ dice1 + " + " + dice2 + " = " + total);
		return total;
	}
	/**decision() method
	 * ***********************************
	 */
	private boolean decision(int total) {
		if(total == 7 || total == 11) {
			println("Thats Natural.YOU WIN");
			return false;
		}else if(total == 2 || total == 3 || total == 12) {
			println("Thats Crap.YOU LOSE");
			return false;
		}else {
			return true;
		}
	}
	/**playAgain() mehtod
	 * **********************************
	 */
	private void playAgain(int total) {
		int point = total;
		println("Your Point is : " + point);
		while(true) {
			total = rollTwoDice();
			if(total == point) {
				println("You Made Your Point. YOU WIN");
				break;
			}else if(total == 7) {
				println("Thats a 7. YOU LOSE");
				break;
			}
		}
	}
}
