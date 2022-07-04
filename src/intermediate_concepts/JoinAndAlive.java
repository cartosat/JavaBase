package intermediate_concepts;
/*
 * Join method waits for threads to join main thread.
 * Below join is waiting for t1 and t2 to join main thread.
 * isAlive method is used to check whether thread is alive or not.
 * 	It checks whether thread is running or not.
 *  Returns boolean values.
 * We can also Set Name for thread.
 * We can use setName command or pass name as argument in in constructor of object creation.
 */
public class JoinAndAlive {

	public static void main(String[] args) throws InterruptedException {
		//Thread 1
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hiiii..");
				try{Thread.sleep(400);} catch(Exception e) {}
			}	
		},"Hii Thread");//Setting Thread Name.
		
		//Thread 2
		Thread t2 = new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hellow..");
				try{Thread.sleep(400);} catch(Exception e) {}
			}	
		});
		
		//Setting Thread Name.
		t2.setName("Hellow Thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.start();
		try{Thread.sleep(400);} catch(Exception e) {}
		t2.start();
		try{Thread.sleep(400);} catch(Exception e) {}
		
		
		t1.join(); // 
		t2.join();
		
		System.out.println("bbye");

	}

}
