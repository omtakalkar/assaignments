import java.util.Scanner;

public class primenumber
{

	public static void main (String[] args)
	   {		
	      
	      int i =0;
	      int num =0;
	      String  primeNumbers = "";
	      System.out.println("Enter n:");
	      Scanner scanner = new Scanner(System.in);
	      int n = scanner.nextInt();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
	        	 if(i%num==0)
		    {
		    	counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers are ");
	      System.out.println(primeNumbers);
	   }
	
}
