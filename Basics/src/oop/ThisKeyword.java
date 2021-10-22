package oop;
/* this --> is reference variable that referes to the current object.
 * this can be used to refere current class instance variable
 * this can be used to invoke current class method,constructor.
 * this can be passed as an argument in method,constructor call.
 */
class Calc2{
	int num1;
	int num2;
	int result;
	
	public Calc2(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc2 obj = new Calc2(4,5);
		System.out.println(obj.num1);	
		System.out.println(obj.num2);
	}

}
