/**File: GStarClass.java
 * ------------------------------
 * this program creates a Start
 */
package Week04.Lect01;

import acm.graphics.*;
import acm.program.*;

public class GStar extends GPolygon{
	/**constructor**************
	 * 
	 */
	public GStar(double width) {
		double dx = width/2;
		double dy = dx * GMath.tanDegrees(18);
		double edge = width/2 - dy * GMath.tanDegrees(36);
		addVertex(-dx,dy);
		int angle = 0;
		for(int i=0; i<5; i++) {
			addPolarEdge(edge, angle);
			addPolarEdge(edge, angle+72);
			angle -= 72;
		}
	}
}
