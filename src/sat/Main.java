package sat;

abstract class AbstractTest1 {
	void surname() {
		System.out.println(" your surname is gangireddy");
	}

	abstract void check();
}

class akhil extends AbstractTest1 {
	void surname() {
		System.out.println(" your surname is not gangireddy");
	}

	void check() {
		System.out.println("you are checked");
	}
	void dislay()
	{
		System.out.println("akhil hi");
	}

}

class Main {
	public static void main(String[] args) {
	akhil t = new akhil();
		t.check();
		t.surname();
		t.dislay();
	}
}