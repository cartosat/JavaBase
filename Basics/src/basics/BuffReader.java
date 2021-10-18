package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
