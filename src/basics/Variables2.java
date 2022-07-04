package basics;

public class Variables2 {

	public static void main(String[] args) {
		//ASCII --> American Standard Code for Information Interchange
		
		char c = 'A';
		c = 67;      //we are assigning numerical value to c
					//But as c is char it will consider 68 as ASCII value
					//and char associated with it will be printed
		
		int a = 66;
		a ='D';     //we are assigning Alphabetical value to a
					//But as a is integer it will consider ASCII value of 'D'
	
		int x =5;
		char y = 'E';
		
		x=y;  // we can directly assign char to int --> since It is Implicit Type Casting
	 // y=x; // Error cannot convert from int to char 
		y=(char)x; // Typecasting int to char --> Explicit Typecasting
		
		
		System.out.println(c);
		System.out.println(a);
		
		System.out.println(x);
		System.out.println(y);

	}

}
