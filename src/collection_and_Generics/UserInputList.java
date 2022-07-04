package collection_and_Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:-");
		for(int i=0; i<5; i++) {
			String temp = sc.nextLine();
			arr.add(temp);
		}
		arr.stream().forEach(System.out::println);
		
	}

}