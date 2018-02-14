/**Fiel:DrawTrain.java
 * ---------------------------------
 * Apurba
 */
package Week03.Lect01;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class DrawTrain extends GraphicsProgram{
	/**run method()
	 * -----------------------------
	 * program starts here
	 */
	private double xNew = 0.0;
	
	public void run() {
		int numOfCaboose =readInt("How many caboose you want?: ");
		double x = 20;
		double y = 30;
		double rx = 100;
		double ry = 60;
		drawEngine(x,y,rx,ry);
		drawConnector(x,y,rx,ry);
		drawBoxCar(xNew,y,rx,ry);
		while(numOfCaboose != 0) {
			drawConnector(xNew,y,rx,ry);
			drawCaboose(xNew,y,rx,ry);
			numOfCaboose--;
		}
		println(xNew);
	}
	/**drawEngine(x1,y) method
	 * -------------------------------
	 * this method draw an engine
	 */
	private void drawEngine(double x, double y, double rx, double ry) {
		drawBody(x+20,y-10,10,10,Color.BLACK);
		drawBody(x+rx-30,y-10,30,10,Color.BLACK);
		drawRim(x,y,rx,ry);
		drawBody(x,y,rx,ry,Color.BLACK);
	}
	/**drawBoxCar(xNew,y,rx,ry) method
	 * ---------------------------------
	 * this method draws the boxcar
	 */
	private void drawBoxCar(double x,double y,double rx,double ry) {
		drawBody(x,y,rx,ry,Color.green);
		drawRim(x,y,rx,ry);
		drawBody(x+40,y+10,rx/5,ry-10,Color.GRAY);
	}
	/**drawCaboose(xNew,y,rx,ry) mehtod
	 * ----------------------------------
	 * this program draws a caboose
	 */
	private void drawCaboose(double x,double y,double rx,double ry) {
		drawBody(x,y,rx,ry,Color.RED);
		drawRim(x,y,rx,ry);
		drawBody(x+rx/3,y-10,40,20,Color.RED);
	}
	/**drawBody(x,y) method
	 * -------------------------------
	 * this method draw a body
	 */
	private void drawBody(double x,double y,double rx,double ry, Color color) {
		GRect body = new GRect(x,y,rx,ry);
		body.setFilled(true);
		body.setColor(color);
		add(body);
	}
	/**drawRim(x,y) method
	 * --------------------------------
	 * this method draws two rims
	 */
	private void drawRim(double x,double y,double rx,double ry) {
		GOval rim1 = new GOval(x+10,y+ry,20,20);
		rim1.setFilled(true);
		rim1.setColor(Color.GRAY);
		add(rim1);
		GOval rim2 = new GOval(x+rx-30,y+ry,20,20);
		rim2.setFilled(true);
		rim2.setColor(Color.GRAY);
		add(rim2);
	}
	/**drawConnector(x,y,rx,ry) method
	 * ---------------------------------
	 * this mehod draws the connector
	 */
	private void drawConnector(double x,double y,double rx,double ry) {
		GLine line = new GLine(x+rx,y+ry,x+rx+10,y+ry);
		add(line);
		xNew = x+rx+10;
	}
}
