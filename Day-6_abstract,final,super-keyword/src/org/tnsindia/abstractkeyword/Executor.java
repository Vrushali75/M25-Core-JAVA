package org.tnsindia.abstractkeyword;
//Main program
public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("Vrushali","Female",1021);
		Person p1=new Employee("Vidya","Female",0);
		p.work();
		p1.work();
		p.changeName("Anaya");
		System.out.println(p.toString());

	}

}
