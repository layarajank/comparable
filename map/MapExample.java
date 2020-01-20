package map;
import java.util.*;

public class MapExample 
{
	public static void main(String args[])
	{    Scanner s=new Scanner(System.in);
        Map<Integer,String> map=new TreeMap<Integer,String>();
        map.put(1,"laya");
        map.put(5, "abc");
        map.put(4,"rfhh");
        map.put(2,"ghh");
        for(Map.Entry m:map.entrySet())
        	System.out.println(m.getValue()+" "+m.getKey());
	}

}
