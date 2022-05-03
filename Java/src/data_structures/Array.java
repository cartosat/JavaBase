package data_structures;
/*
 * Array store variables of similar data type
 * 
 */
public class Array {

	public static void main(String[] args) {
		int[]  arr = new int[4];
		int arr1[] = {1,2,3,4};
		
		int arr2[]; 		// Declaration
		arr2 = new int[5];  // Initialization
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//Enhanced for loop
		for(int k:arr1) {
			System.out.print(k+" ");
		}
		
	}

}
