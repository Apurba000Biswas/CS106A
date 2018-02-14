package Week02.Lect01;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class HellowWorldGraphics extends GraphicsProgram {

	public void run() {
		GLabel label = new GLabel("Hellow World",50,100);
		label.setColor(Color.RED);
		label.setFont("SansSerif-36");
		add(label);
	}

}
