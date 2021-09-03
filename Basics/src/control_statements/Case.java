package control_statements;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If case matches the all consecutives staatements will execute hence we use break
		//default will be triggered if no case is matched
		//We can use character bcoz they get converted to int (Inplicit Typecasting)
		//Switch doesn't support string for java version below 1.7 
		
		int n = 5;
		
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Out of case :)");
			break;
		}

	}

}
