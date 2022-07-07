package collection_and_Generics;
/**
 * @author VSW
 * List is interface which extends Collection interface.
 * In collection we were not able to store element at specific index.
 * But with list we can specify index
 * List store element of any data type. It store all element as object.
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfCollection {

	public static void main(String[] args) {
		
		List arr = new ArrayList();
		arr.add(5);
		arr.add(6);
		arr.add(2, 3); // 2 is index and 3 is element.

		System.out.println("==== using Normal for loop ====");

		for(int i = 0; i< arr.size(); i++){
			System.out.println(arr.get(i)); // we cannot use arr[i] to fetch element.
		}


		System.out.println("==== using Enhanced for loop ====");

		for(Object ele: arr){
			System.out.println(ele);
		}


		System.out.println("==== using Iterator ====");

		Iterator it = arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


		System.out.println("==== using forEach ====");

		arr.stream().forEach(System.out::println);

	}

}
