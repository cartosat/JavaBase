package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author VSW
 * A method reference is described using "::" symbol.
 * types of methods 
 * 	1) Static methods
 * 	2) Instance methods
 * 	3) Constructors using new operator (TreeSet::new)
 * 
 * 
 * 
 *
 */

public class MethodReferences {
	
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Vaibhav", "K2", "Suraj");
		
		//Lambda Expression
		lst.forEach(name -> System.out.println(name));
		
		// Method Reference.
		lst.forEach(System.out::println);
		
		
		
	}
}
