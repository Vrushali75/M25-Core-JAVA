package org.tnsindia.packagedemo;

public class PackageDemo {
	
	public String str;
	/*
	 * if any method or variable is declared default then that method or varibale
	 * you cannot access into another package
	 * If you want to access that variable and method we have to make them as public
	 */
	public void display(){
		System.out.println("The name of string is : "+str);
	}
}
