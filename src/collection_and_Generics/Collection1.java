package collection_and_Generics;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection is framework that store group of objects.
 * Collection provides many interfaces (Set, List, Queue, Deque) and 
 * 	classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
 * Every Element in collection is object.
 * Collection does not support index number.
 * 
 */
public class Collection1 {

	public static void main(String[] args) {
		
		Collection values = new ArrayList();
		
		values.add(4); //Integer v = new Integer(4); --> Uses concept of wrapper classes.
		values.add(6);
		values.add("Hii");
		
		//Printing all values
		System.out.println(values);
		
		for(Object e:values) {
			System.out.println(e);
		}
	}

}
