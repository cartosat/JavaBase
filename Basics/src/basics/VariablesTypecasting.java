package basics;

public class VariablesTypecasting {

	public static void main(String[] args) {
		//Two types of TypeCasting A)implicit conversion B)Explicit
		
		//Impilicit --> Converting a lower data type into a higher one
			// Done automatically
			//It is safe because there is no chance to lose data.
		
		int a = 5;
		double b =a;
		System.out.println(b); //Implicit typcasting
		
		//Explicit --> Converting a higher data type into a lower one
		//       It is done manually by the programmer
		double c = 5.5;
		int d = (int)c;
		System.out.println(d); //Explicit Typecasting
		
		//Typeconversion
		//	byte -> short -> int -> long -> float -> double
		//          char 

	}

}
