package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

//Запрограмувати обчислення cos(x) при x [-p /4; p/4] з точністю ep.

public class L18CosX extends ConsoleProgram{
	
	public void run() {
	
		println("Програма, що розраховує cos(x) при x [-p /4; p/4] з точністю ep");
		double ep=readDouble("Введіть точність ep: ");
		double x=readDouble("Введіть число x [-p /4; p/4]: ");
		
		println("cos(" +x+")="+cosx(x,ep));
		
		double sum=0;
		double s=1;
		int n=1;
		while (sum-s<=ep){
			sum=s;
			s=s*(1)*x*x/(2*n);
			n=n+1;
		}
		}

	private double cosx(double x, double ep) {
		double s=1;
		int n=1;
		
		if (x==0)
			return 1;
		return Math.pow(-1, n)*Math.pow(x,2*n)/2*factr(n);
			
		}

	private double factr(int n) {
		if (n<=1)
			return 1;
		return n*factr(n-1);
	}
	
	
		
		
		

}
