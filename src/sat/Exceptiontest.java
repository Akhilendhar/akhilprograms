package sat;

import java.util.Scanner;

public class Exceptiontest 
{
	public static void main(String []args)
	{
		try
		{
		int a=10/0;
		}
	catch(Exception e)
	{
		System.out.println("can not divde with the zero");
	}
		System.out.println("coding is simple");
}
}