package task1;

import java.util.*;

public class Factest {

	public static void main(String[] args) {
		int no=0;
		System.out.println("ente the positive number");
		Scanner sc = new Scanner(System.in);
		try
		{
		no = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("enter the positive interges only");
			System.exit(0);
		}
		sc.close();
		System.out.println("the factorial of the number is"  + fact(no));
	}

	static int fact(int n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}
}
