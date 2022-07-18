package hacker_rank_notes;

/**
 * @author VSW
 * We use printf function to print formatted output.
 * Check comments below.
 *  refer link for more :- https://www.javatpoint.com/java-string-format
 *      %d for Integer value
 *      %s for String value
 *      %f for float value
 *      %x for Hexadecimal value
 *      %c for Char value
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        String s1 = "java";
        int x = 45;
        char a = 'A';

        System.out.printf("%s%s", s1, a);// Normal format
        System.out.println();
        System.out.printf("%15s%s", s1, a);//%15 represent 15 spaces at beginning.
        System.out.println();
        System.out.printf("%-15s%d", s1, x);//%-15 represent 15 spaces at end of first formatted string.
        System.out.println();
        System.out.printf("%-15s%03d", s1, x);//%03 represent leading zero in 3 digit no. e.g 033 or 003.
        System.out.println();
        System.out.printf("%-15s%03d\n", s1, x);// \n is used for newline.

        String s2 = String.format("name is %s", s1);
        System.out.println(s2);

        String s3=String.format("value is %36.12f",32.33434);// %36 will introduce 36 spaces before
                                            // .12f will print number with 12 precsion/digits.
        System.out.println(s3);
        Math.pow()
    }
}
