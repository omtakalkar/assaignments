import java.util.Scanner;

public class BaseClass {
	
	public static void main(String args[])
	{
		 
		int c;
		String studata[];
		int op,cnt,i,j;
		int d,f;
		
		do
		{
			System.out.println("enter your choice");
			System.out.println("1) buid table \n 2) show table \n 3) Insert a new entry 4) delete old entry 5) search \n");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			switch(input)
			{
			case 1: System.out.println("total no of entries");
					Scanner scn = new Scanner(System.in);
					int ch = scn.nextInt();
					for( i=0 ;i<ch;i++)
					{
						System.out.println("enter name of student");
						name[i]= scan.nextLine();
						System.out.println("enter roll no");
						roll[i]=scan.nextInt();
						System.out.println("enter sub name");
						subname[i]=scan.nextLine();
						System.out.println("enter sub code");
						subcode[i]=scan.nextInt();
						System.out.println("enter internal marks");
						marks[i]=scan.nextInt();
						cnt++;
					}
					break;
			case 2: 	System.out.println("entries are");	
						for(i=0;i<cnt;i++)
						{
							
							System.out.println(name[i],"\t"+ roll[i] "\t" subname[i] "\t" subcode[i] "\t" marks[i]);
						}
						break;
			case 3: 			
						System.out.println("enter record no to delete");
						d=scan.nextInt();
						f=d-1;
						for(i=f;i<cnt;i++)
						{
							studata[i]=studata[i+1];
							
						}cnt--;
						break;
			case 4: 	System.out.println("enter record no to edit");
						d=scan.nextInt();
						f=d-1;
						switch(ch)
						{
						case 1: System.out.println("enter name of student");
						name[j]= scan.nextLine(); break;
						case 2:System.out.println("enter roll no");
						roll[j]=scan.nextInt();break;
						case 3:System.out.println("enter sub name");
						subname[j]=scan.nextLine();break
						case 4:System.out.println("enter sub code");
						subcode[j]=scan.nextInt();break;
						case 5:System.out.println("enter internal marks");
						marks[j]=scan.nextInt();break;
						}break;
				
						System.out.println("continue");
						c=scan.nextInt();
						
					
			
			
			
		}
		}while(c=='y');
		
		
			
	}
	
	
	
}
	 class  Student
	{
	   public Student()
	   {
		int cnt;
		String name[];
		int roll[];
		String subject[];
	   }
	}
	  class Emp extends Student 
	{
		public Emp()
		  {
			int subcode[];
			float  marks[];
		  }

	}
	

