package org.tnsindia.exception;

public class FinallyBlockNotExecuted {
	//it is static because it is outside the main function
	public static void print()
	{
		try
		{
			int x=12,y=5;
			System.out.println("Inside try block "+x/y);
			//1) no any further statement will get executed
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		//2) hen exception is in finally block, it won't be executed
		/*finally
		{
			System.out.println("Finally Block");
			int res=34/0;
			System.out.println(res);
		}
		*/
	}
	public static void main(String[] args) {
		print();
	}
}
