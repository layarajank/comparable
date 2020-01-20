package consoleClass;
import java.io.Console;
public class ConsoleClassExample
{
	public static void main(String args[])
	{
		String str;
		Console con=System.console();
		if(con==null)//checking if there is no console available
		{
			System.out.print("No console available");
			return;
		} 
	    str=con.readLine("enter your name");//read the name as string
		System.out.print(str);
		System.out.println("Enter the password");//reads the password as character array
		char[] ch=con.readPassword();
		String pass=String.copyValueOf(ch);//converting character array to string
		System.out.println("password is: "+pass);
	}
}	