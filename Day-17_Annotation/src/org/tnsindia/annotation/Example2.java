package org.tnsindia.annotation;

import java.util.ArrayList;

public class Example2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList a=new ArrayList<>();
		a.add(7);
		a.add("Vrushali");
		System.out.println(a);


	}

}
