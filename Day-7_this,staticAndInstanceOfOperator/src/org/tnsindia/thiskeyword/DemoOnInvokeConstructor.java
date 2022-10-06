package org.tnsindia.thiskeyword;
class D
{
	//Default Constructor
	D()
	{
		//this keyword is invoking the parent class constructor
		this(5);
		System.out.println("Default Constructor");
	}	
	//Parameterized Constructor
	D(int i)
	{
		System.out.println("Parametrized Constructor");
	}
}
public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
		//Object Creation
		D d=new D();
	}

}
