package org.tnsindia.thiskeyword;

import java.util.Scanner;

//2. this can be passed as an argument in the constructor call
class B
{
	public String name;
	public int id;
	
	B(String name, int id) 
	{	
		//this keyword is used here to refer the current class variable
		this.name = name;
		this.id = id;
	}

	//user defined method
	public void print()
	{
		System.out.println("The name is: "+name);
		System.out.println("The id is : "+id);
	}
}
public class DemoOnThisKeywordConstructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name and id");
		String name1=s.nextLine();
		int id1=s.nextInt();
		B b=new B(name1,id1);
		b.print();
	}

}
