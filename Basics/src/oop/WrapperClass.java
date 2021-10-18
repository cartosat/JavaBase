package oop;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i = 5; //Primitive Datatype
		Integer ii = new Integer(i); //Boxing or wrapping
		
						//Putting Value inside object is called boxing
						//Taking out Value is called unboxing
		
		int j = ii.intValue(); //Un-Boxing or UnWrapping
		System.out.println(j);
		
		Integer value =i;  //Here JAVA automatically does "new Integer(i)"
						   // It is called AutoBoxing
		
		int k =value;    //Here also javadoes "value.intValue()"
						//It is autoUnboxing
		
		String nu = "123";
		int n = Integer.parseInt(nu);
		System.out.println(n);

	}

}
