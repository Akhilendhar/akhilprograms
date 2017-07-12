package task1;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Weektest {

	public static void main(String[] args) {
		System.out.println("enter the week numer");
		Scanner sc=new Scanner(System.in);
		int week = 0;
		try {
		week=sc.nextInt();
		}
		catch(DateTimeException e)
		{
			System.out.println("enter the numberes between 1 and 7");
		}
		sc.close();
		System.out.println(DayOfWeek.of(week));
		
		

	}

}
