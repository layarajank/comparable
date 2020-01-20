package comparator;
import java.util.*;
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
public class ComparatorExample 
{
	public static void main(String args[])
	{
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of entries :");
	int n=s.nextInt();
	List<Employee>obj=new LinkedList<Employee>();
	Employee[] emp=new Employee[n];//array of objects
	System.out.println("Enter the deatils: ");
	for(int i=0;i<n;i++)
	{
		name =s.next();
		age=s.nextInt();
		emp[i]=new Employee();
		emp[i].setage(age);
		emp[i].setname(name);
		obj.add(emp[i]);
	}
	
	System.out.println("Nmae wise comparison : ");
    Collections.sort(obj,new NameComparator());
	for(Employee e:obj)
	{
    	System.out.println(e.getname()+" "+e.getage());
	}
    System.out.println("Age wise comparison : ");
    Collections.sort(obj,new AgeComparator());
	for(Employee e:obj)
	{
    	System.out.println(e.getname()+" "+e.getage());
	}
	
	}
}
class AgeComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getage()==e2.getage())
		  return 0;
		else if(e1.getage()>e2.getage())
			return 1;
		else
			return -1;	
	}
}
class  NameComparator implements Comparator<Employee>
{

	public int compare(Employee o1, Employee o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.getname().compareTo(e2.getname());
		
	}
	
}

	


