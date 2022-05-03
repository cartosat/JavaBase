package control_statements;

public class IfElse {

	public static void main(String[] args) {
		//If statement is executed when condition is true
		//we dont need curly bracket if there is single line after if,else statement
		
		if(true)
			System.out.println("Trueeee...");
		if(false)
			System.out.println("False");
		else
			System.out.println("It is false hence Executing else");
		
		//if-else without curly brackets
		int n = 7;
		
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//If we have more than one statement to execute in if's body then 
		//we need curly bracket
		
		if(n%2==0) {
			System.out.println("Even");
			System.out.println("Bye");
		}
		else {
			System.out.println("Odd");
			System.out.println("Bye");
		}
			
		//If else if and else
		if(n==0) {
			System.out.println("It is zero");
		}
		else if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Oddd");
		}
	}

}
