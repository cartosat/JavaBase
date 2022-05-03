package control_statements;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		if(i>6)
			j=1;	
		else
			j=2;
		System.out.println(j);
		
		//We can replace above code with single line using ternary operator
		// It provides a way to shorten a simple if else block
		// condition?expr1:expr2 -->if condition=True execute expr1 else execute expr2
		
		j = i>6?1:2;
		System.out.println(j);

	}

}
