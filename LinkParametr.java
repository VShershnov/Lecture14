package ua.com.glybovets.java1_1.lecture8;
import acm.program.*;

public class LinkParametr extends ConsoleProgram{

	private void addFive(int x){
		x+=5;
	}
	
	public void run(){
		int x = 3;
		addFive(x);
		println("x = " +x);
	}
	
}
