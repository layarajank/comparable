package collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample 
{
	public static void main(String args[])
	{
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("competition");
		obj.add("be positive");
		obj.add("happy day");
		Iterator itr=obj.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
				
	}

}
