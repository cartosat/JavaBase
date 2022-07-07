package collection_and_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author VSW
 * Iterator object is used to loop through collections.
 * It retrieve elements one by one.
 * Iterator object can be created by calling iterator() method present in Collection interface.
 */

public class IterateCollectionElements {

    public static void main(String[] args) {

        Collection arr = new ArrayList();

        arr.add(5);
        arr.add(7);
        arr.add(9);

        // Iterate over arr elements
        Iterator it = arr.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
