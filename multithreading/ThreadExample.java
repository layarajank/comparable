package multithreading;
public class ThreadExample extends Thread
{
	public void run()
	{
		System.out.println("running thread name is: "+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		ThreadLocal <Number>obj_local=new ThreadLocal<Number>();
		ThreadLocal<String>obj=new ThreadLocal<String>();
		obj_local.set(100);
		System.out.println("value ="+obj_local.get());
		obj_local.set(90);
		System.out.println("value="+obj_local.get());
		obj.set("java");
		System.out.println("value="+obj.get());
		obj.remove();
		System.out.println("value="+obj.get());
		obj_local.remove();
		System.out.println("value="+obj_local.get());
		ThreadExample m1=new ThreadExample();
		ThreadExample m2=new ThreadExample();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
