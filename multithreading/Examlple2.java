package multithreading;

public class Examlple2 
{
	public static void main(String args[])
	{
		ThreadLocal<String>obj=new ThreadLocal<String>();
		ThreadLocal<Integer>obj1=new ThreadLocal<Integer>();
		ThreadLocal<Float>obj2=new ThreadLocal<Float>();
		obj.set("welcome");
		obj1.set(10);
		obj2.set(2.6f);
		System.out.println(obj.get());
		System.out.println(obj1.get());
		System.out.println(obj2.get());
	}
}
