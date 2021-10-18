package PatternsAndMisc;

class Outer1 {
	int a = 5;

	public Outer1() {

	}

	public Outer1(int k) {

	}

	void out() {
		System.out.println("In Outer 1");
	}

	void out(int i) {
		System.out.println("In Outer 2");
	}
}

class Outer2 extends Outer1 {

	void out() {

		System.out.println("In Child Outer");
	}

}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 obj = new Outer2();
		obj.out();
	}

}
