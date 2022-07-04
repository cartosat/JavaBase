package basics;

public class Operators1 {
	/*
	 *  Arithmetic  + - * % /
	 *  BitWise
	 *  Relational
	 *  Logical
	 * 
	 */
	public static void main(String[] args) {
		int m =6, n=4;
		
		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		int r4 = m/n;  //Gives quotient and default datatype is int
		float r5 = (float)m/n; //Typecasted to float
		int r6 = m%n; //Modulous Operator gives remainder 
		
		m+=n; //m = m + n
		n+=1; //Same as n++; and n = n+1;  Increament Operator
		
		++n; // Pre-increment --> Variable is incremented first and then assigned
		n++; // Post-Increment --> Variable is assigned first and then increamented
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		System.out.println(m);

	}

}
