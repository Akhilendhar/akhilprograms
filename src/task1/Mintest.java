package task1;

import java.util.Scanner;

public class Mintest {

	public static void main(String[] args) {
		int m[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int s = 0;
		int[] m1 = null;     
		try {
		s=sc.nextInt();
		m1=new int[s];
		System.out.println("enter the elements to array");
		for (int i = 0; i < s; i++) {
			m1[i] = sc.nextInt();
		}
		}
		catch(Exception e)
		{
			System.out.println("enter the intergers only");
			System.exit(0);
		}
		int min = m1[0];
		for (int i = 0; i < s; i++) {
			if (m1[i] < min) {
				min = m1[i];
			}
		}

		System.out.println("the min number in the array is" + min);
		sc.close();
	}

}
