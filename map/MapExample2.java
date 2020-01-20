package map;

import java.util.HashMap;
import java.util.*;

public class MapExample2 
{
	public static void main(String args[])
	{
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue(" four"));
	}

}
