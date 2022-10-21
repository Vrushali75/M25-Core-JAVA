package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		//adding the value
		obj.add("Vrushali");
		obj.add('x');
		obj.add(87.09f);
		System.out.println("The element in collections are: "+obj);

	}

}
