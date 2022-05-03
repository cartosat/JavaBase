package oop;
/*
 * A class declared with the abstract keyword is known as an abstract class
 * It can have abstract and non-abstract methods
 * Abstraction is a process of hiding the implementation details and showing only 
 * 		functionality to the user.
 * we cannot create object of abstract class.
 * We can have constructor in abstract class.
 * We can create methods in abstract class.
 * 
 */

abstract class Human{
	public abstract void eat(); //Abstarct Method
	public Human() {
		
	}
	
	public void walk() {       //Non-abstract Method
		 
	}
}
class Man extends Human{ //Man class is concrete class
	//When we inherit abstarct class we need to declare all abstract methods from it
	public void eat() {
		
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Man();
		

	}

}
