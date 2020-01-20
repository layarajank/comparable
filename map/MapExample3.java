package map;

import java.util.*;

class Employee 
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
	
}


public class MapExample3 
{
	public static void main(String args[])
	{
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Map<Integer,Employee>obj=new HashMap<Integer,Employee>();
	Employee[] emp=new Employee[n];//array of objects
	for(int i=0;i<n;i++)
	{
		name =s.next();
		age=s.nextInt();
		emp[i]=new Employee();
		emp[i].setage(age);
		emp[i].setname(name);
		obj.put(i,emp[i]);
	}
	for(Map.Entry<Integer,Employee> m:obj.entrySet())
	{	Employee b=m.getValue();
    	System.out.println(m.getKey()+" "+b.getname()+" "+b.getage());
	}
    	s.close();
	}

}
