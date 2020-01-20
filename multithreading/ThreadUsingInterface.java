package multithreading;

public class ThreadUsingInterface implements Runnable
{
	public static void main(String[] args)
	{
		Runnable obj=new ThreadUsingInterface();
		Thread t1=new Thread(obj);
		t1.start();	
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread");
	}

}
