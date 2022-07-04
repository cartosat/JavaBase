package data_structures;
/*
 * Vargs :- Variable Lenght Argument
 * We can pass any number of parameters to method
 */
class calcu{
	public int add(int ...n) {
		int sum=0;
		for(int e:n) {
			sum+=e;
		}
		return sum;
	}
}
public class Vargs {

	public static void main(String[] args) {
		calcu obj = new calcu();
		int result = obj.add(1,2,3,4,5);
		System.out.println(result);
	}

}
