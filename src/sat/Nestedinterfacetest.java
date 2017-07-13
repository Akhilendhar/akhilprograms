package sat;
interface f1
{
	void foo();
	interface f2
	{
		void foo1();
		static int square(int x)
		{
			return x*x;
		}
	}
}
class Nestedinterfacetest implements f1.f2
{
	public void foo1()
	{
	System.out.println("hello nested interface");
	}
	public static void main(String []args)
	{
		f1.f2 obj=new Nestedinterfacetest();
		obj.foo1();
		System.out.println(f1.f2.square(2));
		
	}
}