package oop;
/*
 * Anonymous Class is class which does not have name.
 * We create this class during object creation. We need to give curly brackets before
 *  semicolon of object and declare method inside it.
 * 
 */
class AA{
	public void show() {
		System.out.println("In class A");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ob = new AA() 
		{
			public void show() {
				System.out.println("I am the Best");
			}
		};
		
		ob.show();
	}

}
