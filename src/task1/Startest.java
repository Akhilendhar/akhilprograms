package task1;

import java.util.Scanner;

public class Startest {

	public static void main(String[] args) {
		System.out.println("enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int s = 0;
		try
		{
		s=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("enter the interger only");
		}
		sc.close();
		for(int i=0;i<=s;i++)
		{
			for(int j=4;j>=i;j--)
			{
			   	System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
