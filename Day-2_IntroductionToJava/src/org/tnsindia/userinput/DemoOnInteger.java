package org.tnsindia.userinput;

import java.util.Scanner;

//Program on user input for integer datatype
public class DemoOnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For user input value	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=s.nextInt();
		System.out.println("The result is : ");
		System.out.println(x);	
		s.close();
	}

}
