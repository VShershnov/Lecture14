package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

/*Запрограмувати обчислення ex при x [0;1) із точністю ep ,
тобто за потрібне число приймається перше snтаке, 
що | sn-sn-1 |<ep .
*/
public class L17EpowX extends ConsoleProgram{
	
	public void run() {
	
		println("Програма, що розраховує e в степені x [0;1)" +
				" із точністю ep");
		double ep=readDouble("Введіть точність ep: ");
		double x=readDouble("Введіть число x [0;1): ");
		
		println("e в степені " +x+" ="+cosx(x,ep));
		
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
