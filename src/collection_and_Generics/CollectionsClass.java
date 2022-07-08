package collection_and_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author VSW
 * We have Collectios as class in util package.
 * Collections class is used with the static methods that operate on the collections or
 *      return the collection.
 *
 *   All the methods of this class throw the NullPointerException
 *      if the collection or object passed to the methods is null.
 *
 *  We can use following methods from Collections class:-
 *      - reverse - To reverse List.
 *      - shuffle - To shuffle List.
 *      - min - gets min from List.
 *      - max - gets max from List.
 *      - addAll - To add multiple numbers separated by comma.
 *
 *  There are many more function but above are some major.
 */

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(0, 9);
        nums.add(3);

        // Print unsorted list
        System.out.println(nums);

        // Print sorted list
        System.out.println("==== Sorted List ====");
        Collections.sort(nums);
        System.out.println(nums);

    }
}