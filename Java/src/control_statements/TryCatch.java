package control_statements;
/*
 * try-catch finally block is used in critical statements which may throw errors.
 * Here we are dividing number by zero, hence we will get error.
 * to handle that error we can use try catch block.
 * We can have multiple catch blocks.
 * Finally is special block which execute itself after execution of either try or catch.
 */
public class TryCatch {

	public static void main(String[] args) {
		
		int a=5,b=3,c;
		int[] arr = new int[6];
		try {
			c = a/b;
			System.out.println(c);
			arr[6] = 8; // Index out of bound error.
		}
		catch(Exception e) {
			System.err.println("Error is :- "+ e.getMessage());
		}
		finally {
			System.out.println("Bbye..");
		}

	}

}
