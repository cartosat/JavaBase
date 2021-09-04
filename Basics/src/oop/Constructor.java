package oop;
	//Constructor is member method
	//It has same name as of class
	//It will Never return anything
	//It is used to allocate memory

class A{
	int i;
	int j;
	
	public A() {//It is Default constructor.It get called automatically when object is created
		System.out.println("Default Constructor invoked.....");
		i=5;
	}
	public A(int k) {
		System.out.println("Parameterised Constructor invoked.....");
		System.out.println(k);
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		A obj = new A();
		A obj2 = new A(7);
		System.out.println(obj.i);
	}

}
