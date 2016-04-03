package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

//Запрограмувати обчислення cos(x) при x [-p /4; p/4] з точністю ep .
public class L18CosX extends ConsoleProgram{
	
	public void run() {
	
		println("Програма, що розраховує cos(x) при x [-p /4; p/4] з точністю ep");
		double ep=readDouble("Введіть точність ep: ");
		double x=readDouble("Введіть число x [-p /4; p/4]: ");
		
		println("cos(" +x+")="+cosx(x,ep));
		
		double sum=0;
		doubles=1;
		int n=1;
		while (s>=e){
			sum=s1;
			s=s*(1)*x*x/(2*n);
			n=n+1;
		}
		}

	private double cosx(double x, double ep) {
		
		if (x==0)
			return 1;
		return Math.pow(-1, n)*
			
		}
		return 0;
	}
		
		
		
	}
}
