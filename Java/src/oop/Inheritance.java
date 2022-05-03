package oop;
/*
 * In Inheritance We can call methods of parent class using object of child class
 * we need to use extends keyword to inherit the class.
 */

class Calculator{                        // Parent Class,Base Class
	public int add(int a,int b) {
		return a+b;
	}
	
}
class CalculatorAdv extends Calculator{  // Child Class, Derieved Class
	public int sub(int a, int b) {
		return a-b;
	}
}
class CalcVeryAdv extends CalculatorAdv{
	public int multi(int a,int b) {
		return a*b;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcVeryAdv obj = new CalcVeryAdv();
		int sum = obj.add(6, 3);
		System.out.println(sum);
		int sub = obj.sub(6, 3);
		System.out.println(sub);
	}

}
