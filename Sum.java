package ProblemStatement;

public class Sum {

	public static void main(String[] args) {
		int array[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0,0 };
		int sum = 0;
		

		for (int i=0 ;i<15;i++)
		    sum += array[i];
		System.out.println("The sum is " + sum);
		
	array[16]=sum;
	int length = array.length;
	int n= sum/length;
	System.out.println(+n);
	array[17] =n;
	System.out.println("print array of array[16]:"+array[16]);
	System.out.println(array[17]);
	  for(int i=0;i<array.length;i++)

          System.out.println(array[i]+ " ");

   int min=array[0];

   for(int i=0;i<array.length;i++)

   {

      if(min>array[i])

          min=array[i];


    }

    

    System.out.println("Minimum is : "+min);

	}
	
	
}



