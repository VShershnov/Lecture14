package ua.com.glybovets.java1_1.lecture8;
import acm.program.*;

public class RecurentNumbers extends ConsoleProgram{

	public void run(){
		/*
		//тестуЇмо фатор≥ал
		int n = readInt();
		println(nFact(n));
		*/
		
		//тестуЇмо косинус
		//float x =readFloat("¬вед≥ть х");
		//float e =readFloat("¬вед≥ть e");
		float x=(float) 0.5;
		float e = (float)0.000000001;
		myCos(x,e);
		
	}
	
	private int nFact(int n){
		if ((n==0)||(n==1))
			return 1;
		else{
			int res = 1;
			for (int i=2; i<=n;i++)
				res*=i;
			return res;
		}
	}
	
	private void myCos(float x, float e){
		double s0 = 1;
		double s1 = (-1)*Math.pow(x, 2)/2;
		double sum1 = s0;
		double sum = s0+s1;
		int i = 2;
		int k = 1;
		while (Math.abs(sum-sum1)>e){
			sum1= sum;
			s0=s1;
			s1 = s0*(-1)*Math.pow(x, 2)/((i+1)*(i+2));
			i=i+2;
			sum = sum1+s1;
			k++;
		}
		println(sum);
		println(Math.cos(x));
		println(k); 
			
	}
}
