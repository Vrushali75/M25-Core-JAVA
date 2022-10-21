package org.tnsindia.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//Example on list interface using array list
import java.util.List;


public class ArrayListDemo {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Creating a first list using array list
		List<String> list=new ArrayList<>();
		list.add("Vrushali");
		list.add("Ravindra");
		list.add("SRUTI");
		list.add("Zayn");
		list.add("Arohi");
		//Enhanced for loop is used to extract the elements of a collection
		/*for(String itr:list)
		{
			System.out.println(itr);
		}
		*/
		
		List<String> list1=new LinkedList<String>();
		list1.add("Nia");
		list1.add("Radhika");
		list1.add("Vidya");
		//Using iterator you can extract the elements of the list
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("The elements of list 1 are: "+list);
		System.out.println("The elements of list 2 are: "+list1);
		//contains method is used to check weather list contains that element or not
		System.out.println(list.contains("Neha"));
		System.out.println(list.size());
		//remove() is used to remove specified element
		System.out.println(list.remove(1));
		System.out.println("The elements are: "+list);
		//adding the list 2 elements to list 1
		list.addAll(list1);
		System.out.println("The elements in list1 are: "+list);
		list.removeAll(list1);
		System.out.println("The elements in list1 are: "+list);
		Collections.rotate(list1,1);
		System.out.println("The elements in list1 are: "+list);
		Collections.sort(list1);
		System.out.println("The elements in list1 are: "+list);
		Collections.reverse(list1);
		System.out.println("The elements in list1 are: "+list);
		

	}

}
