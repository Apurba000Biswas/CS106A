/**File : ChekerBoardProblem.java
 * -----------------------------------------
 */

package Week02.Lect03;

import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

public class ChekerBoardProblem extends GraphicsProgram {
	/**run method
	 * ----------------------
	 * program starts here
	 */
	private static final int Rows = 8;
	private static final int Col = 8;
	public void run() {
		
		double sqSize = (double)getHeight()/Rows;
		for(int i=0; i<Rows; i++) {
			for(int j=0; j<Col; j++) {
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect(x,y,sqSize,sqSize);
				sq.setFilled((i+j)%2 !=  0);//if i+j == an odd number then add the square
				add(sq);
			}
		}
	}
}
