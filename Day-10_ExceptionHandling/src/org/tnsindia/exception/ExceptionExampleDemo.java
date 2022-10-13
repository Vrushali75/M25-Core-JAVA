package org.tnsindia.exception;

public class ExceptionExampleDemo {
	public static void print(int[] arr) 
	{
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed!");
	}
	public static void main(String[] args) {
	try
	{
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myIntArray=new int[] {1,2,3};
		print(myIntArray);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Third Line");
	}

  }

}
