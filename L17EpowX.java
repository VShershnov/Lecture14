package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

/*�������������� ���������� ex ��� x [0;1) �� ������� ep ,
����� �� ������� ����� ���������� ����� sn����, 
�� | sn-sn-1 |<ep .
*/
public class L17EpowX extends ConsoleProgram{
	
	public void run() {
	
		println("��������, �� ��������� e � ������ x [0;1)" +
				" �� ������� ep");
		double ep=readDouble("������ ������� ep: ");
		double x=readDouble("������ ����� x [0;1): ");
		
		println("e � ������ " +x+" ="+cosx(x,ep));
		
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
