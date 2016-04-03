package ua.com.glybovets.java1_1.lecture8;
/*
 * ������� � �������� �� ����� ������� ����� Գ������ ������� ������������
 */


import acm.program.*;


public class P8FibonachiRozrjad extends ConsoleProgram{
	
	public void run(){
		int n = readInt("������ ������� ����� Գ������, ��� �� ������ ����������: ");
		for (int i = 0; i < n; i++) {
			println(i + " - " + fibo(i));
		}
		
		int m = readInt("������ ���� ����� m: ");
		println("ʳ������ ������� ����� m: " + rozrjad(m));	

		
	}

	private int rozrjad(int m) {
		int i=1;
		while (m>10) {
			m/=10;
			i++;
		}
		return i;
	}

	private int fibo(int n) {
		if (n==0)
			return 0;
		if (n==1) 
			return 1;
		return fibo(n-1)+fibo(n-2);
	}

}
