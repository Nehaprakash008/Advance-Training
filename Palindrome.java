package ProblemStatement;

public class Palindrome {

	public static void main(String[] args) {
		int length=args.length;
	
		String string = "";
		for(int i=0;i<length;i++)
		{
		 string += args[i];
		 if(i < length-1)
		 {
			 
		 string += " ";
		 }
		}
	
		
		
			System.out.println("The length of the string: " + string.length());
			System.out.println("The string into uppercase: " + string.toUpperCase());
			if (isPalindrome(string)) {
				System.out.println(string + " is a palindrome");
			} else {
				System.out.println(string + " is not a palindrome");
			}
		//} else {
			//System.out.println("Invalid input");
//		}
	}


	static boolean isPalindrome(String word) {
		int index = 0;
		int length = word.length() - 1;
		while (length > index) {
			if (word.charAt(index) != word.charAt(length)) {
				return false;
			}
			index++;
			length--;
		}
		return true;
	}

	}


