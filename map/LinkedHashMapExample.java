package map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LinkedHashMapExample 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String,Integer> obj=new LinkedHashMap<String,Integer>();
		System.out.println("Enter the number of inputs:");
		int n=Integer.parseInt(br.readLine());
		String name;
		int age;
		System.out.println("Enter details:");
		for(int i=0;i<n;i++)
		{
			name=br.readLine();
			age=Integer.parseInt(br.readLine());
			obj.put(name,age);
		}
		System.out.println(obj);
		System.out.println("enter the index to remove");
		String s=br.readLine();
		obj.remove(s);
		System.out.println(obj);
		System.out.println(obj.size());
		
	}

}
