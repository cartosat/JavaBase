package oop;
/* Inside class we can have variables,methods and also Class --> This is called inner class
 * It can Access all members of outer class including private members and methods
 * To access methods of inner class we need object of inner class and that object is created
 * 		with help of obj of outer class beloe is implementation
 * We can have static inner class
 */
class Outer{
	int a;
	public void show() {
		
	}
	class Inner{
		public void display() {
			System.out.println("Inner class");
		}
	}
	static class Inner2{
		public void display() {
			System.out.println("Static Inner class");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		//Static Inner class Object
		Outer.Inner2 obj2 = new Outer.Inner2();
		obj2.display();

	}

}
