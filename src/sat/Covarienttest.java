package sat;

public class Covarienttest {
	public static void main(String[] args) {
		child ch = new child();
		ch.foo1();
	}

}

class parent {
	parent foo()
	{
		return this;
	}

	void foo1() {
		System.out.println("i am in the parent calss");
	}
}

class child extends parent {
	child foo() {
		return this;
	}

	void foo1() {
		System.out.println("welcome the covarient type");
	}
}
