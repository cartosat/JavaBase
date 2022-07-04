package oop;
/*
 * When parent class and child class have same method with same parameters.
 * In case of method overriding method from child class is executed
 */
class Base{
	public void show() {
		System.out.println("Hello Base Show...");
	}
	
}
class Derieved extends Base{
	
	@Override
	public void show() {
		//If we want to call show from base Class then we can use following
		super.show();
		System.out.println("Hello Derieved Show...");
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Base obj = new Derieved();
		obj.show();
		//obj.disp();

	}

}
