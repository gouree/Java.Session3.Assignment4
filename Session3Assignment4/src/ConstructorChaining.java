
public class ConstructorChaining 
{
	public static void main(String args[])
	{
		Trial a = new Trial();
		Trial b= new Trial(10);
		Trial c= new Trial("hello","acadgild");
	}
}

class Trial
{
	public Trial()
	{
		System.out.println("You are in default constructor");
	}
	
	public Trial( int a)
	{
		System.out.println("You are in parameterized constructor");
		System.out.println("Value of the object parameter = " +a);
	}
	
	public Trial( String a, String b)
	{
		System.out.println("You are in parameterized constructor");
		System.out.println("Values of the object parameter strings are = " +a+ " and " +b);
	}
	
}