package org.tnsindia.customexception;

import java.util.Scanner;

//Custom Exception for validating the login credentials
class LoginCredentials extends Exception
{
	public String str;
	//Constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
}
public class UserLoginCustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		System.out.println("Enter email id and password");
		try
		{
			if(id!="vvarankar07@gmail.com" && password!="abc@123")
				throw new LoginCredentials("Invalid Credentials");
			
		}	
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled"+e);
		}
	}
}
