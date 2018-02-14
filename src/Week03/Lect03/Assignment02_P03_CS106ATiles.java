/**File: Assignment02_P03_CS106ATiles.java
 * ------------------------------------------
 * this program prints a tiles of cs106a in the middle of the window
 */
package Week03.Lect03;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Assignment02_P03_CS106ATiles extends GraphicsProgram{
	
	private static final double TILE_WIDTH = 60;
	private static final double TILE_HEIGHT = 40;
	private static final double TILE_SPACE = 20;
	
	private double textWidth = 1;
	private double textHeight = 1;
	/*run method()
	 * **************************************
	 * program starts here
	 */
	public void run() {
		virtualTile();
	}
	/**virtualTile method
	 * **************************************
	 */
	private void virtualTile() {
		double height = 100;
		double width = 160;
		double x = getWidth()/2 -width/2;
		double y = getHeight()/2 - height/2;
		Color c = Color.WHITE;
		Tile(x,y,width,height,c);
		Tile1(x,y);
		Tile2(x,y);
		Tile3(x,y);
		Tile4(x,y);
	}
	/**Tile method
	 * ****************************************
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param c
	 */
	private void Tile(double x,double y,double width,double height,Color c) {
		GRect Tile = new GRect(x,y, width,height);
		Tile.setFilled(false);
		Tile.setColor(c);
		add(Tile);
	}
	private void Text(double x,double y) {
		GLabel text = new GLabel("Apurba",x,y);
		textWidth = text.getWidth();
		textHeight = text.getAscent();
		add(text);
	}
	/**Tile1 method
	 * ****************************************
	 * @param x
	 * @param y
	 */
	private void Tile1(double x,double y) {
		Color c = Color.BLACK;
		Tile(x+10,y+10,TILE_WIDTH,TILE_HEIGHT,c);
		double textX = x+ TILE_WIDTH/2 - textWidth/2;
		double textY = y+ TILE_HEIGHT/2 + textHeight/2;
		Text(textX,textY);
	}
	private void Tile2(double x, double y) {
		Tile1(x+TILE_SPACE+TILE_WIDTH,y);
	}
	private void Tile3(double x, double y) {
		Tile1(x,y+TILE_SPACE+TILE_HEIGHT);
	}
	private void Tile4(double x, double y) {
		Tile1(x+TILE_SPACE+TILE_WIDTH,y+TILE_SPACE+TILE_HEIGHT);
	}
}
