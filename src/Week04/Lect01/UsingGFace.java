/**File: UsingGFace.java
 * ----------------------------
 */
package Week04.Lect01;

import acm.program.*;
import acm.graphics.*;

public class UsingGFace extends GraphicsProgram{
	public void run() {
		GFaceUsingGCompound face = new GFaceUsingGCompound(100,140);
		add(face,getWidth()/2-50,getHeight()/2-70);
	}
}
