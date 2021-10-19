package collection_and_Generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * We called this as Generics since we have list of specific data type.
 * Now we cannot add variable of other data type except Integer.
 * We can sort list with sort method from Collections.
 */
public class List_of_specific_dtype {	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(0, 5);
		list.add(3);
		
		System.out.println(list);
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int e:list) {
			System.out.println(e);
		}

	}

}
