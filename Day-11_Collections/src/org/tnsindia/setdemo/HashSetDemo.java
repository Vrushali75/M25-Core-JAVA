package org.tnsindia.setdemo;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Set is an interface, we can't create the object for the set
		//Set s=new Set<>();
		//@SuppressWarnings("rawtypes")
		//1.HashSet is unordered and it does not contain duplicate values
		//2. Set contains at most one null element
		Set<Object> s=new HashSet<>();
		s.add("Vrushali");
		s.add('s');
		s.add(34.7f);
		s.add(56);
		s.add("Vrushali");
		s.add(null);
		s.add(null);
		System.out.println("The elements in the set are: "+s);

	}

}
