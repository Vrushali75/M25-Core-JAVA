package org.tnsindia.exception;

import java.util.Scanner;
//Program to handle arithmetic exception
public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a=s.nextInt();
		int b=s.nextInt();
		//try block contains the exception code
		try
		{
			int result=a/b;
			System.out.println("The result is: "+result);
			s.close();
		}
		//catch block is used to handle the exception
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Arithmetic Exception Handled using catch block");
		}
		//weather any exception occurs or not finally block is always executed
		finally {
			System.out.println("Finally Block is always executed");
		}
		//outside exception blocks print statements can be executed
		System.out.println("Exception Handling");
		s.close();
	}
}
