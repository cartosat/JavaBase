package oop;

class Constru{
	public Constru() {
		System.out.println("Default Constructor");
	}
	public Constru(int a) {
		System.out.println("Single parameter Constructor");
		System.out.println(a);
	}
	public Constru(int a,int b) {
		System.out.println("Double parameter Constructor");
		System.out.println("addiotion is:-"+a+b);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constru obj = new Constru();
		Constru obj2 = new Constru(5);
		Constru obj3 = new Constru(4,3);

	}

}
