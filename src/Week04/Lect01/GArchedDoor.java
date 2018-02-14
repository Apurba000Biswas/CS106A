/**File : GArchedDoor.java
 * ---------------------------------
 * this program creates an Arch Door
 */
package Week04.Lect01;

import acm.graphics.*;

public class GArchedDoor extends GPolygon{
	/**constructor
	 * 
	 */
	public GArchedDoor(double width, double height) {
		double lenghtOfVerticleEdge = height - width/2;
		addVertex(-width/2, 0);
		addEdge(width, 0);
		addEdge(0, -lenghtOfVerticleEdge);
		addArc(width, width, 0, 180);
		addEdge(0,lenghtOfVerticleEdge);
	}
}
