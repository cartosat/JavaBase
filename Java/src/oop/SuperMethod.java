package oop;
/*
 * Super is used to refer immediate parent class instance variable.
 * It is used to invoke immediate parent class methods.
 * super() is used to invoke immediate parent class constructor.
 */
class C{
	public C() {
		System.out.println("Inside Default C");
	}
	public C(int i) {
		System.out.println("Inside Parameterized C");
	}
}
class D extends C{
	public D() {
		super(5); 
		System.out.println("Inside Default D");
	}
	public D(int i) {
		//super();
		System.out.println("Inside Parameterized D");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob = new D();
	}

}
