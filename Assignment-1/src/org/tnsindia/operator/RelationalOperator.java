package org.tnsindia.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Are you an Indian, type 1 for yes and 0 for No: ");
		int ans=s.nextInt();
		if(ans==1)
		{
			System.out.println("You can vote in India ");
			System.out.println("Enter your age: ");
			int age=s.nextInt();
			if(age>=18)
				System.out.println("Eligible for voting");
			else
				System.out.println("Not eligible for voting");
		}
		else
		{
			System.out.println("You can't vote in India");
		}
		s.close();
		}
	
	}

