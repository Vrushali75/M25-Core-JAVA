package org.tnsindia.abstractkeyword;
//Abstract class
public abstract class Person {
	private String name;
	private String gender;
	
	//Parametarized constructor
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	//abstract method
	public abstract void work();
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	//user defined method for changing the name
	public void changeName(String newName)
	{
		name=newName;
	}
	
}
