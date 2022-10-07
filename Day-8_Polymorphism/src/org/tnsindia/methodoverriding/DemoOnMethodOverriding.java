package org.tnsindia.methodoverriding;
import java.util.Scanner;
//Parent Class
class HeadQuaters
{
	protected int totalemp;
	protected String city;
	Scanner s=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter the city where HeadQuater is situated: ");
		city=s.nextLine();
		System.out.println("Enter the total no. of employees in HeadQuater: ");
		totalemp=s.nextInt();
	}
	public void showDetails()
	{
		System.out.println("HeadQuaters");
		System.out.println("Company is located in "+city+" and the no. of employees are "+totalemp);
	}
}
//child class
class MainBranch extends HeadQuaters
{
	public int totalempMB;
	public String citynameMB;
	public void getDetails()
	{
		System.out.println("HeadQuaters");
		super.getDetails();
		System.out.println("Main Branch");
		System.out.println("Enter the city where Main Branch is situated: ");
		s.nextLine();//to give the input in the new line
		citynameMB=s.nextLine();
		System.out.println("Enter the total no. of employees in the main branch: ");
		totalempMB=s.nextInt();
	}
	//Method Overriding
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Main Branch");
		System.out.println("Company is located in "+citynameMB+" and the no. of employee are "+totalempMB);
	}
	
	
}
public class DemoOnMethodOverriding {

	public static void main(String[] args) {
		MainBranch m=new MainBranch();
		m.getDetails();
		m.showDetails();
	}

}
