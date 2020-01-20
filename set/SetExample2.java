package set;
import java.util.*;

public class SetExample2 
{
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		Set<Integer>obj2=new HashSet<Integer>();
		if(obj2.isEmpty())
		{
			System.out.println("set is empty");
		}
		System.out.println("enter size of set:");
		int m=s.nextInt();
		System.out.println("enter elements of set:");
		for(int i=0;i<m;i++)
		{
			obj2.add(s.nextInt());
		}
		if(obj2.isEmpty())
		{
			System.out.println("set is empty");
		}
		else 
		System.out.println("set is not empty");
		System.out.println("size of set : "+obj2.size());
		System.out.println("enter element to check:");
		int x=s.nextInt();
		if(obj2.contains(x))
		{
			System.out.println("element exists");
		}
		else
		{
			System.out.println("element does not exist");
		}
		}
		
	}
	


