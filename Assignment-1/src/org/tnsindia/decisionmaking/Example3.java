package org.tnsindia.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		int age=15,weight=130;
		
		//Program for nested if
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible to do bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not eligible for bunjee Jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee Jumping");
		}

	}

}
