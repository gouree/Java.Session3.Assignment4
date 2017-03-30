public class StaticExample
{
	private int val_of_object;
	/*
	 * 	static variable.
	 * Static variables can be accessed in main as StaticExample.no_of_obj or a.no_of_obj or b.no_of_obj
	 * 
	 * 	 */
	private static int no_of_obj=0;
	
	//parameterized constructor
	StaticExample(int a)
	{
		val_of_object=a;
		no_of_obj++;		//static variable is incremented whenever an object is created
	}
	
	
	/*
	 * static method which returns the total number of objects created during the program.
	 * static methods can access only static variables
	 */
	public static int numberObjects()
	{
		return(no_of_obj);
	}
	
	public static void main(String args[])
	{
		StaticExample a= new StaticExample(10);
		StaticExample b= new StaticExample(20);
		StaticExample c= new StaticExample(30);
		System.out.println("object a-->"+a.val_of_object);
		System.out.println("object b-->"+b.val_of_object);
		System.out.println("object c-->"+c.val_of_object);
		System.out.println("Number of objects created-->"+numberObjects());
	}
}

