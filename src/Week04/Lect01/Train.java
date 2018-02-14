/**File: Train.java
 * ---------------------------
 */
package Week04.Lect01;

import acm.graphics.*;

public class Train extends GCompound{
	
	public Train() {
		
	}
	public void append(TrainCar car) {
		double width = getWidth();
		double x = (width == 0)? 0: width-TrainCar.CONNECTOR;
		add(car,x,0);
	}
}
