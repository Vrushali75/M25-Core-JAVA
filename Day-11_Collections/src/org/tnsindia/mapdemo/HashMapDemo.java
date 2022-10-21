package org.tnsindia.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		
		//1.Key cannot be duplicated but value can be duplicated
		//2.It follows the sorted order
		//3. Contains many null values but just one null key
		obj.put(1,"Germany");
		obj.put(4,"Austria");
		obj.put(3,"Israel");
		obj.put(1,"Germany");
		obj.put(5,"London");
		obj.put(null, null);
		obj.put(6, null);
		System.out.println(obj);
		obj.remove(4);
		System.out.println(obj);	
		//to extract the pairs  from map 
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
