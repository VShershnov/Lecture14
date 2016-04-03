package ua.com.glybovets.java1_1.lecture8;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class H8RobotFace extends GraphicsProgram {
	
	private static final int WORLD_WIDTH = 500;
	private static final int WORLD_HEIGHT = 600;
	private static final int HEAD_WIDTH = 200; 
	private static final int HEAD_HEIGHT = 400;
	private static final int EYE_RADIUS = 20; 
	private static final int MOUTH_WIDTH = 120; 
	private static final int MOUTH_HEIGHT = 40; 
	
	public void run(){
		
		this.setSize(WORLD_WIDTH, WORLD_HEIGHT);
		
		/* HEAD */
		GRect head = new GRect((WORLD_WIDTH-HEAD_WIDTH)/2,(WORLD_HEIGHT-HEAD_HEIGHT)/2,HEAD_WIDTH,HEAD_HEIGHT);
		head.setFilled(true);
		head.setColor(Color.GRAY);
		add(head);
		
		/* Eyes */
		GOval eyeL = filledCircle((WORLD_WIDTH-MOUTH_WIDTH)/2,((WORLD_HEIGHT-HEAD_HEIGHT)/2+HEAD_HEIGHT/6*2),EYE_RADIUS,Color.YELLOW);
		GOval eyeR = filledCircle((WORLD_WIDTH-MOUTH_WIDTH)/2+MOUTH_WIDTH,((WORLD_HEIGHT-HEAD_HEIGHT)/2+HEAD_HEIGHT/6*2),EYE_RADIUS,Color.YELLOW);
		add(eyeL);
		add(eyeR);
		
		
		
		/* Mouth */
		GRect mouth = new GRect((WORLD_WIDTH-MOUTH_WIDTH)/2,((WORLD_HEIGHT-HEAD_HEIGHT)/2+HEAD_HEIGHT/6*5), MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}

	private GOval filledCircle(int x, int y, double r, Color color){
		GOval circle = new GOval (x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
