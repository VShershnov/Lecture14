package ua.com.glybovets.java1_1.lecture8;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class L12Target extends GraphicsProgram{
	private static final int CIRCLENUM = 3; //кількість червоних кіл у мішені
	
	public void run(){
		this.setSize(500, 600);
		Color color;
		for (int i = CIRCLENUM; i >0; i--) {
			if (i%2==1){
				color=Color.red;
			} else {
				color=Color.white;
			}
			
			GOval o = filledCircle(250,300,30*i,color);
			add(o);
		}
	}
	
	private GOval filledCircle(int x, int y, double r, Color color){
		GOval circle = new GOval (x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
