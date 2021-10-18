package basics;
/*
 * System.in inside scanner Constructor specifies from where we are taking input.
 * Advantage is we dont have to handle exception as we did in BufferedReader.
 * Don't need to convert String into integer.
 * 
 */
import java.util.Scanner;

public class ScannerInJava {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:-");
		n = sc.nextInt();
		System.out.println(n);
		sc.close();
	}

}
