package ProblemStatement;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		//private static final int TOTAL_NUMBER = 5;
		Scanner sc =new Scanner(System.in);
		for(int i=0 ;i< 5; i++)
		{
			int length;
			int breadth;
			System.out.println("Enter the length:");
			length = sc.nextInt();
			System.out.println("Enter the breadth:");
			breadth = sc.nextInt();
			
			
		Rectangle rectangle = new Rectangle(length,breadth);
		System.out.println("Area : "+rectangle.area());
		}
		
		}

	}


