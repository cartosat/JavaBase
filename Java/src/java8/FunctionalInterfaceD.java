package java8;
/**
 * @author VSW
 * Functional Interface :-
 * 	 An Interface that contains only one abstract method is known as functional interface. 
 * 	 It can have any number of default and static methods.
 * 	 Functional interfaces are also known as Single Abstract Method Interfaces (SAM Interfaces).
 * We have annotation @FunctionalInterface which can use to refer functional interface.
 * We can have more that one default method in functional interface.
 * 
 */

@FunctionalInterface
interface sayable {
	void say(String msg);  
	public default void play() {
		// For default methods we need to implement them inside interface only.
	}
}
public class FunctionalInterfaceD implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceD fi = new FunctionalInterfaceD();
		fi.say("Hello");

	}

}
