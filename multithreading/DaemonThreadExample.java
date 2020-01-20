package multithreading;

public class DaemonThreadExample extends Thread
{
		 public void run()
		 {  
		  if(Thread.currentThread().isDaemon())
		  {
			//checking for daemon thread  
		     System.out.println("daemon thread work");  
		  }  
		  else
		  {  
		    System.out.println("user thread work");  
		  }  
		 }  
		 public static void main(String[] args)
		 {  
		  DaemonThreadExample t1=new DaemonThreadExample();//creating thread  
		  DaemonThreadExample t2=new DaemonThreadExample();  
		  DaemonThreadExample t3=new DaemonThreadExample();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		  t1.start();//starting threads  
		  t2.start();
		  t3.setDaemon(true);
		  t3.start();  
		 }  
}  

