interface myinterface
{
	public void myname();
	public void favcolor();
}
public  class Interface implements myinterface 
{
	public void myname()
	{
		System.out.println("my name is this ");
	}

	public void favcolor()
	{
		System.out.println("my fav color is white ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		myinterface m = new Interface();
		
		m.myname();
		m.favcolor();
		
		
		

	}

}
