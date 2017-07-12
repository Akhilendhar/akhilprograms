package task1;

import java.util.Scanner;

public class Swaptest {

	public static void main(String[] args) {
		System.out.println("enter the numbers");
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 0;
		try
		{
		 a = sc.nextInt();
		 b = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("enter the intergers only");
		}
		sc.close();
		b = a + b - (a = b);
		System.out.println("after swaping ");
		System.out.println(a);
		System.out.println(b);

	}

}
