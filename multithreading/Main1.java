package multithreading;
class MusicPlayer extends Thread
{
	public void run()
	{
		System.out.println("Music is playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing Ms word document");
	}
}
public class Main1 
{
	public static void main(String args[])
	{
		MusicPlayer thread1=new MusicPlayer();
		Runnable obj=new MsWord();
		Thread thread2=new Thread(obj);
		thread1.start();
		thread2.start();
	}
}
