package set;
import java.util.*;
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
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 1;
	}
}

public class SetCaseStudy 
{
	public static void main(String args[])
	{
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		TreeSet<Employee>obj=new TreeSet<Employee>();
		Employee[] emp=new Employee[n];//array of objects
		for(int i=0;i<n;i++)
		{
			name =s.next();
			age=s.nextInt();
			emp[i]=new Employee();
			emp[i].setage(age);
			emp[i].setname(name);
			obj.add(emp[i]);
		}
		for(Employee e:obj)
			System.out.println(e.getname()+" "+e.getage());
		s.close();
		}
	}