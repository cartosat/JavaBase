package oop;
/*
 * The final keyword in java is used to restrict the user.
 * If you make any variable as final, you cannot change the value of final variable
 * We can make class final --> But no other class can extend final class
 * Similarly we can make method final
 */

class Fi{
	final int a =0; //We cannot change value of final 
	public Fi() {
		//a = 10; //Re-Assignment id not possible since a is final
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Fi ob = new Fi();
		System.out.println(ob.a);

	}

}
