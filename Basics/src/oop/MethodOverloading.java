package oop;

/* When class have two methods with same name and different parameter/Signature it is 
 *  method Overloading.
 * There are two ways to overload the method in java
 *   1. By changing number of arguments
 *   2. By changing the data type
 * We Also can overload main method But JVM calls main() method which receives string array 
 *  as arguments only
 */

class Casio{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Casio ob = new Casio();
		ob.add(1, 3);
		ob.add(1, 3, 5);

	}

}
