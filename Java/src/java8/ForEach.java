package java8;
/**
 * @author VSW
 * It is used to iterate elements of iterable.
 * Collection classes which extends Iterable interface can use forEach loop to iterate elements.
 * Class should extend Iterable interface then n then we can use forEach loop.
 */
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList("Me", "You", "She");
		
		li.forEach(System.out::println);

	}

}
