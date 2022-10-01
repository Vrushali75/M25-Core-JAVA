package org.tnsindia.looping;
import java.util.Scanner;

//Program for Enhanced For loop
public class Example4 {

	public static void main(String[] args) {
		String country[]=new String[3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 3 country name: ");
		for(int i=0;i<3;i++)
		{
			country[i]=s.next();
		}
		System.out.println("The entered country names are: ");
		for(String x:country)
		{
			System.out.println(x);
		}
		s.close();
	}
}
