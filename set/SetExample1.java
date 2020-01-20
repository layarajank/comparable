package set;
import java.util.*;

public class SetExample1 
{ 
	public  static void main(String args[])
	{

	Scanner s=new Scanner(System.in);
	Set<Integer>obj1=new HashSet<Integer>();
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		obj1.add(s.nextInt());
	}
	System.out.println("set 1: "+obj1);
	Set<Integer>obj2=new HashSet<Integer>();
	int m=s.nextInt();
	for(int i=0;i<m;i++)
	{
		obj2.add(s.nextInt());
	}
	
	System.out.println("set2 : "+obj2);
	
	Set<Integer>union=new HashSet<Integer>(obj1);
	union.addAll(obj2);
	System.out.println("Union : "+union);
	Set<Integer>intersection=new HashSet<Integer>(obj1);
	intersection.retainAll(obj2);
	System.out.println("intersection : "+intersection);
	Set<Integer>sd=new HashSet<Integer>(obj1);
	sd.removeAll(obj2);
	System.out.println("symmetric diiference : "+sd);
	}
}
