package sat;
interface it1
{
	void m1();
	void m2();
	void m3();
	default void m5()
	{
		System.out.println("default method 5 invoked");
	}
	static int cube(int x)
	{
		return (x*x*x);
	}
}
interface it2
{
	void m4();
	
}
class Interfacetest implements it1,it2
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public void m3()
	{
		System.out.println("m3 method");
	}
	public void m4()
	{
		System.out.println("m4 method");
	}
	public static void main(String args[])
	{
		it1 i=new Interfacetest();
	  	i.m1();
	  	i.m2();
	  	i.m3();
	  	i.m5();
	  	System.out.println(it1.cube(5));
	  	
	}
}