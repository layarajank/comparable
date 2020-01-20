package collection;
import java.util.*;

public class Collectionexample 
{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
    LinkedList<String>obj=new LinkedList<String>();
    ArrayList<String>obj1=new ArrayList<String>();
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
	 String ele=s.next();
	 obj.add(ele);
     }
    int m=s.nextInt();
    for(int i=0;i<m;i++)
    {
	 String ele1=s.next();
	 obj1.add(ele1);
    }
     System.out.println("Actual linked list: "+obj);
     obj.addAll(obj1);
      System.out.println("After copy: "+obj);;
	}
}
