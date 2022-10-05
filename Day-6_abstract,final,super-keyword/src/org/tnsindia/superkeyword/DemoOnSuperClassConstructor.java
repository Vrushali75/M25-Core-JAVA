package org.tnsindia.superkeyword;

class Person
{
	//super class constructor
	Person()
	{
		System.out.println("Parent Class Constructor");
	}
}
class Student extends Person
{
	Student()
	{
		//To call Parent class Constructor
		super();
		System.out.println("Child Class Constructor");
	}
}
public class DemoOnSuperClassConstructor {

	public static void main(String[] args) {
		Student s=new Student();
	}

}
