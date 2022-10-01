package org.tnsindia.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		//Increment Operators
		int a=5,b=3;
		int x=a++;
		int y=++b;
		int z=a+x;
		System.out.println("Increment Operation down here");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//Decrement operators
		System.out.println("Decrement operation down here");
		int num1=4,num2=2;
		int res1=num1--;
		int res2=--num2;
		int res3=res1-res2;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
