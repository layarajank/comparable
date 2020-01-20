package multithreading;
import java.lang.*;
public class Example1 extends Thread
	{
	public void run()
	{
		try
		{
			System.out.println("Music player is running");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Whatsapp msg is recieved");
			
		}
	}
	public static void main(String args[])
	{
		Example1 t=new Example1();
		t.start();// this will call run() function
		t.interrupt();
	}
		
	}
    

