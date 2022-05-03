package oop;
/*
 * Interface in Java is a blueprint of a class. It has static constants and abstract methods
 * All methods are abstract by default
 * We cannot have method body in interface
 * Types of Interfaces:-
 * 				1) Normal
 * 				2) Single Abstract Method:- Functional Interface - Lambda Expression
 * 				3) Marker Interface.
 * Variable inside interface are final.
 * We can define method inside interface with default keyword. --> From java 1.8 and Above.
 * We can have static methods in interface.
 */
interface Writer{
	void write();
	default void me() {
		//Trying default method in interface.
	}
}

class Pen implements Writer{
	public void write() {
		System.out.println("I am Pen");
	}
}
class Pencil implements Writer{
	public void write() {
		System.out.println("I am Pencil");
	}	
}
public class Interface {

	public static void main(String[] args) {
		Writer obj = new Pen();
		obj.write();
		
		Writer obj2 = new Pencil();
		obj2.write();

	}

}
