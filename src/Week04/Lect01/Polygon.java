/**File: AddDiamonds.java
 * ------------------------------
 * this program drwas a ploygon (Diamond)
 */
package Week04.Lect01;

import acm.graphics.*;
import acm.program.*;

public class Polygon extends GraphicsProgram{
	/**run method
	 * ******************************
	 * program starts here
	 */
	public void run() {
		GPolygon hex = createHexagon( 50.0);
		add(hex,50,60);
		GPolygon diamond = createDiamond(40,50);
		add(diamond,50,60);
	}
	private GPolygon createHexagon(double side) {
		GPolygon hex = new GPolygon();
		hex.addVertex(-side, 0);
		int angle = 60;
		for (int i = 0; i < 6; i++) {
			hex.addPolarEdge(side, angle);
			angle -= 60;
		}
	return hex;
	}
	private GPolygon createDiamond(double width, double height) {
		   GPolygon diamond = new GPolygon();
		   diamond.addVertex(-width / 2, 0);
		   diamond.addVertex(0, -height / 2);
		   diamond.addVertex(width / 2, 0);
		   diamond.addVertex(0, height / 2);
		   return diamond;
		}

}
