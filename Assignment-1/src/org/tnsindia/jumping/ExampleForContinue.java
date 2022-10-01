package org.tnsindia.jumping;

import java.util.Scanner;

public class ExampleForContinue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==5 || i==10 || i==15 || i==20)
				continue;
			System.out.print(" "+i);
		}
		s.close();
	}

}
