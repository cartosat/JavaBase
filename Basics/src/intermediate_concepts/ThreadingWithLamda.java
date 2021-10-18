package intermediate_concepts;
/*
 * We are implementing Threading concept using lamda expression.
 * We can reduce number of lines from code using lamda expression.
 * Below is implementation.	
 */
public class ThreadingWithLamda {

	public static void main(String[] args) {
		//Lamda expression 1 for Runnable 
		Runnable ob1 = () ->
		{
			for(int i =0;i<5;i++) {
				System.out.println("Hiii..");
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		};
		
		//Lamda expression 2 for Runnable 
		Runnable ob2 = () -> {
			for(int i =0;i<5;i++) {
				System.out.println("Hellow..");
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		};
		
		//Creating Objects of Threads
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start();
		try {Thread.sleep(500);} catch(Exception e) {}
		t2.start();
	}

}
