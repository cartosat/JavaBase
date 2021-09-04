package oop;
/*
 * used to refer to the common property of all objects
 * We dont need object to access static methods and variables
 * to initialize static variables we can use static block
 * to initialize non static variables we can use constructor
 * static block initilizes when we load a class --> only once
 * cannot access non static member inside static method
 */
class Emp{
	int eid;
	int salary;
	static String ceo;
	
	
	public Emp() {
		eid = 1;
		salary = 3000;
		System.out.println("Inside constructor");
	}
	static {
		ceo = "Larry";
		System.out.println("Inside Static block");
	}
	public void show() {
		System.out.println(eid+":"+salary+":"+ceo);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp vaibhav = new Emp();
		vaibhav.show();

	}

}
