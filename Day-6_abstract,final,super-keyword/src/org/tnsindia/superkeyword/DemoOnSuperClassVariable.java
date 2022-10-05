package org.tnsindia.superkeyword;

//Parent class or super class or base class
class Animal
{
	protected String name="Animal";
}
//Child class
class Dog extends Animal
{
	public String name="Dog";
	public void display()
	{
		System.out.println("The name of animal is : "+name);
		//To call super class variable
		System.out.println(super.name);
	}
}
public class DemoOnSuperClassVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();

	}

}
