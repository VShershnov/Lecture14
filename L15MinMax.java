package ua.com.glybovets.java1_1.lecture8;

import acm.program.ConsoleProgram;
/*
Написати програму, що зчитує з клавіатури цілі числа (по одному числу за раз), 
поки користувач не введе число 0 (ви маєте бути в змозі легко поміняти цю умову на якесь інше число). 
По закінченню вводу ваша програма має вивести найменше і найбільше число.
*/
public class L15MinMax extends ConsoleProgram{
	private static final int EXITNUMBER=0;
	
	public void run() {
		
		println ("програма зчитує з клавіатури цілі числа (по одному числу за раз), " +
			"поки користувач не введе число 0. " +
			"По закінченню вводу ваша програма виведе найменше і найбільше число.");

		int max;
		int min;
	
		int n=readInt("Введіть число або "+EXITNUMBER+" для виходу: ");
		if (n==EXITNUMBER)
			println ("Жодного числа не було введено");
		else {
			max=n;
			min=n;
			while (n!=EXITNUMBER) {	
				if (n>=max)
					max=n;
				if (n<=min)
					min=n;		
				n=readInt("Введіть число або "+EXITNUMBER+" для виходу: ");
			}
			println ("Максимальне з введених чисел: "+max);
			println ("Мінімальне з введених чисел: "+min);
		}
	}
}
