package ua.com.glybovets.java1_1.lecture8;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class L11KirpWall extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30; //довжина цеглинки
	private static final int BRICK_HEIGHT = 12; // висота цеглинки
	private static final int BRICKS_IN_BASE = 14; //кількість цеглин у фундамента

	public void run(){
		this.setSize(500, 600);
		int y=600-BRICK_HEIGHT;
		
		for (int j = 0; j < BRICKS_IN_BASE; j++) {
			bricksLine(y-BRICK_HEIGHT*j, BRICKS_IN_BASE-j);
		}
	}
	
		/* y - координати верхньої межі центру лінії цеглинок
		bricksInBase - кількість цеглинок в лінії
		*/
		private void bricksLine(int y, int bricksInBase) {
		 for (int i = 0; i <bricksInBase; i++) {
			 GRect rect1 = new GRect(((500-BRICK_WIDTH*bricksInBase)/2+i*BRICK_WIDTH),y,BRICK_WIDTH,BRICK_HEIGHT);
			 add(rect1);
		}
	}

}
