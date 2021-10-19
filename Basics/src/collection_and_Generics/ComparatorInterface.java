package collection_and_Generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * We will override some methods from camparator and modify sort method from Collections.
 * Lets consider i want to sort element with last digit.
 */
public class ComparatorInterface {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(404);
		list.add(908);
		list.add(639);
		list.add(265);
				
		Comparator<Integer> c = new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				
				return o1%10 > o2%10?1:-1;//Using Ternary Operator.
			}
		};
		//Since Comparator is functional interface we can use lambda expression.
		
		Collections.sort(list,c);//I can specify logic in sort method.
		
		for(int e:list) {
			System.out.println(e);
		}


	}

}
