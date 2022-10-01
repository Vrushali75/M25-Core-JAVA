package org.tnsindia.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//+=
		System.out.println("Enter the value for A and B for addition");
		int add1=s.nextInt();
		int add2=s.nextInt();
		add1+=add2;
		System.out.println("The add assignment operator is: "+add1);
		System.out.println("-----------------------------------------");
		
		//-=
		System.out.println("Enter the value for A and B for subtraction");
		int sub1=s.nextInt();
		int sub2=s.nextInt();
		sub1-=sub2;
		System.out.println("The sub assignment operator result is: "+sub1);
		System.out.println("-----------------------------------------");
		
		//*=
		System.out.println("Enter the value for A and B for multiplication");
		int mul1=s.nextInt();
		int mul2=s.nextInt();
		mul1*=mul2;
		System.out.println("The mul assignment operator result is: "+mul1);
		System.out.println("-----------------------------------------");
		
		// /=
		System.out.println("Enter the value for A and B for divsion");
		int div1=s.nextInt();
		int div2=s.nextInt();
		div1/=div2;
		System.out.println("The div assignment operator result is: "+div1);
		System.out.println("-----------------------------------------");
		
		//%=
		System.out.println("Enter the value for A and B for modular");
		int mod1=s.nextInt();
		int mod2=s.nextInt();
		mod1%=mod2;
		System.out.println("The add assignment operator result is: "+mod1);
		System.out.println("-----------------------------------------");
		s.close();
	}

}
