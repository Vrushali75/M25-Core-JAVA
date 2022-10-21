package org.tnsindia.comparatordemo;

import java.util.Comparator;
//Comparator is an interface : it compare the age of the employee
public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//we have create age of two employee age 
		int emp1_age=((Employee) o1).getAge();
		int emp2_age=((Employee) o2).getAge();
		
		if(emp1_age>emp2_age)
		{
			System.out.println("Employee 1 have more age");
		}
		else if(emp2_age>emp1_age)
		{
			System.out.println("Employee 2 have more age");
		}
		else
		{
			System.out.println("Both have equal age");
		}
		return 0;
	}

}
