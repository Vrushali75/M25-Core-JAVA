package org.tnsindia.thiskeyword;
//1. this keyword is used to refer the current class instance variable
class A
{
	public String name;
	public int id;
	public void accept(String name, int id)
	{
		//this keyword is used here to refer the current class variable
		this.name=name;
		this.id=id;
	}
	//user defined method
	public void print()
	{
		System.out.println("The name is: "+name);
		System.out.println("The id is : "+id);
	}
}
public class DemoOnThiskeywordInstanceVar {

	public static void main(String[] args) {
		A a=new A();
		a.accept("Vrushali", 121);
		a.print();

	}

}
