package ProblemStatement;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		 {
		        Scanner sc=new Scanner(System.in);
		        String bookname;
		        double price;
//		      
		        Book obj[] = new Book[2];
				for(int i=0 ;i<2; i++)
				{
					Book book = new Book();
					System.out.println("Enter the Book Title:");
					 bookname=sc.next();
					System.out.println("Enter the price:");
					  price=sc.nextDouble();
					  book.setBookTitle(bookname);
					  book.setBookPrice(price);
					  obj[i] = book;
				}
					 
					
					   //obj.setBookName(bookname);
	     		        //obj.setBookPrice(price);
					
				 System.out.println("Book Details");
				 for(int i=0 ;i<2; i++)
				 {
			        System.out.println("Book Name :"+obj[i].getBookTitle());
			        System.out.println("Book Price :"+obj[i].getBookPrice());
				}
	      }
		    }
	}



	


