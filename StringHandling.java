package ProblemStatement;

public class StringHandling {

	public static void main(String[] args) {
		String str = "JAVA is Simple" ;
		String wordList[] = str.split(" ");
		
		
		System.out.println("Output in Uppercase :"+str.toUpperCase());
		System.out.println("Output in Lowercase :"+str.toLowerCase());
		System.out.print("Character at index is:");
		for(int i=0; i< wordList.length; i++)
		{
			System.out.print(wordList[i].charAt(0)+" ");
		}
		System.out.println();
		StringBuilder str1= new StringBuilder();
		System.out.print("Character at index is:");
		for(int i=wordList.length-1; 0<=i; i--)
		{
			str1.append(wordList[i]+" ");
		}
		System.out.println(str1);
		System.out.println(str1.reverse());
		System.out.println(str.replace(" ","").length());
		
	}
	
}



