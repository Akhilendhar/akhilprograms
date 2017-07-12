package task1;

import java.util.Scanner;

public class Averagetest {

	public static void main(String[] args) {
		int a = 0, b=0, c=0, d=0;
		float avg = 0;
		System.out.println("enter the marks");
		Scanner sc = new Scanner(System.in);
		try {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		avg = (a + b + c + d) / 4;
		}
		catch(Exception e)
		{
			System.out.println("enter the intergers only");
			System.exit(0);
		}
		sc.close();
		System.out.println(avg);
		if (a > 35 && b > 35 && c > 35 && d > 35) {
			if (avg > 90) {
				System.out.println("a grade");
			} else if (avg > 80) {
				System.out.println("b grade");
			} else if (avg > 70) {
				System.out.println("c grade");

			} else if (avg < 70) {
				System.out.println("d grade");
			}
		} else {
			System.out.println("fail");
		}
	}

}
