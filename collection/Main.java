package collection;
import java.util.ArrayList;
class Contacts
{
    private int phno;
    private String name; 
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
     int getphno()
    {
      return phno;   
    }
    void setphno(int phno)
    {
        this.phno=phno;
    }
}

public class Main 
{
	public static void main(String[] args) 
	{ 
	    String name;
	    int phno;
	    ArrayList<Contacts> contacts=new ArrayList<Contacts>();
	    Contacts obj1=new Contacts();
	    Contacts obj2=new Contacts();
	    obj1.setName("tim");
	    obj1.setphno(181888424);
	    obj2.setName("john");
	    obj2.setphno(181888425);
	    contacts.add(obj1);
	    contacts.add(obj2);
	   
	   System.out.println(contacts.get(0).getName()+" "+contacts.get(0).getphno());
	    System.out.println(contacts.get(1).getName()+" "+contacts.get(1).getphno());
	    
	}

}
