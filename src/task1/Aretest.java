package task1;

import java.util.Scanner;

class Areat {
	void area(int a) {
		System.out.println("area of the squareis" + a * a);
	}

	void area(int l, int b) {
		System.out.println("the are of the rectangle is" + l * b);
	}

	void area(int b, int h, int s) {
		System.out.println("area of the triangle is" + (b * h * s));
	}
}

class Aretest {
	public static void main(String[] args) {
		Areat t = new Areat();
		int s=0,l=0,b=0,g=0,c=0,h=0;
		System.out.println("enter the side of the square");
		Scanner sc = new Scanner(System.in);
		try
		{
		s = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		t.area(s);
		System.out.println("enter the length and bredth");
		try {
		l = sc.nextInt();
		b = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		t.area(l, b);
		System.out.println("enter the side, base and height");
		try {
		g = sc.nextInt();
		c = sc.nextInt();
		h = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		t.area(g, c, h);
		sc.close();

	}

}
