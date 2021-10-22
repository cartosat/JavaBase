package oop;
/*
 * Super is used to refer immediate parent class instance variable.
 * It is used to invoke immediate parent class methods.
 * super() is used to invoke immediate parent class constructor.
 */
class GrandParent{
	int a = 4;
	String name= "Sharad";
}
class Parents{
	int a = 5;
	String name = "Vaibhav";
	
	public void myInfo() {
		
		System.out.println("In myInfo Method..");
	}
}
class Childs extends Parents{
	int a = 6;
	
	public void chilInfo() {
		
		System.out.println(" Parent a:-"+super.a);
		super.myInfo();
	}
	
}
public class SuperKeyword {
	
	public static void main(String[] args) {
		Childs ch = new Childs();
		ch.chilInfo();

	}

}
