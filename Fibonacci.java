package ProblemStatement;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1,b=3,c,i=3;
		//System.out.println("Enter the Number :");
		//n = sc.nextInt();
		System.out.print(a+" "+b);
		while(i<=13)
		{
			c=a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			i++;
		}
	}

}
