package ua.com.glybovets.java1_1.lecture8;
/*
 * Рахуемо і виводимо на экран кількість чисел Фібоначі до вказаного користувачем числа
 */


import acm.program.*;


public class H8FibonachiMax extends ConsoleProgram{

	
	public void run(){
		int n = readInt("Введіть число до якого вівети ряд чисел Фібоначі: ");
		int i=0;
		while (n>fibo(i)) {
			println(i + " - " + fibo(i));
			i++;
		}
	}
	
		private int fibo(int n) {
			if (n==0)
				return 0;
			if (n==1) 
				return 1;
			return fibo(n-1)+fibo(n-2);
		}
}
