saved as MAx.java
import assaignments.*;
import assaignments.Package;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=7;
		Package obj = new Package();
		
		int mx=obj.getMax(a, b);
		
		
		
	}

}


saved as Package.java

package assaignments;

public class Package {

	public int getMax(int x, int y)
	{
	      if ( x > y )
	      {
	         return x;
	      }
	      else 
	      {
	         return y;
	      }
	   }

	
}
