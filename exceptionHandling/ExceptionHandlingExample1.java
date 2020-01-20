package exceptionHandling;

public class ExceptionHandlingExample1
{
	static void check() throws ArithmeticException
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("FACE kollam");
	}
	public static void main(String args[])
	{
		try
		{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught"+ e);
		}
	}
}
