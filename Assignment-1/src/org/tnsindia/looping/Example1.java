package org.tnsindia.looping;
//Program for For loop
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
		s.close();
	}

}
