package java8;
/**
 * @author VSW
 * The Lambda expression is used to provide the implementation of functional interface.
 * Functional interface has only 1 methoda in it.
 * Java lambda expression is treated as a function, so compiler does not create .class file.
 * Java provides an anotation @FunctionalInterface,
 *  which is used to declare an interface as functional interface.
 */

@FunctionalInterface
interface Payable {
	public void pay();
}

public class LambdaExpression {
	public static void main(String[] args) {
		//Old style to create object
		Payable ts = new Payable() {
			public void pay() {
				System.out.println("Hello in traditional Implementation.");
			}
		};
		//Using lambda expression
		Payable pg = () -> {
			System.out.println("Hello in lambda expression.");
		};
		pg.pay();
	}

}
