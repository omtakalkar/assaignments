import java.util.Scanner;

public class factOfNumbers 
{

	public static void main(String args[])
	{
		int i,fact=1;
		 System.out.println("Enter a number: \n");
	      Scanner in = new Scanner(System.in);
	    int  n = in.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	
	}
}}
