package comparableExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Employee implements Comparable<Employee>
{
	String name;
	int age;
    public void setname(String name)
	{
		this.name=name;	
	}
    public void setage(int age)
   	{
   		this.age=age;	
   	}
   public String getname()
    {
    	return name;
    }
    public int getage()
   	{
   		return age;
   	}
	@Override
	public int compareTo(Employee e) 
	{
		if(age>e.getage())
    		return 1;
    	else if(age<e.getage())
    		return -1;
    	else
    		return 0;	
	}
}
public class ComparableInterfaceExample 
{
	public static void main(String args[])
	{
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of entries :");
	int n=s.nextInt();
	HashMap<Integer,Employee>obj=new HashMap<Integer,Employee>();
	Employee[] emp=new Employee[n];//array of objects
	System.out.println("Enter the deatils: ");
	for(int i=0;i<n;i++)
	{
		name =s.next();
		age=s.nextInt();
		emp[i]=new Employee();
		emp[i].setage(age);
		emp[i].setname(name);
		obj.put(i,emp[i]);
	}
	//printing HashMap
	System.out.println("HashMap : ");
	for(Map.Entry<Integer,Employee> m:obj.entrySet())
	{	Employee b=m.getValue();
    	System.out.println(m.getKey()+" "+b.getname()+" "+b.getage());
	}
	
	}
}



