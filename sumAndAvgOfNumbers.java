import java.util.Scanner;

public class sumAndAvgOfNumber {

	public static void main(String[] args) 
  {
		

	int i=0,sum=0,num;
	float  average;
	
	
	System.out.println("enter total number for avg.");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	int a[]= new int[num];
	System.out.println("Enter all the numbesr:");
	for(i=0;i<num;i++)
	{
		a[i]=s.nextInt();
		sum=sum+a[i];
		
	}
	System.out.println("Sum:"+sum);
    average = (float)sum / num;
    System.out.println("Average:"+average);

	
	
	
	}

}
