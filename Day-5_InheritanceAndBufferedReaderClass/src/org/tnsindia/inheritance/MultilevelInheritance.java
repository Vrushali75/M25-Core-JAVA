package org.tnsindia.inheritance;
//Parent Class
class Vehicle{
	protected String name="Car";
	public void display() {
		System.out.println("The Vehicle is: "+name);
	}
}
//Child class for Vehicle{
class BMW extends Vehicle{
	protected String name1="BMW";
	public void display1() {
		System.out.println("The Car Company is: "+name1);
	}
}
//Child class for BMW
class Tyre extends BMW{
	protected String tyrename="BridgeStone";
	public void display2() {
		System.out.println("The tyrename is: "+tyrename);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();

	}

}
