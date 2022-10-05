package org.tnsindia.inheritance;
import java.util.Scanner;

//Demo On single inheritance
//Parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The Animal is : "+name);
	}
}
//Child Class
class Dog extends Animal
{
	public String Breed;
	public void print() 
	{
		System.out.println("The Dog Breed is: "+Breed);
	}
}
public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Dog d=new Dog();
		System.out.println("Enter the name of the animal: ");
		String name1=s.nextLine();
		System.out.println("Enter the breed of the animal");
		String Breed1=s.nextLine();
		d.Breed=Breed1;
		d.name=name1;
		d.display();
		d.print();
		s.close();
	}
}
