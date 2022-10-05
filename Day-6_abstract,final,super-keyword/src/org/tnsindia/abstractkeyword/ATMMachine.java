package org.tnsindia.abstractkeyword;
//Program on abstract class and abstract method
//If any class contains at least one  abstract method then that class must be declared as abstarct
abstract class A
{
	//abstract method
	abstract void print();
}
class B extends A
{
	//Providing the implementation to abstract method inside the child class
	@Override
	void print() {
		int balance=50000;
		System.out.println("Account balance is: "+balance);
	}
	
}
public class ATMMachine {

	public static void main(String[] args) {
		//We cannot create the object for abstract class
		//A a=new A();
		A a=new B();
		a.print();
	}

}
