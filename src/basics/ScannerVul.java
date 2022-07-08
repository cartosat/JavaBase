package basics;

import java.util.Scanner;

/**
 * @author VSW
 * In Scanner class if we call nextLine() method after any one of the seven nextXXX() method
 *  then the nextLine() does not read values from console and cursor will not come into
 *  console it will skip that step.
 *
 *  The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(),
 *      nextLong(), next().
 *
 *   In BufferReader class there is no such type of problem.
 */

public class ScannerVul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:- ");
        int a = sc.nextInt();

        System.out.println("Enter name:-");
        String s1 = sc.nextLine();

        System.out.println(" Num is:-"+ a + " Name is:-"+ s1);

    }
}
