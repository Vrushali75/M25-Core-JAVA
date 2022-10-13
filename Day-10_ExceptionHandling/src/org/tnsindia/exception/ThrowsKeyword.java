package org.tnsindia.exception;

import java.io.IOException;

public class ThrowsKeyword {
	//throws is used to declare the exception
	static void print(int x)throws IOException,ClassNotFoundException
	{
		if(x==1)
		{
			throw new IOException("IOEXception occurred");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException occurred");
		}
	}
	public static void main(String[] args) {
		try
		{
			print(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
