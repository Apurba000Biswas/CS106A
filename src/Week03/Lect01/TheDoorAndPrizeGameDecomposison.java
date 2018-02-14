/**TheDoorAndPrizeGameDecomposison.java
 * --------------------------------------
 * Apurba
 */
package Week03.Lect01;

import acm.program.*;

public class TheDoorAndPrizeGameDecomposison extends ConsoleProgram {
	/**run() method
	 * -------------------------------------
	 * program start here
	 */
	public void run() {
		println("This is a game, first you have to enter throw a door then you have to get a prize");
		
		int door = 1;
		while(door != 0) {
			door = readInt("Door : ");
			int prize = 3;
			door = takeAValidDoor(door);
			if(door == 0) {
				break;
			}
			prize = getThePrize(prize,door);
			println("Your Prize is : " + prize);
			println("Use 0 to Exit");
		}
		
		println("Thanks for playing with me :) !! Good Bye");
	}
	/**takeAValidDoor(door) method
	 * ----------------------------------
	 * return a valid door to get a prize
	 */
	private int takeAValidDoor(int door) {
		while(door<1 || door>3) {
			if(door == 0) {
				break;
			}
			println("Invalid door!");
			door = readInt("Door : ");
			
		}
		return door;
	}
	/**getThePrize(prize) method
	 * -----------------------------------
	 * return a prize
	 */
	private int getThePrize(int prize,int door){
		if(door == 1) {
			println("Welcome to Door: " + door);
			prize = 2 + 9/10 * 100;
		}else if(door == 2) {
			println("Welcome to Door: " + door);
			boolean locked = prize%2 != 1;
			if( !locked ) {
				prize += 7;
			}
		}else {
			println("Welcome to Door: " + door);
			prize++ ;
		}
		return prize;
	}
}
