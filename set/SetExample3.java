package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SetExample3 
{
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		Set<Integer>obj1=new HashSet<Integer>();
		System.out.println("enter size of set:");
		int m=s.nextInt();
		System.out.println("enter elements of set:");
		for(int i=0;i<m;i++)
		{
			obj1.add(s.nextInt());
		}
		System.out.println("enter the element to remove");
		int x=s.nextInt();
		obj1.remove(x);
		System.out.println("after removing "+x+" is : "+obj1); 
		Set <Integer>obj2=new HashSet<Integer>();
		for(int i : obj1)
		{
			for(int j=1;j<=i/2;j++)
			{
				if(j*j==i)
				{
					obj2.add(i);
				}
			}
		}
		obj1.removeAll(obj2);
		System.out.println("after removing perfect squares :"+obj1); 
		obj1.clear();
		System.out.println("after clear() : "+obj1);
		}
	}

