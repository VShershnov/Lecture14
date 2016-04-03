package ua.com.glybovets.java1_1.lecture8;
import acm.program.ConsoleProgram;
import java.lang.Math;

//Написати програму, що запитує у користувача два числа і обраховує корень квадратний з суми їх квадратів.
public class L14Piphagor extends ConsoleProgram{
	
	public void run() {
	
		println("Програма, що запитує у користувача два числа і обраховує корень квадратний з суми їх квадратів");
		double a=readDouble("Введіть число a: ");
		double b=readDouble("Введіть число b: ");
		double c=Math.sqrt(a*a+b*b);
		println("Корень квадратний з суми квадратів a та b : "+c);
	}
}
