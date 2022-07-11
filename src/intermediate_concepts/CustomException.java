package intermediate_concepts;

/**
 * @author VSW
 * Below is implementation of custom exception with help of Exception class.
 *
 */
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
    MyException(){
        System.out.println("Custom divide by zero exception");
    }
}

public class CustomException {

    public static void main(String[] args) throws MyException{

        try{
            int divisor = 0;
            if (divisor == 0) {
                throw new MyException("Bhai Ye kya kr rha hai tu");
            }
            int res = 5/divisor;
        }
        catch (MyException e){
            System.out.println(e.getMessage());

        }

    }

}
