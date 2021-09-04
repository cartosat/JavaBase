package control_statements;

public class DoWhile {

	public static void main(String[] args) {
		// Though condition is false statement in do is executed
		//bcoz do-while loop check for condition after execution of do
		//mainly used when we want to execute block atleast once even if condition is false
		
		int a = 1;
		do {
			System.out.println("Hello");
			a++;
		}
		while(a<=5);
			
		
	}

}
