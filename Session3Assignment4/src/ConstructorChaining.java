
public class ConstructorChaining 
{
	public static void main(String args[])
	{
		Trial a = new Trial();	//default constructor call
		Trial b= new Trial(10);	//invokes parameterized constructor
		Trial c= new Trial("hello","acadgild");	//invokes parameterized constructor
	}
}

class Trial
{
	//default constructor
	public Trial()
	{
		System.out.println("You are in default constructor");
	}
	
	//parameterized constructor with one argument
	public Trial( int a)
	{
		System.out.println("You are in parameterized constructor");
		System.out.println("Value of the object parameter = " +a);
	}
	
	//parameterized constructor with two arguments
	public Trial( String a, String b)
	{
		System.out.println("You are in parameterized constructor");
		System.out.println("Values of the object parameter strings are = " +a+ " and " +b);
	}
	
}