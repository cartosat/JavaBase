package methodReference;

import java.util.Arrays;
import java.util.List;
/*
 * Method reference is used to refer method of functional interface.
 * It is compact and easy form of lambda expression to call methods that are already defined.
 * Method reference can be used for:-
 * 								1) Instance method
 * 								2) Static methods
 * 								3) Constructors
 * Below we can see we are using single line to print all element of list.
 * we are passing method to method i.e method as argument.
 * Operator used for specifying method reference is :: double colon.
 */
public class MethodReference {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Vaibhav","Kiran","Suraj","Hrushi");
		
		//Example of method reference.
		names.forEach(System.out::println);

	}

}
