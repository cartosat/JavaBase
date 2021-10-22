package oop;
/*
 * Here we are implementing Abstraction using Interface.
 * In Interfaces we just declare the methods and implement them in class which Implements 
 * 	that interface.
 * class can implement more than one interface as shown on line 17.
 * All methods in Interfaces are public abstract.
 * Cannot create object of interface.
 * In main method we have reference of interface but object of class.
 * We cannot create object of Interface instead we can create reference of Interface.
 */
interface Writer2{
	void write();
}
interface Writer3{
	void finish();
}

class Pen2 implements Writer2 , Writer3{
	public void write() {
		System.out.println("Pen is Writing");
	}
	public void finish() {
		//Trial of implementing multiple interfaces.
	}
}

class Pencil2 implements Writer2 {
	public void write() {
		System.out.println("Pencil is Writing");
	}
}

class Kit{
	public void doSomething(Writer2 w) {
		w.write();
	}
}

public class AbstractionUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit();
		Writer2 w = new Pen2();
		k.doSomething(w);
		
		Pencil2 pn = new Pencil2();
		k.doSomething(pn); 
	}

}
