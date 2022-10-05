package org.tnsindia.inheritance;

//parent class
class AndroidVersion
{
	protected String name="Android latest version";
	public void display1() {
		System.out.println(name);
	}
}
//Child class 1
class Tiramisu extends AndroidVersion{
	public String v13="Tiramisu";
	//Method overriding
	public void display() {
		System.out.println(v13);
	}
}
//Child Class 2
class SnowCone extends AndroidVersion{
	public String v12="Snow Cone";
	public void display() {
		System.out.println(v12);
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		t.display1();
	}

}
