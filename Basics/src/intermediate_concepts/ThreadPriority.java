package intermediate_concepts;
/*
 * We have two methods:-
 * 				1) getPriority
 * 				2) setPriority
 * Priority range is between 1-10. 
 * 				1-- Least priority. 
 * 				10 -- High Priority
 */
public class ThreadPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hiiie");
				try {Thread.sleep(400);} catch(Exception e) {}
			}
			
		},"Hii Thread");
		
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(400);} catch(Exception e) {}
			}
		});
		
		//Setting Priority
		t1.setPriority(Thread.MIN_PRIORITY); //MIN_PRIORITY = 1
		t2.setPriority(Thread.MAX_PRIORITY); //MAX_PRIORITY = 10
		
		//Getting Priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(400);} catch(Exception e) {}
		t2.start();
		try {Thread.sleep(400);} catch(Exception e) {}

	}

}
