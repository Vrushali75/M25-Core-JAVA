package org.tnsindia.mapdemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		//TreeMap does not contain null key but it contains many null value
		//SortedMap<String,String>obj=new TreeMap<>();
		NavigableMap<String,String>obj=new TreeMap<>();
		obj.put("Vrushali", "Student");
		obj.put("Prayag", "HotelManager");
		obj.put("Kalpesh", "Engineer");
		obj.put("Priti",null);
		System.out.println(obj);
		for(SortedMap.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+"-  "+m.getValue());
		}
		System.out.println("First entry is: "+obj.firstEntry());
		System.out.println("Last entry is: "+obj.lastEntry());
		System.out.println("Last entry key is: "+obj.lastKey());
		
	}

}
