package collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Marklist 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer>marklist=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			marklist.add(s.nextInt());
		}
		ArrayList<Integer>marklistnew=(ArrayList<Integer>)marklist.clone();
		Collections.sort(marklistnew);
		System.out.println(marklistnew);
	}

}
