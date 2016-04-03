package ua.com.glybovets.java1_1.lecture8;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class L13ClassGraph extends GraphicsProgram{
	private static final int BLOCK_WIDTH = 150; //довжина блоку
	private static final int BLOCK_HEIGHT = 50; // висота блоку
	
	
	public void run(){
		
		this.setSize(700, 600);
		int x=700/2;
		int y=600/2-BLOCK_HEIGHT*3/2;
		
		diagramBlock(x,y, "Program");
		diagramBlock(x-3*BLOCK_WIDTH/2,y+2*BLOCK_HEIGHT, "GraphicsProgram");
		diagramBlock(x,y+2*BLOCK_HEIGHT, "ConsoleProgram");
		diagramBlock(x+3*BLOCK_WIDTH/2,y+2*BLOCK_HEIGHT, "DialogProgram");
		
		GLine line1 = new GLine(x,y+BLOCK_HEIGHT/2,x-3*BLOCK_WIDTH/2,y+2*BLOCK_HEIGHT-BLOCK_HEIGHT/2);
		add(line1);
		
		GLine line2 = new GLine(x,y+BLOCK_HEIGHT/2,x,y+2*BLOCK_HEIGHT-BLOCK_HEIGHT/2);
		add(line2);
		
		GLine line3 = new GLine(x,y+BLOCK_HEIGHT/2,x+3*BLOCK_WIDTH/2,y+2*BLOCK_HEIGHT-BLOCK_HEIGHT/2);
		add(line3);
		
		
	}


	/*  
	 * x,y - центр блоку
	 * str - текст блоку
	 */
	private void diagramBlock(int x, int y, String str) {
		GRect rect1 = new GRect(x-BLOCK_WIDTH/2,y-BLOCK_HEIGHT/2,BLOCK_WIDTH,BLOCK_HEIGHT);
		add(rect1);
		
		GLabel label = new GLabel(str, x-(str.length()*8)/2, y+16/2);
		label.setFont("sansserif-16");
		add(label);
		
	}

}
