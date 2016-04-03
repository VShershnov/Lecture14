package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

/*Çàïðîãðàìóâàòè îá÷èñëåííÿ ex ïðè x [0;1) ³ç òî÷í³ñòþ ep ,
òîáòî çà ïîòð³áíå ÷èñëî ïðèéìàºòüñÿ ïåðøå snòàêå, 
ùî | sn-sn-1 |<ep .
*/
public class L17EpowX extends ConsoleProgram{
	
	public void run() {
	
		println("Ïðîãðàìà, ùî ðîçðàõîâóº e â ñòåïåí³ x [0;1)" +
				" ³ç òî÷í³ñòþ ep");
		double ep=readDouble("Ââåä³òü òî÷í³ñòü ep: ");
		double x=readDouble("Ââåä³òü ÷èñëî x [0;1): ");
		
		println("e â ñòåïåí³ " +x+" ="+ePowX(x,ep));
		
		double sum=0;
		doubles=1;
		int n=1;
		while (s>=e){
			sum=s1;
			s=s*(1)*x*x/(2*n);
			n=n+1;
		}
		}

	private double ePowX(double x, double ep) {
		
		if (x==0)
			return 1;
		return Math.pow(-1, n)*
			
		}
		return 0;
	}
		
		
		
	}
}
