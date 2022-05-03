package control_statements;
/*
 * enhanced for loop was introduced since J2SE 5.0.
 * It provides an alternative approach to traverse the array or collection.
 * it cannot traverse the elements in reverse order. 
 * Syntax is :- for(data_type variable : array | collection){......}
 */
public class ForEach {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5};
		
		for(int e:arr) {
			System.out.println(e);
		}
	}

}
