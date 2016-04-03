package ua.com.glybovets.java1_1.lecture8;
import acm.program.*;

public class GoodLinkParametr extends ConsoleProgram{

	private int addFive(int x){
		x+=5;
		return x;
	}
	
	public void run(){
		int x = 3;
		x = addFive(x);
		println("x = " +x);
	}
	
}
