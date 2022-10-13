package org.tnsindia.customexception;
//Example on custom exception
class SimpleCustomException extends Exception
{
	public String str;
	//Constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
	
	
}
public class SimpleCustomExceptionDemo {

	public static void main(String[] args) {
		/*
		 * In order to use our own custom exception we have to create 
		 * an new object of the class and we have to through it using the throw keyword*/
		try
		{
			throw new SimpleCustomException("This is user defined exception demo");
		}
		catch(SimpleCustomException e)
		{
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
	}

}
