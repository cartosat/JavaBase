package collection_and_Generics;

import java.util.HashSet;
import java.util.Set;
/*
 * Set is interface in java.
 * Set does not contain duplicate values.
 * Sequence is not maintained.
 */
public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		// We can use TreeSet here that can give data in ascending order. 
		
		s1.add(5);
		s1.add(6);
		s1.add(9);
		System.out.println(s1.add(6));
		
		System.out.println(s1);
		
		for(Integer e:s1) {
			System.out.println(e);
		}

	}

}
