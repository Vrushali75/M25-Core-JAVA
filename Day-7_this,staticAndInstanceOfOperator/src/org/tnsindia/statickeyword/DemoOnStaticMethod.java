package org.tnsindia.statickeyword;
//static keyword with method
class A
{
	//non static method
	int add(int a,int b)
	{
		return a+b;
	}
	//static method
	static void display()
	{
		System.out.println("Welcome to java full stack training");
	}
}
public class DemoOnStaticMethod {

	public static void main(String[] args) {
		/*without creating any object for a class we can access 
		 * that method by making that method as static
		 * className.methodName();
		 * */
		A.display();
	}
}
