package oop;

class Calc{
	int num1;
	int num2;
	int result;
	
	void operation() {
		result = num1+num2;
	}
}
public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj;
		obj = new Calc(); // Calc obj = new Calc();
		//obj is reference to object 
		//new Calc() is actual object
		
		obj.num1=5;
		obj.num2 = 6;
		obj.operation();
		
		System.out.println(obj.result);
	}

}
