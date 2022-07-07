package collection_and_Generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author VSW
 * When we don't have data type specified we call it as collection.
 * We have data type specified hence We called this as Generics.
 * Now we cannot add variable of other data type except specified in <> bracket.
 * We can sort list with sort method from Collections.
 */
public class GenericsList {

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
