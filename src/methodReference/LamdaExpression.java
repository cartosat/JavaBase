package methodReference;

import java.util.Arrays;
import java.util.List;
/*
 * lambda expression is an anonymous function without declaration.
 * It provides Inline implementation for functional interface.
 * When there are functional interface we can make use of lambda expression.
 */
public class LamdaExpression {

	public static void main(String[] args) {
		
		String[] arr = {"Vaibhav","Kiran","Suraj","Hrushi"};
		List<String> names = Arrays.asList(arr);
		
		
	
		names.forEach(s -> System.out.println(s));
	}

}
