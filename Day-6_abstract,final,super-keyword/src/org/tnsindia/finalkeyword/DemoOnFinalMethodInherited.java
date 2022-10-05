package org.tnsindia.finalkeyword;

class A
{
	final void display()
	{
		System.out.println("Final Method is inherited but not be override");
	}
}
//Child class is inheriting the final method of parent class as well
class B extends A
{
	void print()
	{
		System.out.println("Child class");
	}
}
public class DemoOnFinalMethodInherited {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.print();
	}

}
