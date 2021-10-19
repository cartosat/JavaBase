package collection_and_Generics;
/*
 * List store element of any data type.
 * It store element as object.
 * We can specify Index as well.
 */
import java.util.ArrayList;
import java.util.List;

public class List_of_Elements {

	public static void main(String[] args) {
		
		List arr = new ArrayList();
		arr.add(5);
		arr.add(6);
		arr.add(2, 3); // 2 is index and 3 is element.
		
		for(Object o:arr) {
			System.out.println(o);
		}
		

	}

}
