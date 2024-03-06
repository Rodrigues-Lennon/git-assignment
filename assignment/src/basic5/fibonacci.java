package basic5;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int n,a,b,c;
		
		System.out.println("Enter the nth value: ");
		n=scan.nextInt();
		
		a=0;
		b=1;
		System.out.println("Fibonacci Series:\n"+a+"\n"+b);
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
