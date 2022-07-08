package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VSW
 * Following are the Major Differences between Scanner and BufferedReader Class in Java
 * 		1) BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are
 * 			working with multiple threads.
 *
 * 		2) BufferedReader has a significantly larger buffer memory than Scanner.
 *
 * 		3) The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader
 * 			(8KB byte buffer), but it’s more than enough.
 *
 * 		4) BufferedReader is a bit faster as compared to scanner because the scanner does the parsing
 * 			of input data and BufferedReader simply reads a sequence of characters.
 */

public class BuffReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
	int n;
	System.out.println("Enter Number:-");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	n = Integer.parseInt(br.readLine());
	br.close();
	
	System.out.println("Number is:-"+n);

	}

}
