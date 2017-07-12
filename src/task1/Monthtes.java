package task1;
import java.time.Month;
import java.util.Scanner;

public class Monthtes {

	public static void main(String[] args) {
		System.out.println("enter the month number");
		Scanner sc=new Scanner(System.in);
		try
		{
		int no=sc.nextInt();
		System.out.println(Month.of(no).name());
		}
		catch(Exception e)
		{
			System.out.println("enter the number between 1 to 12");
		}
		sc.close();
		
		

	}

}
