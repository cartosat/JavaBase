package intermediate_concepts;
/*
 * when we dont use synchronized method counter may not be able to give exact count.
 * sychronized method restrict one thread to execute at single time.
 */

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(()->
		{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			
		});
		
		Thread t2 = new Thread(()->
		{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);

	}

}
