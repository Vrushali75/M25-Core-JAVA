package org.tnsindia.superkeyword;
//Super class
class Parent
{
	public void print()
	{
		System.out.println("Welcome to M25 Batch");
	}
	public void accept()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	//Method overriding
	public void print()
	{
		System.out.println("Congratulations for your selection in Screening");
	}
	public void accept()
	{
		System.out.println("Child class method");
	}
	public void display()
	{
		print();
		accept();
		//Calling the parent class method
		super.print();
		super.accept();
	}
}
public class DemoOnSuperClassMethod {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}

}
