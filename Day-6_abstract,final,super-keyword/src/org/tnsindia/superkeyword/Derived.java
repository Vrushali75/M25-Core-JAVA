package org.tnsindia.superkeyword;

public class Derived extends Base{
	//Default constructor
		Derived()
		{
			System.out.println("Child class constructor-DEFAULT");
		}
		//Parameterized Constructor
		Derived(int i)
		{
			super(1); 
			System.out.println("Child class constructor-PARAMETERIZED");
		}
}
