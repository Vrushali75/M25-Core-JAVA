package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		//Tree set sort all the elements in ascending order
		s.add("Vrushali");
		s.add("Tejal");
		s.add("Vidya");
		s.add("Prayag");
		System.out.println("The elements in Tress Set are : "+s);

	}

}
