package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

//�������� ��������, �� ������ � ����������� ��� ����� � �������� ������ ���������� � ���� �� ��������.
public class L14Piphagor extends ConsoleProgram{
	
	public void run() {
	
		println("��������, �� ������ � ����������� ��� ����� � �������� ������ ���������� � ���� �� ��������");
		double a=readDouble("������ ����� a: ");
		double b=readDouble("������ ����� b: ");
		double c=Math.sqrt(a*a+b*b);
		println("������ ���������� � ���� �������� a �� b : "+c);
	}
}
