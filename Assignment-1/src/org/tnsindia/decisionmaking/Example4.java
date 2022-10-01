package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//Switch case
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 2 or 3");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Vrusahli");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("India");
			break;
		default:
			System.out.println("Invalid input");
		}
		s.close();
	}
	

}
