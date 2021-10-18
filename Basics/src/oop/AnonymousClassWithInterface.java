package oop;
/*
 * We try to create object of interface using anonymous class.
 * We need to implement method from interface while creating object.
 * we can implement method using anonymous class.
 * When We have single method in interface we can do as did on line 28.
 */
interface Abc{
	public void show();
}

interface Strange{
	void eat();
}

public class AnonymousClassWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc() {
			public void show() {
				System.out.println("Hehehe Its object of Interface.");
			}
		};
		obj.show();
	
		// Strange
		Strange st = () -> System.out.println("Strange Method.");
		st.eat();

	}

}
