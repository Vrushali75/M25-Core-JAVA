package org.tnsindia.packageexample;
//Importing the package
import org.tnsindia.packagedemo.*;
//import org.tnsindia.packagedemo.PackageDemo;
import java.util.Scanner;
public class PackageClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We are accessing the method of PackageDemo class
		//import the package of specified class
		
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the string : ");
		String str1=s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();
	}

}
