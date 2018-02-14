/**File: GCross.java
 * --------------------------
 * this class creates a Cross
 */
package Week04.Lect01;

import acm.graphics.*;

public class GCross extends GPolygon{
	public GCross(double size) {
		double edge = size / 3;
	    addVertex(-size / 2, -edge / 2);
	    addEdge(edge, 0);
	    addEdge(0, -edge);
	    addEdge(edge, 0);
	    addEdge(0, edge);
	    addEdge(edge, 0);
	    addEdge(0, edge);
	    addEdge(-edge, 0);
	    addEdge(0, edge);
	    addEdge(-edge, 0);
	    addEdge(0, -edge);
	    addEdge(-edge, 0);
	    addEdge(0, -edge);
	}
}
