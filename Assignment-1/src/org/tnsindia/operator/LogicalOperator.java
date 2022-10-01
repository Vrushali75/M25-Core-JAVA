package org.tnsindia.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=3,b=4;
		boolean res=(a<b && b<8); //Logical And operator
		boolean res1=(a<b || b>8); //Logical Or Operator
		boolean res2=!(a<b); //Logical Not Operator
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
