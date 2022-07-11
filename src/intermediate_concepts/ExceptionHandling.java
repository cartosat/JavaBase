package intermediate_concepts;

/**
 * @author VSW
 * The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
 *      so that the normal flow of the application can be maintained.
 * The java.lang.Throwable class is the root class of Java Exception hierarchy.
 *      it inherited by two subclasses: Exception and Error.(see png file for hierarchy)
 *
 * throw :- The "throw" keyword is used to throw an exception.
 * throws :- The "throws" keyword is used to declare exceptions.
 *
 * 1) Checked Exception :-
 *      The classes that directly inherit the Throwable class except RuntimeException and Error
 *      are known as checked exceptions.
 *
 * 2) Unchecked Exception :-
 *      The classes that inherit the RuntimeException are known as unchecked exceptions.
 *
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5, b = 0;

        try{
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        String s=null;
        System.out.println(s.length());//NullPointerException

    }
}
