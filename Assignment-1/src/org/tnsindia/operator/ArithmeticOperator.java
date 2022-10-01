package org.tnsindia.operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 2 number for arithmetic operation: ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		//All arithmetic operation 
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		float div=num1/num2;
		int mod=num1%num2;
		System.out.println("Addition is: "+add);
		System.out.println("Subtraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is: "+div);
		System.out.println("Modular is: "+mod);
		s.close();
	}

}
