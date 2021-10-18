package data_structures;
/*
 * Jagged Array --> we do not have fixed number of elements in cols
 */
public class Array2D {

	public static void main(String[] args) {
		int arr[][] = new int[4][2];
		int arr2[][] = {
				{1,2,3},
				{4,5,6,5},
				{7,8,9},	
				{10,11,12}
						};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
		//Enhanced for loop
			for(int k[]:arr2) {
				for(int j:k) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
	}

}
