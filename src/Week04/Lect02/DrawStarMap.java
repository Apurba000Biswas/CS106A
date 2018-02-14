/**File: DrawStarMap.java
 * -----------------------------
 * 
 */
package Week04.Lect02;

import acm.program.*;
import java.awt.event.*;
import Week04.Lect01.GStar;
import acm.util.RandomGenerator;
import javax.swing.*;

public class DrawStarMap extends GraphicsProgram {
	
	private static final double STAR_SIZE = 20;
	private RandomGenerator rgen = new RandomGenerator();
	
	/**init() mehtod
	 * **********************************
	 * program starts here
	 */
	public void init() {
		addMouseListeners();
		add(new JButton("Clear"),SOUTH);
		addActionListeners();
	}
	/**mouseClicked(MouseEvent e) mehtod
	 * ************************************
	 */
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(true);
		star.setColor(rgen.nextColor());
		add(star, e.getX(),e.getY());
	}
	/** actionPerformed(ActionEvent e) method
	 * **************************************
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Clear")) {
			removeAll();
		}
	}
}
