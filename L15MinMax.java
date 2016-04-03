package ua.com.glybovets.java1_1.lecture8;

import acm.program.ConsoleProgram;
/*
�������� ��������, �� ����� � ��������� ��� ����� (�� ������ ����� �� ���), 
���� ���������� �� ����� ����� 0 (�� ���� ���� � ���� ����� ������� �� ����� �� ����� ���� �����). 
�� ��������� ����� ���� �������� �� ������� �������� � �������� �����.
*/
public class L15MinMax extends ConsoleProgram{
	private static final int EXITNUMBER=0;
	
	public void run() {
		
		println ("�������� ����� � ��������� ��� ����� (�� ������ ����� �� ���), " +
			"���� ���������� �� ����� ����� 0. " +
			"�� ��������� ����� ���� �������� ������ �������� � �������� �����.");

		int max;
		int min;
	
		int n=readInt("������ ����� ��� "+EXITNUMBER+" ��� ������: ");
		if (n==EXITNUMBER)
			println ("������� ����� �� ���� �������");
		else {
			max=n;
			min=n;
			while (n!=EXITNUMBER) {	
				if (n>=max)
					max=n;
				if (n<=min)
					min=n;		
				n=readInt("������ ����� ��� "+EXITNUMBER+" ��� ������: ");
			}
			println ("����������� � �������� �����: "+max);
			println ("̳������� � �������� �����: "+min);
		}
	}
}
