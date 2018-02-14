package Week02.Lect03;

import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

public class AnimatedSquareMy extends GraphicsProgram {
	private static final int Row = 8;
	private static final int Col = 8;
	private static final int PauseTime = 300;
	
	public void run() {
		double sqSize = (double)getHeight()/Row;
		GRect square = new GRect(0,0,sqSize,sqSize);
		square.setFilled(true);
		square.setColor(Color.RED);
		add(square);
		double dx = (getWidth() - sqSize)/Col;
		double dy = (getHeight() - sqSize)/Col;
		for(int i=0; i<Col; i++) {
			square.move(dx, dy);
			pause(PauseTime);
		}
	}
}
